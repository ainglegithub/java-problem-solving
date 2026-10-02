package practice.oops;


class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Association via method parameter
    public void treatPatient(Patient patient) {
        System.out.println("Dr. " + name + " is treating patient " + patient.getName());
    }
}

public class GeneralAssociationDemo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Sarah Jenkins");
        Patient patient = new Patient("John Doe");

        // Doctor interacts with Patient without owning its lifecycle
        doctor.treatPatient(patient);
    }
}
