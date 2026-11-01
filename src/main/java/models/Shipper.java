package models;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name = "shippers")
public class Shipper {

    @Override
	public String toString() {
		return "Shipper [shipperId=" + shipperId + ", companyName=" + companyName + ", phone=" + phone + "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipper_id")
    private Short shipperId;

    @Column(name = "company_name", nullable = false, length = 40)
    private String companyName;

    @Column(name = "phone", length = 24)
    private String phone;

	public Short getShipperId() {
		return shipperId;
	}

	public void setShipperId(Short shipperId) {
		this.shipperId = shipperId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    
}
