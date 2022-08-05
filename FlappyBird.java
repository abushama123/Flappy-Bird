package flappyBird;

import javax.swing.JFrame;

public class FlappyBird implements ActionListener{

    public static FlappyBird flappyBird;
    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public FlappyBird(){
        Jframe jframe = new Jframe();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setsize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }

    public void actionPerforms(ActionEvent e){
        renderer.repaint();
    }

    public void repaint(Graphics g){

    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }
}