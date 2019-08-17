/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pooledweblog;

/**
 *
 * @author markf
 */
public class Entity {

    public String getIp() {
        return ip;
    }

    public int getNumber() {
        return number;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Entity(String ip,int number, int by) {
        this.ip = ip;
        this.number=number;
        this.by=by;
    }
    String ip;
    int number;
    int by;

    public int getBy() {
        return by;
    }

    public void setBy(int by) {
        this.by = by;
    }
    
}
