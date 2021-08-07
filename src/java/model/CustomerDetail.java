/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mynameis
 */
public class CustomerDetail {
    private String fullname ;
    private String sdt ;
    private String address ;
    private String email;
    private String bank;
    private String note ;
    private int oid ;

    public CustomerDetail() {
    }

    public CustomerDetail(String fullname, String sdt, String address, String email, String bank, String note, int oid) {
        this.fullname = fullname;
        this.sdt = sdt;
        this.address = address;
        this.email = email;
        this.bank = bank;
        this.note = note;
        this.oid = oid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "CustomerDetail{" + "fullname=" + fullname + ", sdt=" + sdt + ", address=" + address + ", email=" + email + ", bank=" + bank + ", note=" + note + ", oid=" + oid + '}';
    }
    
    
}
