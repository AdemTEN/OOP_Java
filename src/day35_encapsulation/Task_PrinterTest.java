package day35_encapsulation;

public class Task_PrinterTest {

	public static void main(String[] args) {
		
		Task_Printer printer = new Task_Printer(65);
		printer.setDuplex(true);
		System.out.println(printer.getPageNumber());
		System.out.println(printer.getDuplex());
		
		printer.setTonerLevel(0);
		System.out.println(printer.getTonerLevel());
		
		System.out.println(printer.toString());
		
		
	}

}
