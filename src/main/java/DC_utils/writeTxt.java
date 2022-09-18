package DC_utils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class writeTxt {
    public static void writeAnswer(float f) throws Exception {
        String path = "src/main/resources/answer.txt";
        float m = f*100;
        BigDecimal b = new BigDecimal(m);
        m = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue(); //保留两位小数
        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path, true)));
        out.write( "所测试的两个文本重复度为  %" + m +"\n");
        out.close();
    }
}
