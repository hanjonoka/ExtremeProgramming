import axios from 'axios';
 
const SEANCE_URI = 'http://localhost:8080/seance'
 
export function getAllSeances(){
	return axios.get(SEANCE_URI);
}

export function getAllSeancesFromCinema(cinemaId){
	return axios.get(SEANCE_URI+"/"+cinemaId);
}

export function getAllSeancesOfFilmFromCinema(filmId, cinemaId){
	return axios.get(SEANCE_URI+"/"+cinemaId+"/"+filmId);
}

export function postSeance(seanceForm){
	return axios.post(SEANCE_URI, null, {
		params: {
			cinemaId : seanceForm.cinemaId,
			filmId: seanceForm.filmId,
			dateSeance: seanceForm.dateSeance,
            nombrePlaces: seanceForm.nombrePlaces
		}
	});
}

export function deleteSeance(seanceId){
	return axios.delete(SEANCE_URI+"/"+seanceId);
}
