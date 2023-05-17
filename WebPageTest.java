package automationTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class WebPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sibulele Mahlakata\\eclipse-workspace\\WebTest1\\driver\\chromedriver\\chromedriver.exe");  

WebDriver driver=new ChromeDriver();

	//Launch webpage
      driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
      driver.manage().window().maximize();
      String title =driver.getTitle();
      
      //Confirm that you are accessing the Practice Page
      if (title.equalsIgnoreCase("Practice Page"))
    	  System.out.println("Title matches");
    	  else
    		  System.out.println(title);
      
      //Locate the 1st Radio button
      WebElement btn1 = driver.findElement(By.cssSelector("#radio-btn-example > fieldset > label:nth-child(2) > input"));
    		  
      //Locate the 2nd Radio button
      WebElement btn2 = driver.findElement(By.cssSelector("#radio-btn-example > fieldset > label:nth-child(3) > input"));
      
      //Locate the 3rd Radio button and select the button
      WebElement btn3 = driver.findElement(By.cssSelector("#radio-btn-example > fieldset > label:nth-child(4) > input"));
    		  btn3.click();
    		  
    		  		//Pause script execution for 1 second
	      			Thread.sleep(1000);
    		  
    		  //COME BACK TO ME!!!!!!!!!
    	      //Confirm that the click request ran successfully
    	      System.out.println("Radio button 1 was selected - " + btn1.isSelected());
    	      System.out.println("Radio button 2 was selected - " + btn2.isSelected());
    		  System.out.println("Radio button 3 was selected -" + btn3.isSelected());
    	      
    	      btn2.click();
    	      
    	      		Thread.sleep(1000);
    	      
    		//Confirm that the click request ran successfully. if true it's selected and if false it's not selected
    		  System.out.println("Radio button 1 was selected - " + btn1.isSelected());
    	      System.out.println("Radio button 2 was selected - " + btn2.isSelected());
    	      System.out.println("Radio button 3 was selected - " + btn3.isSelected());
    	    
    	      		Thread.sleep(1000);
    	      
      //Locate the Select Countries text box
      WebElement search = driver.findElement(By.id("autocomplete"));
    		  search.sendKeys("South");
    		  
    		      	 Thread.sleep(1000);
    		  
    		  //Select the South Africa option from the search results
    		  driver.findElement(By.xpath("/html/body/ul/li[2]/div")).click();
    		 
    		  		 Thread.sleep(1000);
    		 
    		  //Remove the "South" text from the search box
    		  search.clear();
    		  
    				  Thread.sleep(1000); 

    		  WebElement SearchTwo = driver.findElement(By.id("autocomplete"));
    		  SearchTwo.sendKeys("Republic");

    	    		  Thread.sleep(1000); 
    		  
    		  //FYI, This code isn't selecting the 1st option 😐 and I tried to fix it but wow 🥲
    		  driver.findElement(By.xpath("/html/body/ul/li[1]")).click();

    		  
    		  //Select all the check box options code
    		WebElement checkboxone = driver.findElement(By.id("checkBoxOption1"));
    				checkboxone.click();
    				
    				Thread.sleep(1000);
    				
    		WebElement checkboxtwo =  driver.findElement(By.id("checkBoxOption2"));
    				checkboxtwo.click();
    				
    				Thread.sleep(1000);
    				
    		WebElement checkboxthree = driver.findElement(By.id("checkBoxOption3"));
    				checkboxthree.click();
    				
    				Thread.sleep(1000);
    				
    				//Confirm that all the check box options have been is selected
    				System.out.println("Verify if checkbox 1 is selected - " + checkboxone.isSelected());
    				System.out.println("Verify if checkbox 2 is selected - " + checkboxtwo.isSelected());
    				System.out.println("Verify if checkbox 3 is selected - " + checkboxthree.isSelected());
    				
    				//Removes check box ones selection
    				checkboxone.click();
    			
    				//Verify that the 1st check box has been removed
    				System.out.println("The selection status of checkbox 1 is - " + checkboxone.isSelected());
    				System.out.println("The selection status of checkbox 2 is - " + checkboxtwo.isSelected());
    				System.out.println("The selection status of checkbox 3 is - " + checkboxthree.isSelected());
    		
    				checkboxthree.sendKeys(Keys.ARROW_DOWN);
    				
    		//Locating the Hide Button
    		WebElement hidebtn = driver.findElement(By.id("hide-textbox"));

    		//Scrolldown on the webpage
    		hidebtn.sendKeys(Keys.ARROW_DOWN);

    		//Click the hide option
    		hidebtn.click();
    		
    				Thread.sleep(1000); 
    		
    		//Confirm that the hide/show text box is gone once hide button has been clicked
    		WebElement hstbox = driver.findElement(By.id("displayed-text"));
    		System.out.println("The hide/show textbox is visible on the webpage - " + hstbox.isDisplayed());	
    		
    				Thread.sleep(1000);
    		
    		//Click the show option
    		WebElement showbtn = driver.findElement(By.id("show-textbox"));
    		showbtn.click();
    		
    		Thread.sleep(1000);
    		//Confirm that the hide/show text box is available once show button has been clicked
    		WebElement shbox = driver.findElement(By.id("displayed-text"));
    		System.out.println("The hide/show textbox is visible on the webpage - " + shbox.isDisplayed());	
    		
    		//Confirm the amount for Joe Postman from Chennai is 46
    		WebElement jpchennai = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr[6]/td[4]"));
    		String rowtxt = jpchennai.getText();
    		System.out.println("Confirm that the amount for Joe Postman amount equals 46 - " + rowtxt.equals("46"));
    		
    		//Confirm that the total amount is 296
    		WebElement tamount = driver.findElement(By.className("totalAmount"));
    		String total = tamount.getText();
    		
    		//This code is also shakey 🥹
    		System.out.println("Total amount collected is 296 - " + total.equals(" Total Amount Collected: 296 "));
    		
    		//Confirm that there is a iframe on the page, if iframe exists on the page a numerical value will appear on the console.
    		int size = driver.findElements(By.tagName("iframe")).size();
    		System.out.println("There are/is " + size + " iframe/s on the web page");
    		
    		//Interact with the iframe
    		System.out.println("We are switching to the next iframe" + driver.switchTo().parentFrame());

			//snooze before the shutdown
			Thread.sleep(1000);
			
			//The shutdown
    		driver.close();	 
	}

}
