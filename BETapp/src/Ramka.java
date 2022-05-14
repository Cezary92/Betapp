import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ramka extends JFrame implements ActionListener{

    JButton oblicz = new JButton("Oblicz");
    JTextField tposiadaniePilki = new JTextField();
    JTextField tsytuacjeBramkowe = new JTextField();
    JTextField tstrzalyNaBramke = new JTextField();
    JTextField trzutyRozne = new JTextField();
    JTextField tpodania = new JTextField();
    JTextField tkurs = new JTextField();
    JLabel odp = new JLabel();


    Ramka(){


        this.setTitle("BET app");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,630);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("ikon2.jpg");
        this.setIconImage(image.getImage());
        this.setLayout(null);
        this.setVisible(true);


        JLabel posiadaniePilki, sytuacjeBramkowe, strzalyNaBramke, rzutyRozne, podania, kurs;


        odp = new JLabel();
        odp.setBounds(50, 50, 400, 50);
        odp.setFont(new Font(null, Font.ITALIC, 34 ));



        posiadaniePilki = new JLabel("Podaj liczbę posiadania piłki: ");
        posiadaniePilki.setBounds(100, 200, 200, 30);
        tposiadaniePilki.setBounds(350, 200, 50, 25);


        sytuacjeBramkowe = new JLabel("Podaj liczbę sytuacji bramkowych: ");
        sytuacjeBramkowe.setBounds(100, 240, 200, 30);
        tsytuacjeBramkowe.setBounds(350, 240, 50, 25);

        strzalyNaBramke = new JLabel("Podaj liczbę strzałów na bramkę: ");
        strzalyNaBramke.setBounds(100, 280, 200, 30);
        tstrzalyNaBramke.setBounds(350, 280, 50, 25);

        rzutyRozne = new JLabel("Podaj liczbę rzutów rożnych: ");
        rzutyRozne.setBounds(100, 320, 200, 30);
        trzutyRozne.setBounds(350, 320, 50, 25);

        podania = new JLabel("Podaj liczbę podań: ");
        podania.setBounds(100, 360, 200, 30);
        tpodania.setBounds(350, 360, 50, 25);

        kurs = new JLabel("Podaj kurs meczowy: ");
        kurs.setBounds(100, 400, 200, 30);
        tkurs.setBounds(350, 400, 50, 25);



        oblicz.setBounds(70, 480, 350, 50);
        oblicz.setBackground(Color.LIGHT_GRAY);
        oblicz.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        oblicz.addActionListener(this);

        this.add(posiadaniePilki); this.add(sytuacjeBramkowe); this.add(strzalyNaBramke); this.add(rzutyRozne); this.add(podania); this.add(kurs);
        this.add(tposiadaniePilki); this.add(tsytuacjeBramkowe); this.add(tstrzalyNaBramke); this.add(trzutyRozne); this.add(tpodania); this.add(tkurs);
        this.add(oblicz); this.add(odp);

        this.getContentPane().setBackground(Color.gray);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pos = tposiadaniePilki.getText();
        String syt = tsytuacjeBramkowe.getText();
        String str = tstrzalyNaBramke.getText();
        String rzu = trzutyRozne.getText();
        String pod = tpodania.getText();
        String kur = tkurs.getText();

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;

        int ipos = Integer.parseInt(pos);
        int isyt = Integer.parseInt(syt);
        int istr = Integer.parseInt(str);
        int irzu = Integer.parseInt(rzu);
        int ipod = Integer.parseInt(pod);
        int ikur = Integer.parseInt(kur);

        if(ipos > 80){
            i1 = 18;
        }else if(ipos > 70){
            i1 = 16;
        }else if(ipos > 60){
            i1 = 14;
        }else if(ipos > 50){
            i1= 10;
        }else if(ipos > 40){
            i1= 5;
        }else{
            i1 = 0;
        }

        if(isyt > 15){
            i2 = 18;
        }else if(isyt > 12){
            i2 = 16;
        }else if(isyt > 10){
            i2 = 14;
        }else if(isyt > 8){
            i2= 10;
        }else if(isyt > 5){
            i2= 5;
        }else{
            i2 = 0;
        }

        if(istr > 8){
            i3 = 18;
        }else if(istr > 7){
            i3 = 16;
        }else if(istr > 6){
            i3 = 14;
        }else if(istr > 5){
            i3= 10;
        }else if(istr > 4){
            i3= 5;
        }else{
            i3 = 0;
        }

        if(irzu > 6){
            i4 = 18;
        }else if(irzu > 5){
            i4 = 16;
        }else if(irzu> 4){
            i4 = 14;
        }else if(irzu > 3){
            i4= 10;
        }else if(irzu> 2){
            i4= 5;
        }else{
            i4 = 0;
        }

        if(ipod > 6){
            i5 = 18;
        }else if(ipod > 5){
            i5 = 16;
        }else if(ipod > 4){
            i5 = 14;
        }else if(ipod > 3){
            i5= 10;
        }else if(ipod> 2){
            i5= 5;
        }else{
            i5 = 0;
        }

        if(ikur < 2){
            i6 = 8;
        }else if(ikur < 3){
            i6 = 5;
        }else if(ikur < 2){
            i6 = 2;
        }else{
            i6 = 0;
        }

        int sum = i1 + i2 + i3 + i4 + i5 + i6 + 1;

        if(e.getSource()==oblicz){
            if(sum > 70){
                odp.setForeground(Color.green);
                odp.setText("Szansa na wygraną: " + sum + "%");
            }else if(sum > 50){
                odp.setForeground(Color.yellow);
                odp.setText("Szansa na wygraną: " + sum + "%");
            }
            else{
                odp.setForeground(Color.red);
                odp.setText("Szansa na wygraną: " + sum + "%");
            }
        }

        }



}
