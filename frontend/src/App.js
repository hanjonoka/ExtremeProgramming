import CinemaList from "./components/CinemaList";
import {mockCinemas} from "./mock/CinemaMock";

function App() {
    return (
        <>
            <h1> App de groupe 2 - red team </h1>
            <!-- FIXME Be careful axios returns Promise<AxiosResponse> -->
            <CinemaList cinemas={mockCinemas}/>
        </>
    );
}

export default App;
