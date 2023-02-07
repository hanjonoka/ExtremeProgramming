import { Card, CardContent, Typography } from "@mui/material"
import { mockSeances } from "../../mock/SeanceMock"
import SeanceList from "./SeanceList"
import CinemaList from "./CinemaList";

export default function FilmCard(props) {
    const cinemas = props.seances.map((v)=> v.cinemaDTO)
            .filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h4" gutterBottom>
                    {props.film.titre}
                </Typography>
                <Typography variant="body1">
                    {props.film.duree} minutes, réalisé par {props.film.realisateur}.
                </Typography>
                {props.cinemaFirst ? (<SeanceList seances={props.seances.filter((v) => v.filmDTO.id === props.film.id)}></SeanceList>) : (<CinemaList cinemas={cinemas} seances={props.seances.filter((v) => v.filmDTO.id === props.film.id)} cinemaFirst={props.cinemaFirst}/>)}
            </CardContent>
        </Card>
    )
  }
