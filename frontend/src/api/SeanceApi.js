import axios from 'axios';
 
const SEANCE_URI = process.env.REACT_APP_API_URI + '/seance';
 
export function getAllSeances(){
	return axios.get(SEANCE_URI);
}

export function getSeancesFromCinema(cinemaId){
	return axios.get(SEANCE_URI+"/"+cinemaId);
}

export function getSeancesOfFilmFromCinema(filmId, cinemaId){
	return axios.get(SEANCE_URI + "/" + cinemaId + "/" + filmId);
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
	return axios.delete(SEANCE_URI + "/" + seanceId);
}
