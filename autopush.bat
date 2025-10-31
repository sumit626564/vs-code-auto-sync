@echo off
cd /d D:\Java\vs-code-auto-sync

:: Optional: Set Git identity (only needed first time)
git config user.name "Sumit Singh Rajput"
git config user.email "rajputsinghshear@gmail.com"

:: Add all changes
git add .

:: Commit with timestamp
git commit -m "Auto commit on %date% %time%"

:: Push to your branch (usually main)
git push origin main

:: Log
echo [%date% %time%] Auto push done >> git_auto_sync.log
exit