package com.selflearning.design.pattern;

import java.io.FileWriter;
import java.io.IOException;

/**
 * The Execute Around idiom specifies some code to be executed before and after a method. Typically
 * the idiom is used when the API has methods to be executed in pairs, such as resource
 * allocation/deallocation or lock acquisition/release.
 * <p>
 * In this example, we have {@link SimpleFileWriter} class that opens and closes the file for the
 * user. The user specifies only what to do with the file by providing the {@link FileWriterAction}
 * implementation.
 *
 */
public class MethodAroundExecute {

    /**
     * Program entry point
     */
    public static void writeFile() {

        try {
            new SimpleFileWriter("testfile.txt", new FileWriterAction() {

                @Override
                public void writeFile(FileWriter writer) throws IOException {
                    // 真正关心的"读写"逻辑
                    writer.write("Hello");
                    writer.append(" ");
                    writer.append("there!");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/**
 *
 * Interface for specifying what to do with the file resource.
 *
 */
interface FileWriterAction {

    void writeFile(FileWriter writer) throws IOException;

}

/**
 *
 * SimpleFileWriter handles opening and closing file for the user. The user only has to specify what
 * to do with the file resource through {@link FileWriterAction} parameter.
 *
 */
class SimpleFileWriter {

    /**
     * Constructor
     */
    public SimpleFileWriter(String filename, FileWriterAction action) throws IOException {
        FileWriter writer = new FileWriter(filename); // 读写前的操作(before)
        try {
            action.writeFile(writer); // 读写(doing)
        } finally {
            writer.close(); // 读写后的操作(finish)
        }
    }
}

