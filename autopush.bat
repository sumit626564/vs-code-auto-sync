@echo off
cd /d D:\Java\vs-code-auto-sync

REM Check for changes in Git
git status --porcelain > temp.txt

for /f %%A in (temp.txt) do (
    git add .
    git commit -m "Auto update %date% %time%"
    git push origin main
    echo [%date% %time%] Auto push successful >> autopush.log
    del temp.txt
    exit /b
)

del temp.txt
echo [%date% %time%] No changes to commit. >> autopush.log
