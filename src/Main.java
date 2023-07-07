import enums.Gender;
import model.Pharmacy;
import model.Worker;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy=new Pharmacy();
        Worker worker1=new Worker(1L,"Asel", LocalDate.of(2001,2,12),"asel@gmail.com", Gender.FEMALE);
        Worker worker2=new Worker(2L,"Tumarbek",LocalDate.of(2002,3,11),"tumarbek@gmail.com",Gender.MALE);
        Worker worker3=new Worker(3L,"Mairamkul",LocalDate.of(1998,7,6),"mairamkul@gmail.com",Gender.FEMALE);
        Worker worker4=new Worker(4L,"Asylbek",LocalDate.of(1993,9,19),"asylbek@gmail.com",Gender.MALE);
        Worker worker5=new Worker(5L,"Samat",LocalDate.of(1956,7,1),"samat@gmail.com",Gender.MALE);
        Worker worker6=new Worker(6L,"Gulnara",LocalDate.of(1971,2,26),"gulnara@gmail.com",Gender.FEMALE);
        Worker worker7=new Worker(7L,"Aisuluu",LocalDate.of(1976,5,5),"aisuluu@gmail.com",Gender.FEMALE);
        Worker worker8=new Worker(8L,"",LocalDate.of(1993,9,19),"asylbek@gmail.com",Gender.MALE);
        Worker worker9=new Worker(9L,"Asylbek",LocalDate.of(1993,9,19),"asylbek@gmail.com",Gender.MALE);
        Worker worker10=new Worker(10L,"Asylbek",LocalDate.of(1993,9,19),"asylbek@gmail.com",Gender.MALE);




    }
}
