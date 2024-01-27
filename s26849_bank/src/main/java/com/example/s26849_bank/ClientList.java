package com.example.s26849_bank;
import java.util.*;

public class ClientList
{
    private List<Client> listOfClients;
    public ClientList()
    {
        this.listOfClients = new ArrayList<>();
    }
    public void addClient(Client Client)
    {
        listOfClients.add(Client);
    }
    public List<Client> getClientList()
    {
        return listOfClients;
    }

}
