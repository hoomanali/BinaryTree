# BinaryTree

# Purpose
This project is mainly an exercise in strengthening my knowledge of Binary Trees and Java.
This README serves as both a reference and design document to help guide the development process.

# Notes
* Java 8 minimum requirement.

# Binary Search Tree Properties
_Most of this information has been collected from the CLRS Algorithms book._

## Node Structure ##
Each node will contain an integer `value`, and point to its `left` and `right` children 
and `parent1 nodes.

# Application Modules

## Main
Primary entry point for the application. Accepts a single argument from the command line,
the file containing the list of nodes of a Binary Tree.

### Usage
java BinaryTree /path/to/file`

## utils.MainHelper
Static class for helper methods used in main.

## utils.TreeFileHandler
Handles all operations for files that store the node structure and values for binary trees.

