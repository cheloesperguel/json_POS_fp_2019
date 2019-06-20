package Vista;

import com.mycompany.pos_fp_06_2019.controlador.FileController;
import javax.swing.*;
import controlador.*;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.util.List;
import modelo.Producto;

public class VentanaVenta extends JFrame {
    
    private VentaController vController;
    private List<Producto> pdctosDisponibles;
    private JTextField codigoTf;
    private JLabel nombrePdcto;
    
    public VentanaVenta(){
        
        codigoTf = new JTextField();
        nombrePdcto = new JLabel();
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        this.setLayout(new BorderLayout());
        
        
        JButton btn =new JButton("Buscar");
        
        this.add(codigoTf,BorderLayout.NORTH);
        
        FileController<Producto> fCont = new FileController(Producto[].class);
        
        pdctosDisponibles= fCont.cargarLista("data/pdctos.json");
        
        
        
        btn.addActionListener( (e) -> {
            
            Producto p = buscarProducto(codigoTf.getText());
            
            if(p!=null){
                nombrePdcto.setText(p.getNombre());
                
            }else{
                nombrePdcto.setText("No se encontró");
            }
            
        });
        this.add(btn, BorderLayout.SOUTH);
        this.add(nombrePdcto,BorderLayout.CENTER);
        
    }
        
    
    public Producto buscarProducto(String codigo){
        
        for (int i = 0; i < pdctosDisponibles.size(); i++) {
            Producto p = pdctosDisponibles.get(i);
            
            
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        
        return null;
        
    }
    
}