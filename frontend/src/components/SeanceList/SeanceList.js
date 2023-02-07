import SeanceCard from "./SeanceCard";

export default function SeanceList(props) {
    
    return props.seances.map((seance)=> {
        return <SeanceCard key={seance.id} seance={seance} />
    })

}
