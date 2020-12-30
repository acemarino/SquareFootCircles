import java.util.ArrayList;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        ArrayList<Building>Buidlings= new ArrayList<Building>();
       
        Buidlings.add(new Building(1000.00,10));
        Buidlings.add(new Building(2000.00,10));
        Buidlings.add(new Building(10000.00,10));
        Buidlings.add(new Building(5000.00,10));
        Buidlings.add(new Building(15000.00,10));
    
        for(int i =0; i <Buidlings.size();i++){
            double SqRt= Math.sqrt(Buidlings.get(i).getSquareFeet());
            
            Buidlings.get(i).setRadius((int)SqRt);
        
        }
        
       new CircleCreate(Buidlings);

    }
}