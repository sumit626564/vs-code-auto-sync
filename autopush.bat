@echo off
cd /d "D:\Java\vs-code-auto-sync"

:: Check if there are any changes
for /f "tokens=*" %%i in ('git status --porcelain') do (
    set changes=1
    goto :commit
)

echo [%date% %time%] - No changes to commit.
goto :eof

:commit
git add .
git commit -m "Auto update: %date% %time%"
git push origin main
