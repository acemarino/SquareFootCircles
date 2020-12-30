import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        ArrayList<Building>Buidlings= new ArrayList<Building>();
       
        Buidlings.add(new Building(1000,10));
        Buidlings.add(new Building(2000,10));
        Buidlings.add(new Building(10000,10));
        Buidlings.add(new Building(5000,10));
        Buidlings.add(new Building(15000,10));
        Collections.sort(Buidlings);
    
        for(int i =0; i <Buidlings.size();i++){
            if(i == 0){
                Buidlings.get(i).setRadius(10); 
            }
            else if(i == Buidlings.size()-1){
                Buidlings.get(i).setRadius(48);
            }
            else{
                double SqRt= Math.sqrt(Buidlings.get(i).getSquareFeet());
                Buidlings.get(i).setRadius((int)SqRt);
            }
            

            System.out.println("Square Feet: "+Buidlings.get(i).getSquareFeet());
            System.out.println("Radius: "+Buidlings.get(i).getRadius());
        
        }

        
       //new CircleCreate(Buidlings);

    }
}