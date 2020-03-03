#!/bin/bash

CLASSPATH='-classpath /Users/ali/Code/Java/BinaryTree/out/production/BinaryTree'
CLASS='com.alihooman.BinaryTree'

echo $CLASSPATH
echo $CLASS

echo '********** Starting command line tests **********'
echo '********** Run without arguments       **********'
echo ''

java $CLASSPATH $CLASS
wait

echo ''
echo '********** Run with arguments          **********'
echo ''

java $CLASSPATH $CLASS fileName
wait

echo ''
echo '********** Run with too many arguments **********'
echo ''

java $CLASSPATH $CLASS Name hello
wait

echo ''
echo '********** Run with quoted arguments   **********'
echo ''

java $CLASSPATH $CLASS "file Name hello"
wait

echo ''
echo '********** End command line tests      **********'
