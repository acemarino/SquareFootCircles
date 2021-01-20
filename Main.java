import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
public class Main{

    //for when max pixel value is exceeded (reccursion)
    public static void reCalc(ArrayList<Building>Data,int minp, int d, int maxp){
        double NewLowRad =Data.get(0).getRadius()-d;
        System.out.println("Square Feet: "+Data.get(0).getSquareFeet());
        System.out.println("NewLowRadius: "+NewLowRad);
        
        Data.get(0).setRadius((int)NewLowRad);
        double newRatio= Math.abs(NewLowRad)/minp;
        System.out.println("NewRatio: "+NewLowRad);
        
        for(int i=1; i< Data.size();i++){
            double SRoot=Math.sqrt(Data.get(i).getSquareFeet());
            double newRadius= SRoot/ newRatio;
            if((int)newRadius>maxp){
                int difference = ((int)newRadius-maxp);
                reCalc(Data, minp, difference, maxp);
            }
            Data.get(i).setRadius((int)newRadius);
        }
        
    }

    //generates final radial values
    public static void genRadialVals(ArrayList<Building>Data, int minP, int maxP, double midNum,double r){
        
        int numSteps= (maxP)/Data.size();
        if(numSteps < 2){
            numSteps = 2;
        }

        //step values
        for(int j=minP; j <= maxP; j+=numSteps){
        
            
            for(int i = 1; i <Data.size();i++){
                //accruate radius for each squarefootage amount
                double SqRt= Math.sqrt(Data.get(i).getSquareFeet());

                //adjust accurate radius based off of the lowest value ex 10 px = 100sqft
                double newRadius= SqRt / r;

                //for finding correct midNum
                midNum=((j+((double)numSteps/2)));
                
                if( newRadius >= midNum){
                    Data.get(i).setRadius(j+numSteps);
                }
            } 

            //resets lowest square footage amount to minPixel Value
            if(j== (maxP - numSteps)  && Data.get(0).getRadius()>minP || Data.get(0).getRadius()<minP){

                Data.get(0).setRadius(minP);
            } 

        }
    }

    //for finding the ratio that will be used to generate radial values later
    public static double genRatioValue(ArrayList<Building>Data, int minP, int maxP){
        //seting lowest value and finding ratio 
        Data.get(0).setRadius(minP); 
        double ratio = Math.sqrt(Data.get(0).getSquareFeet())/minP;

        double maxRadius =Math.sqrt(Data.get(Data.size()-1).getSquareFeet())/ratio;
        if((int)maxRadius>maxP){
            //double difference = maxRadius - maxP;
            //ratio =Math.abs((minP-difference)/minP);
            ratio=Math.sqrt(Data.get(Data.size()-1).getSquareFeet())/maxP;
        }
        return ratio;
    }


    
    
    public static void main(String[] args){

        ArrayList<Building>Buidlings= new ArrayList<Building>();
       
        
        Buidlings.add(new Building(100));
        Buidlings.add(new Building(400));
        Buidlings.add(new Building(750));
        Buidlings.add(new Building(1000));
        Buidlings.add(new Building(1500));
        Buidlings.add(new Building(1500));
        Buidlings.add(new Building(2000));
        Buidlings.add(new Building(7600));
        Buidlings.add(new Building(8500));
        Buidlings.add(new Building(10000));
        Buidlings.add(new Building(5000));
        Buidlings.add(new Building(6400));
        Buidlings.add(new Building(15000));
        Buidlings.add(new Building(20000));
       
        /*
        for(int count=0; count<=1000;count++){
            randSqFt=(int)(Math.random()*20000+10);
            Buidlings.add(new Building(randSqFt));
        }
        */
        Collections.sort(Buidlings);

        int minPixelValue=10;
        int maxPixelValue=48;
        double midNum=0.00;

        double ratio = genRatioValue(Buidlings, minPixelValue, maxPixelValue);
        System.out.println("ratio: "+ratio);
        
        genRadialVals(Buidlings,minPixelValue, maxPixelValue, midNum, ratio);
        
        for(int i = 0; i <Buidlings.size();i++){
            System.out.println("Square Feet: "+Buidlings.get(i).getSquareFeet());
            System.out.println("Radius: "+Buidlings.get(i).getRadius());
    }   

    //new CircleCreate(Buidlings);

    }
   

    
}