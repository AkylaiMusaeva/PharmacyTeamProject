package serviceImpl;

import db.DataBase;
import exception.MyException;
import model.Medicine;
import model.Pharmacy;
import model.Worker;
import service.Service;

import java.util.List;

public class ServiceImpl implements Service {

    private DataBase dataBase;

    public ServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void getAllMedicinesByPharmacy(String pharmacyName) {
        dataBase.getPharmacies().stream()
                .filter(pharmacy -> pharmacy.getName().equals(pharmacyName))
                .forEach(System.out::println);

    }

    @Override
    public void addMedicinesToPharmacy(Long pharmacyId, Medicine medicine) {
        for (Pharmacy p:dataBase.getPharmacies()){
            if (p.getId().equals(pharmacyId)){
                p.getMedicines().add(medicine);
                System.out.println(p);
            }
        }
        System.out.println("Medicine succesfully added to Pharmasy");


    }

    @Override
    public void addWorkerToPharmacy(Long pharmacyId, Worker worker) {
        boolean found=false;
        try {
            for (Pharmacy p : dataBase.getPharmacies()) {
                if (p.getId().equals(pharmacyId)) {
                    found=true;
                    p.getWorkers().add(worker);
                }
            }if (!found){
                throw new MyException("There is no such pharmacy with such id");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }System.err.println("Successfully added worker to pharmacy");
    }

    @Override
    public void updateMedicinePrice(Long pharmacyId, Long medicineId, int price) {
        List<Pharmacy> list = dataBase.getPharmacies()
                .stream()
                .filter(pharmacy -> pharmacy.getId().equals(pharmacyId)).toList();
        List<Medicine> list1 = list.get(0).getMedicines()
                .stream()
                .filter(medicine -> medicine.getId().equals(medicineId)).toList();
        list1.get(0).setPrice(price);
        System.out.println("successfully updated medicine's price");
    }

    @Override
    public void deleteMedicineByName(Long pharmacyId, String medicineName) {
        for (Pharmacy p:dataBase.getPharmacies()) {
            if (p.getId().equals(pharmacyId)){
                for (Medicine m:p.getMedicines()) {
                    if (m.getName().equals(medicineName)){
                        p.getMedicines().remove(m);
                        System.out.println("Successfully deleted medicine by name");
                    }
                }
            }
        }
    }

    @Override
    public void deleteWorkerByName(Long pharmacyId, String workerName) {
        List<Pharmacy> list = dataBase.getPharmacies().stream().filter(pharmacy -> pharmacy.getId().equals(pharmacyId)).toList();
        List<Worker> list1 = list.get(0).getWorkers().stream().filter(worker -> worker.getName().equals(workerName)).toList();
        list.get(0).getWorkers().remove(list1.get(0));
        System.out.println("Successfully deleted worker");
    }

    @Override
    public void getPharmacyByWorkerName(String workerName) {
        List<Pharmacy> pharmacies = dataBase.getPharmacies();
        pharmacies.stream()
                .filter(pharmacy -> pharmacy.getWorkers().stream()
                        .anyMatch(worker -> worker.getName().equals(workerName)))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void getAllMedicines() {
        List<Pharmacy> pharmacies = dataBase.getPharmacies();
        for (Pharmacy p : pharmacies) {
            System.out.println(p.getMedicines());
        }
    }
}
