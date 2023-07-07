package serviceImpl;

import db.DataBase;
import model.Medicine;
import model.Pharmacy;
import model.Worker;
import service.Service;

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

    }

    @Override
    public void updateMedicinePrice(Long pharmacyId, Long medicineId, int price) {

    }

    @Override
    public void deleteMedicineByName(Long pharmacyId, String medicineName) {

    }

    @Override
    public void deleteWorkerByName(Long pharmacyId, String workerName) {

    }

    @Override
    public void getPharmacyByWorkerName(String workerName) {

    }

    @Override
    public void getAllMedicines() {

    }
}
