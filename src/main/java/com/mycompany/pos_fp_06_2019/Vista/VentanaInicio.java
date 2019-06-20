package Vista;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

public class VentanaInicio extends JFrame {

	private VentanaVenta vVenta;
	private VentanaResumen vResumen;

        private JButton btn1;
        
    public VentanaInicio() {
        
        
        this.setSize(300,300);
        
        this.setLayout(new FlowLayout());
        
        
        btn1=new JButton("Ventana Venta");
        btn1.addActionListener( (e) -> {
            abrirVentanaVenta();
        });
        this.add(btn1);
        this.add(new JButton("Ventana Resumen"));

    }

    public void abrirVentanaVenta(){
        
        VentanaVenta vv = new VentanaVenta();
        vv.setVisible(true);
        
    }

}