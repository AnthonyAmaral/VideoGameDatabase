package VideoGameDatabase;

import java.text.DecimalFormat;

public class Element
{
	private String title, complete, console, missing;
	private double price;
	private DecimalFormat df = new DecimalFormat("#.##");
	
	public Element(String console, String title, double price, String complete, String missing) {
		
		super();
		this.console = console;
		this.title = title;
		this.price = price;
		this.complete = complete;
		this.missing = missing;
		
		
	}

	//getters and setters
	public String getConsole() {
		return title;
	}



	public void setConsole(String console) {
		this.console = console;
	}

	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	
	
		public String getComplete() {
		return complete;
	}



	public void setComplete(String complete) {
		this.complete = complete;
	}

	
	public String getMissing() {
		return missing;
	}



	public void setMissing(String missing) {
		this.missing = missing;
	}

	
	
	public static void main(String[] args) {
	
	}

		public String toString() {
			return title + "\t" + console + "\t\t$" +  df.format(price) + "\t\t" + complete + "\t\t" + missing + "\n\n";
			
			
		}
	}
	


