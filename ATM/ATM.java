import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
		System.out.println("\n Done.\n");
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}
