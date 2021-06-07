package ANTI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;


public class TimeTracking {
  Map<Car,LocalDateTime> map = new TreeMap<Car,LocalDateTime>();
 public void borrowCar(Car Car) {
	 LocalDateTime ld=LocalDateTime.now();
	 ld=ld.minus(Duration.ofHours(5));
	 map.put(Car,ld);
 }
 public long ReturnCar(Car Car) {
	LocalDateTime returnTime = LocalDateTime.now();
	LocalDateTime borrowTime = map.get(Car);
	//System.out.println(map);
	Duration duration = Duration.between(borrowTime, returnTime);
    long amountOfTime= duration.toMinutes();
    return  (long) Math.ceil((double)amountOfTime/60);
	 
	 
 }
}
