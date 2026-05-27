package com.responcePojo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateObjectResponce {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("createdAt")
    private long createdAt;

    @JsonProperty("data")
    private Data data;

    // Default constructor
    public CreateObjectResponce() {}

    // Parameterized constructor (optional, for convenience)
    public CreateObjectResponce(String id, String name, long createdAt, Data data) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.data = data;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public Data getData() {
        return data;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setData(Data data) {
        this.data = data;
    }



    // Nested Data class
    public static class Data {

        @JsonProperty("year")
        private int year;

        @JsonProperty("price")
        private double price;

        @JsonProperty("CPU model")
        private String cpuModel;

        @JsonProperty("Hard disk size")
        private String hardDiskSize;

        // Default constructor
        public Data() {}

        // Parameterized constructor (optional, for convenience)
        public Data(int year, double price, String cpuModel, String hardDiskSize) {
            this.year = year;
            this.price = price;
            this.cpuModel = cpuModel;
            this.hardDiskSize = hardDiskSize;
        }

        // Getters
        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public String getCpuModel() {
            return cpuModel;
        }

        public String getHardDiskSize() {
            return hardDiskSize;
        }

        // Setters
        public void setYear(int year) {
            this.year = year;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setCpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
        }

        public void setHardDiskSize(String hardDiskSize) {
            this.hardDiskSize = hardDiskSize;
        }


    }
}