package interfaces;

import models.Admin;

public interface IAdmin {
    void createAdmin(String name, String email, String cnpj, String password);
    void viewAllAdmins();
    void updateAdmin(int index, Admin adminAtt);
    void deleteAdmin();
}
