for i in {1..$(cat ../../create_k8s/names| wc -l)}; do aws ec2 create-volume --region us-west-1 --availability-zone us-west-1a --size 5 --volume-type gp2; done
