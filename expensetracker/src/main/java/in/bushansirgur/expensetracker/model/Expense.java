package in.bushansirgur.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_expenses")
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String expense;
	
	private String description;
	
	private BigDecimal amount;

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(Long id, String expense, String description, BigDecimal amount) {
		super();
		this.id = id;
		this.expense = expense;
		this.description = description;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", expense=" + expense + ", description=" + description + ", amount=" + amount
				+ ", getId()=" + getId() + ", getExpense()=" + getExpense() + ", getDescription()=" + getDescription()
				+ ", getAmount()=" + getAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
