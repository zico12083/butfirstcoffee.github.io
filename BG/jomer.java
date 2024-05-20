import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class jomer {

    public static void main(String[] args) {
        JFrame f = new JFrame("Menu");

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.GREEN);
      

        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);

        JMenu Gov = new JMenu("GOVPH");
        menuBar.add(Gov);

        JMenu Hom = new JMenu("HOME");
        menuBar.add(Hom);

        JMenu abt = new JMenu("ABOUTus");
        menuBar.add(abt);

        JMenu Off = new JMenu("Offices");
        menuBar.add(Off);

        JMenu Serv = new JMenu("Services");
        menuBar.add(Serv);

        JMenu Iss = new JMenu("Issuances");
        menuBar.add(Iss);
        
        JMenu opp = new JMenu("Opportunities");
        menuBar.add(opp);

        JMenu cu = new JMenu("Contact us");
        menuBar.add(cu);


        
        JMenuItem history = new JMenuItem("History");
        abt.add(history);abt.addSeparator();
        JMenuItem tbr = new JMenuItem("Thte Board of Legends");
        abt.add(tbr);abt.addSeparator();
        JMenuItem pc = new JMenuItem("President corner");
        abt.add(pc);abt.addSeparator();
        JMenuItem acc = new JMenuItem("Administrative Council Comittee");
        abt.add(acc);abt.addSeparator();
        JMenuItem oc = new JMenuItem("Organizational Chart");
        abt.add(oc);abt.addSeparator();
        JMenuItem md = new JMenuItem("Mandate");
        abt.add(md);abt.addSeparator();

        JMenuItem op = new JMenuItem("Office of the PResident");
        Off.add(op);Off.addSeparator();
        JMenuItem af = new JMenuItem("TAcademic Affirs");
        Off.add(af);Off.addSeparator();
        JMenuItem abf = new JMenuItem("Administratoin,Business and finance office");
        Off.add(abf);Off.addSeparator();
        JMenuItem prg = new JMenuItem("Planning and resources generation office");
        Off.add(prg);Off.addSeparator();
        JMenuItem R = new JMenuItem("Research,Innovation,Extension and training office");
        Off.add(R);Off.addSeparator();
        
        JMenuItem hd = new JMenuItem("HEalth desk");
        Serv.add(hd);Serv.addSeparator();
        JMenuItem fi = new JMenuItem("Freedom of Information");
        Serv.add(fi);Serv.addSeparator();
        JMenuItem a = new JMenuItem("Admission");
        Serv.add(a);Serv.addSeparator();
        JMenuItem lib = new JMenuItem("Library");
        Serv.add(lib);Serv.addSeparator();
      
        JMenuItem dp = new JMenuItem("Data Privacy Notice Online");
        Iss.add(dp);Iss.addSeparator();
        JMenuItem u = new JMenuItem("Utilization");
        Iss.add(u);Iss.addSeparator();
        JMenuItem oo = new JMenuItem("Office Orders");
        Iss.add(oo);Iss.addSeparator();
       
        JMenuItem cItem = new JMenuItem("Career");
        opp.add(cItem);opp.addSeparator();
        JMenuItem BAC = new JMenuItem("Bids adnd awards Comittee");
        opp.add(BAC);opp.addSeparator();

        JMenuItem CM = new JMenuItem("Campus Map");
        cu.add(CM);cu.addSeparator();
        
        
       
  
        
      
  
      


    }
}