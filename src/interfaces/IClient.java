package interfaces;

import models.Client;

public interface IClient {
    void create(Client client);
    void viewClient();
    void viewAllClient(int index);
    void updateClient(int index, Client clientEdit);
}
