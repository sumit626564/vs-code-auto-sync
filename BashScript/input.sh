#!/bin/bash
echo "What is your name"
read entered_name

echo -e "\nWelcome to bash tutorial" $entered_name

# Multiple input in a single line
echo "Enter your first name and last name: "
read firstname lastname
echo "Hello, $firstname $lastname"

# Input in array

echo "Enter numbers seperated by space: "
read -a numbers

echo "You entered: ${numbers[@]}"
echo "Sum of numbers: $((numbers[0] + numbers[1] + numbers[2]))"

# Prompting Without "echo"
read -p "Enter your city and Country: "  city country
echo "You live in $city $country"