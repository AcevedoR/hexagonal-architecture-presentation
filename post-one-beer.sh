curl --location --request POST 'localhost:8080' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "my beer",
    "brewery": "vocation",
    "alcool": 8.0,
    "ibu": 40
}'
