package Pojos;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//,generator = "cus_seq")
   // @SequenceGenerator(name = "cus_seq", sequenceName = "cus_seq", initialValue = 101)
    private int customerId;
    private String customername;
    private String customeremail;
    private String customercity;
    private String customerpassword;
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }

    public String getCustomerpassword() {
        return customerpassword;
    }

    public void setCustomerpassword(String customerpassword) {
        this.customerpassword = customerpassword;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customername='" + customername + '\'' +
                ", customeremail='" + customeremail + '\'' +
                ", customercity='" + customercity + '\'' +
                ", customerpassword='" + customerpassword + '\'' +
                ", employee=" + employee +
                '}';
    }
}
