Feature: EndToEnd validation
Scenario: End To End scenario for buy a product
Given Navigate to  url
When User will hoverover on any menu
And user click on any submenu
And user click on any specific product from submenu
And user will select any color 
And user select any size
And user will click add to cart button
Then user should see one product into cart 
When user navigate back 
And user add another product into cart 
Then user should see two product into cart
