import axios from 'axios';
 
const FILM_URI = process.env.REACT_APP_API_URI + '/film';
 
export function getAllFilms(){
	return axios.get(FILM_URI);
}

export function getFilmsInCinema(cinemaId){
	return axios.get(FILM_URI+"/"+cinemaId);
}

export function postFilm(filmForm){
    // check format
	return axios.post(FILM_URI, null, {
		params: {
			duree : filmForm.duree,
			realisateur: filmForm.realisateur,
			titre: filmForm.titre
		}
	});
}

export function deleteFilm(filmId){
	return axios.delete(FILM_URI+"/"+filmId);
}
