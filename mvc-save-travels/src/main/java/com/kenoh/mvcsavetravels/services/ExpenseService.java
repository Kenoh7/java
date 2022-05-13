package com.kenoh.mvcsavetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kenoh.mvcsavetravels.models.Expense;
import com.kenoh.mvcsavetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
//	import repository
	private final ExpenseRepository expenseRepo;

	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}

//	find all expense
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}

// find one expense
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}

// create a expense
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}

// update a expense
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}

// delete a expense
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
}
