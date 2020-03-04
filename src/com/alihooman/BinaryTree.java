package com.alihooman;

import com.alihooman.utils.TreeFileHandler;

public class BinaryTree {

    static String TAG ="[BinaryTree - Main] ";

    /**
     * Main entry point for BinaryTree application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        checkArgs(args);

        TreeFileHandler treeFileHandler = new TreeFileHandler();
        if(treeFileHandler.setFilePath(args[0])) {
            System.out.println(TAG + "Path is " + treeFileHandler.getFilePath().toString());
        } else {
            System.exit(0);
        }
    }

    /**
     * Checks if command line arguments have been provided.
     * Prints usage instructions and quits if no arguments provided or if more
     * than one argument is given. Otherwise, checks for a valid file
     * and proceeds.
     * @param args Command line arguments.
     */
    static void checkArgs(String[] args) {

        if(args.length < 1) {
            System.out.println(TAG + "No filename provided.");
            System.out.println(TAG + "Usage: java BinaryTree filename");
            System.exit(0);
        } else if(args.length > 1) {
            System.out.println(TAG + "Too many arguments, use quotes for filenames containing spaces");
            System.out.println(TAG + "Usage: java BinaryTree \"file name\"");
            System.exit(0);
        }
    }
}
