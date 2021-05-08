import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tictactoe
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay Chaurasia\\Desktop\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("https://playtictactoe.org/");
		
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[4]/div[1]")).click();
		System.out.println("2 players selected");
		
		w.findElement(By.xpath("//body/div[3]/div[1]/div[1]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[2]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[3]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[4]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[5]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[6]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[7]")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Player 1 is win: "+w.findElement(By.xpath("//body/div[4]/p[1]/span[4]")).getText());
		
		w.quit();
	}
}