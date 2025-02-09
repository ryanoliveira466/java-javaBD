package com.senactds.model;

import java.time.LocalDate;
import java.util.Date;

public class Medicines {

    // Atributos
    private Long id;
    private String supplier;
    private String medicineName;
    private String medicineType;
    private Long batchNumber;
    private LocalDate dateReceipt;
    private LocalDate validity;

    
    //Construtores
    public Medicines() {
    }

    public Medicines(Long id, String supplier, String medicineName, String medicineType, Long batchNumber, LocalDate dateReceipt, LocalDate validity) {
        this.id = id;
        this.supplier = supplier;
        this.medicineName = medicineName;
        this.medicineType = medicineType;
        this.batchNumber = batchNumber;
        this.dateReceipt = dateReceipt;
        this.validity = validity;
    }

    public Medicines(String supplier, String medicineName, String medicineType, Long batchNumber, LocalDate dateReceipt, LocalDate validity) {
        this.supplier = supplier;
        this.medicineName = medicineName;
        this.medicineType = medicineType;
        this.batchNumber = batchNumber;
        this.dateReceipt = dateReceipt;
        this.validity = validity;
    }

   //Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public LocalDate getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(LocalDate dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }
    
    

}
