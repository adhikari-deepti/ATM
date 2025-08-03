import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
		close();
		System.out.println("\n Done.\n");

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
	
	public static void close() {
		System.out.println("Payment Has Been Done!");
	}
}
