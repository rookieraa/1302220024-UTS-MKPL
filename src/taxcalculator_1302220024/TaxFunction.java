/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcalculator_1302220024;

public class TaxFunction {

	
	
	public static int calculateTax(TaxPayerInfo info) {
            final int PTKP_SINGLE = 54_000_000;
            final int PTKP_MARRIED = 4_500_000;
            final int PTKP_CHILD = 1_500_000;
            final int MAX_CHILDREN = 3;
            final double TAX_RATE = 0.05;

            int validMonths = Math.min(info.getNumberOfMonthWorking(), 12);
            int validChildren = Math.min(info.getNumberOfChildren(), MAX_CHILDREN);

            int totalIncome = (info.getMonthlySalary() + info.getOtherMonthlyIncome()) * validMonths;

            int ptkp = PTKP_SINGLE +
                       (info.isMarried() ? PTKP_MARRIED : 0) +
                       (info.isMarried() ? (validChildren * PTKP_CHILD) : 0);

            int taxableIncome = totalIncome - info.getDeductible() - ptkp;
            int tax = (int) Math.round(TAX_RATE * taxableIncome);

            return Math.max(tax, 0);
        }

	
}

