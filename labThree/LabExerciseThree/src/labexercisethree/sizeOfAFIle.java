/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * @author yasin
 */
import java.nio.file.Paths;
public class sizeOfAFIle {
    public static void main(String[] args) {
        String fn = "/home/yasin/Pictures/ss.png";
        Path path = Paths.get(fn, args);
        try {

            // size of a file (in bytes)
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kilobytes", bytes / 1024));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
