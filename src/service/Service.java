package service;

import model.Medicine;
import model.Worker;

public interface Service {
    public void getAllMedicinesByPharmacy(String pharmacyName);
    public void addMedicinesToPharmacy(Long pharmacyId, Medicine medicine);
    public void addWorkerToPharmacy(Long pharmacyId, Worker worker); //-worker email сущестующий болбошу керек, жашы 18-ден ойдо болушу керек
    public void updateMedicinePrice(Long pharmacyId, Long medicineId, int price);
    public  void deleteMedicineByName(Long pharmacyId,String medicineName);
    public void deleteWorkerByName(Long pharmacyId,String workerName);
    public void getPharmacyByWorkerName(String workerName);
    public  void getAllMedicines();
}
