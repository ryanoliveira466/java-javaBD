CREATE TABLE MEDICINES (
    id bigint not null generated always 
    as identity (start with 1, increment by 1),
    supplier varchar(50) not null,
    medicineName varchar(50) not null,
    medicineType varchar(50) not null,
    batchNumber bigint not null,
    dateReceipt Date,
    validity Date
);
