#!/bin/bash

CLASSPATH='-classpath /Users/ali/Code/Java/BinaryTree/out/production/BinaryTree'
CLASS='com.alihooman.BinaryTree'

echo $CLASSPATH
echo $CLASS

echo '*************************************************'
echo '********** Starting command line tests **********'
echo '*************************************************'
echo ''
echo '*************************************************'
echo '********** Run without arguments       **********'
echo '*************************************************'
echo ''

java $CLASSPATH $CLASS
wait

echo ''
echo '*************************************************'
echo '********** Run with arguments          **********'
echo '*************************************************'
echo ''

java $CLASSPATH $CLASS fileName
wait

echo ''
echo '*************************************************'
echo '********** Run with too many arguments **********'
echo '*************************************************'
echo ''

java $CLASSPATH $CLASS Name hello
wait

echo ''
echo '*************************************************'
echo '********** Run with quoted arguments   **********'
echo '*************************************************'
echo ''

java $CLASSPATH $CLASS "file Name hello"
wait

echo ''
echo '*************************************************'
echo '********** End command line tests      **********'
echo '*************************************************'
