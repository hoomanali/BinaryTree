package com.alihooman.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeFileHandlerTest {

    @Test
    void setFilePathValidPath() {
        String path = "/Users/ali/Desktop/rp.txt";
        TreeFileHandler treeFileHandler = new TreeFileHandler(path);
        assertTrue(treeFileHandler.setFilePath(path));
    }

    @Test
    void setFilePathInvalidPath() {
        String path = "doesnotexist";
        TreeFileHandler treeFileHandler = new TreeFileHandler(path);
        assertFalse(treeFileHandler.setFilePath(path));
    }

    @Test
    void setFilePathNoPath() {
        String path = "";
        TreeFileHandler treeFileHandler = new TreeFileHandler("");
        assertFalse(treeFileHandler.setFilePath(path));
    }

    @Test
    void setFilePathNullPath() {
        TreeFileHandler treeFileHandler = new TreeFileHandler("/Users/ali/Desktop/rp.txt");
        assertFalse(treeFileHandler.setFilePath(null));
    }

    @Test
    void getFilePath() {
        String path = "/Users/ali/Desktop/rp.txt";
        TreeFileHandler treeFileHandler = new TreeFileHandler(path);
        assertEquals(path, treeFileHandler.getFilePath().toString());
    }
}