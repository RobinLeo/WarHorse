rd /s /q target
call mvn clean
call mvn -Dmaven.test.skip=true package

