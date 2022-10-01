// This is a cool and animated way to print the great two word for every programmer "HELLO WORLD".'''
// So, here is the little representation of this "HELLO WORLD".
// This is a beginner friendly and simple animation using JAVA.
// In this animation Applet package and Abstract Window Toolkit package are used for graphics.
// ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

// Here is the code for this cool representation:

// First of all we import the Applet and Abstract Window Toolkit packages.
import java.applet.*;
import java.awt.*;

public class hello extends Applet {

//  Now in the Class set the background size and color for the animation 
  public void init()
  {
    resize(500,500);
    setBackground(Color.white);
  }
 
//   Here we go! Let's write the code for animation.
  public void paint(Graphics cool)
  {cool.setColor(Color.red);
    try{
//   First we play with "HELLO"
      
// This is for H & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=100;i<151;i++)
    {cool.fillOval(50, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=50;i<76;i++)
    { cool.fillOval(i, 125, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=100;i<151;i++)
    {cool.fillOval(75, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
      
// This is for E & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=100;i<151;i++)
    {cool.fillOval(100, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=100;i<126;i++)
    {cool.fillOval(i, 100, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=100;i<126;i++)
    { cool.fillOval(i, 125, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=100;i<126;i++)
    {cool.fillOval(i, 150, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
      
// This is for two L & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=100;i<151;i++)
    {cool.fillOval(150, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
   for(int i=150;i<176;i++)
    {cool.fillOval(i, 150, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=100;i<151;i++)
    {cool.fillOval(200, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=200;i<226;i++)
    {cool.fillOval(i, 150, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
      
// This is for O & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=100;i<151;i++)
    {cool.fillOval(250, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=250;i<276;i++)
    {cool.fillOval(i, 150, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=150;i>99;i--)
    {cool.fillOval(275, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=275;i>249;i--)
    {cool.fillOval(i, 100, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    
// Now Let's animate the World 
    
// This is for W & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=200;i<251;i++)
    {cool.fillOval(50, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=50;i<63;i++)
    {cool.fillOval(i, 250, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=250;i>226;i--)
    {cool.fillOval(62, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=62;i<76;i++)
    {cool.fillOval(i, 250, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=250;i>199;i--)
    {cool.fillOval(75,i , 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
      
// This is for O & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=200;i<251;i++)
    {cool.fillOval(100, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=100;i<126;i++)
    {cool.fillOval(i, 250, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=250;i>199;i--)
    {cool.fillOval(125, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=125;i>99;i--)
    {cool.fillOval(i, 200, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
      
// This is for R & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=200;i<251;i++)
    {cool.fillOval(150, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=150;i<176;i++)
    {cool.fillOval(i, 200, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    for(int i=200;i<226;i++)
    {cool.fillOval(175, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    for(int i=175;i>149;i--)
    {cool.fillOval(i,225,5,5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
    int x=150,y=225;
    while(x<176)
    {cool.fillOval(x, y, 5, 5);
      x++;y++;
      Thread.sleep(20);
    }cool.setColor(Color.blue);
      
// This is for L & time interval included here is 20 (you can change the time interval and colors as your choice)
    for(int i=200;i<251;i++)
    {cool.fillOval(200, i, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.red);
   for(int i=200;i<226;i++)
    {cool.fillOval(i, 250, 5, 5);
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    
// This is for D & time interval included here is 20 (you can change the time interval and colors as your choice)
   for(int i=200;i<251;i++)
    {cool.fillOval(250, i, 5, 5);
      Thread.sleep(20);
    }
    x=250;y=200;g.setColor(Color.red);
    while(x<276)
    {cool.fillOval(x,y,5,5);
      x++;y++;
      Thread.sleep(20);
    }cool.setColor(Color.blue);
    x=275;y=225;
    while(x>249)
    {cool.fillOval(x, y, 5, 5);
      x--;y++;
      Thread.sleep(20);
    }
    }
    catch(Exception e)
    {}
      
  }

}
