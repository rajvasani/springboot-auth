curl http://localhost:8080/tasks

{"timestamp":"2020-02-17T05:35:44.411+0000","status":403,"error":"Forbidden","message":"Access Denied","path":"/tasks"}


curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "admin"
}' http://localhost:8080/users/sign-up


curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "admin"
}' http://localhost:8080/login



curl -H "Content-Type: application/json" \
-H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU4Mjc4MTgxOH0.tGu3niovXRPJLvh7Cx2LC-n0I9V-pOi3WlChr3w48cXX5QNyoAbKsrBJu_0pNz0xaDvnitmQXFaIP6Qp30XFVg" \
-X POST -d '{
    "description": "Buy watermelon"
}'  http://localhost:8080/tasks


curl -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU4Mjc4MTgxOH0.tGu3niovXRPJLvh7Cx2LC-n0I9V-pOi3WlChr3w48cXX5QNyoAbKsrBJu_0pNz0xaDvnitmQXFaIP6Qp30XFVg" http://localhost:8080/tasks