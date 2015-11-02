@echo off
set APP=chuck_joke
set LOCATION=C:\temp

REM Always deploy new version, clean before
call bin\clean.bat
call bin\package.bat

REM If app folder exists under C:\temp, remove it
if exist %LOCATION%\\%APP% rmdir /S /Q %LOCATION%\\%APP%

REM If destionation folder doesn't exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%

xcopy /E build\install %LOCATION%

REM Run application once
%LOCATION%\\%APP%\\bin\\%APP%
