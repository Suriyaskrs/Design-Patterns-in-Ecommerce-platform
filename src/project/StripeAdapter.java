/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */
public class StripeAdapter implements PaymentGateway {
    private StripeAPI stripe = new StripeAPI();

    public void pay() {
        stripe.sendPayment();
    }
}
