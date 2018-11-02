import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
public class ImageTest {
 public static boolean play=false;
 public static boolean opi=false,con=true,rec=true; 
 public static int op=0;
 public static String b="",v="",s="";
 public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
	
    ImagePanel panel = new ImagePanel(new ImageIcon("resources/bc.jpg").getImage());
    panel.setBackground(Color.ORANGE);
    panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
    JFrame frame = new JFrame();
    frame.setTitle("Simple Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.NORTH);
    JLabel disp = new JLabel(" 0");
    disp.setBounds(75, 56, 256, 43);
    disp.setIcon(null);
    disp.setBackground(Color.LIGHT_GRAY);
    disp.setFont(new Font("Tahoma", Font.BOLD, 19));
    disp.setHorizontalAlignment(SwingConstants.RIGHT);
    JButton btn1 = new JButton("1");
    btn1.setBounds(75, 293, 60, 60);
    
    JLabel opr = new JLabel("Operation");
    opr.setForeground(UIManager.getColor("CheckBox.darkShadow"));
    opr.setBackground(Color.WHITE);
    opr.setFont(new Font("Tahoma", Font.BOLD, 15));
    opr.setBounds(81, 11, 250, 43);
    panel.add(opr);
    btn1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true ;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+1;disp.setText(v+" ");s=s+1;opr.setText(s);}
    		else {b=b+1;disp.setText(b+" ");s=s+1;opr.setText(s);}
    	}
    });
    
    JButton btn2 = new JButton("2");
    btn2.setBounds(145, 293, 60, 60);
    btn2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+2;disp.setText(v+" ");s=s+2;opr.setText(s);}
    		else {b=b+2;disp.setText(b+" ");s=s+2;opr.setText(s);}
    	}
    });

    
    JButton btn6 = new JButton("6");
    btn6.setBounds(215, 222, 60, 60);
    btn6.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+6;disp.setText(v+" ");s=s+6;opr.setText(s);}
    		else {b=b+6;disp.setText(b+" ");s=s+6;opr.setText(s);}
    	}
    });
    
    JButton btn3= new JButton("3");
    btn3.setBounds(215, 293, 60, 60);
    btn3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+3;disp.setText(v+" ");s=s+3;opr.setText(s);}
    		else {b=b+3;disp.setText(b+" ");s=s+3;opr.setText(s);}
    	}
    });
    
    JButton btn4 = new JButton("4");
    btn4.setBounds(75, 222, 60, 60);
    btn4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+4;disp.setText(v+" ");s=s+4;opr.setText(s);}
    		else {b=b+4;disp.setText(b+" ");s=s+4;opr.setText(s);}
    	}
    });
    
    JButton btn5 = new JButton("5");
    btn5.setBounds(145, 222, 60, 60);
    btn5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+5;disp.setText(v+" ");s=s+5;opr.setText(s);}
    		else {b=b+5;disp.setText(b+" ");s=s+5;opr.setText(s);}
    	}
    });
    
    JButton btn7 = new JButton("7");
    btn7.setBounds(75, 151, 60, 60);
    btn7.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+7;disp.setText(v+" ");s=s+7;opr.setText(s);}
    		else {b=b+7;disp.setText(b+" ");s=s+7;opr.setText(s);}
    	}
    });
    
    JButton btn9 = new JButton("9");
    btn9.setBounds(215, 151, 60, 60);
    btn9.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+9;disp.setText(v+" ");s=s+9;opr.setText(s);}
    		else {b=b+9;disp.setText(b+" ");s=s+9;opr.setText(s);}
    	}
    });
    
    JButton btn8 = new JButton("8");
    btn8.setBounds(145, 151, 60, 60);
    
    JButton opp = new JButton("+");
    opp.setBounds(285, 303, 48, 50);
    opp.setBackground(Color.ORANGE);
    opp.setFont(new Font("Tahoma", Font.BOLD, 12));

    JButton ops = new JButton("-");
    ops.setBounds(285, 253, 48, 50);
    ops.setBackground(Color.ORANGE);
    ops.setFont(new Font("Arial Black", Font.PLAIN, 17));
    JButton opd = new JButton("/");
    opd.setBounds(285, 151, 48, 52);
    opd.setBackground(Color.ORANGE);
   
    opd.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JButton opx = new JButton("x");
    opx.setBounds(285, 203, 48, 50);
    opx.setBackground(Color.ORANGE);
    opx.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JButton btn0 = new JButton("0");
    btn0.setBounds(75, 363, 130, 30);
    btn0.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+0;disp.setText(v+" ");s=s+0;opr.setText(s);}
    		else {b=b+0;disp.setText(b+" ");s=s+0;opr.setText(s);}
    	}
    });
    
    
    JButton button_equal = new JButton("=");
    button_equal.setBounds(215, 364, 118, 29);
    button_equal.setBackground(new Color(169, 169, 169));
    button_equal.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JButton btnClearAll = new JButton("Clear All");
    btnClearAll.setBounds(75, 110, 130, 30);
    btnClearAll.setBackground(new Color(0, 255, 255));
    btnClearAll.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		opr.setText("Operation");s="";
    	b="";v=""; disp.setText(""+0);opi=false;
    	}
    });
    JButton btnDelete = new JButton("Delete");
    btnDelete.setBounds(215, 110, 118, 30);
    btnDelete.setBackground(new Color(0, 255, 255));
    panel.setLayout(null);
    panel.add(disp);
    panel.add(btnClearAll);
    panel.add(btnDelete);
    panel.add(btn7);
    panel.add(btn4);
    panel.add(btn1);
    panel.add(btn8);
    panel.add(btn5);
    panel.add(btn2);
    panel.add(btn9);
    panel.add(btn6);
    panel.add(btn3);
    panel.add(opd);
    panel.add(opx);
    panel.add(ops);
    panel.add(opp);
    panel.add(btn0);
    panel.add(button_equal);
   
   btnDelete.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);s= s.substring(0, s.length() - 1);opr.setText(s);
    		if(opi) {
    		if(v=="")disp.setText("0");
    			v= v.substring(0, v.length() - 1);
    		disp.setText(v+" ");
 
    		}
    		else {
    		if(b=="")disp.setText("0");	
    			b= b.substring(0, b.length() - 1);
    		disp.setText(b+" ");		}
    	}});
    button_equal.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		int s =opdo(op);
            rec=true;
    		disp.setText(s+" ");
    		b=""+s;v="";opi=false;
    		con=false; 
    	}
    });
    
    opx.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		opi=true;op=3;
    		s=s+"x";opr.setText(s);
    		rec=false;
    	}
    });
    opp.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		opi=true;op=1;
    		rec=false;s=s+"+";opr.setText(s);
    	}
    });
    opd.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		opi=true;rec=false;op=4;
    		s=s+"/";opr.setText(s);
    	}
    });
    ops.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(1);
    		opi=true;op=2;
    		s=s+"-";opr.setText(s);rec=false;
    	}
    });
    
    
    btn8.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		play=true;music(2);
    		if(rec) {s="";rec=false;b="";}
    		if(opi) {v=v+8;disp.setText(v+" ");s=s+8;opr.setText(s);}
    		else {b=b+8;disp.setText(b+" ");s=s+8;opr.setText(s);}
    	}    });
    frame.pack();
    frame.setVisible(true);
  }
 public static int opdo(int x) {
	  if (x==1)
	    return Integer.valueOf(b)+Integer.valueOf(v);
	  if (x==2)
		    return Integer.valueOf(b)-Integer.valueOf(v);
	  if (x==3)
		    return Integer.valueOf(b)*Integer.valueOf(v);
	  if (x==4)
		    return Integer.valueOf(b)/Integer.valueOf(v);
	 return 0;
 }
  public static void music(int p) {
	  
	  if (p==1) {try {
      FileInputStream file = new FileInputStream("resources/b1.mp3");
      Player player = new Player(file); if (play)player.play();
	  }catch (FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(JavaLayerException e) {
		  e.printStackTrace();}} 
	  if (p==2) {try {
	  FileInputStream file = new FileInputStream("resources/b2.mp3");
	  Player player = new Player(file); if (play)player.play();
	  }catch (FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(JavaLayerException e) {
		  e.printStackTrace();}} 
  if (p==3) {try {
	  FileInputStream file = new FileInputStream("resources/b3.wav");
	  Player player = new Player(file); if (play)player.play();
	  }catch (FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(JavaLayerException e) {
		  e.printStackTrace();}} }  
}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }
  public ImagePanel(Image img) {
    this.img = img;  /*(img.getWidth(null), img.getHeight(null))*/
    Dimension size = new Dimension(440,480);
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}
  
