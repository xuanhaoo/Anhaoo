package learn.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月21日 09:24
 */
public class Question3 {


    public static void main(String[] args) {

    }


    /**
     * 无重复字符的最长子串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        int n = s.length();
        // 子串长度
        int res = 0;
        Map<Character, Integer> map  = new HashMap<>();
        // 双指针，进行滑动
        for (int start = 0, end = 0; end < n; end++) {
            char tmp = s.charAt(end);
            if (map.containsKey(tmp)) {
                // 字符串不能包含重复字母，所以将start重置，后文res取得最大值
                start = Math.max(map.get(tmp), start);
            }
            res = Math.max(res, end - start + 1);
            map.put(tmp, end + 1);
        }
        return res;
    }
}
