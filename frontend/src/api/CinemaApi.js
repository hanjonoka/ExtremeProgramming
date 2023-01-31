import axios from 'axios';
 
const CINEMA_URI = 'http://localhost:8080/cinema'
 
export function getAllCinemas(){
	return axios.get(CINEMA_URI);
}

export function postCinema(cinemaForm){
    // check format
	return axios.post(CINEMA_URI, null, {
		params: {
			nom : cinemaForm.nom,
			ville: cinemaForm.ville
		}
	});
}

export function deleteCinema(cinemaId){
	return axios.delete(CINEMA_URI+"/"+cinemaId);
}
