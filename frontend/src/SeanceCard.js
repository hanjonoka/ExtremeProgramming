import { Card, CardContent, Typography } from "@mui/material"

export default function SeanceCard(props) {
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h5" gutterBottom>
                    {props.seance.filmName}
                </Typography>
                <Typography variant="body1">
                    {props.seance.cinemaName}
                </Typography>
                <Typography variant="body1">
                    date : {props.seance.date}
                </Typography>
                <Typography variant="body1">
                    places disponibes : {props.seance.nombrePlaces}
                </Typography>
            </CardContent>
        </Card>
    )
  }
