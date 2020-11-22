import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
import javax.swing.JButton;
import java.awt.Image;
import java.awt.Toolkit;
//
// public class janken extends JPanel {
//
//
//   this.setBackground(Color.WHITE);
//
//   Image img1 = Toolkit.getDefaultToolkit().getImage("images/gu.jpg");
//   Image img2 = Toolkit.getDefaultToolkit().getImage("images/choki.jpg");
//   Image img3 = Toolkit.getDefaultToolkit().getImage("images/pa.jpg");
//
//   public static void main(String[] args) {
//     JFrame app = new JFrame();
//     app.add(new janken());
//     app.setSize(500, 600);
//     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     app.setVisible(true);
//
//   }
//
// 	public void paintComponent(Graphics g) {
// 		super.paintComponent(g);
// 		//画像の表示
//     g.drawImage(img1, 50, 300, 100, 100, this);
//     g.drawImage(img2, 200, 300, 100, 100, this);
//     g.drawImage(img3, 350, 300, 100, 100, this);
//   }
//
//
//
// }
public class janken{
  public static void main(String[] args){
    JFrame app = new JFrame();
    JPanel canvas  = new ContentsPanel();

    ImageIcon icon1 = new ImageIcon("images/gu.jpg");
    Image img1 = icon1.getImage();
    Image resizedImage = img.getScaledInstance(button1.getWidth(), button2)
    img1 = new ImageIcon(resizedImage)
    ImageIcon icon2 = new ImageIcon("images/choki.jpg");
    ImageIcon icon3 = new ImageIcon("images/pa.jpg");

    JButton button1 = new JButton(icon1);
    button1.setPreferredSize(new Dimension(300, 100));
    JButton button2 = new JButton(icon2);
    button2.setPreferredSize(new Dimension(300, 100));
    JButton button3 = new JButton(icon3);
    button3.setPreferredSize(new Dimension(300, 100));

    canvas.add(button1);
    canvas.add(button2);
    canvas.add(button3);

    app.add(canvas);
    app.setSize(500, 600);
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setVisible(true);
  }
}

class ContentsPanel extends JPanel{
  public ContentsPanel(){
    setBackground(Color.WHITE);
  }
  public void paintComponent(Graphics g) {

    // Image img1 = Toolkit.getDefaultToolkit().getImage("images/gu.jpg");
    // Image img2 = Toolkit.getDefaultToolkit().getImage("images/choki.jpg");
    // Image img3 = Toolkit.getDefaultToolkit().getImage("images/pa.jpg");
    // Image imgE = Toolkit.getDefaultToolkit().getImage("images/pa.jpg");

    super.paintComponent(g);
    //画像の表示


    String str = "どれを出しますか？";
    // g.drawImage(img1, 50, 400, 100, 100, this);
    // g.drawImage(img2, 200, 400, 100, 100, this);
    // g.drawImage(img3, 350, 400, 100, 100, this);
    // g.drawImage(imgE, 200, 100, 80, 80, this);
    g.drawString(str, 80, 350);

  }
}
