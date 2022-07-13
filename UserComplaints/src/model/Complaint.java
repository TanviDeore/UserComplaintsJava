package model;

public class Complaint {
	String dateRecieved;
	String product;
	String subProduct;
	String issue;
	String subIssue;
	String company;
	String state;
	String zipCode;
	String submittedVia;
	String dateSent;
	String companyResponse;
	String timelyResponse;
	String consumerDisputed;
	String complaintId;
	
	public Complaint() {}

	

	public Complaint(String dateRecieved, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedVia, String dateSent, String companyResponse,
			String timelyResponse, String consumerDisputed, String complaintId) {
		super();
		this.dateRecieved = dateRecieved;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSent = dateSent;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		this.complaintId = complaintId;
	}



	public String getDateRecieved() {
		return dateRecieved;
	}

	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getSubIssue() {
		return subIssue;
	}

	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSubmittedVia() {
		return submittedVia;
	}

	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}

	public String getDateSent() {
		return dateSent;
	}

	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}

	public String getCompanyResponse() {
		return companyResponse;
	}

	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}

	public String getTimelyResponse() {
		return timelyResponse;
	}

	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}

	public String getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}



	public String getConsumerDisputed() {
		return consumerDisputed;
	}



	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	

	
	

}
