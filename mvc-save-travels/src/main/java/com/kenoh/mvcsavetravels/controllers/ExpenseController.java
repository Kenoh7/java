package com.kenoh.mvcsavetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kenoh.mvcsavetravels.models.Expense;
import com.kenoh.mvcsavetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;

//	Find One
	@GetMapping("/expenses/{id}")
	public String oneExpense(@PathVariable("id")Long id, Model model) {
		Expense oneExpense = expenseService.findExpense(id);
		model.addAttribute("expense",oneExpense);
		return"showExpense.jsp";
	}

//	All Expense
	@GetMapping("/expenses")
	public String allExpenses(Model model) {
		model.addAttribute("expenses",expenseService.allExpenses());
		model.addAttribute("expense", new Expense());
		return "index.jsp";
	}

//	Post // process the form
	@PostMapping("/expenses/create")
	public String processExpense(@Valid @ModelAttribute("expense")Expense expense,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenseService.allExpenses());
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
//	Edit // 1. render the form 2. process the form
//	render the form --> findOne + create
	
	@GetMapping("/expenses/{id}/edit")
	public String renderExpenseForm(@PathVariable("id")Long id, Model model) {
		Expense oneExpense = expenseService.findExpense(id);
		model.addAttribute("expense", oneExpense);
		return "editExpense.jsp";
	}
	
	@PutMapping("/expenses/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("expense")Expense expense,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editExpense.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
//	Delete //
	@DeleteMapping("/expenses/{id}")
	public String deleteExpense(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
	return "redirect:/expenses";
	}
}
