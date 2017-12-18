package logic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import db.CertificatDAO;

import db.CertificatDAO;

@Entity
@Table
public class Certificat extends CertificatDAO {
	@Id
	private int certificatId;
	private String certificatName;
	private boolean result;
	
	public Certificat() {
		super();
	}
	
	public Certificat(String certificatName, boolean i) {
		super();
		this.certificatName = certificatName;
		this.result = i;
	}
	
	public int getCertificatId() {
		return certificatId;
	}
	
	public void setCertificatId(int certificatId) {
		this.certificatId = certificatId;
	}
	
	public String getCertificatName() {
		return certificatName;
	}
	
	public void setCertificatName(String certificatName) {
		this.certificatName = certificatName;
	}
	
	public boolean isResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}	
}

