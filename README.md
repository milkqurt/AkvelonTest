# AkvelonTest
REST API

Technology stack:
Java 11,Spring Boot,Spring DATA JPA,MySQL,Spring Web
All dependencies can be viewed in the Maven builder(pom.xml)

Description of the completed task:
Web API for entering data into the database.

And so I created a PROJECT entity object and connected it to another TASK entity object through OneToMany and ManyToOne, that is, there can be several tasks in one project, I did not specify the int priority for Enum and did it simply through ORDINAL, which displays the enumeration by numbering through int .
The project can be called by id, deleted by id, edited, added a new one, and you can view all the tasks of the specified project when calling the project
Tasks can be added and edited, I don’t see the point in deleting tasks, since there is a status field
The task is linked to the project via a field
Deleting a project deletes all of its tasks
I have tested this web API through Postman.

Note:
I haven't come across the Docker tool.
My attempts to deploy this project in a Docker container were in vain.
Therefore, he is not here.
