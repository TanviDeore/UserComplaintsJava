package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import csv.ReadFile;
import model.Complaint;

public class ComplaintDaoInMemory implements ComplaintDao {
	
	static ReadFile rd = new ReadFile();
	 List<Complaint> complaints = rd.fileLoader();
	 
	
	@Override
	public List<Complaint> viewComplaintsBasedOnYear(String year) {
		// TODO Auto-generated method stub
		return complaints.stream().filter(cp -> (cp.getDateRecieved().substring(cp.getDateRecieved().length()-4)).equals(year)).collect(Collectors.toList());
	}

	@Override
	public List<Complaint> viewComplaintsBasedOnCompany(String company) {
		return complaints.stream().filter(cp -> cp.getCompany().equals(company)).collect(Collectors.toList());
	}


	@Override
	public List<Complaint> viewComplaintsCloseWithExplanation(String explain) {
		// TODO Auto-generated method stub
		return complaints.stream().filter(cp -> cp.getCompanyResponse().equals(explain)).collect(Collectors.toList());
	}

	@Override
	public List<Complaint> viewComplaintsRecievedTimelyResponse() {
		// TODO Auto-generated method stub
		return complaints.stream().filter(cp -> cp.getTimelyResponse().equals("Yes")).collect(Collectors.toList());
	}

	@Override
	public Complaint viewComplaintsBasedOnId(String complaintId) {
		return complaints.stream().filter(cp->cp.getComplaintId().equals(complaintId)).findAny().orElse(null);
	
	}

}
