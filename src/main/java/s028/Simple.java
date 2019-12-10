/*
 * A simple Java source file
 */
package s028;

import java.lang.Math; // not required

/**
 * @author manny
 */
public class Simple {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        int alpha = 12;
        int beta = 21;
        int gamma = 12;
        System.out.println("alpha < beta? " + (alpha < beta)); // true
        System.out.println("alpha < gamma? " + (alpha < gamma)); // false
        System.out.println("alpha <= gamma? " + (alpha <= gamma)); // true
        System.out.println("alpha > beta? " + (alpha > beta)); // false
        System.out.println("alpha > gamma? " + (alpha > gamma)); // false
        System.out.println("alpha >= gamma? " + (alpha >= gamma)); // true
        System.out.println("alpha == beta? " + (alpha == beta)); // false
        System.out.println("alpha == gamma? " + (alpha == gamma)); // true
        System.out.println("alpha != beta? " + (alpha != beta)); // true
        System.out.println("alpha != gamma? " + (alpha != gamma)); // false
    }
}

class PackageClass {
    // TBD
}