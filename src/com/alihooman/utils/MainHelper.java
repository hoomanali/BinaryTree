package com.alihooman.utils;

/**
 * Helper class with useful functions for main method.
 */
public class MainHelper {

    /**
     * Checks command line arguments for valid input.
     * @param args Arguments from the command line.
     * @return True if args array is valid.
     */
    public static boolean checkArgs(String[] args) {
        if(hasOneElement(args)) {
            return true;
        }
        printUsageMessage();
        return false;
    }

    /**
     * Make sure args array has exactly one element.
     * @param args Arguments from the command line.
     * @return True if args array has exactly one element.
     */
    private static boolean hasOneElement(String[] args) {
        if(args.length < 0 || args.length > 1) {
            return false;
        }
        return true;
    }

    /**
     * Prints usage instructions to command line.
     * @return Usage instructions as a string.
     */
    private static String printUsageMessage() {
        String usage = "Usage: java BinaryTree treefile";
        System.out.println(usage);
        return usage;
    }

}
