package com.example;

public class Polynomial {
    // coefficients 係數, exponents 指數
    private int[] coef; // coef[i] is the coefficient for x^i

    // Constructor to create a polynomial with a given degree
    // 建立一個具有指定exponent指數的多項式
    public Polynomial(int degree) {
        coef = new int[degree + 1];
    }

    // Constructor to create a polynomial with given coefficients
    // 建立一個具有指定coefficient係數的多項式
    public Polynomial(int[] coefficients) {
        coef = coefficients.clone();
    }

    // Return the number of non-zero terms
    public int numTerms() {
        int count = 0;
        for (int c : coef) {
            if (c != 0) count++;
        }
        return count;
    }

    // Return the coefficient for exponent e
    public int getCoef(int e) {
        if (e < 0 || e >= coef.length) return 0;
        return coef[e];
    }

    // Return the highest exponent with a non-zero coefficient
    // 返回具有非零係數的最高指數
    public int leadExp() {
        for (int i = coef.length - 1; i >= 0; i--) {
            if (coef[i] != 0) return i;
        }
        return -1;
    }

    // Add another polynomial
    public static Polynomial add(Polynomial poly1, Polynomial poly2) {
        int maxDegree = Math.max(poly1.leadExp(), poly2.leadExp());
        int[] resultCoef = new int[maxDegree + 1];
        // Iterate from the maximum degree through each exponent
        // 從最大指數開始迭代每個指數
        while(maxDegree >= 0) {
            resultCoef[maxDegree] = poly1.getCoef(maxDegree) + poly2.getCoef(maxDegree);
            maxDegree--;
        }
        return new Polynomial(resultCoef);
    }

    // Multiply with another polynomial
    public Polynomial mult(Polynomial poly) {
        int degree = this.leadExp() + poly.leadExp() + 1;
        int[] result = new int[degree];
        for (int i = 0; i < this.coef.length; i++) {
            for (int j = 0; j < poly.coef.length; j++) {
                result[i + j] += this.coef[i] * poly.coef[j];
            }
        }
        return new Polynomial(result);
    }

    // Evaluate for a given value
    public float eval(float x) {
        float result = 0;
        for (int i = coef.length - 1; i >= 0; i--) {
            result = result * x + coef[i];
        }
        return result;
    }

    // (Optional) Set coefficient for an exponent
    public void setCoef(int exp, int value) {
        if (exp >= coef.length) {
            int[] newCoef = new int[exp + 1];
            System.arraycopy(coef, 0, newCoef, 0, coef.length);
            coef = newCoef;
        }
        coef[exp] = value;
    }

    public static int compare(Polynomial one, Polynomial another){
        
        // Compare coefficients of all the exponent
        int maxDegree = Math.max(one.leadExp(), another.leadExp());
        for (int i = maxDegree; i >= 0; i--) {
            int coef1 = one.getCoef(i);
            int coef2 = another.getCoef(i);
            if (coef1 > coef2) {
                return 1; // one is greater
            } else if (coef1 < coef2) {
                return -1; // another is greater
            }
        }
        return 0; // They are equal
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coef.length; i++) {
            if (coef[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coef[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }
}
