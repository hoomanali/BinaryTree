# BinaryTree

# Purpose
This project is mainly an exercise in strengthening my knowledge of Binary Trees and Java. This README serves as both a reference and design document to help guide the development process.

# Notes
* Java 8 minimum requirement.

# Binary Search Tree Properties
_Most of this information has been collected from the CLRS Algorithms book._

## Node Structure ##
Each node will contain an integer _value_, and point to its _left_ and _right_ children and _parent_ nodes.

# Application Modules

## TreeFileHandler
Handles all operations for files that store the node structure and values for binary trees.

### Methods

#### setFilePath()
Takes a filename or full path as a string and verifies that the path is valid and the file exists. Returns true if path and file are valid.

#### readTreeFile()
Takes a binary tree file name and/or directory as a parameter and returns an array representing the nodes of a binary tree.
