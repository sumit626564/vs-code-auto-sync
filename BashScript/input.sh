#!/bin/bash
echo "What is your name"
read entered_name

echo -e "\nWelcome to bash tutorial" $entered_name

# Multiple input in a single line
echo "Enter your first name and last name: "
read firstname lastname
echo "Hello, $firstname $lastname"