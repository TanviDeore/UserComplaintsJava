package dao;

import java.util.List;

import model.Complaint;

public interface ComplaintDao {
List<Complaint> viewComplaintsBasedOnYear(String year);
List<Complaint> viewComplaintsBasedOnCompany(String company);
Complaint viewComplaintsBasedOnId(String complaintId);
//Number of days took
List<Complaint> viewComplaintsCloseWithExplanation(String explain);
List<Complaint> viewComplaintsRecievedTimelyResponse();
//take input

}

