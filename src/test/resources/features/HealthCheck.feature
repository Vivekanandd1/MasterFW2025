
@ui @BDDAssign
  Feature: E-commerce Project Web Site
 
  Background: Navigation to the URL
    Given User navigated to the home application url
     
  @t1
  Scenario: User navigate to the home page url and validate to the home page url with given url
     When user validate application home page url
     Then User should be redirected to "https://automationpractice.com/index.php"
     
 @t2
 Scenario: User navigated to home page url and validate apllication logo visibility with Height & Width
     When User validate application logo visibility
     Then User validate Height & Width of logo "99" and "350"

 @t3
   Scenario: Validation of Application product maincategory list
    When user fetch product category list
   | WOMEN 		|
   | DRESSES	|
   | T-SHIRTS |
   
    Then User validate count of the product categories should be "3"

 @t4 
   Scenario: User navigated to home page url and validate Search functionality
     When User entered text in searchbox "Faded"
     Then User validate autosuggestion text "Faded"

@t5 
		Scenario: Application social media handles validation    
		When User clicked on twitter logo
		And User Validate the url opened on a new tab contains "seleniumfrmwrk"
	  Then Validate the twiiter accont name is "Selenium Framework"  
