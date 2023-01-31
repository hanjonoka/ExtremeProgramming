import axios from 'axios';
 
const CLIENT_URI = 'http://localhost:8080/client'
 
export function getAllClients(){
	return axios.get(CLIENT_URI);
}

export function postClient(clientForm){
    // check format
	return axios.post(CLIENT_URI, null, {
		params: {
			nom : clientForm.nom,
			isAdmin: clientForm.isAdmin
		}
	});
}

export function deleteClient(clientId){
	return axios.delete(CLIENT_URI+"/"+clientId);
}
