package com.example.s26849_bank;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public class Saldo {

    private double saldo;
    private String ID;
    private double transfer_amount;

    public Saldo(double saldo)
    {
        this.saldo = saldo;

    }

    public String Transfer(String ID, double transfer_amount) {
        this.transfer_amount = transfer_amount;
        this.ID = ID;

        if (saldo - transfer_amount < 0) {
            return "DECLINED";
        }
        else
        {
            double x = saldo - transfer_amount;
            String zwrot = x + "";
            return "ACCEPTED " + "Aktualne saldo to: " + zwrot;
        }
    }

    public String Payment(String ID, double transfer_amount) {
        this.transfer_amount = transfer_amount;
        this.ID = ID;

            double x = saldo + transfer_amount;
            String zwrot = x + "";
            return "ACCEPTED " + "Aktualne saldo to: " + zwrot;


    }
}
