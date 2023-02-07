import CinemaCard from "./CinemaCard";

export default function CinemaList(props) {
    return props.cinemas.map((cinema)=> {
        return <CinemaCard key={cinema.id} cinema={cinema} cinemaFirst={props.cinemaFirst} seances={props.seances.filter((v)=> v.cinema.id === cinema.id)} />
    })

}
