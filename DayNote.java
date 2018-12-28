import javax.swing.*;
import java.awt.*;
import java.awt.event.*;        

public class DayNote extends JFrame implements ActionListener{
    
    private JMenuBar mb1;
    private JMenu menOptions, menFondo, menTam, menEscrit;
    private JMenuItem itmAzul, itmRojo, itmGray, itm400, itm500, itm600;
    private JTextArea txta1;
    private JLabel note1, date;
    private JScrollPane sc1;
    private JComboBox cbTipo, cbTam;
    
    public DayNote(){
        
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Day Note");
    getContentPane().setBackground(Color.lightGray);
    
    mb1 = new JMenuBar();
    setJMenuBar(mb1);
    
    menOptions = new JMenu("Opciones");
    menOptions.setFont(new Font("Arial", 0, 15));
    mb1.add(menOptions);
    
//Color de Fondo
    
    menFondo = new JMenu("Color de fondo");
    menFondo.setFont(new Font("Arial", 0, 15));
    menOptions.add(menFondo);
    
    itmAzul = new JMenuItem("Azul");
    itmAzul.setFont(new Font("Arial", 0, 15));
    itmAzul.addActionListener(this);
    menFondo.add(itmAzul);
    
    itmRojo = new JMenuItem("Rojo");
    itmRojo.setFont(new Font("Arial", 0, 15));
    itmRojo.addActionListener(this);
    menFondo.add(itmRojo);
    
    itmGray = new JMenuItem("Gris");
    itmGray.setFont(new Font("Arial", 0, 15));
    itmGray.addActionListener(this);
    menFondo.add(itmGray);

//Tamaño de la ventana

    menTam = new JMenu("Ventana");
    menTam.setFont(new Font("Arial", 0, 15));
    menOptions.add(menTam);
    
    itm400 = new JMenuItem("400x300");
    itm400.setFont(new Font("Arial", 0, 15));
    itm400.addActionListener(this);
    menTam.add(itm400);
    
    itm500 = new JMenuItem("500x400");
    itm500.setFont(new Font("Arial", 0, 15));
    itm500.addActionListener(this);
    menTam.add(itm500);
    
    itm600 = new JMenuItem("600x500");
    itm600.setFont(new Font("Arial", 0, 15));
    itm600.addActionListener(this);
    menTam.add(itm600);

//Menu de Letras

    cbTipo = new JComboBox();
    cbTam.setFont(new Font("Arial", 0, 10));
    menEscrit.add(mb1);
    cbTipo.addItem("Algerian");
    cbTipo.addItem("Arial");
    cbTipo.addItem("Calibri");
    cbTipo.addItem("Times New Roman");
    
    cbTam = new JComboBox();
    cbTam.setFont(new Font("Arial", 0, 10));
    menEscrit.add(mb1);
    cbTam.addItem("10");
    cbTam.addItem("12");
    cbTam.addItem("14");
    cbTam.addItem("16");
    cbTam.addItem("18");
    cbTam.addItem("20");
    
//Area de notas

    date = new JLabel("13/Dic/2018");
    date.setBounds(290,-30,100,100);
    date.setFont(new Font("Calibri", 0, 18));
    date.setBackground(Color.black);
    add(date);
   
    note1 = new JLabel("Notas: ");
    note1.setBounds(10,-30,100,100);
    note1.setFont(new Font("Calibri", 0, 18));
    note1.setBackground(Color.black);
    add(note1);
    
    txta1 = new JTextArea();
    txta1.setBounds(10,40,375,200);
    txta1.setFont(new Font("Arial", 0, 14));
    add(txta1);
    
    sc1 = new JScrollPane(txta1);
    sc1.setBounds(10,40,375,200);
    add(sc1);
    
}

    public void actionPerformed(ActionEvent x){
        
    // Color del fondo    
        
        if(x.getSource() == itmAzul){
            getContentPane().setBackground(Color.blue);
        }
        if(x.getSource() == itmRojo){
            getContentPane().setBackground(Color.red);
        }
        if(x.getSource() == itmGray){
            getContentPane().setBackground(Color.lightGray);
        }
    
    // Tamaño de la Ventana

        if(x.getSource() == itm400){
           this.setBounds(0,0,400,300);
           txta1.setBounds(10,40,375,200);
           sc1.setBounds(10,40,375,200);
           date.setBounds(290,-30,100,100);
        }
        if(x.getSource() == itm500){
           this.setBounds(0,0,500,400);
           txta1.setBounds(10,40,475,300);
           sc1.setBounds(10,40,475,300);
           date.setBounds(390,-30,100,100);
        }
        if(x.getSource() == itm600){
           this.setBounds(0,0,600,500); 
           txta1.setBounds(10,40,575,400);
           sc1.setBounds(10,40,575,400);
           date.setBounds(490,-30,100,100);
        }
}

    //Metodo main
    
    public static void main(String[] args) {
        
        DayNote DN = new DayNote();
        DN.setBounds(0, 0, 400, 300);
        DN.setVisible(true);
        DN.setResizable(false);
        DN.setLocationRelativeTo(null);
        
    }
}

