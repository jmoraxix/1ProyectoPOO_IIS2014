package alejandriax.vista;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.List;
import java.util.Arrays;

import javax.swing.*;

import alejandriax.Alejandriax;

class PanelCalificacion extends JPanel {
	LevelBar levelBar;
	
    public PanelCalificacion() {
        super(new GridLayout(2,2));
//        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("Star.png"));
        ImageIcon defaultIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Alejandriax.class.getResource("vista/imagenes/Star.png")));
        ImageProducer ip = defaultIcon.getImage().getSource();

        ImageIcon yStar = makeStarImageIcon(ip, new float[]{1.0f,1.0f,.0f});
        List<ImageIcon> list = Arrays.asList(yStar, yStar, yStar, yStar, yStar, yStar, yStar, yStar, yStar, yStar);
        levelBar = new LevelBar(defaultIcon, list, 1);
        add(levelBar);
        setPreferredSize(new Dimension(200, 45));
        setOpaque(false);
    }
    
    public int getCalificacion(){
    	return levelBar.getLevel();
    }
    
    private ImageIcon makeStarImageIcon(ImageProducer ip, float[] filter) {
        return new ImageIcon(createImage(new FilteredImageSource(ip, new SelectedImageFilter(filter))));
    }
}

class LevelBar extends JPanel implements MouseListener, MouseMotionListener {
    private final int gap;
    protected final List<ImageIcon> iconList;
    protected final List<JLabel> labelList = Arrays.asList(
        new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), 
        new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()
    );
    protected final ImageIcon defaultIcon;
    private int clicked = -1;
    public LevelBar(ImageIcon defaultIcon, List<ImageIcon> list, int gap) {
        super(new GridLayout(1, 10, gap*2, gap*2));
        this.defaultIcon = defaultIcon;
        this.iconList = list;
        this.gap = gap;
        for(JLabel l:labelList) {
            l.setIcon(defaultIcon);
            add(l);
        }
        addMouseListener(this);
        addMouseMotionListener(this);
        setOpaque(false);
    }
    public void clear() {
        clicked = -1;
        repaintIcon(clicked);
    }
    public int getLevel() {
        return clicked;
    }
    public void setLevel(int l) {
        clicked = l;
        repaintIcon(clicked);
    }
    private int getSelectedIconIndex(Point p) {
        for(int i=0;i<labelList.size();i++) {
            Rectangle r = labelList.get(i).getBounds();
            r.grow(gap, gap);
            if(r.contains(p)) {
                return i;
            }
        }
        return -1;
    }
    protected void repaintIcon(int index) {
        for(int i=0;i<labelList.size();i++) {
            labelList.get(i).setIcon(i<=index?iconList.get(i):defaultIcon);
        }
        repaint();
    }
    @Override public void mouseMoved(MouseEvent e) {
        repaintIcon(getSelectedIconIndex(e.getPoint()));
    }
    @Override public void mouseEntered(MouseEvent e) {
        repaintIcon(getSelectedIconIndex(e.getPoint()));
    }
    @Override public void mouseClicked(MouseEvent e) {
        clicked = getSelectedIconIndex(e.getPoint());
    }
    @Override public void mouseExited(MouseEvent e) {
        repaintIcon(clicked);
    }
    @Override public void mouseDragged(MouseEvent e)  { /* not needed */ }
    @Override public void mousePressed(MouseEvent e)  { /* not needed */ }
    @Override public void mouseReleased(MouseEvent e) { /* not needed */ }
}

class SelectedImageFilter extends RGBImageFilter {
    private final float[] filter;
    public SelectedImageFilter(float[] arrays) {
        super();
        //filter = arrays;
        filter = new float[arrays.length];
        for(int i=0;i<arrays.length;i++) {
            filter[i] = arrays[i];
        }
        canFilterIndexColorModel = false;
    }

    @Override public int filterRGB(int x, int y, int argb) {
        int r = (int)(((argb >> 16) & 0xff) * filter[0]);
        int g = (int)(((argb >>  8) & 0xff) * filter[1]);
        int b = (int)(((argb      ) & 0xff) * filter[2]);
        return (argb & 0xff000000) | (r<<16) | (g<<8) | (b);
    }
}
