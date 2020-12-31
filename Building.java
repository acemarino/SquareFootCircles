public class Building implements Comparable{
    
    int SquareFeet;
    int radius;
    String key;

    public Building(int SqFt){
        SquareFeet=SqFt;
        radius=10;
        key=null;
    }

    void setSquareFeet(int S){
        SquareFeet = S;
    }
    void setRadius(int R){
        radius=R;
    }
    void setKey(String K){
        key=K;
    }

    int getSquareFeet(){
        return SquareFeet;
    }

    int getRadius(){
        return radius;
    }
    String getKey(){
        return key;
    }

    @Override
    public int compareTo(Object compareBuilding){
        int value =((Building)compareBuilding).getSquareFeet();
        return this.SquareFeet-value;
        
    }
}
