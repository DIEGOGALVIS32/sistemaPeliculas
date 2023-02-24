
import java.awt.Color;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class prinMusi extends javax.swing.JFrame {

    int val = 0;

    public prinMusi() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        //GENERAL
        rsscalelabel.RSScaleLabel.setScaleLabel(basketCase, "src/BasketCase.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(breakHeart, "src/BreakHeart.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(darkHorse, "src/DarkHorse.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(forgotAbout, "src/ForgotAbout.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(gasolina, "src/Gasolina.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(inClub, "src/InDaClub.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(newRules, "src/NewRules.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(nocheSexo, "src/NocheSexo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(sexyMovimiento, "src/SexyMovimiento.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(nirvana, "src/TeenSpirit.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(thunder, "src/ThunderStruck.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(goodDay, "src/WasGoodDay.jpg");

        //REGGAETON
        rsscalelabel.RSScaleLabel.setScaleLabel(ftGaso1, "src/Gasolina.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftNoche, "src/NocheSexo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftSexy, "src/SexyMovimiento.jpg");

        //POP
        rsscalelabel.RSScaleLabel.setScaleLabel(ftBreak, "src/BreakHeart.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftDark, "src/DarkHorse.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftRules, "src/NewRules.jpg");

        //ROCK
        rsscalelabel.RSScaleLabel.setScaleLabel(ftNirva, "src/TeenSpirit.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftGreen, "src/BasketCase.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftAcdc, "src/ThunderStruck.jpg");

        //RAP
        rsscalelabel.RSScaleLabel.setScaleLabel(ftIce, "src/WasGoodDay.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftCent, "src/InDaClub.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(ftDre, "src/ForgotAbout.jpg");

        //DESACTIVAR REGGAETON
        gas2.setVisible(false);
        ftGaso1.setVisible(false);
        nchesx2.setVisible(false);
        ftNoche.setVisible(false);
        sxmvnt2.setVisible(false);
        ftSexy.setVisible(false);

        //DESACTIVAR POP
        ftBreak.setVisible(false);
        ftDark.setVisible(false);
        ftRules.setVisible(false);
        newrul2.setVisible(false);
        dark2.setVisible(false);
        heart2.setVisible(false);

        //DESACTIVAR ROCK
        ftNirva.setVisible(false);
        ftGreen.setVisible(false);
        ftAcdc.setVisible(false);
        green2.setVisible(false);
        acdc2.setVisible(false);
        smells2.setVisible(false);

        //DESACTIVAR HIP HOP
        ftCent.setVisible(false);
        ftIce.setVisible(false);
        ftDre.setVisible(false);
        cent2.setVisible(false);
        ice2.setVisible(false);
        dre2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        categoria = new javax.swing.JLabel();
        gas2 = new javax.swing.JLabel();
        darkHorse = new javax.swing.JLabel();
        nchesx2 = new javax.swing.JLabel();
        basketCase = new javax.swing.JLabel();
        sxmvnt2 = new javax.swing.JLabel();
        nocheSexo = new javax.swing.JLabel();
        newrul = new javax.swing.JLabel();
        gasolina = new javax.swing.JLabel();
        dark = new javax.swing.JLabel();
        breakHeart = new javax.swing.JLabel();
        heart = new javax.swing.JLabel();
        newRules = new javax.swing.JLabel();
        smells = new javax.swing.JLabel();
        nirvana = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        sexyMovimiento = new javax.swing.JLabel();
        acdc = new javax.swing.JLabel();
        thunder = new javax.swing.JLabel();
        inClub = new javax.swing.JLabel();
        cent = new javax.swing.JLabel();
        ice = new javax.swing.JLabel();
        goodDay = new javax.swing.JLabel();
        forgotAbout = new javax.swing.JLabel();
        dre = new javax.swing.JLabel();
        gas = new javax.swing.JLabel();
        ftSexy = new javax.swing.JLabel();
        nchesx = new javax.swing.JLabel();
        ftGaso1 = new javax.swing.JLabel();
        sxmvnt = new javax.swing.JLabel();
        ftNoche = new javax.swing.JLabel();
        newrul2 = new javax.swing.JLabel();
        ftRules = new javax.swing.JLabel();
        dark2 = new javax.swing.JLabel();
        ftDark = new javax.swing.JLabel();
        heart2 = new javax.swing.JLabel();
        ftBreak = new javax.swing.JLabel();
        smells2 = new javax.swing.JLabel();
        acdc2 = new javax.swing.JLabel();
        green2 = new javax.swing.JLabel();
        ftNirva = new javax.swing.JLabel();
        ftAcdc = new javax.swing.JLabel();
        ftGreen = new javax.swing.JLabel();
        cent2 = new javax.swing.JLabel();
        ice2 = new javax.swing.JLabel();
        dre2 = new javax.swing.JLabel();
        ftCent = new javax.swing.JLabel();
        ftIce = new javax.swing.JLabel();
        ftDre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lblPre2 = new javax.swing.JLabel();
        lblPre1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1862, 818));
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        titulo.setText("MUSICA GemeTech");
        getContentPane().add(titulo);
        titulo.setBounds(420, 10, 270, 44);

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Reggaeton", "Pop", "Rock", "Hip Hop" }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });
        getContentPane().add(opciones);
        opciones.setBounds(141, 64, 92, 22);

        categoria.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        categoria.setText("Categoria");
        getContentPane().add(categoria);
        categoria.setBounds(66, 62, 69, 22);

        gas2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        gas2.setText("Daddy Yankee -Gasolina ");
        getContentPane().add(gas2);
        gas2.setBounds(190, 160, 150, 22);

        darkHorse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darkHorseMouseClicked(evt);
            }
        });
        getContentPane().add(darkHorse);
        darkHorse.setBounds(184, 396, 156, 181);

        nchesx2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        nchesx2.setText("Aventura - Noche De Sexo");
        getContentPane().add(nchesx2);
        nchesx2.setBounds(550, 160, 166, 22);

        basketCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basketCaseMouseClicked(evt);
            }
        });
        getContentPane().add(basketCase);
        basketCase.setBounds(577, 396, 156, 181);

        sxmvnt2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        sxmvnt2.setText("Wisin y Yandel - Sexy Movimiento");
        getContentPane().add(sxmvnt2);
        sxmvnt2.setBounds(880, 160, 198, 22);

        nocheSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nocheSexoMouseClicked(evt);
            }
        });
        getContentPane().add(nocheSexo);
        nocheSexo.setBounds(10, 400, 156, 181);

        newrul.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        newrul.setText(" New Rules");
        getContentPane().add(newrul);
        newrul.setBounds(206, 116, 83, 22);

        gasolina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gasolinaMouseClicked(evt);
            }
        });
        getContentPane().add(gasolina);
        gasolina.setBounds(6, 150, 156, 181);

        dark.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        dark.setText("Dark Horse");
        getContentPane().add(dark);
        dark.setBounds(226, 368, 83, 22);

        breakHeart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breakHeartMouseClicked(evt);
            }
        });
        getContentPane().add(breakHeart);
        breakHeart.setBounds(617, 144, 156, 181);

        heart.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        heart.setText("Break My Heart");
        getContentPane().add(heart);
        heart.setBounds(643, 116, 104, 22);

        newRules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newRulesMouseClicked(evt);
            }
        });
        getContentPane().add(newRules);
        newRules.setBounds(190, 144, 156, 181);

        smells.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        smells.setText("Nirvana - Smells Like Teen Spirit");
        getContentPane().add(smells);
        smells.setBounds(362, 116, 198, 22);

        nirvana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nirvanaMouseClicked(evt);
            }
        });
        getContentPane().add(nirvana);
        nirvana.setBounds(381, 144, 156, 181);

        green.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        green.setText("Green Day - Basket Case");
        getContentPane().add(green);
        green.setBounds(577, 368, 151, 22);

        sexyMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sexyMovimientoMouseClicked(evt);
            }
        });
        getContentPane().add(sexyMovimiento);
        sexyMovimiento.setBounds(374, 396, 156, 181);

        acdc.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        acdc.setText("ACDC - Thunderstruck");
        getContentPane().add(acdc);
        acdc.setBounds(1014, 116, 135, 22);

        thunder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thunderMouseClicked(evt);
            }
        });
        getContentPane().add(thunder);
        thunder.setBounds(993, 144, 156, 181);

        inClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inClubMouseClicked(evt);
            }
        });
        getContentPane().add(inClub);
        inClub.setBounds(813, 144, 156, 181);

        cent.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        cent.setText("50 Cent - In Da Club");
        getContentPane().add(cent);
        cent.setBounds(821, 116, 118, 22);

        ice.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ice.setText("Ice Cube - It Was A Good Day");
        getContentPane().add(ice);
        ice.setBounds(979, 368, 176, 22);

        goodDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goodDayMouseClicked(evt);
            }
        });
        getContentPane().add(goodDay);
        goodDay.setBounds(985, 396, 156, 181);

        forgotAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotAboutMouseClicked(evt);
            }
        });
        getContentPane().add(forgotAbout);
        forgotAbout.setBounds(805, 396, 156, 181);

        dre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        dre.setText("Dr. Dre - Forgot About");
        getContentPane().add(dre);
        dre.setBounds(810, 370, 128, 22);

        gas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        gas.setText("Daddy Yankee -Gasolina ");
        getContentPane().add(gas);
        gas.setBounds(13, 116, 150, 22);

        ftSexy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftSexyMouseClicked(evt);
            }
        });
        getContentPane().add(ftSexy);
        ftSexy.setBounds(870, 220, 240, 330);

        nchesx.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        nchesx.setText("Aventura - Noche De Sexo");
        getContentPane().add(nchesx);
        nchesx.setBounds(0, 368, 166, 22);

        ftGaso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftGaso1MouseClicked(evt);
            }
        });
        getContentPane().add(ftGaso1);
        ftGaso1.setBounds(146, 230, 240, 330);

        sxmvnt.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        sxmvnt.setText("Wisin y Yandel - Sexy Movimiento");
        getContentPane().add(sxmvnt);
        sxmvnt.setBounds(353, 368, 206, 22);

        ftNoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftNocheMouseClicked(evt);
            }
        });
        getContentPane().add(ftNoche);
        ftNoche.setBounds(520, 220, 240, 330);

        newrul2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        newrul2.setText(" New Rules");
        getContentPane().add(newrul2);
        newrul2.setBounds(190, 160, 120, 22);

        ftRules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftRulesMouseClicked(evt);
            }
        });
        getContentPane().add(ftRules);
        ftRules.setBounds(150, 230, 240, 330);

        dark2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        dark2.setText("Dark Horse");
        getContentPane().add(dark2);
        dark2.setBounds(550, 160, 166, 22);

        ftDark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftDarkMouseClicked(evt);
            }
        });
        getContentPane().add(ftDark);
        ftDark.setBounds(520, 220, 240, 330);

        heart2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        heart2.setText("Break My Heart");
        heart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heart2MouseClicked(evt);
            }
        });
        getContentPane().add(heart2);
        heart2.setBounds(880, 160, 198, 22);

        ftBreak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftBreakMouseClicked(evt);
            }
        });
        getContentPane().add(ftBreak);
        ftBreak.setBounds(870, 220, 240, 330);

        smells2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        smells2.setText("Nirvana - Smells Like Teen Spirit");
        getContentPane().add(smells2);
        smells2.setBounds(190, 160, 150, 22);

        acdc2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        acdc2.setText("ACDC - Thunderstruck");
        getContentPane().add(acdc2);
        acdc2.setBounds(550, 160, 166, 22);

        green2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        green2.setText("Green Day - Basket Case");
        getContentPane().add(green2);
        green2.setBounds(880, 160, 198, 22);

        ftNirva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftNirvaMouseClicked(evt);
            }
        });
        getContentPane().add(ftNirva);
        ftNirva.setBounds(150, 230, 240, 330);

        ftAcdc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftAcdcMouseClicked(evt);
            }
        });
        getContentPane().add(ftAcdc);
        ftAcdc.setBounds(520, 220, 240, 330);

        ftGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftGreenMouseClicked(evt);
            }
        });
        getContentPane().add(ftGreen);
        ftGreen.setBounds(910, 220, 240, 330);

        cent2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        cent2.setText("50 Cent - In Da Club");
        getContentPane().add(cent2);
        cent2.setBounds(190, 160, 150, 22);

        ice2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ice2.setText("Ice Cube - It Was A Good Day");
        getContentPane().add(ice2);
        ice2.setBounds(550, 160, 166, 22);

        dre2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        dre2.setText("Dr. Dre - Forgot About");
        getContentPane().add(dre2);
        dre2.setBounds(880, 160, 198, 22);

        ftCent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftCentMouseClicked(evt);
            }
        });
        getContentPane().add(ftCent);
        ftCent.setBounds(150, 230, 240, 330);

        ftIce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftIceMouseClicked(evt);
            }
        });
        getContentPane().add(ftIce);
        ftIce.setBounds(520, 220, 240, 330);

        ftDre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftDreMouseClicked(evt);
            }
        });
        getContentPane().add(ftDre);
        ftDre.setBounds(870, 220, 240, 330);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("VOLVER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 640, 70, 30);

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("ALQUILAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 340, 90, 29);

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setText("ALQUILAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 340, 100, 29);

        jButton3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton3.setText("ALQUILAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 340, 100, 29);

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton4.setText("ALQUILAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 340, 100, 29);

        jButton5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton5.setText("ALQUILAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(860, 340, 100, 29);

        jButton6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton6.setText("ALQUILAR");
        getContentPane().add(jButton6);
        jButton6.setBounds(1050, 340, 100, 29);

        jButton7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton7.setText("ALQUILAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(40, 600, 100, 29);

        jButton8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton8.setText("ALQUILAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(220, 600, 84, 29);

        jButton9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton9.setText("ALQUILAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(410, 600, 84, 29);

        jButton10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton10.setText("ALQUILAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(620, 600, 84, 29);

        jButton11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton11.setText("ALQUILAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(850, 600, 84, 29);

        jButton12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton12.setText("ALQUILAR");
        getContentPane().add(jButton12);
        jButton12.setBounds(1030, 600, 84, 29);

        lblPre2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblPre2.setForeground(new java.awt.Color(0, 0, 255));
        lblPre2.setText("3");
        getContentPane().add(lblPre2);
        lblPre2.setBounds(1110, 10, 20, 29);

        lblPre1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblPre1.setText("Prestamos Restantes: ");
        getContentPane().add(lblPre1);
        lblPre1.setBounds(920, 10, 165, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        String opcion = opciones.getSelectedItem().toString();
        switch (opcion) {

            case "Reggaeton":
                darkHorse.setVisible(false);
                gas.setVisible(false);
                basketCase.setVisible(false);
                breakHeart.setVisible(false);
                forgotAbout.setVisible(false);
                gasolina.setVisible(false);
                inClub.setVisible(false);
                newRules.setVisible(false);
                nocheSexo.setVisible(false);
                sexyMovimiento.setVisible(false);
                nirvana.setVisible(false);
                thunder.setVisible(false);
                goodDay.setVisible(false);
                nchesx.setVisible(false);
                sxmvnt.setVisible(false);
                newrul.setVisible(false);
                dark.setVisible(false);
                heart.setVisible(false);
                smells.setVisible(false);
                green.setVisible(false);
                acdc.setVisible(false);
                cent.setVisible(false);
                ice.setVisible(false);
                dre.setVisible(false);

                // Activadas 
                gas2.setVisible(true);
                ftGaso1.setVisible(true);
                nchesx2.setVisible(true);
                ftNoche.setVisible(true);
                sxmvnt2.setVisible(true);
                ftSexy.setVisible(true);

                //Desactivadas
                ftCent.setVisible(false);
                ftIce.setVisible(false);
                ftDre.setVisible(false);
                cent2.setVisible(false);
                ice2.setVisible(false);
                dre2.setVisible(false);

                ftNirva.setVisible(false);
                ftGreen.setVisible(false);
                ftAcdc.setVisible(false);
                green2.setVisible(false);
                acdc2.setVisible(false);
                smells2.setVisible(false);

                ftBreak.setVisible(false);
                ftDark.setVisible(false);
                ftRules.setVisible(false);
                newrul2.setVisible(false);
                dark2.setVisible(false);
                heart2.setVisible(false);
                break;

            case "Pop":
                darkHorse.setVisible(false);
                gas.setVisible(false);
                basketCase.setVisible(false);
                breakHeart.setVisible(false);
                forgotAbout.setVisible(false);
                gasolina.setVisible(false);
                inClub.setVisible(false);
                newRules.setVisible(false);
                nocheSexo.setVisible(false);
                sexyMovimiento.setVisible(false);
                nirvana.setVisible(false);
                thunder.setVisible(false);
                goodDay.setVisible(false);
                nchesx.setVisible(false);
                sxmvnt.setVisible(false);
                newrul.setVisible(false);
                dark.setVisible(false);
                heart.setVisible(false);
                smells.setVisible(false);
                green.setVisible(false);
                acdc.setVisible(false);
                cent.setVisible(false);
                ice.setVisible(false);
                dre.setVisible(false);

                // Activadas 
                ftBreak.setVisible(true);
                ftDark.setVisible(true);
                ftRules.setVisible(true);
                newrul2.setVisible(true);
                dark2.setVisible(true);
                heart2.setVisible(true);

                //Desactivadas
                ftCent.setVisible(false);
                ftIce.setVisible(false);
                ftDre.setVisible(false);
                cent2.setVisible(false);
                ice2.setVisible(false);
                dre2.setVisible(false);

                ftNirva.setVisible(false);
                ftGreen.setVisible(false);
                ftAcdc.setVisible(false);
                green2.setVisible(false);
                acdc2.setVisible(false);
                smells2.setVisible(false);

                gas2.setVisible(false);
                ftGaso1.setVisible(false);
                nchesx2.setVisible(false);
                ftNoche.setVisible(false);
                sxmvnt2.setVisible(false);
                ftSexy.setVisible(false);

                break;

            case "Rock":
                darkHorse.setVisible(false);
                gas.setVisible(false);
                basketCase.setVisible(false);
                breakHeart.setVisible(false);
                forgotAbout.setVisible(false);
                gasolina.setVisible(false);
                inClub.setVisible(false);
                newRules.setVisible(false);
                nocheSexo.setVisible(false);
                sexyMovimiento.setVisible(false);
                nirvana.setVisible(false);
                thunder.setVisible(false);
                goodDay.setVisible(false);
                nchesx.setVisible(false);
                sxmvnt.setVisible(false);
                newrul.setVisible(false);
                dark.setVisible(false);
                heart.setVisible(false);
                smells.setVisible(false);
                green.setVisible(false);
                acdc.setVisible(false);
                cent.setVisible(false);
                ice.setVisible(false);
                dre.setVisible(false);

                // Activadas 
                ftNirva.setVisible(true);
                ftGreen.setVisible(true);
                ftAcdc.setVisible(true);
                green2.setVisible(true);
                acdc2.setVisible(true);
                smells2.setVisible(true);

                //Desactivadas
                ftCent.setVisible(false);
                ftIce.setVisible(false);
                ftDre.setVisible(false);
                cent2.setVisible(false);
                ice2.setVisible(false);
                dre2.setVisible(false);

                ftBreak.setVisible(false);
                ftDark.setVisible(false);
                ftRules.setVisible(false);
                newrul2.setVisible(false);
                dark2.setVisible(false);
                heart2.setVisible(false);

                gas2.setVisible(false);
                ftGaso1.setVisible(false);
                nchesx2.setVisible(false);
                ftNoche.setVisible(false);
                sxmvnt2.setVisible(false);
                ftSexy.setVisible(false);

                break;

            case "Hip Hop":
                darkHorse.setVisible(false);
                gas.setVisible(false);
                basketCase.setVisible(false);
                breakHeart.setVisible(false);
                forgotAbout.setVisible(false);
                gasolina.setVisible(false);
                inClub.setVisible(false);
                newRules.setVisible(false);
                nocheSexo.setVisible(false);
                sexyMovimiento.setVisible(false);
                nirvana.setVisible(false);
                thunder.setVisible(false);
                goodDay.setVisible(false);
                nchesx.setVisible(false);
                sxmvnt.setVisible(false);
                newrul.setVisible(false);
                dark.setVisible(false);
                heart.setVisible(false);
                smells.setVisible(false);
                green.setVisible(false);
                acdc.setVisible(false);
                cent.setVisible(false);
                ice.setVisible(false);
                dre.setVisible(false);

                // Activadas 
                ftCent.setVisible(true);
                ftIce.setVisible(true);
                ftDre.setVisible(true);
                cent2.setVisible(true);
                ice2.setVisible(true);
                dre2.setVisible(true);

                //Desactivadas
                ftBreak.setVisible(false);
                ftDark.setVisible(false);
                ftRules.setVisible(false);
                newrul2.setVisible(false);
                dark2.setVisible(false);
                heart2.setVisible(false);

                gas2.setVisible(false);
                ftGaso1.setVisible(false);
                nchesx2.setVisible(false);
                ftNoche.setVisible(false);
                sxmvnt2.setVisible(false);
                ftSexy.setVisible(false);

                ftNirva.setVisible(false);
                ftGreen.setVisible(false);
                ftAcdc.setVisible(false);
                green2.setVisible(false);
                acdc2.setVisible(false);
                smells2.setVisible(false);

                break;

            case "General":
                darkHorse.setVisible(true);
                gas.setVisible(true);
                basketCase.setVisible(true);
                breakHeart.setVisible(true);
                forgotAbout.setVisible(true);
                gasolina.setVisible(true);
                inClub.setVisible(true);
                newRules.setVisible(true);
                nocheSexo.setVisible(true);
                sexyMovimiento.setVisible(true);
                nirvana.setVisible(true);
                thunder.setVisible(true);
                goodDay.setVisible(true);
                nchesx.setVisible(true);
                sxmvnt.setVisible(true);
                newrul.setVisible(true);
                dark.setVisible(true);
                heart.setVisible(true);
                smells.setVisible(true);
                green.setVisible(true);
                acdc.setVisible(true);
                cent.setVisible(true);
                ice.setVisible(true);
                dre.setVisible(true);

                //Desactivadas
                ftCent.setVisible(false);
                ftIce.setVisible(false);
                ftDre.setVisible(false);
                cent2.setVisible(false);
                ice2.setVisible(false);
                dre2.setVisible(false);

                ftBreak.setVisible(false);
                ftDark.setVisible(false);
                ftRules.setVisible(false);
                newrul2.setVisible(false);
                dark2.setVisible(false);
                heart2.setVisible(false);

                gas2.setVisible(false);
                ftGaso1.setVisible(false);
                nchesx2.setVisible(false);
                ftNoche.setVisible(false);
                sxmvnt2.setVisible(false);
                ftSexy.setVisible(false);

                ftNirva.setVisible(false);
                ftGreen.setVisible(false);
                ftAcdc.setVisible(false);
                green2.setVisible(false);
                acdc2.setVisible(false);
                smells2.setVisible(false);

                break;
        }
    }//GEN-LAST:event_opcionesActionPerformed

    private void gasolinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasolinaMouseClicked

        GasolinaDaddy llamar = new GasolinaDaddy();
        llamar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_gasolinaMouseClicked

    private void nocheSexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nocheSexoMouseClicked

        NochedeSx llamar = new NochedeSx();
        llamar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_nocheSexoMouseClicked

    private void ftGaso1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftGaso1MouseClicked
        GasolinaDaddy llamar = new GasolinaDaddy();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftGaso1MouseClicked

    private void sexyMovimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexyMovimientoMouseClicked
        SexyMovimiento llamar = new SexyMovimiento();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sexyMovimientoMouseClicked

    private void ftNocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftNocheMouseClicked
        NochedeSx llamar = new NochedeSx();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftNocheMouseClicked

    private void ftSexyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftSexyMouseClicked
        SexyMovimiento llamar = new SexyMovimiento();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftSexyMouseClicked

    private void breakHeartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breakHeartMouseClicked
        BreakHear llamar = new BreakHear();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_breakHeartMouseClicked

    private void heart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heart2MouseClicked

    }//GEN-LAST:event_heart2MouseClicked

    private void ftBreakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftBreakMouseClicked
        BreakHear llamar = new BreakHear();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftBreakMouseClicked

    private void darkHorseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkHorseMouseClicked
        DarkHose llamar = new DarkHose();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_darkHorseMouseClicked

    private void ftDarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftDarkMouseClicked
        DarkHose llamar = new DarkHose();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftDarkMouseClicked

    private void newRulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newRulesMouseClicked
        NewRules llamar = new NewRules();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newRulesMouseClicked

    private void ftRulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftRulesMouseClicked
        NewRules llamar = new NewRules();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftRulesMouseClicked

    private void nirvanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nirvanaMouseClicked
        smellLike llamar = new smellLike();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nirvanaMouseClicked

    private void ftNirvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftNirvaMouseClicked
        smellLike llamar = new smellLike();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftNirvaMouseClicked

    private void thunderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thunderMouseClicked
        ThunderStrike llamar = new ThunderStrike();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thunderMouseClicked

    private void ftAcdcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftAcdcMouseClicked
        ThunderStrike llamar = new ThunderStrike();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftAcdcMouseClicked

    private void basketCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basketCaseMouseClicked
        BasquetCase llamar = new BasquetCase();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_basketCaseMouseClicked

    private void ftDreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftDreMouseClicked
        ForgoutAbout llamar = new ForgoutAbout();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftDreMouseClicked

    private void ftGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftGreenMouseClicked
        BasquetCase llamar = new BasquetCase();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftGreenMouseClicked

    private void inClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inClubMouseClicked
        InClub llamar = new InClub();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inClubMouseClicked

    private void ftCentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftCentMouseClicked
        InClub llamar = new InClub();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftCentMouseClicked

    private void goodDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goodDayMouseClicked
        GoodDay llamar = new GoodDay();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goodDayMouseClicked

    private void ftIceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftIceMouseClicked
        GoodDay llamar = new GoodDay();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ftIceMouseClicked

    private void forgotAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotAboutMouseClicked
        ForgoutAbout llamar = new ForgoutAbout();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgotAboutMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        inicial in = new inicial();
        in.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        val = 1;
        Prestamos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       val = 2;
        Prestamos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       val = 3;
        Prestamos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       val = 4;
        Prestamos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        val = 5;
        Prestamos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        val = 6;
        Prestamos();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        val = 7;
        Prestamos();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        val = 8;
        Prestamos();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        val = 9;
        Prestamos();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        val = 10;
        Prestamos();
    }//GEN-LAST:event_jButton11ActionPerformed

    int contador = 3;
    String peliPre[] = new String[3];
    int fechaPre[][] = new int[3][3];
    LocalDate todaysDate = LocalDate.now();
    LocalDate todaysDate2 = todaysDate.plusDays(3);
    int multUni = 10000, dayActu, dayLimit;

    public void fechaPre() {
        dayActu = todaysDate.getDayOfMonth();
        dayLimit = todaysDate2.getDayOfMonth();
        JOptionPane.showMessageDialog(this, "Fecha Actual: " + todaysDate + "\n Fecha de Entrega: " + todaysDate2);
        fechaPre[0][0] = todaysDate2.getDayOfMonth();
        fechaPre[1][0] = todaysDate2.getDayOfMonth();
        fechaPre[2][0] = todaysDate2.getDayOfMonth();/// Espacio vector dia limite entrega
        fechaPre[0][1] = todaysDate.getDayOfMonth();
        fechaPre[1][1] = todaysDate.getDayOfMonth();
        fechaPre[2][1] = todaysDate.getDayOfMonth();/// Espacio vector dia actual
        fechaPre[0][2] = todaysDate.getMonthValue();
        fechaPre[1][2] = todaysDate.getMonthValue();
        fechaPre[2][2] = todaysDate.getMonthValue();/// Espacio vector dia actual
        System.out.println(Arrays.deepToString(fechaPre));
        System.out.println(peliPre[0]);
    }

    public void Prestamos() {
        contador--;
        lblPre2.setText(Integer.toString(contador));
        switch (contador) {
            case 3:
                JOptionPane.showMessageDialog(rootPane, "No puedes prestar mas peliculas", "Error 404 NOT FOUND", 0);
                break;
            case 2:
                for (int i = 0; i < 1; i++) {
                    switch (val) {
                        case 1:
                            peliPre[i] = gas.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + gas.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 2:
                            peliPre[i] = newrul.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + newrul.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 3:
                            peliPre[i] = smells.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + smells.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 4:
                            peliPre[i] = heart.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + heart.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 5:
                            peliPre[i] = cent.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + cent.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 6:
                            peliPre[i] = acdc.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + acdc.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 7:
                            peliPre[i] = nchesx.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + nchesx.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 8:
                            peliPre[i] = dark.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dark.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 9:
                            peliPre[i] = sxmvnt.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + sxmvnt.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 10:
                            peliPre[i] = green.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + green.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 11:
                            peliPre[i] = dre.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dre.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 12:
                            peliPre[i] = ice.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + ice.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        default:
                            JOptionPane.showMessageDialog(rootPane, "TECH: !Ops¡ No reconoci el boton", "ERROR 404 NOT FOUND", 0);
                            break;
                    }
                }
                break;
            case 1:
                for (int i = 0 + 1; i < 2; i++) {
                    switch (val) {
                        case 1:
                            peliPre[i] = gas.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + gas.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 2:
                            peliPre[i] = newrul.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + newrul.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 3:
                            peliPre[i] = smells.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + smells.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 4:
                            peliPre[i] = heart.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + heart.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 5:
                            peliPre[i] = cent.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + cent.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 6:
                            peliPre[i] = acdc.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + acdc.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 7:
                            peliPre[i] = nchesx.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + nchesx.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 8:
                            peliPre[i] = dark.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dark.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 9:
                            peliPre[i] = sxmvnt.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + sxmvnt.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 10:
                            peliPre[i] = green.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + green.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 11:
                            peliPre[i] = dre.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dre.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 12:
                            peliPre[i] = ice.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + ice.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        default:
                            JOptionPane.showMessageDialog(rootPane, "TECH: !Ops¡ No reconoci el boton", "ERROR 404 NOT FOUND", 0);
                            break;
                    }
                }
                break;
            case 0:
                for (int i = 0 + 1 + 1; i < 2 + 1; i++) {
                    switch (val) {
                        case 1:
                            peliPre[i] = gas.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + gas.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 2:
                            peliPre[i] = newrul.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + newrul.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 3:
                            peliPre[i] = smells.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + smells.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 4:
                            peliPre[i] = heart.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + heart.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 5:
                            peliPre[i] = cent.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + cent.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 6:
                            peliPre[i] = acdc.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + acdc.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 7:
                            peliPre[i] = nchesx.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + nchesx.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 8:
                            peliPre[i] = dark.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dark.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 9:
                            peliPre[i] = sxmvnt.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + sxmvnt.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 10:
                            peliPre[i] = green.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + green.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 11:
                            peliPre[i] = dre.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + dre.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        case 12:
                            peliPre[i] = ice.getText();
                            JOptionPane.showMessageDialog(rootPane, "Has prestado la pelicula" + " " + ice.getText(), "PRESTAMO CON EXITO", 1);
                            fechaPre();
                            break;
                        default:
                            JOptionPane.showMessageDialog(rootPane, "TECH: !Ops¡ No reconoci el boton", "ERROR 404 NOT FOUND", 0);
                            break;
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "No puedes prestar mas peliculas", "Error 404 NOT FOUND", 0);
                lblPre2.setText(Integer.toString(0));
                break;
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prinMusi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prinMusi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prinMusi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prinMusi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prinMusi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acdc;
    private javax.swing.JLabel acdc2;
    private javax.swing.JLabel basketCase;
    private javax.swing.JLabel breakHeart;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel cent;
    private javax.swing.JLabel cent2;
    private javax.swing.JLabel dark;
    private javax.swing.JLabel dark2;
    private javax.swing.JLabel darkHorse;
    private javax.swing.JLabel dre;
    private javax.swing.JLabel dre2;
    private javax.swing.JLabel forgotAbout;
    private javax.swing.JLabel ftAcdc;
    private javax.swing.JLabel ftBreak;
    private javax.swing.JLabel ftCent;
    private javax.swing.JLabel ftDark;
    private javax.swing.JLabel ftDre;
    private javax.swing.JLabel ftGaso1;
    private javax.swing.JLabel ftGreen;
    private javax.swing.JLabel ftIce;
    private javax.swing.JLabel ftNirva;
    private javax.swing.JLabel ftNoche;
    private javax.swing.JLabel ftRules;
    private javax.swing.JLabel ftSexy;
    private javax.swing.JLabel gas;
    private javax.swing.JLabel gas2;
    private javax.swing.JLabel gasolina;
    private javax.swing.JLabel goodDay;
    private javax.swing.JLabel green;
    private javax.swing.JLabel green2;
    private javax.swing.JLabel heart;
    private javax.swing.JLabel heart2;
    private javax.swing.JLabel ice;
    private javax.swing.JLabel ice2;
    private javax.swing.JLabel inClub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPre1;
    private javax.swing.JLabel lblPre2;
    private javax.swing.JLabel nchesx;
    private javax.swing.JLabel nchesx2;
    private javax.swing.JLabel newRules;
    private javax.swing.JLabel newrul;
    private javax.swing.JLabel newrul2;
    private javax.swing.JLabel nirvana;
    private javax.swing.JLabel nocheSexo;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JLabel sexyMovimiento;
    private javax.swing.JLabel smells;
    private javax.swing.JLabel smells2;
    private javax.swing.JLabel sxmvnt;
    private javax.swing.JLabel sxmvnt2;
    private javax.swing.JLabel thunder;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
