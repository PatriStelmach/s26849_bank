package com.example.s26849_bank;

public class Transfer
{
    private String ID;
    private double transfer_amount;
    private double remaining_saldo;
    private double Saldo;
    public double Transfer(String ID, double transfer_amount)
    {
        this.transfer_amount = transfer_amount;
        this.ID = ID;
        return Saldo - transfer_amount;
    }

    public double remaining_saldo()
    {

        this.Saldo = Saldo;
        this.remaining_saldo = Saldo - transfer_amount;
        return remaining_saldo;
    }

}

