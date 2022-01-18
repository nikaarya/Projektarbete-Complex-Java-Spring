# Projektarbete-Complex-Java-Spring

== INTRO ==

This project makes use of Spring Boot, Spring Security and JMS in Maven.
The best way to test the endpoints is through Insomnia or Postman.

Different user roles have access to different endpoints. For example,
admin can access everything while the basic user role can only reach
endpoints like 'students'.

The best way to try out the endpoints is to start by create the desired
user. After that you can play around with the endpoints that you see fit.

!BE AWARE! if you want to jump between roles. Insomnia will save a cookie 
of the previous role you created, and it will cause an 401 error
on every call you'll try and make. Clear the cookies or restart Insomnia, 
and it should work.

= = = = = =

-ADMIN endpoints-
POST /admins
GET /admins
DELETE /admins/{id}

-BOOK endpoints-
POST /books
DELETE /books/{id}
GET /books/{id}
GET(all) /books

-LIBRARY endpoints-
POST /libraries
GET /libraries
PUT /libraries/update

-STUDENT endpoints-
POST /students
DELETE /students/{id}
GET /students/{id}
GET(all) /students

-SUBJECT endpoints-
POST /subjects
DELETE /subjects/{id}
GET /subjects/{id}
GET(all) /subjects

-TEACHER endpoints-
POST /teachers
DELETE /teachers/{id}
GET /teachers/{id}
GET(all) /books

-USERS endpoints-
POST
/users/signup
/users/createadmin
/users/createteacher

GET /users