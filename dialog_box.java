import javax.swing.JOptionPane;

public class dialog_box
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Hello World!");
    }
}

class dialog_input_box
{
    public static void main(String[] args)
    {
        String quest;
        quest = JOptionPane.showInputDialog("What is your quest?");
    }
}

