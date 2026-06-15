import type { RoutePoint } from "./RoutePoint"

export type RouteConnection = {
  id: number
  name: string
  fromPoint: RoutePoint
  toPoint: RoutePoint
  description: string
}