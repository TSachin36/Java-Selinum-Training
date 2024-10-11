#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: About Testers
  In order to get a high paid job
  As a Tester
  I want to learn Automation
  Scenario: I am a manual tester
    Given I am a "manual" tester
    When I apply for a job
    Then I got "less" paid job
    Then I am "not" satisfied with my salary
    But my parents are "still" satisfied
 Scenario: I am a automation tester
    Given I am a "Automation" tester
    When I apply for a job
    Then I got "highly" paid job
    Then I am "very" satisfied with my salary
    But my parents are "super" satisfied
Scenario: I am a API tester
    Given I am a "API" tester
    When I apply for a job
    Then I got "decently" paid job
    Then I am "quite" satisfied with my salary
    But my parents are "very much" satisfied