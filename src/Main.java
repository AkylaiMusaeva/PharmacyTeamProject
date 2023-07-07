import db.DataBase;
import enums.Gender;
import model.Medicine;
import model.Pharmacy;
import model.Worker;
import serviceImpl.ServiceImpl;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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

        Medicine medicine1=new Medicine(1L,"Trimol",250,46);
        Medicine medicine2=new Medicine(2L,"Aler G",340,50);
        Medicine medicine3=new Medicine(3L,"Tailol Hot",100,20);
        Medicine medicine4=new Medicine(4L,"Panangin",390,15);
        Medicine medicine5=new Medicine(5L,"Paramol",230,48);

        Pharmacy pharmacy1 = new Pharmacy(1L, "Neman", "Manasa 42", List.of(medicine1,medicine2), List.of(worker1,worker2));
        Pharmacy pharmacy2 = new Pharmacy(2L, "Doctorin", "Sovetskaya 187", new ArrayList<>(), new ArrayList<>());
        Pharmacy pharmacy3 = new Pharmacy(3L, "Aibolit", "Orozbekova 26", new ArrayList<>(), new ArrayList<>());
        Pharmacy pharmacy4 = new Pharmacy(4L, "Neman", "Manasa 42", new ArrayList<>(), new ArrayList<>());
        Pharmacy pharmacy5 = new Pharmacy(5L, "FarmService", "Ahunbaeva 197", new ArrayList<>(), new ArrayList<>());
        List<Pharmacy>pharmacies=List.of(pharmacy1,pharmacy2,pharmacy3,pharmacy4,pharmacy5);

        DataBase dataBase=new DataBase(pharmacies);
        ServiceImpl service=new ServiceImpl(dataBase);
        Scanner scanWord=new Scanner(System.in);
        Scanner scanNum=new Scanner(System.in);
        int num;
        while (true){
            System.out.println("""
                    1-> getAllMedicinesByPharmacy
                    2-> addMedicinesToPharmacy
                    3-> addWorkerToPharmacy
                    4-> updateMedicinePrice
                    5-> deleteMedicineByName
                    6-> deleteWorkerByName
                    7-> getPharmacyByWorkerName
                    8-> getAllMedicines
                    """);
            switch (num=scanNum.nextInt()){
                case 1-> service.getAllMedicinesByPharmacy("Neman");
                case 2-> { service.addMedicinesToPharmacy(3L,new Medicine(6L,"Trimol", 120,10));}
                case 3->service.addWorkerToPharmacy(3L,worker3);
                case 4->service.updateMedicinePrice(3L,6L,150);
                case 5 -> {
                    System.out.println("Method delete medicine by name");
                    System.out.println("write the Pharmacy id ");
                    Long pharmacyId = new Scanner(System.in).nextLong();
                    System.out.println("Write the Medicine name");
                    String medicineName = new Scanner(System.in).nextLine();
                    service.deleteMedicineByName(pharmacyId, medicineName);
                }
                case 6->{
                    System.out.println("Delete worker by name");
                    System.out.println("write the pharmacy's id");
                    Long pharmacyId=new Scanner(System.in).nextLong();
                    System.out.println("write the worker's name");
                    String workerName=new Scanner(System.in).nextLine();
                    service.deleteWorkerByName(pharmacyId,workerName);
                }
                case 7->{
                    System.out.println("Get Pharmacy by worker by name");
                    System.out.println("Write the worker's name");
                    String workerName=new Scanner(System.in).nextLine();
                    service.getPharmacyByWorkerName(workerName);
                }
                case 8-> {
                    System.out.println("all medicines");
                    service.getAllMedicines();
                }
            }

        }





    }
}
