package src;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {
        try {
            File sourceFile = new File("./source");
            File targetFile = new File("./target");
            FileInputStream is = new FileInputStream(sourceFile);
            FileOutputStream os = new FileOutputStream(targetFile);
            byte[] bytes = new byte[1024];
            int length;
            int totalBytes = 0;
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
                totalBytes += length;
            }
            System.out.println(totalBytes);

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
