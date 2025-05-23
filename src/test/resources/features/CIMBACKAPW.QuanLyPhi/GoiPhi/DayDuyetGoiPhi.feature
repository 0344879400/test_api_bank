@feature=day-duyet-goi-phi @API
@quan-ly-goi-phi
@day-duyet-goi-phi
Feature: API Day duyet goi phi
  Endpoint: /cimback/fee/fee-pkg/save/1.0

  @day-duyet-goi-phi
  Scenario Outline: Kiểm tra đẩy duyệt gói phí thành công
    #create and submit fee package
    When user call api save draft fee package
      | Key                | Value         |
      | action             | <action>      |
      | feePkg.name        | <name>        |
      | feePkg.description | <description> |
      | feePkg.effectFrom  | <effectFrom>  |
      | feePkg.effectTo    | <effectTo>    |
    Then user verify API response code display equals 200
    Then user verify API response json data with information as below
      | status | code | message |
      | 0      | 0    | SUCCESS |
    #verify status of fee package after submit
    Then user should see status of fee package in table FEE_PKG_PROCESS is '<status>'

    Examples:
      | action | name               | description | effectFrom | effectTo   | status      |
      | SUBMIT | Gói chiến dịch 290 | 290         | 10/12/2024 | 15/12/2024 | PENDING_NEW |