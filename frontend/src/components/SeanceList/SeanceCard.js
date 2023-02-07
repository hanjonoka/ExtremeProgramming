import {Button, Card, CardContent, Typography} from "@mui/material"
import {Link} from "react-router-dom";

export default function SeanceCard(props) {
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h5">
                    date : {props.seance.date}
                </Typography>
                <Typography variant="body1">
                    {props.seance.filmDTO.titre}
                </Typography>
                <Typography variant="body1">
                    places totales : {props.seance.nb_places}
                </Typography>
                <Typography variant="body2" gutterBottom>
                    projeté à {props.seance.cinemaDTO.nom}
                </Typography>

                {props.reservation ? "" :<Button component={Link} to={`/reservation?id=${props.seance.id}`}>Réserver</Button>}
                
            </CardContent>
        </Card>
    )
  }
