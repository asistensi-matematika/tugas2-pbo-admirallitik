/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAsistensi3;

/**
 *
 * @author Admiral Litik
 */
public class bilKompleks {
    private String komp1;
    private String komp2;

    public bilKompleks() {
        this.komp1 = "0+0i";
        this.komp2 = "0+0i";
    }

    public bilKompleks(String komp1, String komp2) {
        this.komp1 = komp1;
        this.komp2 = komp2;
    }
    
    public void setKomp1(String komp1) {
        this.komp1 = klarifikasi(komp1);
    }

    public String getKomp1() {
        return komp1;
    }
    
    public void setKomp2(String komp2) {
        this.komp2 = klarifikasi(komp2);
    }

    public String getKomp2() {
        return komp2;
    }
    
    public String klarifikasi(String test){
        String[] x, y;
        String fix;
        char[] p = test.toCharArray();
        x = test.split("\\+");
        y = test.split("\\-");
        if (x.length == 1 && y.length == 2 && y[0].isEmpty()) {
            if (p[p.length - 1] == 'i') {
                char[] z = new char[p.length + 1];
                z[0] = '0';
                for (int i = 1; i < z.length; i++) {
                    z[i] = p[i - 1];
                }
                fix = String.valueOf(z);
            } else {
                char[] z = new char[p.length + 3];
                System.arraycopy(p, 0, z, 0, z.length - 3);
                z[z.length - 1] = 'i';
                z[z.length - 2] = '0';
                z[z.length - 3] = '+';
                fix = String.valueOf(z);
            }
        } else if (x.length == 1 && y.length == 1) {
            if (p[p.length - 1] == 'i') {
                char[] z = new char[p.length + 2];
                z[0] = '0';
                z[1] = '+';
                for (int i = 2; i < z.length; i++) {
                    z[i] = p[i - 2];
                }
                fix = String.valueOf(z);
            } else {
                char[] z = new char[p.length + 3];
                System.arraycopy(p, 0, z, 0, z.length - 3);
                z[z.length - 1] = 'i';
                z[z.length - 2] = '0';
                z[z.length - 3] = '+';
                fix = String.valueOf(z);
            }
        } else {
            fix = test;
        }
        return fix;
    }

