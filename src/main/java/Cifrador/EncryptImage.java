package Cifrador;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class EncryptImage extends javax.swing.JFrame {

    int x, y; 
    static ImageIcon icon;
    static String path = "";
    
    String archivoCifrado;
    String clave;
    
    public EncryptImage(String path) {
        initComponents();
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_disabled.png")); 
        title.setIcon(new ImageIcon("src/main/java/icons/favicon.png"));
        btnDecrypt.setIcon(new ImageIcon("src/main/java/icons/encrypt_icon.png"));
        btn_back.setIcon(new ImageIcon("src/main/java/icons/back_disabled.png")); 
        
        this.path = path;
        clave = "0xFF";
        archivoCifrado = cifrar(clave);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        btnDecrypt = new javax.swing.JButton();
        encryptedImage = new javax.swing.JLabel();
        originalImage = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        close_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        close_btn.setBorderPainted(false);
        close_btn.setContentAreaFilled(false);
        close_btn.setFocusable(false);
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_btnMouseExited(evt);
            }
        });
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        title.setText("Cifrar archivo de imagen");

        title1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        title1.setText("Imagen original");

        title2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        title2.setText("Imagen cifrada");

        btnDecrypt.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnDecrypt.setText("Descifrar");
        btnDecrypt.setBorder(null);
        btnDecrypt.setContentAreaFilled(false);
        btnDecrypt.setFocusPainted(false);
        btnDecrypt.setFocusable(false);
        btnDecrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDecryptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDecryptMouseExited(evt);
            }
        });
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        originalImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brand\\OneDrive\\Documentos\\NetBeansProjects\\Cifrador\\src\\main\\java\\icons\\perrito.bmp")); // NOI18N

        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setFocusable(false);
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(originalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encryptedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title2))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(close_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encryptedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(originalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(title1)))
                .addGap(18, 18, 18)
                .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseEntered
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_enabled.png"));
    }//GEN-LAST:event_close_btnMouseEntered

    private void close_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseExited
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_disabled.png"));
    }//GEN-LAST:event_close_btnMouseExited

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_btnActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()-x, this.getLocation().y + evt.getY()-y );
        this.setOpacity(0.9f);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setOpacity(1f);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void btnDecryptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecryptMouseEntered
        btnDecrypt.setForeground(new java.awt.Color(51, 51, 51));
        btnDecrypt.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK, 1));
    }//GEN-LAST:event_btnDecryptMouseEntered

    private void btnDecryptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecryptMouseExited
        btnDecrypt.setForeground(java.awt.Color.BLACK);
        btnDecrypt.setBorder(null);
    }//GEN-LAST:event_btnDecryptMouseExited

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        if(btnDecrypt.getText().equals("Descifrar")){
            descifrar(archivoCifrado, clave);
            btnDecrypt.setText("Cifrar");
        }else{
            cifrar(clave);
            btnDecrypt.setText("Descifrar");
        }
        
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setIcon(new ImageIcon("src/main/java/icons/back_enabled.png"));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setIcon(new ImageIcon("src/main/java/icons/back_disabled.png"));
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    public String cifrar(String clave) {
        File cifradoFile = null;
        try {
            // Leer la imagen original
            File original = new File(path);
            BufferedImage bmpImage = ImageIO.read(original);
            
            File pngFile = new File(original.getParent() + original.getName() + ".png");
            ImageIO.write(bmpImage, "png", pngFile);
            ImageIcon icon = new ImageIcon(pngFile.getAbsolutePath());

            Image newImg = icon.getImage().getScaledInstance(originalImage.getWidth(), originalImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            originalImage.setIcon(newIcon);
            
             // Crear una nueva imagen con el mismo tamaño que la imagen original
            BufferedImage cifradaImage = new BufferedImage(bmpImage.getWidth(), bmpImage.getHeight(), bmpImage.getType());

            // Obtener el entero correspondiente a la clave en base 16
            int intClave = Integer.parseInt(clave.substring(2), 16);

            // Recorrer los píxeles de la imagen original y cifrarlos
            for (int y = 0; y < bmpImage.getHeight(); y++) {
                for (int x = 0; x < bmpImage.getWidth(); x++) {
                    int rgb = bmpImage.getRGB(x, y);
                    int r = (rgb >> 16) & 0xFF;
                    int g = (rgb >> 8) & 0xFF;
                    int b = rgb & 0xFF;
                    r ^= intClave;
                    g ^= intClave;
                    b ^= intClave;
                    int cifradoRgb = (r << 16) | (g << 8) | b;
                    cifradaImage.setRGB(x, y, cifradoRgb);
                }
            }

            // Escribir la nueva imagen cifrada en un archivo BMP
            cifradoFile = new File(original.getParent() + "/cifrado.bmp");
            ImageIO.write(cifradaImage, "bmp", cifradoFile);

            // Cargar y mostrar la imagen cifrada
            BufferedImage cifradaBMP = ImageIO.read(cifradoFile);
            ImageIcon cifradaIcon = new ImageIcon(cifradaBMP);
            Image newEncryptedImageIcon = cifradaIcon.getImage().getScaledInstance(encryptedImage.getWidth(), encryptedImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newEncryptedIcon = new ImageIcon(newEncryptedImageIcon);            
            encryptedImage.setIcon(newEncryptedIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return cifradoFile.getAbsolutePath();
    }

    public void descifrar(String ruta, String clave) {
        try {
            // Leer la imagen cifrada
            File cifrado = new File(ruta);
            BufferedImage cifradaImage = ImageIO.read(cifrado);

            // Crear una nueva imagen con el mismo tamaño que la imagen cifrada
            BufferedImage descifradaImage = new BufferedImage(cifradaImage.getWidth(), cifradaImage.getHeight(), cifradaImage.getType());

            // Obtener el entero correspondiente a la clave en base 16
            int intClave = Integer.parseInt(clave.substring(2), 16);

            // Recorrer los píxeles de la imagen cifrada y descifrarlos
            for (int y = 0; y < cifradaImage.getHeight(); y++) {
                for (int x = 0; x < cifradaImage.getWidth(); x++) {
                    int cifradoRgb = cifradaImage.getRGB(x, y);
                    int r = (cifradoRgb >> 16) & 0xFF;
                    int g = (cifradoRgb >> 8) & 0xFF;
                    int b = cifradoRgb & 0xFF;
                    r ^= intClave;
                    g ^= intClave;
                    b ^= intClave;
                    // Crear el nuevo color descifrado y establecerlo en la nueva imagen
                    Color descifradoColor = new Color(r, g, b);
                    descifradaImage.setRGB(x, y, descifradoColor.getRGB());
                }
            }

            // Escribir la nueva imagen cifrada en un archivo BMP
            File descifradoFile = new File(cifrado.getParent() + "/descifrado.bmp");
            ImageIO.write(descifradaImage, "bmp", descifradoFile);

            // Cargar y mostrar la imagen cifrada
            BufferedImage cifradaBMP = ImageIO.read(descifradoFile);
            ImageIcon cifradaIcon = new ImageIcon(cifradaBMP);

            Image newEncryptedImageIcon = cifradaIcon.getImage().getScaledInstance(encryptedImage.getWidth(), encryptedImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newEncryptedIcon = new ImageIcon(newEncryptedImageIcon);

            encryptedImage.setIcon(newEncryptedIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptImage(path).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel encryptedImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel originalImage;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
