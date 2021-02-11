# Autor: Juan Ariza
@stories
Feature: utes community
  As an user, I want to register at the page of the utes community
  @scenario1
  Scenario: Register at the utes page
    Given than juan wants to register at the utes page
    | fname       | lname       | email                 |
    | Juan Carlos | Ariza Reyes | juanmicros3@gmail.com |
    When he performs all the registration steps on the utes platform
    | password          | confpassword      |
    | MyfirStpasS1,23,. | MyfirStpasS1,23,. |
    Then he completes the registration on the utes page