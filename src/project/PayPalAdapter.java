/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */
public class PayPalAdapter implements PaymentGateway {
    private PayPalAPI paypal = new PayPalAPI();

    public void pay() {
        paypal.makePayment();
    }
}