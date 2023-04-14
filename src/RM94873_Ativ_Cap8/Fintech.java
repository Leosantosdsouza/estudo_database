package RM94873_Ativ_Cap8;

public class Fintech {
	
	private String email;
	private Integer NumeroConta;
	private Double Saldo;
	private Double Gasto;
	
	public Fintech() {
		
	}

	public Fintech(String email, Integer numeroConta, Double saldo, Double gasto) {
		this.email = email;
		NumeroConta = numeroConta;
		Saldo = saldo;
		Gasto = gasto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		NumeroConta = numeroConta;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

	public Double getGasto() {
		return Gasto;
	}

	public void setGasto(Double gasto) {
		Gasto = gasto;
	}
	
	public double SaldoAtual() {
		return Saldo - Gasto;
	}

}
