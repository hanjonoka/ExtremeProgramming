import { compose } from "@mui/system";
import { useEffect, useState } from "react";
import { getAllSeances } from "./api/DataApi";
import CinemaList from "./CinemaList";
import FilmList from "./FilmList";
import { mockSeances } from "./mock/DataMock";

function App() {
  const [seances, setSeances] = useState([]);
    useEffect(() => {
      getAllSeances().then(reponse => {
          setSeances(reponse.data);
      }).catch(err => {
          console.log(err);
      })
      }, [])

    const cinemas = seances.map((v)=> v.cinemaDTO).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    const films = seances.map((v)=> v.filmDTO).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    // const seances = mockSeances;
    
    let cinemaFirst = true;

    return (
    <>
      <h1> App de groupe 2 - red team </h1>
      {cinemaFirst ? (<CinemaList cinemas={cinemas} seances={seances} cinemaFirst={cinemaFirst}/>) : (<FilmList films={films} seances={seances} cinemaFirst={cinemaFirst}></FilmList>)}
    </>
  );
}

export default App;
