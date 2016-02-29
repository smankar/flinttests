Feature: FlintBit

  * User should be able to create a new flintbit
  * User should be able to run a flint bit

  Scenario: User should be able to run available flintbit
    Given that example:DevBoxProvisioning.rb flintbit is installed
    When I run the example:DevBoxProvisioning.rb flintbit
    Then Dev box should be provisioned

  @wip
  Scenario: User should be create a new flintbit
    Given I have a script to provision a DevBox
    When create example:DevBoxProvisioning.rb flintbit
    Then example:DevBoxProvisioning.rb flintbit should be available to use