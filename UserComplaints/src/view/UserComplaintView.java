package view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import csv.ReadFile;
import model.Complaint;
import dao.ComplaintDao;
import dao.ComplaintDaoInMemory;

public class UserComplaintView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(
				"Enter 1.Displayall the complaints based on the year provided by the user\n2. Display all the complaints basedon the name of the bank provided by the user\n3.Display complaints based on the complaint id provided by the user\n4. Display all thecomplaints closed/closed with explanation\n5.Displayall the complaints which received a timely response");
ComplaintDao dao = new ComplaintDaoInMemory();
Scanner scan = new Scanner(System.in);
int option = scan.nextInt();
switch (option) {
case 1:
	System.out.println("Enter year");
	String cyear  = scan.next();
	List<Complaint> complaints0 = dao.viewComplaintsBasedOnYear(cyear);
	Iterator<Complaint> iterator0 = complaints0.iterator();
	while (iterator0.hasNext()) {
		Complaint complaint0 = iterator0.next();
		System.out.println(complaint0.getDateRecieved()+" "+complaint0.getComplaintId());
		
	}
	break;
case 2:
	System.out.println("Enter company name");
	String cname  = scan.next();
	List<Complaint> complaints = dao.viewComplaintsBasedOnCompany(cname);
	Iterator<Complaint> iterator = complaints.iterator();
	while (iterator.hasNext()) {
		Complaint complaint = iterator.next();
		System.out.println(complaint.getComplaintId()+" "+complaint.getCompany());
		
	}
	break;
case 3:
	System.out.println("Enter company id");
	String cid = scan.next();
	Complaint cmp = dao.viewComplaintsBasedOnId(cid);
	System.out.println(cmp.getComplaintId()+" "+cmp.getIssue());
	break;
case 4:
	System.out.println("Closed with explanation");
	String closeexp = "Closed with explanation";
	List<Complaint> complaints1 = dao.viewComplaintsCloseWithExplanation(closeexp);
	Iterator<Complaint> iterator1 = complaints1.iterator();
	while (iterator1.hasNext()) {
		Complaint complaint1 = iterator1.next();
		System.out.println(complaint1.getComplaintId()+" "+complaint1.getCompany());
		
	}
	break;
case 5:
	System.out.println("Recieved Timely Response");
	List<Complaint> complaints2 = dao.viewComplaintsRecievedTimelyResponse();
	Iterator<Complaint> iterator2 = complaints2.iterator();
	while (iterator2.hasNext()) {
		Complaint complaint2 = iterator2.next();
		System.out.println(complaint2.getComplaintId()+" "+complaint2.getCompanyResponse());
		
	}
	break;

default:
	break;
}
	}

}
