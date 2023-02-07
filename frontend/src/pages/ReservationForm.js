import {Link, useSearchParams} from "react-router-dom";
import {Button, Card, CardContent, FormControl, Typography} from "@mui/material";
import {useEffect, useState} from "react";
import SeanceCard from "../components/SeanceList/SeanceCard";
import {getSeanceById} from "../api/DataApi";
import SeanceList from "../components/SeanceList/SeanceList";


export default function ReservationForm() {
    const [searchParams, setSearchParams] = useSearchParams();
    const [seanceId, setSeanceId] = useState(0);
    const [seance, setSeance] = useState();

    useEffect(() => {
        getSeanceById(parseInt(searchParams.get("id"))).then((response)=>{
            setSeance(response.data);
        })
    }, [])
    return (
        <div>
            {seance!=null ? <SeanceCard reservation={true} seance={seance} /> : "" }
            <FormControl fullWidth>

            </FormControl>
        </div>
    )
}