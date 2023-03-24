Feature: Pactice demoqa
  Background:
    Given User lauch browser and pass the url "https://demoqa.com/"
#  @textbox
#  Scenario Outline: To validate the textbox elements of demoqa
#    When work on textbox firstname <fname> and email <email> and cadd <currentadd> and padd <paddresss>
#    Then clear all textboxess
#    Examples:
#      |fname          |email            |currentadd   |paddresss     |
#      |tester         |tester@gmail.com |banglore     |banglore      |
#      |tester2        |tester2@gmail.com|banglore     |ramanagar     |
#
#  @checkbox
#  Scenario: To validate the checkbox of demoqa
#    When work on checkbox
#    Then Check how many checkboxes are their and check it is selected
#
#  @radiobutton
#  Scenario: To validate the Radio button
#    When work on radiobutton
#    Then Check which radio button is selected and no of radiobuttons
#
#  @upload
#  Scenario: To validate the upload button
#    When work on upload button
#    Then check file is updated
#
#  @forms
#  Scenario Outline: To validate the fields in form
#    When Enter the data to fname <firstname> and lname <lastname> and email <email>
#    And Enter all the datas
#    And click on submit
#    Examples:
#      |firstname    |lastname      |email                 |
#      |tester       |xy           |testerxy@gmail.com    |
#      |tester       |new          |testernew@gmail.com   |
#
#  @alert
#  Scenario: To validate the simplealert
#    When click on alertframewindow tab and select alert
#    And Print the text in the alert
#    And accept the alert
#
#  @alert
#  Scenario: To validate the timedalert
#    When click on alertframewindow tab and select alert and click on timedalert button
#    And Print the text in the timedalertbutton
#    And accept the timedalert
#
#  @alert
#  Scenario: To validate the confirmbuttonalert
#    When click on alertframewindow tab and select alert and click on confirmalert button
#    And Print the text in the confirmalertbutton
#    And accept the confirmdalert
#    And Check the alert accepted
#
#  @alert
#  Scenario: To validate the promtbuttonalert
#    When click on alertframewindow tab and select alert and click on promtalert button
#    And Print the text in the promtbutton
#    And accept the promtdalert
#    And Check the promtalert accepted
#
#  @windowandtab
#  Scenario: To validate the window and tab button
#    When click on respective button
#    And capture the text
#
#  @frames
#  Scenario: To validate the frame elements
#    When Enter the fetch the text
#
#  @webtables
#  Scenario Outline: To validate the webtables
#    When Create a employee data is created f <fname>and l <lname>and email <emailid> age <age>and sal <salary>and deapart <dept>
#    Then Check the employee data is created f<fname>
#
#    Examples:
#      |fname |lname|emailid           |age|salary|dept|
#      |tester|xy   |tester@gmail.com|24 |28000 |manual    |
#      |tester|new  |tester@gmail.com|24 |28000 |automation|
#
#  @Buttons
#  Scenario: To validate the all button
#    When user click on doubleclick button
#    Then check clcik on doubleclick button
#    When user click on rightclick button
#    Then check clcik on rightclick button
#    When user click on dynamicclick button
#    Then check clcik on dynamicclick button
#
#  @interactionsdraganddrop
#  Scenario: To validate the dropable
#    When user click on interactions and droppable
#    And work on dropable
#    Then check the dropped or not
#
#  @nestedframes
#  Scenario: To validate the nestedframes
#    When user click nestedframes tab and fetch the text of all frame
#    And validate the text
#  @modaldailogs
#  Scenario:
#    When user click on modal dailogs
#    And Get the text from modal dailogs window
#    And Close the modal dailogs window
#
#  @slider
#   Scenario: To validate the Slider bar
#    When user click on slider
#    And drag it to small value
#    And fecth the text from it
#  @progressivebar
#  Scenario: To validate the progressivebar
#    When user click on progrssivebar button
#    And user click on start button
#    And wait untill it complete 100% and click on reset
#
#  @tooltips
#  Scenario: To do the mouse over actions
#    When mouse over on button
#    And mouse over on textfiled
#    Then close browser
#  @datepicker
#  Scenario Outline: To validate the datepicker
#    When click on datepicker
#    And Select a date <date>  and month <month> from date list
#    Examples:
#    |date|month|
#    |5   |June |
#    |25  |December|
#
#  @resizeable
#  Scenario: To validate the resizable
#    When To resize the webelement

#  @selectable
#  Scenario: To Validate the selecatable
#    When user click on selectables and check they are enabled gettext
#
#  @dropdowns
#  Scenario: To validate the dropdowns
#    When To validate withoutgroup
#    And To validate selectone
#    And To validate static dropdown
#    And To validate multiselect dropdown
#    And To validate standard multiselect dropdown
#
#  @autocomplete
#  Scenario: To validate the autocomplete
#    When user pass colour and select from suggestions

#  @drag
#  Scenario: To validate the drag elements
#    When user darg the element to certain place
#  @tabs
#  Scenario: To validate the tabs
#    When user go to every tab and fetch the text of tab and body

#  @menu
#  Scenario: To validate the menu tab and subtab
#    When user click on menu and mouse over on main item and goto sublist

  @sortables
  Scenario: To validates selectables
    When user click and hold and offset it