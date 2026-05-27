package com.requestPojo;



import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateObject {

    @JsonProperty("name")
    private String name;

    @JsonProperty("data")
    private Data data;

    // Parameterized constructor (optional, for convenience)
    public CreateObject(String name, Data data) {
        this.name = name;
        this.data = data;
    }

    public CreateObject() {

    }

    // Getters
    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
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

        // Parameterized constructor (optional, for convenience)
        public Data(int year, double price, String cpuModel, String hardDiskSize) {
            this.year = year;
            this.price = price;
            this.cpuModel = cpuModel;
            this.hardDiskSize = hardDiskSize;
        }

        public Data() {

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