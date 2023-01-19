package sdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello World!");

    
        String dirPath ="data";
        String fileName = "data.txt";


        // create a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated) {
            System.out.println("New directory " + dirPath + " created");
        }
        else {
            System.out.println("Directory " + dirPath + " already exists");
        }


        // create a file in the directory above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated) {
            System.out.println("New file " + fileName + " is created");
        } 
        else {
            System.out.println("File " + fileName + " already exists");
        }



        // list files under a directory
        File fileList[] = newDir.listFiles();
        for(File f : fileList) {
            System.out.println("File " + f.getCanonicalPath() + ":" + f.getCanonicalFile());
        }

      
        // use FileOutputStream to write some intgers to file "data.txt"
        // Must set the append to ‘true’ so that every time it writes, it will append instead of overwriting.
        // Setting it to false will overwrite the file.
        FileOutputStream fos = new FileOutputStream(newFile, true);
        for (int i = 0; i < 10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }




        // trying to write a string message
        String welcomeMessage = "Welcome to ISS TFIP programme";

        //fos.write is expecting a byte array so we have to convert to byte array
        // convert string to byte array using getBytes function
        byte outPutData[] = welcomeMessage.getBytes();

        // writing the string to byte array, one character at at time to the file
        fos.write(outPutData);


        // the flush clears the OutputStream 
        // force data to store to the file destination
        fos.flush();
        fos.close();























        // Below is first part of classes today

        // CollectionSortExample cse = new CollectionSortExample();
        // cse.example02();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackExample se = new StackExample();
        // se.example();

    }
}