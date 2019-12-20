Feature: sample feature

Scenario: Successful Login to facebook
     Given with valid url
     When enter valid username and password     
     Then homepage should display
     
Scenario: unSuccessful with invalid Login to facebook
     Given with valid url
     When enter valid username and password     
     Then homepage should display