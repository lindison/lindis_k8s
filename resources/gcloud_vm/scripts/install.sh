#!/bin/bash
echo "ubuntu:password" | chpasswd

#!/bin/bash
set -x

# add docker privileges
usermod -G docker ubuntu

# Install GCloud SDK
export CLOUD_SDK_REPO="cloud-sdk-$(lsb_release -c -s)"
echo "deb https://packages.cloud.google.com/apt $CLOUD_SDK_REPO main" | sudo tee -a /etc/apt/sources.list.d/google-cloud-sdk.list
curl https://packages.cloud.google.com/apt/doc/apt-key.gpg | sudo apt-key add -

# Install Packages
apt-get update && apt-get -y install docker.io docker-compose tree google-cloud-sdk kubectl

# clean up
apt-get clean
