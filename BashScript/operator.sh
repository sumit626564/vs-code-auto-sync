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

name="sumit_singh"
if [ -n "$name" ]; then
    echo "Name is set to $name"
else
    echo "Name is Empty"
fi

# File Test Operators
#  Operator     Description                             Example 
# -e            (File exists)                           [ -e file.txt ]
# -f             (File exists and is a regular file)    [ -f file.txt ]
# -d             (Directory exists)                     [ -d /home/sumit ]
# -r             (File is readiable)                    [ -r file.txt ]
# -w              (File is writeable)                   [ -w file.txt ]
# -x              (File is executable)                  [ -x script.sh ]
# -a              (File size > 0)                       [ -s file.txt ]

file="input.sh"
if [ -x $file ]; then
    echo "$file is executable"
else
    echo "$file is not executable"
fi

file="inpt.sh"
if [ -e $file ]; then 
    echo "$file is exits"
else
    echo "$file doesn't exists"
fi

################################################
# Logical Operators
#################################
#  &&        AND            [ $a -gt 5 ] && [ $b -lt 10 ]
# `                             `
# !          NOT            [ ! -f file.txt ]