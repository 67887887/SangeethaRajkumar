package assignment.week3.day1;

public class Desktop extends ComputerClass {

	private void desktopSize() {
		System.out.println("The size of desktop 32 inch");

	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
}
