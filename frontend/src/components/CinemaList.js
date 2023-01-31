import CinemaCard from "./CinemaCard";

export default function CinemaList({cinemas}) {

    return cinemas.map((cinema) => {
        return <CinemaCard key={cinema.id} cinema={cinema}/>
    })

}
