import {Card, CardContent, Typography} from "@mui/material"
import {mockSeances} from "./mock/SeanceMock"
import SeanceList from "./SeanceList"

export default function FilmCard(props) {
    return (
        <!-- FIXME Prevent undefined cases -->
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h4" gutterBottom>
                    {props.film.titre}
                </Typography>
                <Typography variant="body1">
                    {props.film.duree} minutes, réalisé par {props.film.realisateur}.
                </Typography>
                <SeanceList cinemaId={props.cinemaId} seances={mockSeances}></SeanceList>
            </CardContent>
        </Card>
    )
}
