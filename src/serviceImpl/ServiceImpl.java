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

    }

    @Override
    public void addMedicinesToPharmacy(Long pharmacyId, Medicine medicine) {

    }

    @Override
    public void addWorkerToPharmacy(Long pharmacyId, Worker worker) {
        for (Pharmacy p:dataBase.getPharmacies()) {
            if (p.getId().equals(pharmacyId)){
                p.getWorkers().add(worker);

            }
        }System.out.println("Successfully added worker to pharmacy");
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
