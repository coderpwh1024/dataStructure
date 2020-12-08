package com.coderpwh.data.ch02;

/***
 *  多项式结点
 * @author coderpwh
 */
public class PolyNode {

    /***
     *  系数
     */
    public double coef;

    /***
     *  指数
     */
    public int expn;

    public PolyNode(double coef, int expn) {
        this.coef = coef;
        this.expn = expn;
    }
}
