import javax.swing.*;

class Main {
	public static void main(String[] args) {
		JFrame myFrame;

		myFrame = new JFrame();
		myFrame.setSize(500,400);
		myFrame.setVisible(true);

		JOptionPane.showMessageDialog(myFrame, "Success");

		String name = JOptionPane.showInputDialog(myFrame, "Input Your Name");
		while (name.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Your name is...");
			name = JOptionPane.showInputDialog(myFrame, "Name:");
		}

		String yearStr = JOptionPane.showInputDialog(myFrame, "Year of birth:");
		while (yearStr.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Please input your name...");
			yearStr = JOptionPane.showInputDialog(myFrame, "Birth of date:");
		}
		int year = Integer.parseInt(yearStr);
		int age = 1998 - year;
		

		JOptionPane.showMessageDialog(myFrame, "Hello " + name + ", your age is " + age + " years old.");
		myFrame.dispose();
	}
}