package DBCPJ;

public class Advertise {

	private String adId;
	private String adContent;
	private String adProduct;
	private String adType;
	public Advertise() {
	}
	
	public Advertise(String adId) {
		this.adId=adId;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdContent() {
		return adContent;
	}
	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}
	public String getAdProduct() {
		return adProduct;
	}
	public void setAdProduct(String adProduct) {
		this.adProduct = adProduct;
	}
	public String getAdType() {
		return adType;
	}
	public void setAdType(String adType) {
		this.adType = adType;
	}


}
