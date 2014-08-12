/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 31/07/2014
 */

package alejandriax.vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.border.Border;

/**
 * @author jmora 31/07/2014
 *
 */
public class BgBorder implements Border 
{
	private BufferedImage mImagen = null;

	public BgBorder(BufferedImage pImagen) {
		mImagen = pImagen;
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width,int height) 
	{
		if (mImagen != null) {
			g.drawImage(mImagen, 0, 0, width, height, null);
		}
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(0, 0, 0, 0);
	}

	public boolean isBorderOpaque() {
		return true;
	}
}

