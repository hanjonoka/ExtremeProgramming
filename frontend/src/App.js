import FilmList from "./FilmList";
import {mockFilms} from "./mock/FilmMock";
import SeanceList from "./SeanceList";
import { mockSeances } from "./mock/SeanceMock";

function App() {
  return (
    <>
      <h1> App de groupe 2 - red team </h1>
      <SeanceList seances={mockSeances}/>
    </>
  );
}

export default App;
