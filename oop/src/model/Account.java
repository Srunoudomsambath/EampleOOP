//package model;
//
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class Account {
//    private Integer id;
//    private String accountName;
//    private BigDecimal balance;
//    private LocalDate createdDated;
//    private LocalDate expireDated;
//    public Account() {}
//    public Account(Integer id, String accountName, BigDecimal balance, LocalDate createdDated, LocalDate expireDated) {
//        this.id = id;
//        this.accountName = accountName;
//        this.balance = balance;
//        this.createdDated = createdDated;
//        this.expireDated = expireDated;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAccountName() {
//        return accountName;
//    }
//    public LocalDate getCreatedDated(){
//        return createdDated;
//    }
//    public LocalDate getExpireDated(){
//        return expireDated;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//    public void setCreatedDated(LocalDate createdDated) {
//        this.createdDated = createdDated;
//    }
//    public void setExpireDated(LocalDate expireDated) {
//        this.expireDated = expireDated;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", accountName='" + accountName + '\'' +
//                ", balance=" + balance +
//                ", createdDated=" + createdDated +
//                ", expireDated=" + expireDated +
//                '}';
//    }
//}
