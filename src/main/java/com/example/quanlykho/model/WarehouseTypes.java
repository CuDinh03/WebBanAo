package com.example.quanlykho.model;

public class WarehouseTypes {
    private int warehouseTypesId;
    private String warehouseTypesCode;
    private String warehouseTypesName;
    private boolean warehouseTypesStatus;

    public WarehouseTypes() {
    }

    public WarehouseTypes(int warehouseTypesId, String warehouseTypesCode, String warehouseTypesName, boolean warehouseTypesStatus) {
        this.warehouseTypesId = warehouseTypesId;
        this.warehouseTypesCode = warehouseTypesCode;
        this.warehouseTypesName = warehouseTypesName;
        this.warehouseTypesStatus = warehouseTypesStatus;
    }

    public int getWarehouseTypesId() {
        return warehouseTypesId;
    }

    public void setWarehouseTypesId(int warehouseTypesId) {
        this.warehouseTypesId = warehouseTypesId;
    }

    public String getWarehouseTypesCode() {
        return warehouseTypesCode;
    }

    public void setWarehouseTypesCode(String warehouseTypesCode) {
        this.warehouseTypesCode = warehouseTypesCode;
    }

    public String getWarehouseTypesName() {
        return warehouseTypesName;
    }

    public void setWarehouseTypesName(String warehouseTypesName) {
        this.warehouseTypesName = warehouseTypesName;
    }

    public boolean isWarehouseTypesStatus() {
        return warehouseTypesStatus;
    }

    public void setWarehouseTypesStatus(boolean warehouseTypesStatus) {
        this.warehouseTypesStatus = warehouseTypesStatus;
    }
}
