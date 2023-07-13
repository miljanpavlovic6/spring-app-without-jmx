# Spring app for testing on Linux host, docker or Kubernetes JMX disabled

## Deploying on Linux host

## Deploying on Docker

### Create the local image from Dockerfile
-Dockerfile
```
FROM openjdk:11
EXPOSE 8099
ARG JAR_FILE=demo-simple-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} demo-simple-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-simple-api-0.0.1-SNAPSHOT.jar"]
```
Execute and test locally
```
docker build --tag=appwithoutjmx:v1 .
docker run -p 8090:8090 appwithoutjmx:v1
```
-and push to docker hub
```
docker login -u miljanpavlovic -p <password>
docker tag appwithoutjmx:v1 miljanpavlovic/appwithoutjmx:v1
docker push miljanpavlovic/appwithoutjmx:v1
```
## Deploy to docker -> create Linux instance and install docker
```
docker image pull miljanpavlovic/appwithoutjmx:v1
docker run -d -p 8099:8099 miljanpavlovic/appwithoutjmx:v1
```

## Deploying on Kubernetes
```
git clone ...
cd spring-app-test/K8S
kubectl apply -f namespace-dev.yaml
kubectl apply -f k8s-deployment.yaml
kubectl apply -f rolling.yaml
```
