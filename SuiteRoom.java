package room;
public class SuiteRoom extends Room{
    String roomType;
    int days;
    public SuiteRoom(String roomType,int days){
        super(roomType);
        this.days=days;
    }
    @Override
    public double calculateRent(int days){
        return (double)(20000*days);
    }
}