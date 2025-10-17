#!/bin/bash

mark=85
if [ $mark -ge 90 ]; then
    echo "$ A Grade"
elif [ $mark -ge 75 ]; then
    echo "B grade "
else
    echo "C grade"
fi