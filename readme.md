# Kayak Planner

Its aim is to help organise kayak trips for family and friends.

## Requirements

- Java 25
- Node.js 22+
- PostgreSQL 17+
- Docker Desktop (for running the full application with Docker Compose)

# Tips

## Building the backend

./gradlew build

## Running the backend locally

Make sure PostgreSQL is running and the database is available.

./gradlew bootRun

The backend will be available at:

http://localhost:8080

## Running the frontend locally

Go to the `frontend` directory.

Install dependencies:

npm install

Run the development server:

npm run dev

The frontend will be available at:

http://localhost:5173

## Running the application with Docker

Docker Compose starts the complete application:

- PostgreSQL
- Spring Boot backend
- React/Vite frontend

To build the backend image and start all services:

docker compose up --build

To start the services in the background:

docker compose up -d

The application will be available at:

- Frontend: http://localhost:5173
- Backend: http://localhost:8080
- PostgreSQL: localhost:5432

To view the application logs:

docker compose logs

To view logs for a specific service:

docker compose logs app
docker compose logs frontend
docker compose logs postgres

## Database

When running with Docker Compose, PostgreSQL is started automatically.

The default database configuration is:

Database: kayak_planner
User: postgres
Password: postgres
Port: 5432