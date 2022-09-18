package DC_main;

import DC_utils.getSimilarity;
import DC_utils.readTxt;
import DC_utils.writeTxt;

import java.io.File;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        readTxt read = new readTxt();
        getSimilarity gs = new getSimilarity();
        writeTxt write = new writeTxt();
        String str = null, str1 = null, str2 = null, str3 = null, str4 = null, str5 = null;
        File file = new File("src/main/resources/orig.txt");
        File file1 = new File("src/main/resources/orig_0.8_add.txt");
        File file2 = new File("src/main/resources/orig_0.8_del.txt");
        File file3 = new File("src/main/resources/orig_0.8_dis_1.txt");
        File file4 = new File("src/main/resources/orig_0.8_dis_10.txt");
        File file5 = new File("src/main/resources/orig_0.8_dis_15.txt");
        //获得文本中的字符串并合成一个字符串
        try {
            str = read.getTxt(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            str1 = read.getTxt(file1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            str2 = read.getTxt(file2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            str3 = read.getTxt(file3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            str4 = read.getTxt(file4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            str5 = read.getTxt(file5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获得两个字符串的相似度并写入文件
        Scanner sc = new Scanner(System.in);
        System.out.println("choose operation : 0/1/2/3/4/5");// 0为退出，1——5对应源文件与1——5号测试文件的比较
            switch (sc.nextInt()) {
                case (0):
                    break;
                case (1):
                    try {
                        write.writeAnswer(gs.cos(str, str1));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case (2):
                    try {
                        write.writeAnswer(gs.cos(str, str2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case (3):
                    try {
                        write.writeAnswer(gs.cos(str, str3));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case (4):
                    try {
                        write.writeAnswer(gs.cos(str, str4));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case (5):
                    try {
                        write.writeAnswer(gs.cos(str, str5));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
    }
    }