    public void perkalianBilanganKompleks() {
        char[] temp_a = getKomp1().toCharArray();
        char[] temp1_a = new char[temp_a.length - 1];
        System.arraycopy(temp_a, 0, temp1_a, 0, temp_a.length - 1);

        String a = String.valueOf(temp1_a);
        String[] temp_1a, temp_2a;
        int[] Temp_a = new int[2];

        char[] temp_b = getKomp2().toCharArray();
        char[] temp1_b = new char[temp_b.length - 1];
        System.arraycopy(temp_b, 0, temp1_b, 0, temp_b.length - 1);

        String b = String.valueOf(temp1_b);
        String[] temp_1b, temp_2b;
        int[] Temp_b = new int[2];

        if (a.charAt(0) == '-') {
            char[] penampung_a = a.toCharArray();
            char[] penampung_A = new char[penampung_a.length - 1];
            for (int j = 0; j < penampung_a.length - 1; j++) {
                penampung_A[j] = penampung_a[j + 1];
            }
            String PenampungA = String.valueOf(penampung_A);
            temp_1a = PenampungA.split("\\+");

            if (temp_1a.length == 1) {
                temp_2a = PenampungA.split("\\-");
                Temp_a[0] = Integer.parseInt(temp_2a[0]) * -1;
                Temp_a[1] = Integer.parseInt(temp_2a[1]) * -1;
            } else {
                temp_2a = temp_1a;
                Temp_a[0] = Integer.parseInt(temp_2a[0]) * -1;
                Temp_a[1] = Integer.parseInt(temp_2a[1]);
            }

            if (b.charAt(0) == '-') {
                char[] penampung_b = b.toCharArray();
                char[] penampung_B = new char[penampung_b.length - 1];
                for (int j = 0; j < penampung_b.length - 1; j++) {
                    penampung_B[j] = penampung_b[j + 1];
                }
                String PenampungB = String.valueOf(penampung_B);
                temp_1b = PenampungB.split("\\+");

                if (temp_1b.length == 1) {
                    temp_2b = PenampungB.split("\\-");
                    Temp_b[0] = Integer.parseInt(temp_2b[0]) * -1;
                    Temp_b[1] = Integer.parseInt(temp_2b[1]) * -1;
                } else {
                    temp_2b = temp_1b;
                    Temp_b[0] = Integer.parseInt(temp_2b[0]) * -1;
                    Temp_b[1] = Integer.parseInt(temp_2b[1]);
                }
            } else {
                char[] penampung_B = b.toCharArray();
                String PenampungB = String.valueOf(penampung_B);
                temp_1b = PenampungB.split("\\+");

                if (temp_1b.length == 1) {
                    temp_2b = PenampungB.split("\\-");
                    Temp_b[0] = Integer.parseInt(temp_2b[0]);
                    Temp_b[1] = Integer.parseInt(temp_2b[1]) * -1;
                } else {
                    temp_2b = temp_1b;
                    Temp_b[0] = Integer.parseInt(temp_2b[0]);
                    Temp_b[1] = Integer.parseInt(temp_2b[1]);
                }
            }
        } else {
            char[] penampung_A = a.toCharArray();
            String PenampungA = String.valueOf(penampung_A);
            temp_1a = PenampungA.split("\\+");

            if (temp_1a.length == 1) {
                temp_2a = PenampungA.split("\\-");
                Temp_a[0] = Integer.parseInt(temp_2a[0]);
                Temp_a[1] = Integer.parseInt(temp_2a[1]) * -1;
            } else {
                temp_2a = temp_1a;
                Temp_a[0] = Integer.parseInt(temp_2a[0]);
                Temp_a[1] = Integer.parseInt(temp_2a[1]);
            }

            if (b.charAt(0) == '-') {
                char[] penampung_b = b.toCharArray();
                char[] penampung_B = new char[penampung_b.length - 1];
                for (int j = 0; j < penampung_b.length - 1; j++) {
                    penampung_B[j] = penampung_b[j + 1];
                }
                String PenampungB = String.valueOf(penampung_B);
                temp_1b = PenampungB.split("\\+");

                if (temp_1b.length == 1) {
                    temp_2b = PenampungB.split("\\-");
                    Temp_b[0] = Integer.parseInt(temp_2b[0]) * -1;
                    Temp_b[1] = Integer.parseInt(temp_2b[1]) * -1;
                } else {
                    temp_2b = temp_1b;
                    Temp_b[0] = Integer.parseInt(temp_2b[0]) * -1;
                    Temp_b[1] = Integer.parseInt(temp_2b[1]);
                }
            } else {
                char[] penampung_B = b.toCharArray();
                String PenampungB = String.valueOf(penampung_B);
                temp_1b = PenampungB.split("\\+");

                if (temp_1b.length == 1) {
                    temp_2b = PenampungB.split("\\-");
                    Temp_b[0] = Integer.parseInt(temp_2b[0]);
                    Temp_b[1] = Integer.parseInt(temp_2b[1]) * -1;
                } else {
                    temp_2b = temp_1b;
                    Temp_b[0] = Integer.parseInt(temp_2b[0]);
                    Temp_b[1] = Integer.parseInt(temp_2b[1]);
                }
            }
        }

        int count1 = Temp_a[0] * Temp_b[0] - Temp_a[1] * Temp_b[1];
        int count2 = Temp_a[0] * Temp_b[1] + Temp_a[1] * Temp_b[0];

        System.out.print("Output: ");
        if (count1 == 0) {
            if (count2 == 0) {
                System.out.println("0");
            } else {
                System.out.println(count2 + "i");
            }
        } else {
            if (count2 == 0) {
                System.out.println(count1);
            } else if (count2 > 0) {
                System.out.println(count1 + "+" + count2 + "i");
            } else {
                System.out.println(count1 + "-" + (-count2) + "i");
            }
        }
    }
}

