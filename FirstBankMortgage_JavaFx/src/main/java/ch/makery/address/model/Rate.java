package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import domain.RateDomainModel;

public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments, int house)
	{
		
		double monthlyPay = FinanceLib.pmt((this.getInterestRate() / 100.0) / 12, NumberOfPayments, -house, 0, false);
		//interest rate put into decimal form. 
		
		return monthlyPay;
	}
}
