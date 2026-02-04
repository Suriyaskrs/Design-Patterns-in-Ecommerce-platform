/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */

import java.util.ArrayList;
import java.util.List;

public class MessageData {
    private String message;
    private List<MessageObserver> observers = new ArrayList<>();

    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public String getMessage() {
        return message;
    }

    private void notifyObservers() {
        for (MessageObserver o : observers) {
            o.update(message);
        }
    }
}
