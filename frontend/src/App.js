import CinemaList from "./CinemaList";
import { mockCinemas } from "./mock/CinemaMock";

function App() {
  return (
    <>
      <h1> App de groupe 2 - red team </h1>
      <CinemaList cinemas={mockCinemas}/>
    </>
  );
}

export default App;
