import { BrowserRouter, Routes, Route } from "react-router-dom"

import RiversPage from "./pages/RiversPage"
import RiverPage from "./pages/RiverPage"

function App() {

  return (
    <BrowserRouter>

      <Routes>

        <Route
          path="/"
          element={<RiversPage />}
        />

        <Route
          path="/rivers/:id"
          element={<RiverPage />}
        />

      </Routes>

    </BrowserRouter>
  )
}

export default App