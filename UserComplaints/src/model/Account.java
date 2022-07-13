package model;

import java.time.LocalDate;

public class Account {
int accountNo;
String name;
LocalDate complaintGet;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getComplaintGet() {
	return complaintGet;
}
public void setComplaintGet(LocalDate complaintGet) {
	this.complaintGet = complaintGet;
}


}
