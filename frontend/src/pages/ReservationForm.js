import {Link, useSearchParams} from "react-router-dom";
import {Button, Card, CardContent, FormControl, TextField, Typography} from "@mui/material";
import {useEffect, useState} from "react";
import SeanceCard from "../components/SeanceList/SeanceCard";
import {getSeanceById} from "../api/DataApi";
import SeanceList from "../components/SeanceList/SeanceList";


export default function ReservationForm() {
    const [searchParams, setSearchParams] = useSearchParams();
    const [seanceId, setSeanceId] = useState(0);
    const [seance, setSeance] = useState();
    const [nb_places, setnb_places] = useState(0);
    const changeNbPlaces = (event) => {
        setnb_places(event.target.value);
    }
    const [clientid, setClientid] = useState(0);
    const changeClientid = (event) => {
        setClientid(event.target.value);
    }

    const submitReservation = (event) => {
        let reservation = {seance_id: seanceId, nb_places: nb_places, client_id: clientid};

    }

    useEffect(() => {
        setSeanceId(parseInt(searchParams.get("id")));
        getSeanceById(parseInt(searchParams.get("id"))).then((response)=>{
            setSeance(response.data);
        })
    }, [])
    return (
        <div>
            {seance!=null ? <SeanceCard reservation={true} seance={seance} /> : "" }
            <FormControl fullWidth>
                <TextField id="id-field" type="hidden" value={seanceId}></TextField>
                <TextField id="nb_places-field" label="nb_places" type="number" value={nb_places} onChange={changeNbPlaces}></TextField>
                <TextField id="cliend-field" label="id_client" type="number"  value={clientid} onChange={changeClientid}></TextField>
                <Button onClick={submitReservation}>Réserver</Button>
            </FormControl>
        </div>
    )
}