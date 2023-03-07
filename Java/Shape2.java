import java.applet.*;
import java.awt.*;
public class Shape2 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Square Inside A Circle",150,110);
g.drawOval(180,10,80,80);
g.drawRect(192,22,55,55);
}
}
/*
<applet code="Shape2.class" width=300 height=300>
</applet>*/
