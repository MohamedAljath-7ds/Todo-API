# Todo-API

The Todo API is a RESTful web service designed to manage tasks or "todos." It provides endpoints for creating, retrieving, updating, and deleting tasks. The API follows standard HTTP methods and returns data in JSON format.

### Endpoints:

1. *Get All Todos*
   - *Endpoint:* GET /api/tasks
   - *Description:* Retrieve a list of all todos.
   - *Response:* JSON array containing todo objects.

2. *Get Todo by ID*
   - *Endpoint:* GET /api/tasks/{id}
   - *Description:* Retrieve a specific todo by its unique identifier.
   - *Parameters:* {id} - Unique identifier of the todo.
   - *Response:* JSON object representing the todo.

3. *Create Todo*
   - *Endpoint:* POST /api/tasks
   - *Description:* Create a new todo.
   - *Request Body:* JSON object representing the todo to be created.
   - *Response:* JSON object representing the created todo.

4. *Update Todo*
   - *Endpoint:* PUT /api/tasks/{id}
   - *Description:* Update an existing todo by its unique identifier.
   - *Parameters:* {id} - Unique identifier of the todo to be updated.
   - *Request Body:* JSON object representing the updated todo.
   - *Response:* JSON object representing the updated todo.

5. *Delete Todo*
   - *Endpoint:* DELETE /api/tasks/{id}
   - *Description:* Delete a specific todo by its unique identifier.
   - *Parameters:* {id} - Unique identifier of the todo to be deleted.
   - *Response:* HTTP status indicating success or failure.

### Todo Object Structure:

- *id:* Unique identifier for the todo.
- *title:* Title or name of the todo.
- *description:* Additional details or description of the todo.
- *completed:* Boolean indicating whether the todo is completed.
