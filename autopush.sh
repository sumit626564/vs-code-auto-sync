#!/bin/bash
cd /home/cyber-tech/Vs-Code

# Check if there are any changes
if [ -n "$(git status --porcelain)" ]; then
    git add .
    git commit -m "Auto update: $(date '+%Y-%m-%d %H:%M:%S')"
    git push origin main
else
    echo "$(date '+%Y-%m-%d %H:%M:%S') - No changes to commit."
fi

