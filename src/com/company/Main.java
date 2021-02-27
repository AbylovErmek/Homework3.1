package com.company;

public class Main {

    public static void main(String[] args) {
        home();
    }

    public static void home (){
        double[] array2 = {1.2,-1.5,-3.5, 3.6, 5.6,-8.7, 6.0, 9.0,-5.6, 8.0,-3.7,6.5,-3.5,6.8,7.5};
        double cow = 0.0;
        int raight = 0;
        boolean fly = false;
        for (double home3:array2) {
            if(home3 < 0){
                fly = true;
            }else if(fly){
                cow += home3;
                raight++;

            }
        }
        double answer = cow/raight;


        System.out.println(answer);
    }


}
