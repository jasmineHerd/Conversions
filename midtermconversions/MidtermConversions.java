/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermconversions;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jasmineherd
 */
public class MidtermConversions {

    static Scanner sc = new Scanner(System.in);
    static boolean usingk = false;
    static DecimalFormat df = new DecimalFormat("#.00");
    
    public static void main(String[] args) {
        int cvtype;

        System.out.println("Welcome to the Standard-to-Metric Converter");
       
        System.out.println("On Temp conversions, would you also like to see "
                + "degrees Kelvin (K) in the results? (Y/N): ");
       if(sc.nextLine().substring(0,1).equalsIgnoreCase("Y")){
           usingk = true;
       }
       

        
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
        int cv;//conversion type
              do{
                try{
                    System.out.print("Select  conversion type"
                            + "(1=mi-to-km, 2=oz-to-g, 3=f-to-c, 0=end)");
                    cv = sc.nextInt();
                   if(cv<0 || (cv > 3)){
                        System.out.print("Conversion type ERROR.\n");
                    }

               }catch(Exception e){
                   System.out.println("Illegal input: positive numbers over 3 only");
                   sc.nextLine();
                   cv = -1;
               }

            }while(cv < 0 || cv >3);

        return cv;

    }




   public static void MitoKm(){
       double mi,km;
       mi = getValue("Miles");
       km = 1.60934 * mi ;
       
       System.out.println("The distance of "+ mi +
               " mile(s) converted to kilometer(s)= "+ df.format(km)); 

   }
  
      public static void OztoG(){
       double oz,gr;
       oz = getValue("Ounces");
       gr = 28.3495 * oz ;

       System.out.println("The measurement of " +oz+ " to grams= "+
               df.format(gr));
       
       
   }
      
      public static void FtoC(){
       double tF,tC;
       tF = getValue("Farenhite temperature");
      tC = ( tF - 32.0) * (5.0 / 9.0);
      
      if(tC%1==0){
          System.out.println("A temp of " + tF + " Farenheit converted to Celsius "
                  +String.format("%.0f",tC));
      }else{
 
       System.out.println("A temp of "+tF+
               " Farenheit converted to Celsius= " +
               df.format(tC) );}
 
       if(usingk == true){
              showDegreesK(tC);}
       

   }
      

    public static double  getValue(String convtype){
        boolean badval = true;
        double v = 0;
        

        do{
           try{
                System.out.print("Enter your "+ convtype + ":");
                v = sc.nextDouble();
                
                if(!convtype.equals("Farenhite temperature")&& v < 0){
                    System.out.println("Input must be positive");
                }else{
                badval = false;}
                
                }catch(Exception e){
                   System.out.print("Illegal input: positive numbers over 3 only");
                   sc.nextLine();
                  badval = true;
               }

            }while(badval);
        return v;
    }  
         
         
public static void showDegreesK(double c){
    double tK;

    tK = c + (273.15);
    if(tK < 0){
        System.out.println("This temperature is not possible, as it is below 0 K");

    }else{
        System.out.println("This is also a temperature of: "+
                df.format(tK)+" K");
    }

}






















}
