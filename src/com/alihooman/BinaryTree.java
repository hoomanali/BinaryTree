package com.alihooman;

public class BinaryTree {

    /**
     * Main entry point for BinaryTree application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        checkArgs(args);
    }

    /**
     * Checks if command line arguments have been provided.
     * Prints usage instructions and quits if no arguments provided or if more
     * than one argument is given. Otherwise, checks for a valid file
     * and proceeds.
     * @param args Command line arguments.
     */
    static void checkArgs(String[] args) {
        final String TAG ="[BinaryTree] ";

        if(args.length < 1) {
            System.out.println(TAG + "No filename provided.");
            System.out.println(TAG + "Usage: java BinaryTree filename");
            System.exit(0);
        } else if(args.length > 1) {
            System.out.println(TAG + "Too many arguments, use quotes for filenames containing spaces");
            System.out.println(TAG + "Usage: java BinaryTree \"file name\"");
            System.exit(0);
        } else {
            //TODO Check if file exists and is valid.
            System.out.println(TAG + "Tree file: " + args[0]);
        }
    }
}
