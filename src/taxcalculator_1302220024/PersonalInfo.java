/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcalculator_1302220024;

import java.util.List;

/**
 *
 * @author ASUS TM420IA
 */
public class PersonalInfo {
    private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;
        private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    public PersonalInfo(String firstName, String lastName, String idNumber, String address, boolean isForeigner, String spouseName, String spouseIdNumber, List<String> childNames, List<String> childIdNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
        this.childNames = childNames;
        this.childIdNumbers = childIdNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsForeigner() {
        return isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    public List<String> getChildNames() {
        return childNames;
    }

    public void setChildNames(List<String> childNames) {
        this.childNames = childNames;
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(List<String> childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
	
        
}
