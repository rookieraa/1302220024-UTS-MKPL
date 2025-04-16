/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcalculator_1302220024;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	
        private LocalDate joiningDate; // Changed to LocalDate for better date handling
        private PersonalInfo info;
        	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	
	public Employee(String employeeId, PersonalInfo info) {
            this.employeeId = employeeId;
            this.info = info;
        }
	
	
	public void setMonthlySalary(int grade) {
	int baseSalary = switch (grade) {
		case 1 -> 3_000_000;
		case 2 -> 5_000_000;
		case 3 -> 7_000_000;
		default -> 0;
	};
	if (this.info.isIsForeigner()) {
		baseSalary *= 1.5;
	}
	monthlySalary = (int) baseSalary;
}

	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
            this.info.setSpouseName(spouseName); 
            this.info.setSpouseIdNumber(spouseIdNumber);
        }

	
        public void addChild(String childName, String childIdNumber) {
            this.info.add(childName);	
            this.info.setChildIdNumbers(childIdNumber);
        }

	
	public int getAnnualIncomeTax() {
            int monthsWorked = calculateMonthsWorked();
            return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthsWorked, annualDeductible, isMarried(), childIdNumbers.size());
        }
}

