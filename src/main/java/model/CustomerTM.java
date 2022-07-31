package model;

import java.io.Serializable;

public class CustomerTM implements Serializable {  // 6. Serializable
    /* Serializable - Me class eken hdagnna java beans ekak
       (object ekak) network eka through transfer karannna
       puluwan ho file ekaka save karanna puluwan kiyana eka */

    private String id; // 1. fully encapsulated (private)
    private String name;  // 2. Properties name should be camelCases (customerName / name)
    private String address;

    public CustomerTM() {  // 4.noArgs constructor

    }

    public CustomerTM(String id, String name, String address) {  // 5. All Args constructor
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /* Constructor add karanna puluwan ona tharam, habi NoArgs ekai AllArgs ekai tyenna oni */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    private boolean flag;
//
//    public boolean isFlag() {
//        return flag;
//    }
//
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }


    @Override
    public String toString() {
        // toString method eka tibune naththan memory locations print wenawa(TableFormController eke 68 weni line eke tyen loop eka tibboth)
        return "CustomerTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
