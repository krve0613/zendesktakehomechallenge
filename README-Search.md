This application is to search the json file by any field entity.

Steps to use this application:

1. run this as java application
2. Use any REST API tool like postman to send the command as given below.
	GET: http://localhost:8080/api/item?value=72
	GET: http://localhost:8080/api/item?value=urgent
3. it return all the rows that contain the value as 72.
4. If we want to search by empty values, use below URL
	GET: http://localhost:8080/api/item?value=None
5. Inside the code if the value is null, i am taking it as None. So we have to search with a value of "None"

