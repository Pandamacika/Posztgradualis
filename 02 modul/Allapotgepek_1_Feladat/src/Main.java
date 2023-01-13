import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Scanner;

import static java.lang.System.*;


public class Main {
    enum ForgovillaAllapot {
        Nyitva,
        Zarva
    }

    enum ForgovillaEsemeny {
        AthaladasiKiserlet,
        athaladtAKapun


    }

    public static JFrame f = new JFrame("Forgovilla");
    public static JButton button2 = new JButton("Kilep");
    public static JButton button1 = new JButton("Athaladas");
    public static JButton button3 = new JButton("Atert");
    public static boolean aktualisAllapot;
    public static int count = 0;
    public static int count3 = 0;

    public static void main(String[] args) throws FileNotFoundException {
        //Egy alap forgóvillának két állapota van (nyitva és zárva),
        // illetve két alap eseménye (pénz bedobás és áthaladási kísérlet).
        // Az ilyen forgóvilla nem képes modellezni azt a helyzetet,
        // amikor valaki elkezd áthaladni a forgóvillán,
        // de meggondolja magát és visszafordul. Készítsen olyan forgóvilla modellt,
        // ami kezelni tudja ezt az esetet is. Határozza meg a kibővített állapotok
        // és események halmazát, és implementálja az új állapot kiszámoló függvényt ezeknek megfelelően.
        Radio_hallgatas();
        PenzbedobasVagysem();
        ForgovillaEsemeny athaladasiKiserlet = ForgovillaEsemeny.athaladtAKapun;
        Scanner sc = new Scanner(in);

        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        File mappa = mappa_eleresi_utvonala.toFile();
        f.pack();

        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        f.getContentPane().setBackground(Color.green);
        f.add(button1);
        f.add(button3);
        f.add(button2);
        button2.setBackground(Color.CYAN);
        button1.setBackground(Color.CYAN);
        button3.setBackground(Color.CYAN);
        f.setSize(450, 450);
        f.setLocationRelativeTo(null);
        f.setBackground(Color.green);
        f.setVisible(true);
        button2.addActionListener(new Kilepes());
        ClicksCount1 Athaladt_klikk = new ClicksCount1();
        ClicksCount3 Atert_klikk = new ClicksCount3();


    }

    static class ClicksCount1 implements ActionListener {


        ClicksCount1() {

            button1.addActionListener(this);

            f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

            f.getRootPane().setDefaultButton(button1);

            f.setSize(450, 450);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            count++;
            if ((count == 1)) {
                System.out.println(" On nem haladt at a kapun. Kerem probalja meg ujra ! ");
                PenzbedobasVagysem();
            }

        }
    }

    static class ClicksCount3 implements ActionListener {


        ClicksCount3() {


            button3.addActionListener(this);
            f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));


            f.getRootPane().setDefaultButton(button3);
            f.setSize(450, 450);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            count3++;
            if ((count3 == 1)) {
                System.out.println(" On athaladt a kapun . Viszontlatasra ! ");
                System.exit(0);
            }
            System.out.println(" On megnyomta a gombot " + count3);
        }
    }

    private static void Radio_hallgatas() {
        Runtime rTime = Runtime.getRuntime();
        String url = "http://onlineradiobox.com/ro/friss/player/?cs=ro.friss&played=1";
        String browser = "C:/Program Files/Internet Explorer/iexplore.exe ";
        Process pc = null;
        try {
            pc = rTime.exec(browser + url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class Kilepes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //DO SOMETHING
            System.exit(0);
        }
    }


    private static ActionListener PenzbedobasVagysem() {
        ForgovillaAllapot aktualisallapot;
        Scanner sc = new Scanner(in);
        out.println("Kerem adja meg,hogy szeretne-e penzt  bedobni vagy sem. A valasza lehet igen vagy nem !");
        String valasz = sc.nextLine();
        String penzbedobas = "igen";
        if (valasz.equals(penzbedobas)) {
            out.println("On athaladhat a kapun");
            aktualisallapot = ForgovillaAllapot.Nyitva;
            aktualisAllapot = true;
        } else {
            out.println("A kapu zarva marad");
            aktualisallapot = ForgovillaAllapot.Zarva;
            aktualisAllapot = false;
        }
        switch (aktualisallapot) {
            case Nyitva, Zarva -> {
                out.println(aktualisallapot);
            }
        }
        return null;
    }

}
