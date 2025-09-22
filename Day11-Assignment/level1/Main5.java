import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
    void showPatient() {
        System.out.println("Patient: " + name);
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
    }
    void showPatients() {
        System.out.println("Doctor: " + name);
        for (Patient p : patients) {
            p.showPatient();
        }
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    void addDoctor(Doctor d) {
        doctors.add(d);
    }
    void addPatient(Patient p) {
        patients.add(p);
    }
    void showHospital() {
        System.out.println("Hospital: " + hospitalName);
        for (Doctor d : doctors) {
            d.showPatients();
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Alice");
        Doctor d2 = new Doctor("Bob");
        Patient p1 = new Patient("Charlie");
        Patient p2 = new Patient("David");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        h.showHospital();
    }
}
