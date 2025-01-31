package Personas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements 
ActionListener {
private ListaPersonas lista; // El objeto ListaPersonas de la aplicación
private Container contenedor;
// Etiquetas estáticas para los nombres de los atributos
private JLabel nombre, apellidos, teléfono, dirección;
private JTextField campoNombre, campoApellidos, campoTeléfono, campoDirección;
private JButton añadir, eliminar, borrarLista; // Botones
private JList listaNombres; // Lista de personas
private DefaultListModel modelo; // Objeto que modela la lista
private JScrollPane scrollLista; // Barra de desplazamiento vertical

public VentanaPrincipal(){
    lista = new ListaPersonas(); // Crea la lista de personas
    inicio();
    setTitle("Personas"); // Establece el título de la ventana
    setSize(270,350); // Establece el tamaño de la ventana
    setLocationRelativeTo(null); /* La ventana se posiciona en el 
   centro de la pantalla */
    // Establece que el botón de cerrar permitirá salir de la aplicación
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false); /* Establece que el tamaño de la ventana no 
   se puede cambiar */
    }

private void inicio() {
contenedor = getContentPane(); 
contenedor.setLayout(null); 
    // Establece la etiqueta y el campo nombre
nombre = new JLabel();
nombre.setText("Nombre:");
nombre.setBounds(20, 20, 135, 23); 
campoNombre = new JTextField();
campoNombre.setBounds(105, 20, 135, 23);
apellidos = new JLabel();
apellidos.setText("Apellidos:"); 
apellidos.setBounds(20, 50, 135, 23);
campoApellidos = new JTextField();
campoApellidos.setBounds(105, 50, 135, 23);


teléfono = new JLabel();
 teléfono.setText("Teléfono:");
 teléfono.setBounds(20, 80, 135, 23);
 campoTeléfono = new JTextField();
 campoTeléfono.setBounds(105, 80, 135, 23);
 dirección = new JLabel();
 dirección.setText("Dirección:");
 dirección.setBounds(20, 110, 135, 23);
 campoDirección = new JTextField();
 campoDirección.setBounds(105, 110, 135, 23);
 añadir = new JButton();
 añadir.setText("Añadir");
 añadir.setBounds(105, 150, 80, 23);  

 añadir.addActionListener(this);
 // Establece el botón Eliminar persona
 eliminar= new JButton();
 eliminar.setText("Eliminar");
 eliminar.setBounds(20, 280, 80, 23);
 /* Agrega al botón un ActionListener para que gestione eventos 
del botón */
 eliminar.addActionListener(this);
 borrarLista= new JButton();
 borrarLista.setText("Borrar Lista");
 borrarLista.setBounds(120, 280, 120, 23); 
 borrarLista.addActionListener(this);


  listaNombres = new JList();
  listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  modelo = new DefaultListModel();
  scrollLista = new JScrollPane();
  scrollLista.setBounds(20, 190 ,220, 80);
  scrollLista.setViewportView(listaNombres);


  contenedor.add(nombre);
  contenedor.add(campoNombre);
  contenedor.add(apellidos);
  contenedor.add(campoApellidos);
  contenedor.add(teléfono);
  contenedor.add(campoTeléfono);
  contenedor.add(dirección);
  contenedor.add(campoDirección);
  contenedor.add(añadir);
  contenedor.add(eliminar);
  contenedor.add(borrarLista);
  contenedor.add(scrollLista);
  }


  @Override
  public void actionPerformed(ActionEvent evento) {
  if (evento.getSource() == añadir) { // Si se pulsa el botón añadir
  añadirPersona(); // Se invoca añadir persona
  }
  if (evento.getSource() == eliminar) {  eliminarNombre(listaNombres.getSelectedIndex() );}
  if (evento.getSource() == borrarLista) { borrarLista();  }
  }



     private void añadirPersona() {
     /* Se obtienen los campos de texto ingresados y se crea una 
    persona */
     Persona p = new Persona(campoNombre.getText(), 
    campoApellidos.getText(), 
    campoTeléfono.getText(), campoDirección.getText());
     lista.añadirPersona(p); /* Se añade una persona al vector de 
    personas */
     String elemento = campoNombre.getText() + "-" + 
    campoApellidos.getText() + 
    "-" + campoTeléfono.getText() + "-" + campoDirección.
     getText();
     modelo.addElement(elemento); /* Se agrega el texto con los 
    datos de la persona al JList */
     listaNombres.setModel(modelo);
     // Se colocan todos los campos de texto nulos
     campoNombre.setText("");
     campoApellidos.setText("");
     campoTeléfono.setText("");
     campoDirección.setText("");
     }

     private void eliminarNombre(int indice) {
     if (indice >= 0) { // Si la posición existe
     modelo.removeElementAt(indice);
     
    lista.eliminarPersona(indice); /* Se elimina la persona 
    seleccionada del vector de personas */
     } else { /* Si no se seleccionó ninguna persona, se genera un 
    mensaje de error */
     JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error", JOptionPane.ERROR_MESSAGE);}
     }
     

     private void borrarLista() {
     lista.borrarLista(); // Se eliminan todas las personas del vector
     modelo.clear(); }

     }
     