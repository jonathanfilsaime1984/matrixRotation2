package com.company;

public class Main {

    public static void main(String[] args) {

        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        int x = 0;
        int y = 0;

        String[][] a = new String[4][4];

        a[0][0] = "A";
        a[0][1] = "B";
        a[0][2] = "C";
        a[0][3] = "D";
        a[1][0] = "E";
        a[1][1] = "F";
        a[1][2] = "G";
        a[1][3] = "H";
        a[2][0] = "I";
        a[2][1] = "J";
        a[2][2] = "K";
        a[2][3] = "L";
        a[3][0] = "M";
        a[3][1] = "N";
        a[3][2] = "O";
        a[3][3] = "P";

        print(a);


        for(int c = 0; c < 2; c++){

            if(c == 0 ){ x = 3; }
            if(c == 1 ){ x = 2; }
            if(c == 2 ){ x = 1; }
            if(c == 3 ){ x = 0; }

            for(int i = 0; i < 3 ; i++){

                if(i == 0 ){ y = 3; }
                if(i == 1 ){ y = 2; }
                if(i == 2 ){ y = 1; }
                if(i == 3 ){ y = 0; }

                if(c == 1 ){ i++; y--; }
                if(c == 2){ i = i + 2; y = y - 2; }
                if(c == 3){ i = i + 3; y = y - 3; }

                temp1 = a[i][x];
                a[i][x] = a[c][i];

                temp2 = a[x][y];
                a[x][y] = temp1;

                temp3 = a[y][c];
                a[y][c] = temp2;

                a[c][i] = temp3;

                if( c == 1 && i == 1){
                    break;
                }

            }
        }

        System.out.print("\n" + "inverted" + "\n" );

        print(a);

    }

    public static void print(String[][] t) {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(t[x][y] + ",");
            }
            System.out.print("\n");
        }
    }
}
