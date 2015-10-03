/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhatro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlinhatro.entity.Bill;
import quanlinhatro.entity.Room;

/**
 *
 * @author SâuBéNhỏ
 */
public class DataManager {

    Vector<Room> listRoom;

    private static DataManager instance = new DataManager();

    public static DataManager getInstance() {
        return instance;
    }

    private DataManager() {
        listRoom = new Vector<>();
    }
    
    public void loadData() {
        
        try {
            File file = new File("quanlinhatro.txt");
            if(!file.exists()) {
                file.createNewFile();
                return;
            }
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fileInput);
            listRoom = (Vector<Room>) objIn.readObject();
            
            objIn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveData() {
        
        try {
            FileOutputStream fileOutput = new FileOutputStream("quanlinhatro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fileOutput);
            objout.writeObject(listRoom);
            objout.flush();
            objout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
    
    public void deleteRoom(String roomcode) {
        listRoom.remove(getRoom(roomcode));
    }

    
}
