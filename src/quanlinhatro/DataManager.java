/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhatro;

import java.util.Vector;
import quanlinhatro.entity.Lodger;
import quanlinhatro.entity.Room;

/**
 *
 * @author SâuBéNhỏ
 */
public class DataManager {

    Vector<Room> listRoom;
    Vector<Lodger> listLodger;

    private static DataManager instance = new DataManager();

    public static DataManager getInstance() {
        return instance;
    }

    private DataManager() {
        listRoom = new Vector<>();
        listLodger = new Vector<>();
        
        Room rooms = new Room("305", false, 587, 5867, 572);
        Room rooms1 = new Room("303", true, 345, 324, 25);
        Room rooms2 = new Room("307", false, 7854, 25, 74);
        listRoom.add(rooms);
        listRoom.add(rooms1);
        listRoom.add(rooms2);
        
    }
    
    public Room getRoom(String roomCode) {
        
        for(Room rooms : listRoom) {
            if(roomCode.equals(rooms.getRoomCode())){
                return rooms;
            }
        }
        return null;
    }
    
    public Vector<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(Vector<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public Vector<Lodger> getListLodger() {
        return listLodger;
    }

    public void setListLodger(Vector<Lodger> listLodger) {
        this.listLodger = listLodger;
    }

}
