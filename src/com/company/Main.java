package com.company;

public class Main {

    public static void main(String[] args) {

        String[] a1 = {"A","B","C","D"};
        String[] a2 = {"E","F","G","H"};
        String[] a3 = {"I","J","K","L"};
        String[] a4 = {"M","N","O","P"};

        print(a1);
        print(a2);
        print(a3);
        print(a4);

        String temp1;
        String temp2;
        int y;

        for(int x = 0; x < 4; x++){
            if( x == 0 ){
                temp1 = a1[3];
                a1[3] = a1[x];
                y = 3;
                temp2 = a4[y];
                a4[y] = temp1;
                a1[x] = temp2;}

            if( x == 1 ){
                temp1 = a2[3];
                a2[3] = a1[x];
                y = 2;
                temp2 = a4[y];
                a4[y] = temp1;
                a1[x] = temp2;}

            if( x == 2 ){
                temp1 = a3[3];
                a3[3] = a1[x];
                y = 1;
                temp2 = a4[y];
                a4[y] = temp1;
                a1[x] = temp2;}

            if( x == 3 ){
                temp1 = a4[3];
                a4[3] = a1[x];
                y = 0;
                temp2 = a4[y];
                a4[y] = temp1;
                a1[x] = temp2;}
        }

        System.out.print("\n" + "inverted" + "\n" + "\n");

        print(a1);
        print(a2);
        print(a3);
        print(a4);

    }

    public static void print(String[] t){
        for(int x = 0; x < 4; x++ ){
            System.out.print(t[x] + ",");
        }
        System.out.print("\n");
    }
}
