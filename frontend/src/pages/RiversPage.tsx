import { useEffect, useState } from "react"
import { Link } from "react-router-dom"

type River = {
  id: number
  name: string
}

function RiversPage() {

  const [rivers, setRivers] = useState<River[]>([])

  useEffect(() => {

    fetch("/api/rivers")
      .then(response => response.json())
      .then(data => {
        setRivers(data)
      })

  }, [])

  return (
    <div>

      <h1>Rivers</h1>

      {rivers.map(river => (

        <div key={river.id}>

          <Link to={`/rivers/${river.id}`}>
            {river.name}
          </Link>

        </div>

      ))}

    </div>
  )
}

export default RiversPage