import {Card, CardContent, Typography} from "@mui/material"
import FilmList from "./FilmList"
import {mockFilms} from "./mock/FilmMock";

export default function CinemaCard(props) {
    return (
        <!-- FIXME Prevent undefined cases -->
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h3" gutterBottom>
                    {props.cinema.nom}
                </Typography>
                <Typography variant="body1">
                    situé à {props.cinema.ville}
                </Typography>
                <FilmList cinemaId={props.cinema.id} films={mockFilms}></FilmList>
            </CardContent>
        </Card>
    )
}
