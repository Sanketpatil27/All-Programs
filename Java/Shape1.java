import java.applet.*;
import java.awt.*;
public class Shape1 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Circle Inside a Square",100,110);
g.drawRect(100,10,80,80);
g.drawOval(100,10,80,80);
}
}
/*
<applet code="Shape1.class" width=300 height=300>
</applet>
*/
