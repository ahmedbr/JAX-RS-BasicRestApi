/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebApplication1;

/**
 *
 * @author Ahmed BR
 */
public class Notification {
    int id;
    String userName;
    String text;

    public Notification() {
    }

    public Notification(int id, String userName, String message) {
        this.id = id;
        this.userName = userName;
        this.text = message;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String text) {
        this.text = text;
    }
    
    
    
}
