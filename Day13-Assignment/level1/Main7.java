interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private double treatmentCost;
    private String records = "";

    public InPatient(int patientId, String name, int age, double roomCharge, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCost = treatmentCost;
    }

    public double calculateBill() {
        return roomCharge + treatmentCost;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public void viewRecords() {
        System.out.println("Records:\n" + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String records = "";

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public void viewRecords() {
        System.out.println("Records:\n" + records);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "John", 45, 2000, 5000);
        Patient p2 = new OutPatient(2, "Alice", 30, 800);

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            MedicalRecord mr = (MedicalRecord)p;
            mr.addRecord("Checkup done");
            mr.viewRecords();
        }
    }
}
