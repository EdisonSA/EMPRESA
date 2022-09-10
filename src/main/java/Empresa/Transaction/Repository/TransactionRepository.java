package Empresa.Transaction.Repository;

import Empresa.Transaction.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface TransactionRepository extends JpaRepository <Transaction, String> {

    ArrayList<Transaction> findByConcept(String concept);
}
