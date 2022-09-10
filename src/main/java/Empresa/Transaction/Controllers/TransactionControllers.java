package Empresa.Transaction.Controllers;

import Empresa.Transaction.Entities.Transaction;
import Empresa.Transaction.Services.TransactionServices;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;h

@RestController
public class TransactionControllers {

private TransactionServices Services;

    public TransactionControllers(TransactionServices services) {
        Services = services;
    }

    @GetMapping("/ListarMovimientos")
    public ResponseEntity<List<Transaction>>getAllTransaction() {
        return TransactionServices.findAllTransaction();
    }


    @GetMapping("/Movimientos/{id}")
    public ResponseEntity<Transaction> findAllTransactionById(@PathVariable("id") Long id) {
        return TransactionServices.findTransactionById(id);
    }

    @PostMapping("CrearMovimiento")
    public String createTransaction(@PathVariable("id") Long id, @RequestBody Transaction, transaction) {
        return TransactionServices.createTransaction(id, transaction);
    }

    @PatchMapping("/ActualizarEmployee")
    public ResponseEntity<Transaction> updateEmployee(@PathVariable("id") Long id, @RequestBody() Transaction transaction) {
        return TransactionServices.updateTransaction(id, transaction);
    }

    @DeleteMapping("/EliminarEmployee/{id}")
    public ResponseEntity<Transaction> deleteTransaction(@PathVariable("id") Long id) {
        return TransactionServices.deleteTransaction(id);
    }
}
