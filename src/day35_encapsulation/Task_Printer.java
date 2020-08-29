package day35_encapsulation;

public class Task_Printer {

	private double tonerLevel;
	private int numberOfPagesPrinted;
	private boolean isDuplex;
	
	
	
	public boolean getDuplex() {
		return isDuplex;
	}

	public void setDuplex(boolean isDuplex) {
		this.isDuplex = isDuplex;
	}

	public Task_Printer(double tonerLevel) {
		this.tonerLevel = tonerLevel;
		
	}
	
	public int getPageNumber() {
		if(tonerLevel==0) {
			numberOfPagesPrinted = 0;
		}else if(tonerLevel<10) {
			numberOfPagesPrinted = 100;
		}else if(tonerLevel<50) {
			numberOfPagesPrinted = 500;
		}else if(tonerLevel<=100) {
			numberOfPagesPrinted = 1000;
		}
		
		return numberOfPagesPrinted;
	}
	
	
	

	
	public double getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(double tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public String toString() {
		return "Task_Printer [tonerLevel=" + tonerLevel + ", numberOfPagesPrinted=" + numberOfPagesPrinted
				+ ", isDuplex=" + isDuplex + "]";
	}
	
	
	
	

}
