package studentMarkManagementMystem;



public class Batch {

    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    private int batchNum;
    private int status;

    public Batch(int batchNum, int status) {
        this.batchNum = batchNum;
        this.status = status;
}
    public int getBatchNumber() {
        return batchNum;
    }

    public int getStatus() {
        return status;
    }
    

    public void setStatus(int status) {
        this.status = status;
    }

    
    public static Batch[] batchArray = {
    new Batch(105, 0),
    new Batch(106, 0),
    new Batch(107, 0),
    new Batch(108, 0),
    new Batch(109, 1),
    new Batch(110, 1)
};
    
}