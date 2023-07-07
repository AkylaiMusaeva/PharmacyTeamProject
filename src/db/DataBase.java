package db;

import model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Pharmacy>pharmacies;

    public DataBase(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }

    public DataBase() {
    }

    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }
}
