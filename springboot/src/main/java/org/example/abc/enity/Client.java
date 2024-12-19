package org.example.abc.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    String clientName;//客户姓名
    String clientAddress;//客户住址
    String clientArea;//客户片区
    String clientPhoneNumber;//客户电话
    String invoicingPhoneNumber;//开票电话
    String invoicingAddress;//开票地址
    String buyerAttributes; //买房属性
    String clientIndustry; //客户所属行业

    public Client() {
    }

    public Client(String clientName, String clientAddress, String clientArea, String clientPhoneNumber, String invoicingPhoneNumber, String invoicingAddress, String buyerAttributes, String clientIndustry) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientArea = clientArea;
        this.clientPhoneNumber = clientPhoneNumber;
        this.invoicingPhoneNumber = invoicingPhoneNumber;
        this.invoicingAddress = invoicingAddress;
        this.buyerAttributes = buyerAttributes;
        this.clientIndustry = clientIndustry;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getInvoicingPhoneNumber() {
        return invoicingPhoneNumber;
    }

    public void setInvoicingPhoneNumber(String invoicingPhoneNumber) {
        this.invoicingPhoneNumber = invoicingPhoneNumber;
    }

    public String getInvoicingAddress() {
        return invoicingAddress;
    }

    public void setInvoicingAddress(String invoicingAddress) {
        this.invoicingAddress = invoicingAddress;
    }

    public String getBuyerAttributes() {
        return buyerAttributes;
    }

    public void setBuyerAttributes(String buyerAttributes) {
        this.buyerAttributes = buyerAttributes;
    }

    public String getClientIndustry() {
        return clientIndustry;
    }

    public void setClientIndustry(String clientIndustry) {
        this.clientIndustry = clientIndustry;
    }
}
