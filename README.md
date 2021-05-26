Website https://www.saucedemo.com/ automation testing checklist.
Browser: Chrome 90.0.4430.93, OS Windows: 10 10.0.19042

1.
Module: Login page
Priority: High
Summary: Check the field “Username” on the login page.
Input possible username (“standard_user”, "locked_out_user", "problem_user", "performance_glitch_user"), leave the field blank.

2. 
Module: Login page
Priority: High
Summary: Check the field “Password” on the login page.
 Input valid password (“secret_sauce”), leave the field blank.

3.
Module: Login page
Priority: High
Summary: Check the registration with all field on the login page is empty.

4. 
Module: Login page
Priority: Low
Summary: Check the button error message container close.

5. 
Module: Login page
Priority: High
Summary: Check the button “Login” on the login page.

6. 
Module: Products page
Priority: High
Summary: Check the button “Add to cart” on the products page.

7. 
Module: Products page
Priority: Medium
Summary: Check the button “Remove” on the products page.

8. 
Module: Products page
Priority: Medium
Summary: Sorting possibility check on the products page (Name: A to Z, Name: Z to A, Price: low to high, Price: high to low).

9. 
Module: Products page
Priority: Low
Summary: Click on a product photo or product name on the products page to display the product in full screen.

10. 
Module: Products page
Priority: High
Summary: Check the button “Add to cart” when the product display in the full screen on the products page.

11. 
Module: Products page
Priority: Medium
Summary: Check the button “Remove” when the product display in the full screen on the products page.

12.
Module: Products page
Priority: Low
Summary: Check the button “Back to products” when the product display in the full screen on the products page.

13.
Module: Header
Priority: High
Summary: Check the go to cart button on the header with opened products page.

14.
Module: Header
Priority: Medium 
Summary: Check the menu button on the header.

15.
Module: Header
Priority: Medium
Summary: Check the button “All items” on the header menu when opened products cart.

16.
Module: Header
Priority: Low
Summary: Check the button “About” on the header menu.

17.
Module: Header
Priority: Low
Summary: Check the button “Log out” on the header menu.

18.
Module: Header
Priority: Low
Summary: Check the button “Reset app state” on the header menu.

19. 
Module: Cart page
Priority: High
Summary: Сheck if an item has been added to the cart.

20. 
Module: Cart page
Priority: High
Summary: Сheck if the price of a product on the cart page matches its price on the products page.

21.
Module: Cart page
Priority: High
Summary: Check the quantity field on the cart page.

22.
Module: Cart page
Priority: Medium
Summary: Check the button “Remove” on the cart page.

23.
Module: Cart page
Priority: Medium
Summary: Check the button “Continue shopping” on the cart page.

24.
Module:  Cart page
Priority: High
Summary: Check the button “Checkout” on the cart page.

25. 
Module: Checkout page
Priority: High
Summary: Check the field “First Name” on the checkout page.
Input Latin letters (“User”), Cyrilic letters (“Юзер”), leave the field is empty, input numbers (“12345”), other characters (“/*+-.,=”).

26.
Module: Checkout page
Priority: High
Summary: Check the field “Last Name” on the checkout page.
Input Latin letters (“User”), Cyrilic letters (“Юзер”), leave the field is empty, input numbers (“12345”), other characters (“/*+-.,=”).

27.
Module: Checkout page
Priority: High
Summary: Check the field “Zip-code” on the checkout page. Input numbers (“12345”), leave the field is empty, input letters (“aaaaa”).

28.
Module: Checkout page
Priority: High
Summary: Chek the checkout with all fields on the checkout page is empty.

29.
Module: Checkout page
Priority: High
Summary: Check the button “Continue” on the checkout page.

30.
Module: Checkout page
Priority: Low
Summary: Check the button “Cancel” on the checkout page.

31.
Module:  Overview page
Priority: High
Summary: Сheck the product name on the overview page.

32.
Module: Overview page
Priority: High
Summary: Сheck if the price of a product on the overview page matches its price on the cart page.

33.  
Module: Overview page
Priority: High
Summary: Check the quantity field on the overview page.

34.
Module: Overview page
Priority: High
Summary: Check the field “Total” on the overview page. 

35.
Module: Overview page
Priority: High
Summary: Check the button “Finish” on the overview page.

36.
Module: Overview page
Priority: Low
Summary: Check the button “Cancel” on the overview page.


mvn versions:display-dependency-updates:

[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 4.4.1 -> 4.4.3
[INFO]   org.seleniumhq.selenium:selenium-java ....... 3.141.59 -> 4.0.0-beta-3
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  17.736 s
[INFO] Finished at: 2021-05-26T15:58:01+03:00
[INFO] ------------------------------------------------------------------------

mvn versions:use-latest-versions:

[INFO] Major version changes allowed
[INFO] Updated org.seleniumhq.selenium:selenium-java:jar:3.141.59 to version 4.0.0-beta-3
[INFO] Updated org.testng:testng:jar:7.1.0 to version 7.4.0
[INFO] Updated io.github.bonigarcia:webdrivermanager:jar:4.4.1 to version 4.4.3
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.381 s
[INFO] Finished at: 2021-05-26T16:12:26+03:00
[INFO] ------------------------------------------------------------------------

mvn clean test:

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 53.793 sec

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:01 min
[INFO] Finished at: 2021-05-26T16:36:25+03:00
[INFO] ------------------------------------------------------------------------

mvn -Dtest=LoginTest#loginWithEmptyNameFieldTest+loginWithEmptyPasswordFieldTest test:

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.316 s - in tests.LoginTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  24.004 s
[INFO] Finished at: 2021-05-26T17:01:14+03:00
[INFO] ------------------------------------------------------------------------

mvn -Dtest=CartTest#checkProductsPriceInCartTest -DuserName=standard_user -Dpassword=secret_sauce test

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.347 s - in tests.CartTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.735 s
[INFO] Finished at: 2021-05-26T17:19:07+03:00
[INFO] ------------------------------------------------------------------------