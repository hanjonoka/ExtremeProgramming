import axios from 'axios';
 
const RESERVATION_URI = process.env.REACT_APP_API_URI + '/reservation';
 
export function getAllReservations(){
	return axios.get(RESERVATION_URI);
}

export function postReservation(reservationForm){
    // check format
	return axios.post(RESERVATION_URI, null, {
		params: {
			clientId : reservationForm.clientId,
			seanceId: reservationForm.seanceId
		}
	});
}

export function deleteReservation(reservationId){
	return axios.delete(RESERVATION_URI + "/" + reservationId);
}
