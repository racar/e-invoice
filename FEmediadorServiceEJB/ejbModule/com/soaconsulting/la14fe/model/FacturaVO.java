package com.soaconsulting.la14fe.model;


public class FacturaVO {
	
	private String seriePrefix;
	private String serieNumber;
	private BillingPeriodVO billingPeriod;
	private IssuerPartyVO issuerParty;
	private CustomerPartyVO customerParty;
	private String currency;
	private LinesVO lines;
	private TaxSummaryVO taxSummary;
	private WithholdingTaxSummaryVO withholdingTaxSummary;
	private PrepaidPaymentsVO prepaidPayments;
	private TotalVO total;
	private String issueMode;
	private String issueDate;
	private String dueDate;
	private String deliveryDate;
	private String externalReference;
	private DocumentAttachmentsVO documentAttachments;
	private String correlationDocumentId;
	private String serieExternalKey;
	private PaymentExchangeRateVO paymentExchangeRate;
	private DeliveryTermsVO deliveryTerms;
	private String additionalNotificationEmails;
	private PaymentMeansVO paymentMeans;
	private PaymentTermsVO paymentTerms;
	private AllowanceChargesVO allowanceCharges;
	private DocumentReferencesVO documentReferences;
	
	public FacturaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSeriePrefix() {
		return seriePrefix;
	}
	public void setSeriePrefix(String seriePrefix) {
		this.seriePrefix = seriePrefix;
	}
	public String getSerieNumber() {
		return serieNumber;
	}
	public void setSerieNumber(String serieNumber) {
		this.serieNumber = serieNumber;
	}
	public void setBillingPeriod (BillingPeriodVO _bpVO) {
		this.billingPeriod = _bpVO;
	}
	public BillingPeriodVO getBillingPeriod() {
		return billingPeriod;
	}
	public IssuerPartyVO getIssuerParty() {
		return issuerParty;
	}
	public void setIssuerParty(IssuerPartyVO issuerParty) {
		this.issuerParty = issuerParty;
	}
	public CustomerPartyVO getCustomerParty() {
		return customerParty;
	}
	public void setCustomerParty(CustomerPartyVO customerParty) {
		this.customerParty = customerParty;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LinesVO getLines() {
		return lines;
	}
	public void setLines(LinesVO lines) {
		this.lines = lines;
	}
	public TaxSummaryVO getTaxSummary() {
		return taxSummary;
	}
	public void setTaxSummary(TaxSummaryVO taxSummary) {
		this.taxSummary = taxSummary;
	}
	public WithholdingTaxSummaryVO getWithholdingTaxSummary() {
		return withholdingTaxSummary;
	}
	public void setWithholdingTaxSummary(WithholdingTaxSummaryVO withholdingTaxSummary) {
		this.withholdingTaxSummary = withholdingTaxSummary;
	}
	public PrepaidPaymentsVO getPrepaidPayments() {
		return prepaidPayments;
	}
	public void setPrepaidPayments(PrepaidPaymentsVO prepaidPayments) {
		this.prepaidPayments = prepaidPayments;
	}
	public TotalVO getTotal() {
		return total;
	}
	public void setTotal(TotalVO total) {
		this.total = total;
	}
	public String getIssueMode() {
		return issueMode;
	}
	public void setIssueMode(String issueMode) {
		this.issueMode = issueMode;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getExternalReference() {
		return externalReference;
	}
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}
	public DocumentAttachmentsVO getDocumentAttachments() {
		return documentAttachments;
	}
	public void setDocumentAttachments(DocumentAttachmentsVO documentAttachments) {
		this.documentAttachments = documentAttachments;
	}
	public String getCorrelationDocumentId() {
		return correlationDocumentId;
	}
	public void setCorrelationDocumentId(String correlationDocumentId) {
		this.correlationDocumentId = correlationDocumentId;
	}
	public String getSerieExternalKey() {
		return serieExternalKey;
	}
	public void setSerieExternalKey(String serieExternalKey) {
		this.serieExternalKey = serieExternalKey;
	}
	public PaymentExchangeRateVO getPaymentExchangeRate() {
		return paymentExchangeRate;
	}
	public void setPaymentExchangeRate(PaymentExchangeRateVO paymentExchangeRate) {
		this.paymentExchangeRate = paymentExchangeRate;
	}
	public DeliveryTermsVO getDeliveryTerms() {
		return deliveryTerms;
	}
	public void setDeliveryTerms(DeliveryTermsVO deliveryTerms) {
		this.deliveryTerms = deliveryTerms;
	}
	public String getAdditionalNotificationEmails() {
		return additionalNotificationEmails;
	}
	public void setAdditionalNotificationEmails(String additionalNotificationEmails) {
		this.additionalNotificationEmails = additionalNotificationEmails;
	}
	public PaymentMeansVO getPaymentMeans() {
		return paymentMeans;
	}
	public void setPaymentMeans(PaymentMeansVO paymentMeans) {
		this.paymentMeans = paymentMeans;
	}
	public PaymentTermsVO getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(PaymentTermsVO paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public AllowanceChargesVO getAllowanceCharges() {
		return allowanceCharges;
	}
	public void setAllowanceCharges(AllowanceChargesVO allowanceCharges) {
		this.allowanceCharges = allowanceCharges;
	}
	public DocumentReferencesVO getDocumentReferences() {
		return documentReferences;
	}
	public void setDocumentReferences(DocumentReferencesVO documentReferences) {
		this.documentReferences = documentReferences;
	}
	
	
}
