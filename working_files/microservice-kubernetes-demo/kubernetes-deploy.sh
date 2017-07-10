#!/bin/sh
if [ -z "$DOCKER_ACCOUNT" ]; then
    DOCKER_ACCOUNT=lindison
fi;
kubectl run apache --image=docker.io/$DOCKER_ACCOUNT/microservice-kubernetes-demo-apache:latest --port=80 -l visualize=true
kubectl expose deployment/apache --type="LoadBalancer" --port 80 -l visualize=true
kubectl run catalog --image=docker.io/$DOCKER_ACCOUNT/microservice-kubernetes-demo-catalog:latest --port=8080 -l visualize=true
kubectl expose deployment/catalog --type="LoadBalancer" --port 8080 -l visualize=true
kubectl run customer --image=docker.io/$DOCKER_ACCOUNT/microservice-kubernetes-demo-customer:latest --port=8080 -l visualize=true
kubectl expose deployment/customer --type="LoadBalancer" --port 8080 -l visualize=true
kubectl run order --image=docker.io/$DOCKER_ACCOUNT/microservice-kubernetes-demo-order:latest --port=8080 -l visualize=true
kubectl expose deployment/order --type="LoadBalancer" --port 8080 -l visualize=true
kubectl run hystrix-dashboard --image=docker.io/$DOCKER_ACCOUNT/microservice-kubernetes-demo-hystrix-dashboard:latest --port=8080 -l visualize=true
kubectl expose deployment/hystrix-dashboard --type="LoadBalancer" --port 8080 -l visualize=true 
