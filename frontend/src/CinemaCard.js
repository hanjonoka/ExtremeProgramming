import { Card, CardContent, Typography } from "@mui/material"
import FilmList from "./FilmList"
import SeanceList from "./SeanceList";
import { mockFilms } from "./mock/FilmMock";

export default function CinemaCard(props) {
    const films = props.seances.map((v)=> v.film)
            .filter((value, index, self) => index === self.findIndex((t) => (t.id === value.id)));
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h4" gutterBottom>
                    {props.cinema.nom}
                </Typography>
                <Typography variant="body1">
                    situé à {props.cinema.ville}
                </Typography>
                {props.cinemaFirst ? <FilmList films={films} cinemaFirst={props.cinemaFirst} seances={props.seances.filter((v) => v.cinema.id === props.cinema.id)}></FilmList> : <SeanceList seances={props.seances.filter((v) => v.cinema.id === props.cinema.id)}></SeanceList>}
                
            </CardContent>
        </Card>
    )
  }
