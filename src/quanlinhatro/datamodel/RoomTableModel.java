/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhatro.datamodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import quanlinhatro.entity.Room;

/**
 *
 * @author SâuBéNhỏ
 */
public class RoomTableModel extends AbstractTableModel {

    private final String[] HEADER = new String[]{"Code", "Price", "Internet", "peoples", "Elec", "Water"};

    private List<Room> rooms;

    @Override
    public int getRowCount() {
        if (rooms == null || rooms.isEmpty()) {
            return 0;
        }

        return rooms.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Room room = rooms.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = room.getRoomCode();
                break;
            case 1:
                value = room.getPriceRoom();
                break;
            case 2:
                value = room.isInternet();
                break;
            case 3:
                value = room.getNumberPeople();
                break;
            case 4: 
                value = room.getNumberElectricity();
                break;
            case 5:
                value = room.getNumberWater();
                break;
        }

        return value;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (aValue == null) {
            return;
        }
        
        Room room = (Room) aValue;
        switch (columnIndex) {
            case 0:
                super.setValueAt(room.getRoomCode(), rowIndex, columnIndex);
                break;
            case 1:
                super.setValueAt(room.getPriceRoom(), rowIndex, columnIndex);
                break;
            case 2:
                super.setValueAt(room.getNumberPeople(), rowIndex, columnIndex);
                break;
            case 3:
                super.setValueAt(room.isInternet(), rowIndex, columnIndex);
                break;
            case 4:
                super.setValueAt(room.getNumberElectricity(), rowIndex, columnIndex);
                break;
            case 5:
                super.setValueAt(room.getNumberWater(), rowIndex, columnIndex);
                break;
        }

    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String getColumnName(int column) {
        return HEADER[column];
    }

    
}
