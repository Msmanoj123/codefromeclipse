Feature: interactions
  Background:
    Given User launch the browser and pass the URL "https://jqueryui.com/"
  @draggable
  Scenario: To validate draggable in jQuery
    When user click on draggable
    Then check user navigate correct page
    When user is try to drag the element to required position

  @droppable
  Scenario: To validate droppable in jQuery
    When user click on droppable
    Then check user navigate droppable correct page
    When user is drag and drop the element
    Then Check the element is dropped

  @sortable
  Scenario: To validate sortable in jQuery
    When user click on sortable
    Then check user navigate sortable correct page
    When user is try to sort elements
    Then Check the element is sorted