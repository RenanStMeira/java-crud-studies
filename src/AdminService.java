import java.util.ArrayList;

public class AdminService {
    private ArrayList<Admin> list;

    public AdminService () {
        this.list = new ArrayList<>();
    }

    public void createAdmin(String name, String email, String cnpj, String password) {
        Admin newAdmin = new Admin(name, email, cnpj, password);
        list.add(newAdmin);
    }

    public void viewAllAdmins() {
        for (int i = 0; i < list.size(); i++) {
            Admin admin = list.get(i);
            System.out.printf("""
                Name: %s
                Email: %s
                CNPJ: %s
                """, admin.getName(), admin.getEmail(), admin.getCnpj());
        }
    }


    public void updateAdmin (int index, Admin adminAtt) {
        Admin admin = list.get(index);
        admin.setName(adminAtt.getName());
        admin.setEmail(adminAtt.getEmail());
        admin.setCnpj(adminAtt.getCnpj());
        admin.setPassword(adminAtt.getPassword());
        System.out.println(admin + " Successfully changed");
    }

    public void deleteAdmin() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("Admin successfully removed");
        } else {
            System.out.println("Admin list is empty");
        }
    }

}
