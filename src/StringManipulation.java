/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class StringManipulation
 *Name: Parker
 *Created 11/16/2020
 */

/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  StringManipulation purpose: take in a text file and manipulate the string
 *  @author Parker
 *  @version created on 11/16/2020 at 2:38 PM
 */

import java.io.*;
public class StringManipulation {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\Desktop\\txt\\tierlist.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = " - ";
        int sLength = s.length();
        String line;


        while ((line = br.readLine()) != null) {
            line = line.substring(line.indexOf(s)+sLength);
            line  = line.substring(0,line.indexOf(s));
            System.out.println(line);

        }

    }



}


