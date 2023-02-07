
import { Route, Routes, Navigate } from 'react-router-dom';

import Seances from "./pages/Seances";

function App() {
  return (
      <Routes>
        <Route path="/" element={<Navigate to="/seances" />}/>
        <Route path="/seances" element={<Seances />}></Route>
      </Routes>
  )
}

export default App;
