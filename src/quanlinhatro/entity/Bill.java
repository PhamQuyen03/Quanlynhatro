/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhatro.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SâuBéNhỏ
 */
public class Bill implements Serializable{
    
    private Date date;
    private int numberElectricity;
    private int numberWater;
    private  Room room;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberElectricity() {
        return numberElectricity;
    }

    public void setNumberElectricity(int numberElectricity) {
        this.numberElectricity = numberElectricity;
    }

    public int getNumberWater() {
        return numberWater;
    }

    public void setNumberWater(int numberWater) {
        this.numberWater = numberWater;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    
    public float calculate() {
        
        int sumElec = (numberElectricity - room.getNumberElectricity()) * Room.priceElectricity;
        int sumWater = (numberWater - room.getNumberWater()) * Room.priceWater;
        if(room.isInternet()) {
            return (room.getPriceRoom() + sumElec + sumWater + Room.priceInternet);
        } 
        return (room.getPriceRoom() + sumElec + sumWater );
    }
}
