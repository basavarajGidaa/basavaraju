import java.awt.Desktop;
import java.net.URI;

// ...
class Browser{
public static void main(String[] args){
if(Desktop.isDesktopSupported())
{
  Desktop.getDesktop().browse(new URI("http://www.google.com"));
}
else
{
System.out.println("code failure");
}
}
}
