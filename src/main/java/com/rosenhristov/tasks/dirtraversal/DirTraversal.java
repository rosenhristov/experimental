package com.rosenhristov.tasks.dirtraversal;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class DirTraversal {

    public static void main(String[] args) {
        DirTraversal dirTraversal = new DirTraversal();
        Set<File> dirs = new HashSet<>();
        dirTraversal.traverseDir("C:\\", dirs);
    }


    void traverseDir(String directoryPath, Set<File> dirs) {
        traverseDir(new File(directoryPath), new String(), dirs);
    }

    void traverseDir(File dir, String spaces, Set<File> dirs) {
        if (!isValidDir(dir)) {
            return;
        }
        dirs.add(dir);
        System.out.println(dirs.size() + ": " + spaces + dir.getAbsolutePath());
        File[] children = dir.listFiles();
        if (isNull(children) || children.length == 0) {
            return;
        }
        for (File child : children) {
            traverseDir(child, spaces + "  ", dirs);
        }
    }

    static boolean isValidDir(File dir) {
        return nonNull(dir) && dir.exists() && dir.isDirectory();
    }
}
