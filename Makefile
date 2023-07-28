start:
	mvn clean
	mvn install -Dmaven.test.skip=true
	docker compose down
	docker compose up --build -d

stop:
	docker compose down
