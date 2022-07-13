package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Complaint;

public class ReadFile {

	public  List<Complaint> fileLoader() {
		String path = "C:\\Users\\tanvi\\Downloads\\complaints.csv";
		String blank = "";
		List<Complaint> complaints = new ArrayList<Complaint>();
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(path));
			while ((blank = bf.readLine()) != null) {
				String[] elements = blank.split(",");
				Complaint complaint = new Complaint();
				complaint.setDateRecieved(elements[0]);
				complaint.setProduct(elements[1]);
				complaint.setSubProduct(elements[2]);
				complaint.setIssue(elements[3]);
				complaint.setSubIssue(elements[4]);
				complaint.setCompany(elements[5]);
				complaint.setState(elements[6]);
				complaint.setZipCode(elements[7]);
				complaint.setSubmittedVia(elements[8]);
				complaint.setDateSent(elements[9]);
				complaint.setCompanyResponse(elements[10]);
				complaint.setTimelyResponse(elements[11]);
				complaint.setConsumerDisputed(elements[12]);
				complaint.setComplaintId(elements[13]);
	complaints.add(complaint);
			}

			bf.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return complaints;
	}

	

}
