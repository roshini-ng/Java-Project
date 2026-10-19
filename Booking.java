package booking;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Booking {
    String checkInDate;
    String checkOutDate;
    public Booking(String checkInDate,String checkOutDate){
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
    }
    public int days() {
        LocalDate checkIn = LocalDate.parse(checkInDate);
        LocalDate checkOut = LocalDate.parse(checkOutDate);
        return (int)ChronoUnit.DAYS.between(checkIn, checkOut);
    }
}
