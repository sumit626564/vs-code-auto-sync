#!/bin/bash

#arthimetic Operations
#$(( expression ))
#  +, -, *, /, %, **(power)
a=3
b=1
echo $((a+b))
echo "Product: $((a * b))"
echo "Division: $((a / b))"

#####################################
# Relational Operator(for NUmbers)
#####################################
#Symbol:-
#       [$variable -relationalOpName $variable]
# 
# -eq  (equal to)
# -ne  (not equal to)
# -gt   (Greater Than )
# -lt   (less than)
# -ge   (Greater than)
# -le   (less than or equal)

a=15
b=10
if [ $a -gt $b ]; then
    echo "$a is greater than $b"
else
    echo "$a is not greater than $b"
fi

############################################
# String Operator
####################################
#Symbol:- ["$var" = "$var"]
#   =   (equal)
#   !=  (Not Equal)
#   -z  (String is Empty)
#   -n  (String is not empty)

name="sumit singh"
if[-n "$name"];
    echo "Name is set to $name"
else
    echo "Name is Empty"
fi