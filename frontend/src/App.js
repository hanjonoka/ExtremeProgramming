
import { Route, Routes, Navigate } from 'react-router-dom';

import Seances from "./pages/Seances";
import ReservationForm from "./pages/ReservationForm";

function App() {
  return (
      <Routes>
          <Route path="/" element={<Navigate to="/seances" />}/>
          <Route path="/seances" element={<Seances />} />
          <Route path="/reservation" element={<ReservationForm />}></Route>
      </Routes>
  )
}

export default App;
