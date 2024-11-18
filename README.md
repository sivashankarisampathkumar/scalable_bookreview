# scalable_bookreview
scalable_bookreview_microservice_2023TM93585

#**Tech**:Springboot,MongoDb

**#Sample POST to add a book Review**
curl -X POST http://localhost:8080/books -H "Content-Type: application/json" -d '{"id": "1", "title": "The Great Gatsby", "review": "A classic novel."}'

**#Sample GET command to get all the reviews**
 curl -X GET http://localhost:8080/books

**#Sample GET command to get the review of particular user**
  curl -X GET http://localhost:8080/books/1
