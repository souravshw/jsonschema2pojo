package sample_wsdl_jsonschema2pojo;

import com.globalss.wsdl.BusinessEntityType;
import com.globalss.wsdl.CorporateLinkage;
import com.globalss.wsdl.DnbAssessment;
import com.globalss.wsdl.DunsControlStatus;
import com.globalss.wsdl.InquiryDetail;
import com.globalss.wsdl.Location;
import com.globalss.wsdl.RegistrationNumbers;
import com.globalss.wsdl.SocioEconomicInformation;
import com.globalss.wsdl.TransactionDetail;

public class EnrichCompanyProfileResponse {
  private CorporateLinkage corporateLinkage[];
  private Location location[];
  private BusinessEntityType BusinessEntityType[];
  private SocioEconomicInformation socioEconomicInformation[];
  private RegistrationNumbers registrationNumbers[];
  private DnbAssessment dnbAssessment[];
  private DunsControlStatus dunsControlStatus[];
  private TransactionDetail TransactionDetail[];
  private InquiryDetail inquiryDetail[];

  public CorporateLinkage [] getCorporateLinkage() {
    return corporateLinkage;
  }

  public void setCorporateLinkage(CorporateLinkage [] corporateLinkage) {
    this.corporateLinkage = corporateLinkage;
  }

  public Location [] getLocation() {
    return location;
  }

  public void setLocation(Location [] location) {
    this.location = location;
  }

  public BusinessEntityType [] getBusinessEntityType() {
    return BusinessEntityType;
  }

  public void setBusinessEntityType(BusinessEntityType [] businessEntityType) {
    BusinessEntityType = businessEntityType;
  }

  public SocioEconomicInformation [] getSocioEconomicInformation() {
    return socioEconomicInformation;
  }

  public void setSocioEconomicInformation(SocioEconomicInformation [] socioEconomicInformation) {
    this.socioEconomicInformation = socioEconomicInformation;
  }

  public RegistrationNumbers [] getRegistrationNumbers() {
    return registrationNumbers;
  }

  public void setRegistrationNumbers(RegistrationNumbers [] registrationNumbers) {
    this.registrationNumbers = registrationNumbers;
  }

  public DnbAssessment [] getDnbAssessment() {
    return dnbAssessment;
  }

  public void setDnbAssessment(DnbAssessment [] dnbAssessment) {
    this.dnbAssessment = dnbAssessment;
  }

  public DunsControlStatus [] getDunsControlStatus() {
    return dunsControlStatus;
  }

  public void setDunsControlStatus(DunsControlStatus [] dunsControlStatus) {
    this.dunsControlStatus = dunsControlStatus;
  }

  public TransactionDetail [] getTransactionDetail() {
    return TransactionDetail;
  }

  public void setTransactionDetail(TransactionDetail [] transactionDetail) {
    TransactionDetail = transactionDetail;
  }

  public InquiryDetail [] getInquiryDetail() {
    return inquiryDetail;
  }

  public void setInquiryDetail(InquiryDetail [] inquiryDetail) {
    this.inquiryDetail = inquiryDetail;
  }
}
