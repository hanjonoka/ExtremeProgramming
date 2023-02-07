import axios from 'axios';
 
const URI = 'http://localhost:8080/'

export function getAllSeances(){
	return axios.get(URI+"seance/allFutur");
}

export function getSeanceById(id) {
	return axios.get(URI+"seance/byId?id="+id);
}

export function submitReservation(reservation) {
	return axios.post(URI+"reservation/reserver",reservation);
}