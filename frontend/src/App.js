import { compose } from "@mui/system";
import { useEffect, useState } from "react";
import CinemaList from "./CinemaList";
import FilmList from "./FilmList";
import { mockSeances } from "./mock/DataMock";

function App() {
  // const [cinemaFirst, setCinemaFirst] = useState(true);
  //   useEffect(()=> {
      
  //   })
    const cinemas = mockSeances.map((v)=> v.cinema).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    const films = mockSeances.map((v)=> v.film).filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    const seances = mockSeances;
    
    let cinemaFirst = true;

    return (
    <>
      <h1> App de groupe 2 - red team </h1>
      {cinemaFirst ? (<CinemaList cinemas={cinemas} seances={seances} cinemaFirst={cinemaFirst}/>) : (<FilmList films={films} seances={seances} cinemaFirst={cinemaFirst}></FilmList>)}
    </>
  );
}

export default App;
