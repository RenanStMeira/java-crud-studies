import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdminService listAdmin = new AdminService();
        listAdmin.createAdmin("Renan", "renan@mail.com", "34.145.852-0001.89", "@1234");
        listAdmin.createAdmin("Teste", "teste@mail.com", "00.408.772-585.89", "@1234");
        listAdmin.createAdmin("Teste2", "teste2@mail.com", "08.080.585-0001.00", "@1234");
        listAdmin.updateAdmin(0, new Admin("Renan Meira", "renan.meira@mail.com", "34.145.852-0001.25", "@@123"));
        listAdmin.updateAdmin(1, new Admin("Teste1", "teste1.@mail.com", "34.123.852-987.25", "@@18823"));
        listAdmin.viewAllAdmins();
        listAdmin.deleteAdmin();
    }
}