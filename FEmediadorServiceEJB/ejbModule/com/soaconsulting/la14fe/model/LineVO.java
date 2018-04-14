package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class LineVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Number;
	private String  FreeOfCharge;
	private String  AccountingCostCode;
	private String  Quantity;
	private String  QuantityUnitOfMeasure;
	private String  TaxableAmount;
	private String  TaxCategory;
	private String  TaxPercentage;
	private String  TaxAmount;
	private String  UnitPrice;
	private String  GrossAmount;
	private String  NetAmount;
	private AllowanceChargesVO allowanceCharges;
	private DocumentReferencesVO documentsReferences;
	private DocumentLineReferencesVO documentLineReferences;
	private ItemVO item;
	
	
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getFreeOfCharge() {
		return FreeOfCharge;
	}
	public void setFreeOfCharge(String freeOfCharge) {
		FreeOfCharge = freeOfCharge;
	}
	public String getAccountingCostCode() {
		return AccountingCostCode;
	}
	public void setAccountingCostCode(String accountingCostCode) {
		AccountingCostCode = accountingCostCode;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getQuantityUnitOfMeasure() {
		return QuantityUnitOfMeasure;
	}
	public void setQuantityUnitOfMeasure(String quantityUnitOfMeasure) {
		QuantityUnitOfMeasure = quantityUnitOfMeasure;
	}
	public String getTaxableAmount() {
		return TaxableAmount;
	}
	public void setTaxableAmount(String taxableAmount) {
		TaxableAmount = taxableAmount;
	}
	public String getTaxCategory() {
		return TaxCategory;
	}
	public void setTaxCategory(String taxCategory) {
		TaxCategory = taxCategory;
	}
	public String getTaxPercentage() {
		return TaxPercentage;
	}
	public void setTaxPercentage(String taxPercentage) {
		TaxPercentage = taxPercentage;
	}
	public String getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		TaxAmount = taxAmount;
	}
	public String getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		UnitPrice = unitPrice;
	}
	public String getGrossAmount() {
		return GrossAmount;
	}
	public void setGrossAmount(String grossAmount) {
		GrossAmount = grossAmount;
	}
	public String getNetAmount() {
		return NetAmount;
	}
	public void setNetAmount(String netAmount) {
		NetAmount = netAmount;
	}
	public AllowanceChargesVO getAllowanceCharges() {
		return allowanceCharges;
	}
	public void setAllowanceCharges(AllowanceChargesVO allowanceCharges) {
		this.allowanceCharges = allowanceCharges;
	}
	public DocumentReferencesVO getDocumentsReferences() {
		return documentsReferences;
	}
	public void setDocumentsReferences(DocumentReferencesVO documentsReferences) {
		this.documentsReferences = documentsReferences;
	}
	public DocumentLineReferencesVO getDocumentLineReferences() {
		return documentLineReferences;
	}
	public void setDocumentLineReferences(DocumentLineReferencesVO documentLineReferences) {
		this.documentLineReferences = documentLineReferences;
	}
	public ItemVO getItem() {
		return item;
	}
	public void setItem(ItemVO item) {
		this.item = item;
	}
	
	
	
}
