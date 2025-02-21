import java.awt.*;

class myFrame extends Frame {
    Panel ptop;
    public myFrame() {
        ptop = new Panel();
        ptop.setBackground(Color.RED);
        ptop.setBounds(40, 50, 400, 500);
        setSize(500, 600);
        setLayout(null);
        add(ptop);
        setVisible(true);
    }
}

class guiWithPanel{
    public static void main(String args []){
        new myFrame();
    }
}