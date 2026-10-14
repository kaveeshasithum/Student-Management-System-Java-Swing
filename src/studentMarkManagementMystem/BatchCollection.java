/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package studentMarkManagementMystem;

/**
 *
 * @author Kaveesha
 */

public class BatchCollection {

    private Batch[] batchArray = new Batch[100];
    private int nextIndex = 0;

    public void addBatch(Batch batch) {
        batchArray[nextIndex++] = batch;
    }

    public Batch[] getAllBatches() {
        Batch[] temp = new Batch[nextIndex];

        for (int i = 0; i < nextIndex; i++) {
            temp[i] = batchArray[i];
        }

        return temp;
    }

    public Batch getBatch(int batchId) {

        for (int i = 0; i < nextIndex; i++) {

            if (batchArray[i].getBatchNumber()== batchId) {
                return batchArray[i];
            }
        }

        return null;
    }
}