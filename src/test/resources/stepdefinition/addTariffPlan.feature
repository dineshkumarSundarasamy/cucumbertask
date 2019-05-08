
@reg
Feature: Title of your feature
  I want to use this template for my feature file


  Scenario Outline: Title of your scenario outlines
    Given I want to write a step for addTariffPlan
    When I want to add tariff plan in form "<mrnt>","<flmn>","<fimn>","<fsmn>","<lcn>","<icn>","<scn>"      
    Then I verify the status in steps

   Examples:
   |mrnt|flmn|fimn|fsmn|lcn|icn|scn|
   |10|20|30|40|50|600|100|
   |20|30|40|50|60|70|200|