import SeanceCard from "./SeanceCard";

export default function SeanceList({seances}) {
    
    return seances.map((seance)=> {
        return <SeanceCard key={seance.id} seance={seance} />
    })

}
