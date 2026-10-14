/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentMarkManagementMystem;

/**
 *
 * @author Kaveesha
 */
;

public class AccessBatchCollection {

    private static AccessBatchCollection instance;

    private BatchCollection batchCollection;

    private AccessBatchCollection() {
        batchCollection = new BatchCollection();
    }

    public static AccessBatchCollection getInstance() {

        if (instance == null) {
            instance = new AccessBatchCollection();
        }

        return instance;
    }

    public BatchCollection getBatchCollection() {
        return batchCollection;
    }
}