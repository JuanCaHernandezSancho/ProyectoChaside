package vista;

import javax.swing.*;

public class InterfazGUI extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int yes, no;
	
	public void ConfirmStart()
	{
		int returnValue = JOptionPane.showConfirmDialog(null, "Next, we will make you 98 questions. Do you want to continue?", "Warning!", JOptionPane.WARNING_MESSAGE);
		if(returnValue == JOptionPane.CANCEL_OPTION)
		{
			System.exit(0);
		}
	}
	
	public void Pregunta(String insertQuestion)
	{
		int returnValue = JOptionPane.showConfirmDialog(null, insertQuestion, "Chaside", JOptionPane.YES_NO_OPTION);
		if(returnValue == JOptionPane.YES_OPTION)
		{
			yes++;
		}
		else
		{
			no++;
		}
	}
	
	public void Final(int totalPoints)
	{
		JOptionPane.showMessageDialog(null, "The final score is: "+totalPoints, "End of the test.", JOptionPane.INFORMATION_MESSAGE);
	}

	public int getYes() {
		return yes;
	}

	public int getNo() {
		return no;
	}
	
}
