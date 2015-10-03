/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhatro.entity;

import java.io.Serializable;

/**
 *
 * @author SâuBéNhỏ
 */
public class Room implements Serializable{

    public static int priceElectricity = 4000;
    public static int priceWater = 25000;
    public static int priceInternet = 80000;
    
    private int elecNumber;
    private int waterNumber;
    private String roomCode;
    private float priceRoom;
    private boolean internet;
    private int numberPeople;
    
    public Room() {
        
    }
    
    public Room(String codeNumber, boolean internet, int elecNumber, int waterNumber, float priceRoom) {
        this.elecNumber = elecNumber;
        this.priceRoom = priceRoom;
        this.waterNumber = waterNumber;
        this.roomCode = codeNumber;
        this.internet = internet;
    }

    public int getNumberElectricity() {
        return elecNumber;
    }

    public void setNumberElectricity(int numberElectricity) {
        this.elecNumber = numberElectricity;
    }

    public int getNumberWater() {
        return waterNumber;
    }

    public void setNumberWater(int numberWater) {
        this.waterNumber = numberWater;
    }
    

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public float getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(float priceRoom) {
        this.priceRoom = priceRoom;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public static int getPriceElectricity() {
        return priceElectricity;
    }

    public static int getPriceWater() {
        return priceWater;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    @Override
    public String toString() {
        return roomCode;
    }

    
}
