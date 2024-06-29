import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetDisplayApp extends JFrame {
    private JLabel petLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup petGroup;

    public PetDisplayApp() {
        setTitle("Pet Display Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        petLabel = new JLabel();
        petLabel.setHorizontalAlignment(SwingConstants.CENTER);
        petLabel.setPreferredSize(new Dimension(200, 200));

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        petGroup = new ButtonGroup();
        petGroup.add(birdButton);
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(pigButton);

        birdButton.addActionListener(new ActionListener() {
   
