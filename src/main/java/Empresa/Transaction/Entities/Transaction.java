package Empresa.Transaction.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Column(nullable=false, length=50)
    private Employee Employee;
    @Column(nullable=false, length=30)
    private Enterprise Enterprise;
    @Id
    @Column(nullable=false, length=20)
    long id;
    @Column(nullable=false, length=20)
    String concept;
    @Column(nullable=false, length=50)
    float amount;
    @Column(nullable=false, length=40)
    date createdAt;
    @Column(nullable=false, length=40)
    date updateAt;

    public Transaction() {
    }

    public Transaction(Employee employee, Empresa.Transaction.Entities.Enterprise enterprise, long id, String concept, float amount, date createdAt, date updateAt) {
        Employee = employee;
        Enterprise = enterprise;
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Employee getEmployee() {
        return Employee;
    }

    public void setEmployer(Employee employee) {
        Employee = employee;
    }

    public Enterprise getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        Enterprise = enterprise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "Employee=" + Employee +
                ", Enterprise=" + Enterprise +
                ", id=" + id +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
