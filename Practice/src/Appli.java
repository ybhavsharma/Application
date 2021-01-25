import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appli {
        public static void main(String[] args){
          Frame f=new Frame("Swap");
          f.setSize(500,500);
          Label l=new Label("First number");

          TextField t1=new TextField(10);

            Label l2=new Label("2nd number");

            TextField t2=new TextField(10);


            Button b=new Button("SWAP");
            f.add(l);
            f.add(l2);
            f.add(t1);
            f.add(t2);
            f.add(b);
            f.setLayout(new FlowLayout());
            f.setVisible(true);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String str1=t1.getText();
                    String str2=t2.getText();
                    t2.setText(str1);
                    t1.setText(str2);

                }
            });


        }
}