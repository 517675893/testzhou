#!/bin/sh
#define root folder for testauto
testautoRootPath=/nt/sdcard/testauto
junitReportPath=$testautoRootPath/junit

echo 'delete all screenshots in sdcard'
adb -s $1 shell r -rf /nt/sdcard/Robotiu-Screenshots/

cd todolisttest
ant clean debug
cd ..

echo "start to install source apk"
adb -s $1 install todolist/bin/todolist-debug.apk
echo "start to install test apk"
adb -s $1 install todolisttest/bin/todolistTest-debug.apk

echo "start to run test"
adb -s $1 shell a instruent -w -e reportDir $junitReportPath -e reportFile junit-report.xl co.exaple.todolist.test/co.exaple.todolist.test.runners.Runner1

echo "pull junit report file to PC"
adb -s $1 pull $junitReportPath/junit-report.xl $WORKSPACE

echo "pull screenshots"
adb -s $1 pull /nt/sdcard/Robotiu-Screenshots/ $WORKSPACE/