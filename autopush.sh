#!/bin/bash
cd ~/Vs-Code
if [ -n "$(git status --porcelain)" ]; then
    git add .
    git commit -m "Auto update: $(date)"
    git push origin main
else
    echo "No changes to commit."
fi
