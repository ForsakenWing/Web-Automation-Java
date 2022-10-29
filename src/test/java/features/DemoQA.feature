@Demo-QA
Feature: BBC test automation scenarios
  A collection of test scenarios for BBC, demonstrating capabilities of Pickleib
  Background: Navigate to the page
  Navigates to the page
    * Navigate to url: https://demoqa.com/automation-practice-form

  @AutomationPractise
  Scenario:  DemoQA steps
  A scenario where DemoQA form is tested
    * Set window width & height as 625 & 1025
    * Fill the firstName on the AutomationPractisePage with text: MrPupkin
    * Fill the lastName on the AutomationPractisePage with text: MrPupkinLastName
    * Fill the email on the AutomationPractisePage with text: MrPupkin@gmail.com
    * Click the male on the AutomationPractisePage
    * Fill the phoneNumber on the AutomationPractisePage with text: 1234567890
    * Click the dateOfBirth on the AutomationPractisePage
    * Click listed element August from monthList list on the AutomationPractisePage
    * Click listed element 2004 from yearList list on the AutomationPractisePage
    * Click listed element 10 from dayList list on the AutomationPractisePage
    * Fill the subjects on the AutomationPractisePage with text: English
    * Click the subjectOption on the AutomationPractisePage
    * Click the sports on the AutomationPractisePage
    * Fill the address on the AutomationPractisePage with text: Address Mister Pupkin.com
    # Put your path to directory in the step below
#    * Fill the uploadPicture on the AutomationPractisePage from folder /Users/mac/JavaProjects/Web-Automation-Java/src/test/resources/files with file testImage.jpg
    * Click the state on the AutomationPractisePage
    * Click listed element Haryana from stateList list on the AutomationPractisePage
    * Click the city on the AutomationPractisePage
    * Click listed element Karnal from cityList list on the AutomationPractisePage
    * Click the submit on the AutomationPractisePage

