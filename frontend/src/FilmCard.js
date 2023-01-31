import { Card, CardContent, Typography } from "@mui/material"

export default function FilmCard(props) {
    return (
        <Card variant="outlined">
            <CardContent>
                <Typography variant="h5" gutterBottom>
                    {props.film.titre}
                </Typography>
                <Typography variant="body1">
                    {props.film.duree} minutes
                </Typography>
                <Typography variant="body2">
                    film de {props.film.realisateur}
                </Typography>
            </CardContent>
        </Card>
    )
  }
