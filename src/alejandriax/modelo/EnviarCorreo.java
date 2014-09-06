/** 
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 */
package alejandriax.modelo;



/**
 * @author xDiegoxD 06/09/2014
 *
 * 
 */
public class EnviarCorreo {
	
/*	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	private String server ="smtp.gmail.com", puerto = "587";


private boolean alejandriaxSiEnviaCorreos(){
	try {
		//propiedades de la conexion
		Properties props = new Properties();
        props.setProperty("mail.smtp.host",  server);
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", puerto);
        props.setProperty("mail.smtp.auth", "true");
        
        //preparar sesion
        Session session = Session.getDefaultInstance(props);
        
        // levantar datos
//        String str_De =  correoOrigen.getText();
//        String str_PwRemitente = contrasena.getText();               
//        String str_Para = correoDestino.getText();
//        String str_Asunto = asunto.getText();
//        String str_Mensaje = mensaje.getText();
//        
        //obtener el destino
        
        String destinos[] = str_Para.split(",");
        
        //cargar el mensaje
        
        MimeMessage message = new MimeMessage(session);
         
        message.setFrom(new InternetAddress( str_De ));
        Address [] receptores = new Address [ destinos.length ];
        int j = 0;
    while(j<destinos.length){                    
        receptores[j] = new InternetAddress ( destinos[j] ) ;                   
        j++;                
    }
    
    //receptores
    message.addRecipients(Message.RecipientType.TO, receptores);        
    message.setSubject(str_Asunto);        
    message.setText(str_Mensaje);
    
 // Envio del correo
    Transport t = session.getTransport("smtp");
    t.connect(str_De, str_PwRemitente);
    t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
    
 // Cierre de la conexion.
    t.close();
    return true;
	}
	catch(Exception e){
		e.printStackTrace();
		return false;
	}
		
		
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnGuardar){
		int confirmado = JOptionPane.showConfirmDialog(null, "El correo se enviará, ¿desea enviar el mensaje?", null, JOptionPane.YES_NO_OPTION);
		if(JOptionPane.YES_OPTION == confirmado){
			boolean enviado = healthAbilitySiEnviaCorreos();
			if(enviado)
				JOptionPane.showMessageDialog(this, "Correo enviado!");
			else
				JOptionPane.showMessageDialog(this, "Error al enviar el correo.");
			MenuPrincipal menuPrincipal = new MenuPrincipal();
			menuPrincipal.setVisible(true); 
			setVisible(false);
		}
	} else if(rdbtnGmail.isSelected()){
		server = "smtp.gmail.com";
		puerto = "587";
		correoOrigen.setText("@gmail.com");
		correoDestino.setText("@gmail.com");
	} else if(rdbtnHotmail.isSelected()){
		server = "smtp.live.com";
		puerto = "587";
		correoOrigen.setText("@hotmail.com");
		correoDestino.setText("@hotmail.com");
	} else if(rdbtnYahoo.isSelected()){
		server = "smtp.mail.yahoo.com";
		puerto = "465";
		correoOrigen.setText("@yahoo.com");
		correoDestino.setText("@yahoo.com");
	}
}
*/
}
	

