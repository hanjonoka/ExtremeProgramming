import { Card, CardContent, Typography } from "@mui/material"

export default function SeanceCard(props) {
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h5">
                    date : {props.seance.date}
                </Typography>
                <Typography variant="body1">
                    {props.seance.filmName}
                </Typography>
                <Typography variant="body1">
                    places disponibes : {props.seance.nombrePlaces}
                </Typography>
                <Typography variant="body2" gutterBottom>
                    projetté à {props.seance.cinemaName}
                </Typography>
                
            </CardContent>
        </Card>
    )
  }
