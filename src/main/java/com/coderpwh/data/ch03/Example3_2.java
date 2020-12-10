package com.coderpwh.data.ch03;

/**
 * 大数相加
 *
 * @author coderpwh
 */
public class Example3_2 {


    public static void main(String[] args) throws Exception {
        Example3_2 e = new Example3_2();
        System.out.println("两个大数的和为："
                + e.add("18 452 543 389 943 209 752 345 473",
                "8 123 542 678 432 986 899 334"));

        System.out.println("两数之和为:"+e.add("1234 56","4967 81"));


    }

    /***
     *  两数相加
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public String add(String a, String b) throws Exception {
        LinkStack sum = new LinkStack();
        LinkStack sa = numSplit(a);
        LinkStack sb = numSplit(b);

        // 两数之和
        int partialSum;
        // 进位标识
        boolean isCarry = false;
        while (!sa.isEmpty() && !sb.isEmpty()) {

            partialSum = (Integer) sa.pop() + (Integer) sb.pop();
            if (isCarry) {
                partialSum++;
                isCarry = false;
            }

            if (partialSum >= 10) {
                partialSum = partialSum - 10;
                sum.push(partialSum);
                isCarry = true;
            } else {
                sum.push(partialSum);
            }
        }

        LinkStack temp = !sa.isEmpty() ? sa : sb;

        while (!temp.isEmpty()) {
            // 需要进位
            if (isCarry) {
                Integer t = (Integer) temp.pop();
                ++t;
                if (t >= 10) {
                    t = t - 10;
                    sum.push(t);
                    isCarry = false;
                } else {
                    sum.push(temp.pop());
                    isCarry = false;
                }
            } else {
                sum.push(temp.pop());
            }

        }

        if (isCarry) {
            sum.push(1);
        }

        String str = new String();
        while (!sum.isEmpty()) {
            str = str.concat(sum.pop().toString());
        }

        return  str;
    }


    /***
     *   将数字字符压入栈中
     * @param str
     * @return
     * @throws Exception
     */
    public LinkStack numSplit(String str) throws Exception {
        LinkStack s = new LinkStack();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            } else if (c >= '0' && c <= '9') {
                s.push(Integer.valueOf(String.valueOf(c)));

            } else {
                throw new Exception("错误:输入非数字型的字符!");
            }
        }
        return s;

    }


}
