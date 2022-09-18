package DC_utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class readTxt {

    public static String getTxt(File s) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(s));
        String st;
        StringBuilder stringBuilder = new StringBuilder("");
        while ((st = br.readLine()) != null) {
            stringBuilder.append(st);  //将读到的字符串合成同一个字符串
        }
        br.close();
        return stringBuilder.toString();
    }
}



