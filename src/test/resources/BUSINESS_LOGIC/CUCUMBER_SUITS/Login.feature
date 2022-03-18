Feature: Login functionality

Background: user will successfully openApplication
Given user opens "webdriver.chrome.driver"browser with exe as "E:\\FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user opens URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user click on cancle login window
When user moveto login
When user click on Myprofile
When user enter username as "8055916704"
When user enter password as "sunil@51"
When user clik on login button
Then application shows login successfully 
 
