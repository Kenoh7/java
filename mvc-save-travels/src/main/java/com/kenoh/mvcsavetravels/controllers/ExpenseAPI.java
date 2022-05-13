package com.kenoh.mvcsavetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kenoh.mvcsavetravels.models.Expense;
import com.kenoh.mvcsavetravels.services.ExpenseService;

@RestController
public class ExpenseAPI {
	private final ExpenseService expenseService;
	public ExpenseAPI(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
// Find All
	@GetMapping("/api/expenses")
	public List<Expense> findallExpense(){
		return expenseService.allExpenses();
	}
	
// Create a Book
	@PostMapping("/api/expenses")
	public Expense createExpense(
			@RequestParam("name")String name,
			@RequestParam("vendor")String vendor,
			@RequestParam("amount")Double amount,
			@RequestParam("description")String description
			) {
		Expense newExpense = new Expense(name, vendor, amount,description);
		return expenseService.createExpense(newExpense);
	}

//	Find One
	@GetMapping("/api/expenses/{id}")
	public Expense oneExpense(@PathVariable("id") Long id) {
		return expenseService.findExpense(id);
	}

//	Update
	@PutMapping(value="/api/expenses/{id}")
	public Expense updateExpense(
			@PathVariable("id") Long id,
			@RequestParam("name")String name,
			@RequestParam("vendor")String vendor,
			@RequestParam("amount")Double amount,
			@RequestParam("description")String description
			) {
		Expense updateExpense = expenseService.findExpense(id);
		updateExpense.setName(name);
		updateExpense.setVendor(vendor);
		updateExpense.setAmount(amount);
		updateExpense.setDescription(description);
		
		return expenseService.updateExpense(updateExpense);
	}
//	Delete
	@DeleteMapping("/api/expenses/{id}")
	public void deleteExpense(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
	}
}
