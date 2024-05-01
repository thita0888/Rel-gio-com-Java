import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel, dayLabel, dateLabel;
    String time,day,date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Meu Relógio");
        this.setLayout(new FlowLayout());
        this.setSize(500,300);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 75));
        timeLabel.setForeground(new Color(172,0,191));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayFormat = new SimpleDateFormat("EEEE");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.PLAIN, 55));
        dayLabel.setForeground(new Color(172,0,191));
        dayLabel.setBackground(Color.black);
        dayLabel.setOpaque(true);

        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN, 45));
        dateLabel.setForeground(new Color(172,0,191));
        dateLabel.setBackground(Color.black);
        dateLabel.setOpaque(true);

        timeLabel.setText("10:40:60");
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
    }
  }
}