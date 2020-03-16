package com.alihooman.utils;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TreeFileHandler {
    final String TAG = "[BinaryTree: TreeFileHandler] ";
    Path path;

    /**
     * Blank constructor for TreeFileHandler class.
     */
    public TreeFileHandler(String path) {
        setFilePath(path);
    }

    /**
     * Sets TreeFileHandler object's path variable and checks if the path and file
     * name are valid and exist.
     * @param path String representation of the file name and/or absolute or relative path.
     * @return True if path is valid and file exists.
     */
    public boolean setFilePath(String path) {
        if(path == null) {
            System.out.println(TAG + "Path not set, path is null.");
            return false;
        }
        if(path.equals("")) {
            System.out.println(TAG + "Path not set, no path given.");
            return false;
        }

        // Create path
        this.path = Paths.get(path);

        // Check if path exists
        try {
            this.path = this.path.toRealPath();
        } catch(NoSuchFileException e) {
            System.out.println(TAG + "File not found: " + path);
            return false;
        } catch(IOException e) {
            System.out.println(TAG + e);
            return false;
        }

        return true;
    }

    /**
     * Retrieves the TreeFileHandler object's path variable.
     * @return The current TreeFileHandler's path, can be null.
     */
    public Path getFilePath() {
        return this.path;
    }

}
