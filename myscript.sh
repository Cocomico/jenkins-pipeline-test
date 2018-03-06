#!/bin/bash

printf "Running myscript.sh\n"
printf "Using branch ${branchName}\n"
echo "which node"
which node
echo "npm install"
npm install
echo "ls -al node_modules"
ls -al node_modules
