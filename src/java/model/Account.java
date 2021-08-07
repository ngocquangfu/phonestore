package model;

/**
 *
 * @author mynameis
 */
public class Account {
   private String username;
    private String phone;
    private String password;

    private int isSell;
    private int isAdmin;

    public Account() {
    }

    

    public Account(String username, String phone, String password, int isSell, int isAdmin) {
        this.username = username;
        this.phone = phone;
        this.password = password;

        this.isSell = isSell;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", phone=" + phone + ", password=" + password + ", isSell=" + isSell + ", isAdmin=" + isAdmin + '}';
    }

 

}
