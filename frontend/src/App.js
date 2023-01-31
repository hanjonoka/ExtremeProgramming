import FilmList from "./FilmList";
import {mockFilms} from "./mock/FilmMock";

function App() {
  return (
    <>
      <h1> App de groupe 2 - red team </h1>
      <FilmList films={mockFilms}/>
    </>
  );
}

export default App;
