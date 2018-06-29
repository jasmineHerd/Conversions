/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermconversions;

import java.util.Scanner;

/**
 *
 * @author jasmineherd
 */
public class MidtermConversions {

    static Scanner sc = new Scanner(System.in);
    static boolean usingk;
    public static void main(String[] args) {
        int cvtype;
        //display welcome message
        System.out.println("Welcome to the conversion calculator");

        //obtain 'display k?' Anser and set -->usingK boolean
        //System.out.println("Display K?");
        //usingk = sc.nextBoolean();
        
        




        
        cvtype = getCVType();



        while(cvtype != 0){
            switch(cvtype){
                case 1:
                    MitoKm();
                    break;
                case 2:
                    OztoG();
                    break;
                case 3:
                    FtoC();
                    break;
                default:
                    System.out.println("Error");
                    break;}
            cvtype = getCVType();                
        
    }
       System.out.println("Thanks for using the conversion calculator");

    }//end main




    public static int getCVType(){
        int cv;
              do{
                try{
                    System.out.print("Select  conversion type"
                            + "(1=mi-to-km, 2=oz-to-g, 3=f-to-c, 0=end)");
                    cv = sc.nextInt();
                   if(cv<0 || (cv > 3)){
                        System.out.print("Conversion type ERROR.");
                    }

               }catch(Exception e){
                   System.out.println("Illegal input: positive numbers over 3 only");
                   sc.nextLine();
                   cv = -1;

               }

            }while(cv < 0 || cv >3);

        return cv;

    }


   public static double  getValue(String convtype){
        boolean badval;
        double v;


        //do{
           // try{
                System.out.print("convtype TEMP?");
                v = sc.nextDouble();
                badval = false;
                /*}catch(Exception e){
                   System.out.println("Illegal input: positive numbers over 3 only");
                   sc.nextLine();
                  badval = false;
               }

            }while(badval=true);*/
        return v;
    }

   public static void MitoKm(){
       double mi,km;
       mi = getValue("miles");
       km = mi * 1.60934;
       System.out.println(km); 

   }
   /*
      public static void OztoG(){
       double oz,gr;
       oz = getValue();
       gr = oz * 28.3495;
       

   }
      public static void FtoC(){
       double tF,tC;
       tF = getValue(faren);
       tC = (tF-32) * (5/9);
       return tC;

   }*/
public static void showDegreesK(double c){
    double tK;

    tK = c +273.15;
    if(tK<0){
        System.out.println("Error message");

    }else{
        System.out.println(tK);
    }

}























}
