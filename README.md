Spring Boot Course Enrollment System

This project is a simple course enrollment system built using Spring Boot. It allows students to enroll in courses and view enrolled students in a course. The application uses a PostgreSQL database and provides a RESTful API interface.

Features

Enroll students in a course.

View all students enrolled in a specific course.

Basic authentication for API security.

Prerequisites

To run this project, you need:

Java 8 or higher

PostgreSQL (configured in application.properties file)

Maven 3.x

Spring Boot 2.x

Setup Instructions

1. Clone the Repository

git clone <repo_url>
cd <project_directory>

2. Configure the Database

Update the application.properties file with your PostgreSQL database details:

spring.datasource.url=jdbc:postgresql://<hostname>:<port>/<database_name>
spring.datasource.username=<your_username>
spring.datasource.password=<your_password>
spring.jpa.hibernate.ddl-auto=update

3. Run the Application

mvn spring-boot:run

4. Access the API

Visit the Swagger UI for interactive API testing:

http://localhost:8080/swagger-ui/

API Endpoints

1. Enroll a Student in a Course

POST /api/students/enroll

Request Body:

{
  "studentId": "string",
  "courseId": "string"
}

Response:

{
  "message": "Student enrolled successfully",
  "studentId": "string",
  "courseId": "string"
}

2. Get Enrolled Students in a Course

GET /api/courses/{courseId}/students

Path Parameter:

courseId: The ID of the course.

Response:

[
  {
    "studentId": "string",
    "name": "string",
    "email": "string"
  }
]

Technologies Used

Backend Framework: Spring Boot 2.x

Database: PostgreSQL

Build Tool: Maven 3.x

API Documentation: Swagger

Notes

The project uses basic authentication. Update the security configuration in SecurityConfig.java as per your requirements.

Ensure that all dependencies are properly added to pom.xml.

The application schema is auto-generated in the database. Ensure the ddl-auto setting is appropriately configured (update or validate).

Contribution

Contributions are welcome! Please fork the repository and create a pull request with your changes.

License

This project is licensed under the MIT License. See the LICENSE file for details.
