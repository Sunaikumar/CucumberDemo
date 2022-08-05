Feature: Online Dress Purchase in Automation

Scenario: Purchase Evening Dress

Given user Launch the Shopping Site

When user click The Sign in

And user Enter The Username 

And user Enter The Password

And user Click The Signin

And click_And_Hold Dresses

And click Evening Dresses

And click Quickview

And quantity_click

And size "byText" "M"

And click_Color

And add_To_Cart

And click_Proceed_Checkout

And summary

And address

And shipping

And closed

And terms_Service

And shipping_next

And payment

And pay_By_Bank

Then confirm_Order














