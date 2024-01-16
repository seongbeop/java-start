package cond;

public class Switch1 {

    public static void main(String[] args) {
        // grage 1 : 1000, grage 2 : 2000, grage 3 : 3000
        int grage = 2;
        int coupon;

        if (grage == 1) {
            coupon = 1000;
        } else if (grage == 2) {
            coupon = 2000;
        } else if (grage == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
    }
}
