package services;

import models.Client;

import java.util.ArrayList;

public class ClientService {
    private ArrayList<Client> list;

    public ClientService() {
        this.list = new ArrayList<>();
    }

    public void create(Client client) {
        list.add(client);
    }

    public void viewClient() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void viewAllClient(int index) {
        Client client = list.get(index);
        System.out.println(String.format("""
            Nome: %s
            cpf: %s
            Email: %s
            """, client.getName(), client.getCpf(), client.getEmail()));
    }

    public void updateClient(int index, Client clientEdit) {
        Client client = list.get(index);
        client.setName(clientEdit.getName());
        client.setCpf(clientEdit.getCpf());
        client.setEmail(clientEdit.getEmail());
        client.setPassword(clientEdit.getPassword());
        System.out.println(client + " Successfully changed");
    }

    public void deleteClient(int index) {
        list.remove(index);
        System.out.println("models.Client Successfully removed");
    }
}
