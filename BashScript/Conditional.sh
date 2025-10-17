#!/bin/bash

# For Multiple Condition

mark=85
if [ $mark -ge 90 ]; then
    echo "$ A Grade"
elif [ $mark -ge 75 ]; then
    echo "B grade "
else
    echo "C grade"
fi

##### String Comprasion

#echo "Enter Your Name: "
#read name
name="Sumit"
if [ "$name" == "Sumit" ]; then
    echo "Welcome Sumit!"
elif [ "$name" == "Raj"]; then
    echo "Welcome Raj!"
else
    echo "Unknown user"
fi


## Question 2

echo "Enter Your Age: "
read age
echo "Enter Country name"
read country

if (( "first-expression" == "second-expression" )); then
    command ...
fi 