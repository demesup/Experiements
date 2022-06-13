package algorithmsAndDataStructures;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFile {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFile(new File("D:\\"), fileList);
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }

    public static void searchFile(File rootFile, List<File> files) {
        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFile(file, files);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            files.add(file);
                        }
                    }

                }
            }
        } else System.out.println("error");
    }
}
