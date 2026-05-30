import { useEffect, useState } from "react"
import { useParams } from "react-router-dom"

import type { River } from "../types/River"

function RiverPage() {

  const { id } = useParams()

  const [river, setRiver] = useState<River | null>(null)

  useEffect(() => {

    fetch(`/api/rivers/${id}`)
      .then(response => response.json())
      .then(data => {
        setRiver(data)
      })

  }, [id])

  if (!river) {
    return <div>Loading...</div>
  }

const points = river.riverPoints.map((point, index) => ({
  ...point,

  x: 250 + Math.sin(index * 0.8) * 50,
  y: 30 + index * 100
}))

  return (
    <div>

      <h1>{river.name}</h1>

      <div>Length: {river.lengthKm} km</div>

      <div>Country: {river.country}</div>

      <div>Region: {river.region}</div>

      <div>{river.description}</div>

      <h2>Points</h2>

      <svg width="600" height="1200">

  {points.slice(0, -1).map((point, index) => {

    const next = points[index + 1]

    const path = `
      M ${point.x} ${point.y}
      C ${point.x + 70} ${point.y},
        ${next.x - 50} ${next.y},
        ${next.x} ${next.y}
    `

    return (
      <path
        key={index}
        d={path}
        stroke="#3b82f6"
        strokeWidth="8"
        fill="none"
      />
    )
  })}

  {points.map(point => (

    <g key={point.id}>

      <circle
        cx={point.x}
        cy={point.y}
        r="9"
        fill="#2563eb"
      />

      <text
        x={point.x + 30}
        y={point.y + 5}
        fontSize="20"
      >
        {point.name}
      </text>

    </g>
  ))}

</svg>
    </div>
  )
}

export default RiverPage