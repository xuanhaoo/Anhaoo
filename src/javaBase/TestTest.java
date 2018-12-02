package javaBase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxuanhao
 * @date 2018年06月23日  11:40
 */
public class TestTest {

    public static void main(String[] args) {

//        String x = "hello";
//        int y = 7;
//        x = x + y;
//        System.out.println(x);
        List<String> jj = new ArrayList<>();
        jj.add("uio1");
        jj.add("uio2");
        jj.add("uio3");
        jj.add("uio4");
        jj.add("uio5");

        List<HH> kk = new ArrayList<>();
        HH hh = new HH();
        hh.setCode("uio5");
        kk.add(hh);
        for (HH m : kk) {
            jj.remove(m.getCode());
        }

        for (String o : jj) {
            System.out.println(o);
        }



    }
}
class  HH {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;


}



