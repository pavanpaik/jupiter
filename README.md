# Spring Boot Reactive Microservice POC

## Package Spring Boot project
```
./mvnw package
```

## Build and tag Docker container
```
docker build -t jupiter .
docker tag jupiter pavanpaik/jupiter:0.1
docker push pavanpaik/jupiter:0.1
```

## Deploy App on to Kubernetes
```
kubectl apply -f k8s/mongo-statefulset.yaml
kubectl apply -f k8s/jupiter-deployment.yaml
kubectl apply -f k8s/jupiter-service.yaml
```

## Undeploy App from Kubernetes
```
kubectl delete statefulset -l app=jupiter-app
kubectl delete deployment -l app=jupiter-app
kubectl delete service -l app=jupiter-app
```
