import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {

    // variable to keep track of current index in the list
    // --- TO DO: why is this static? ---
    private static int currentIndex = 0;

    public static void main(String[] args) throws Exception {
        // create a list of top 5 things
        // --- TO DO: Change to your own list ---
        String[] top5 = {
            "1. aWEf",
            "2. awef",
            "3. oijrehg",
            "4. bjdsiof",
            "5. e4gkgopre"
        };

         // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("My Top 5 List");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // create a Button and a Label
        JButton nextButton = new JButton("Next");
        JLabel outputLabel = new JLabel();
        // --- TO DO: create a back button, format, and add it to the frame ---
        JButton backButton = new JButton("Back");
        JLabel outputLabel2 = new JLabel();
        // place and size for components
        // setBounds(x position, y position, width, height)
        nextButton.setBounds(100, 200, 100, 50);
        outputLabel.setBounds(100,100,200,50);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
        outputLabel.setForeground(Color.BLUE);

        backButton.setBounds(250, 200, 100, 50);
        outputLabel2.setBounds(100,100,200,50);
        outputLabel2.setFont(new Font("Arial", Font.PLAIN, 32));
        outputLabel2.setForeground(Color.BLUE);


        // the output label will display the first item in the list initially
        outputLabel.setText( top5[currentIndex] );

        // add components to JFrame f
        frame.add(outputLabel);
        frame.add(nextButton);
        frame.add(backButton);
        // frame.add(outputLabel2);

        // add event listener for button click
        nextButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentIndex = getNextIndex(currentIndex, top5.length);
            outputLabel.setText(top5[currentIndex]);
        }    });

        // --- TO DO: add event listener for back button ---

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentIndex = getPrevIndex(currentIndex, top5.length);
                outputLabel.setText(top5[currentIndex]);
            }    });
        // --- TO DO: create a getPreviousIndex function, see below ---


        // make the frame visible
        frame.setVisible(true);
    }

    /**
     *  find the next index in the list
     * @param currentIndex
     * @param listLength
     * @return next index
     */
        public static int getNextIndex(int currentIndex, int listLength) {
            if (currentIndex == listLength - 1) {
                return 0; // wrap around to the start
            }
            else {
                return currentIndex + 1; // move to the next index
            }
        }

    // --- TO DO: create a getPreviousIndex function ---
    /**
     *  find the next index in the list
     * @param currentIndex
     * @param listLength
     * @return previous index
     */

    public static int getPrevIndex(int currentIndex, int listLength) {
        if (currentIndex == listLength - 1) {
            return 0; // wrap around to the start
        }
        else {
            return currentIndex - 1; // move to the next index
        }
    }
    
}

