package studentMarkManagementMystem;

public class Student {

    private String id;
    private String nic;
    private String name;
    private int prfMarks;
    private int dbmsMarks;

    // Constructor
    public Student(String id, String nic, String name,
                   int prfMarks, int dbmsMarks) {

                            this.id = id;
                            this.nic = nic;
                            this.name = name;
                            this.prfMarks = prfMarks;
                            this.dbmsMarks = dbmsMarks;
    }

    // ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // NIC
    public String getnic() {
        return nic;
    }

    public void setnic(String nic) {
        this.nic = nic;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // PRF Marks
    public int getPrfMarks() {
        return prfMarks;
    }

    public void setPrfMarks(int prfMarks) {
        this.prfMarks = prfMarks;
    }

    // DBMS Marks
    public int getDbmsMarks() {
        return dbmsMarks;
    }

    public void setDbmsMarks(int dbmsMarks) {
        this.dbmsMarks = dbmsMarks;
    }
   
    
    public double getGpa() {

    if (prfMarks < 0 || dbmsMarks < 0) {
        return 0.0;
    }

    double prfGpa = StudentCollection.getGpa(prfMarks);
    double dbmsGpa = StudentCollection.getGpa(dbmsMarks);

    return (prfGpa + dbmsGpa) / 2;
}
}