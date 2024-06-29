java
Copy code
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
            public void actionPerformed(ActionEvent e) {
                displayPet("Bird");
            }
        });

        catButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPet("Cat");
            }
        });

        dogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPet("Dog");
            }
        });

        rabbitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPet("Rabbit");
            }
        });

        pigButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPet("Pig");
            }
        });

        JPanel radioPanel = new JPanel(new GridLayout(5, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(radioPanel, BorderLayout.WEST);
        getContentPane().add(petLabel, BorderLayout.CENTER);
    }

    private void displayPet(String pet) {
        String imagePath = "";
        switch (pet) {
            case "Bird":
                imagePath = "bird.jpg";
                break;
            case "Cat":
                imagePath = "cat.jpg";
                break;
            case "Dog":
                imagePath = "dog.jpg";
                break;
            case "Rabbit":
                imagePath = "rabbit.jpg";
                break;
            case "Pig":
                imagePath = "pig.jpg";
                break;
            default:
                break;
        }
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        petLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PetDisplayApp().setVisible(true);
            }
        });
    }
}
   
