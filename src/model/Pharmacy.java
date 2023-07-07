package model;

import model.Medicine;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private Long id;
    private String name;
    private String address;
    private List<Medicine>medicines;
    private List<Worker> workers;

    public Pharmacy(Long id, String name, String address, List<Medicine> medicines, List<Worker> workers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.medicines = medicines;
        this.workers = workers;
    }

    public Pharmacy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
    public void setWorker(Worker worker){
        if(this.workers==null) {
            this.workers=new ArrayList<>();
        }
        this.workers.add(worker);
    }
//createDataBaseClassAndPackage

    @Override
    public String toString() {
        return "-----Pharmacy-----{" +
                "\nid:" + id +
                "\nname:" + name + '\'' +
                "\naddress:" + address + '\'' +
                "\nmedicines:" + medicines +
                "\nworkers:" + workers +"\n";

    }
}
