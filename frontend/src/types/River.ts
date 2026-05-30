import type { RiverPoint } from "./RiverPoint"

export type River = {
  id: number
  name: string
  lengthKm: number
  country: string
  region: string
  description: string
  riverPoints: RiverPoint[]
}