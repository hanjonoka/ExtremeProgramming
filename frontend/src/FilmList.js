import FilmCard from "./FilmCard";

export default function FilmList(props) {
    
    return props.films.map((film)=> {
        return <FilmCard key={film.id} film={film} cinemaFirst={props.cinemaFirst} seances={props.seances.filter((v)=> v.film.id === film.id)}/>
    })

}
