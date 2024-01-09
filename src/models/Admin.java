package models;

public class Admin {
    String name;
    String email;
    String CNPJ;
    String password;

    public Admin (String name, String email, String cnpj, String password) {
        this.name = name;
        this.email = email;
        this.CNPJ = cnpj;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return this.CNPJ;
    }

    public void setCnpj(String cnpj) {
        this.CNPJ = cnpj;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
