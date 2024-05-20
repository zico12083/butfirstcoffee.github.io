import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class rya {

    public rya() {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.GREEN);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JMenuBar menuBar = new JMenuBar();

        JMenu editMenu = new JMenu("Menu");
        JMenu searchMenu = new JMenu("Search");
        JMenu viewMenu = new JMenu("View");

        menuBar.add(editMenu);
        menuBar.add(searchMenu);
        menuBar.add(viewMenu);
        frame.setJMenuBar(menuBar);

        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem selectAllItem = new JMenuItem("Select All");

        editMenu.add(undoItem);
        editMenu.addSeparator();
        editMenu.add(copyItem);
        editMenu.addSeparator();
        editMenu.add(pasteItem);
        editMenu.add(selectAllItem);
        editMenu.addSeparator();
        editMenu.add(cutItem);
        editMenu.addSeparator();

        JMenu insertMenu = new JMenu("Insert");
        editMenu.add(insertMenu);
        editMenu.addSeparator();

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        selectAllItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.selectAll();
            }
        });

        undoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Undo action performed");
            }
        });

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

 

        JLabel label = new JLabel("Hi maam jlabel to");
        bottomPanel.add(label);

 

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new rya();
    }
}
