# GKE

If you are using Kubernetes on a cloud provider, you may need to create cloud firewall rules to serve traffic. If you are using GCE or GKE, you can use the following commands to add firewall rules.  

Firewall rules:  
`gcloud compute firewall-rules create allow-guest-book-fe --allow tcp:30964 --description "Incoming http allowed."` 

An output similiar to this should display when completed.  

```shell
NAME                 NETWORK  SRC_RANGES  RULES      SRC_TAGS  TARGET_TAGS
allow-guest-book-fe  default  0.0.0.0/0   tcp:30964
``` 
