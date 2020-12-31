import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        ArrayList<Building>Buidlings= new ArrayList<Building>();
       
        Buidlings.add(new Building(1000));
        Buidlings.add(new Building(1500));
        Buidlings.add(new Building(2000));
        Buidlings.add(new Building(7600));
        Buidlings.add(new Building(8500));
        Buidlings.add(new Building(10000));
        Buidlings.add(new Building(5000));
        Buidlings.add(new Building(6400));
        Buidlings.add(new Building(15000));
        Buidlings.add(new Building(20000));
        Collections.sort(Buidlings);

        int minPixelValue=10;
        int maxPixelValue=48;
        int midNum;
        
        //seeting lowest value and finding ratio 
        Buidlings.get(0).setRadius(minPixelValue); 
        double ratio= Math.sqrt(Buidlings.get(0).getSquareFeet())/ Buidlings.get(0).getRadius();
        int numSteps= (maxPixelValue)/Buidlings.size();
    
        //step values
        for(int j=minPixelValue; j <= maxPixelValue; j+=numSteps){

            
            for(int i = 1; i <Buidlings.size();i++){
                //accruate radius for each squarefootage amount
                double SqRt= Math.sqrt(Buidlings.get(i).getSquareFeet());

                //adjust accurate radius based off of the lowest value ex 10 px = 100sqft
                double newRadius= SqRt / ratio;

                //for finding correct midNum
                if(((j+numSteps)-j)%2==0){
                    midNum=((j+(numSteps/2)));
                }
                else{
                    midNum=((j+(numSteps/2))+1);
                }
              
                if( (int)newRadius > midNum){
                    Buidlings.get(i).setRadius(j+numSteps);
                }
            }   
        
        }

        for(int i = 0; i <Buidlings.size();i++){
            System.out.println("Square Feet: "+Buidlings.get(i).getSquareFeet());
            System.out.println("Radius: "+Buidlings.get(i).getRadius());
    }   

       new CircleCreate(Buidlings);

    }
}