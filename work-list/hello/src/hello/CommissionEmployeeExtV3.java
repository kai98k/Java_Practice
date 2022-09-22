package hello;

public class CommissionEmployeeExtV3 extends Object{
	
	private String firstName;
	private String lastName;
	private String idNumber;
	private double grossSales;
	private double commissionRate;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {		
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，銷售金額必須 >= 0.0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if((commissionRate < 0.0) || (commissionRate >1.0)){
			throw new IllegalArgumentException("薪資資料錯誤，傭金比率必須 >= 0.0 並且 <= 1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployeeExtV3(String firstName,String lastName,String idNumber,double grossSales,double commissionRate) {
		super();
		
		if(firstName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 firstName 不可空白!");
		}
		
		if(lastName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 lastName 不可空白!");
		}
		
		if(idNumber.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 idNumber 不可空白!");
		}
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，銷售金額必須 >= 0.0");
		}
		
		if((commissionRate < 0.0) || (commissionRate >1.0)){
			throw new IllegalArgumentException("薪資資料錯誤，傭金比率必須 >= 0.0 並且 <= 1.0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double earnings() {
		return (getGrossSales() * getCommissionRate());
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領傭金的員工-姓名",getLastName(),getFirstName(),
				"身分證字號",getIdNumber(),
				"銷售金額",getGrossSales(),
				"傭金比例",getCommissionRate(),
				"薪資",this.earnings());
	}
}

