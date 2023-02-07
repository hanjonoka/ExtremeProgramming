import axios from 'axios';
 
const URI = 'http://localhost:8080/seance/allFutur'

export function getAllSeances(){
	return axios.get(URI);
}