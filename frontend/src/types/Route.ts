import type { RoutePoint } from "./RoutePoint"

export type Route = {
  id: number
  name: string
  description: string
  points: RoutePoint[]
}