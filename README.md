# ms-logger
Micro Service to store Logs in in-memory

# run database locally
docker run -d \
--name postgres-container \
--restart unless-stopped \
-e POSTGRES_USER=admin \
-e POSTGRES_PASSWORD=admin \
-e POSTGRES_DB=logger \
-p 5432:5432 \
