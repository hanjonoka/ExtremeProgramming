import {useEffect, useState} from "react";
import {getAllSeances} from "../api/DataApi";
import CinemaList from "../components/SeanceList/CinemaList";
import FilmList from "../components/SeanceList/FilmList";
import {Button} from "@mui/material";

export default function Seances() {
    const [seances, setSeances] = useState([]);
    useEffect(() => {
        getAllSeances().then(reponse => {
            setSeances(reponse.data);
        }).catch(err => {
            console.log(err);
        })
    }, [])

    const [cinemaFirst, setCinemaFirst] = useState(true);
    const toggleTri = () => {
        setCinemaFirst(!cinemaFirst);
    }

    const cinemas = seances.map((v)=> v.cinemaDTO).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    const films = seances.map((v)=> v.filmDTO).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    // const seances = mockSeances;


    return (
        <div>
            <h1> Liste des seances disponibles </h1>
            <Button onClick={toggleTri}>Trier par cinema/film</Button>
            {cinemaFirst ? (<CinemaList cinemas={cinemas} seances={seances} cinemaFirst={cinemaFirst}/>) : (<FilmList films={films} seances={seances} cinemaFirst={cinemaFirst}></FilmList>)}
        </div>
    );
}