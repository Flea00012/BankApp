import java.io.File;

public class BankApp extends Logger{
	
	@Override
	public <E extends File> E writeToFile(E file) {
		// TODO Auto-generated method stub
		return super.writeToFile(file);
	}
	private String itemString;
	private String dateString;
	private double cost;
	
	public BankApp(String itemString, String dateString, double cost) {
		super();
		this.itemString = itemString;
		this.dateString = dateString;
		this.cost = cost;
	}
	
	
	
	
	
	
	

}
