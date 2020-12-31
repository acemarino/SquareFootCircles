import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        ArrayList<Building>Buidlings= new ArrayList<Building>();
       
        Buidlings.add(new Building(1000,10));
        Buidlings.add(new Building(1500,10));
        Buidlings.add(new Building(2000,10));
        Buidlings.add(new Building(7600,10));
        Buidlings.add(new Building(8500,10));
        Buidlings.add(new Building(10000,10));
        Buidlings.add(new Building(5000,10));
        Buidlings.add(new Building(6400,10));
        Buidlings.add(new Building(15000,10));
        Buidlings.add(new Building(20000,10));
        Collections.sort(Buidlings);

        int minPixelValue=10;
        int maxPixelValue=48;
        int midNum;
        Buidlings.get(0).setRadius(minPixelValue); 
        double ratio= Math.sqrt(Buidlings.get(0).getSquareFeet())/ Buidlings.get(0).getRadius();
        int numSteps= (maxPixelValue)/Buidlings.size();
    
        //step values
        for(int j=minPixelValue; j <= maxPixelValue; j+=numSteps){

            System.out.println("num step: " + j);
            //accruate radius for each squarefootage amount
            for(int i = 1; i <Buidlings.size();i++){
                double SqRt= Math.sqrt(Buidlings.get(i).getSquareFeet());
                double newRadius= SqRt / ratio;

                if(((j+numSteps)-j)%2==0){
                    midNum=((j+(numSteps/2)));
                }
                else{
                    midNum=((j+(numSteps/2))+1);
                }
                 
                
                System.out.println("MidNum: "+midNum);
                System.out.println("New Radius: "+newRadius);
                
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