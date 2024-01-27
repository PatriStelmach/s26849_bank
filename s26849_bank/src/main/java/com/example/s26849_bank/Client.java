package com.example.s26849_bank;

public class Client
{
    private String ID;
    private Saldo Saldo;

    public Client(String ID, Saldo Saldo)
    {
        this.ID = ID;
        this.Saldo = Saldo;
    }

    public String GetID()
    {
        return ID;
    }

    public Saldo GetSaldo()
    {
        return Saldo;
    }

    public void SetID(String ID)
    {
        this.ID = ID;
    }

    public void SetSaldo(Saldo Saldo)
    {
        this.Saldo = Saldo;
    }



}
