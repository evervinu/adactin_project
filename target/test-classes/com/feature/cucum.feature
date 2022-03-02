Feature:Booking a room in Adactin hotel website
Scenario:Login into the application
Given:User launch the website link
When:User enter the Username In "vinever95" Field
And:User enter the Password In "Vin@54321" Field
And:User click login button
Then:User should navigate to Search Hotel page

Scenario:Search a hotel in page
When:User select the Location
And:User select the Hotel
And:User select the Room type
And:User select the Number of rooms
And:User select the Check in date
And:User select the Check out date
And:User select the Adults per room
And:User select the Children per Room
And:User click search button
Then:Verify user navigate to select a hotel

Scenario:Slect the hotel in page
When:User should select on the radio button
And:User should click on the continue button
Then:User should navigate to book a hotel

Scenario:Book a Hotel in application
When:User enter the First Name 
And:User enter the Last Name 
And:User enter the Billing Address 
And:User enter the Credit Card Number 
And:User enter the Credit Card type
And:User enter the Credit Card expiry month and year
And:User enter the CVV number
And:User enter the should click on the book now button
Then:verify to user navigate to booking conformation

Scenario:Booking the confirmation in application
When:check all data conformation after click logout button
Then:User should navigate to logout page