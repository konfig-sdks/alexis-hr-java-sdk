<div align="left">

[![Visit Alexishr](./header.png)](https://alexishr.com)

# [Alexishr](https://alexishr.com)

<h1 id="introduction">Introduction</h1>
<p>
  AlexisHR API is currently in preview. This means that small, backward
  incompatible changes might be introduced while in preview. The changes will be
  documented and communicated.
  <a
    href="https://cdn.forms-content.sg-form.com/56c6a65c-90a2-11eb-a700-a6de1aea3a1a"
    target="_blank"
    ><button>Subscribe to updates</button></a
  >
</p>

<h1 id="authentication">Authentication</h1>
<pre class="click-to-expand-wrapper is-snippet-wrapper language-undefined">
<code class="is-highlighted language-bash">curl https://api.alexishr.com/v1/employee \
  -H "Authorization: Bearer &lt;your_access_token&gt;"</code>
</pre>
<p>
  Authenticate your account when using the API by including your secret Access
  Token in the request.
  <a href="https://app.alexishr.com/access-tokens">Manage your Access Tokens</a
  >.
</p>
<p>
  Authentication is performed by passing the Access Token in the Authorization
  header.
</p>
<hr />

<h1 id="structure">Structure</h1>
<p>
  You will find the structure of the API to be highly uniform and consistent.
  Typically every resource can be accessed via a top level endpoint, such as
  <code>/v1/employee</code>. For every such resource, you can perform some of
  the following operations:
</p>
<h2>Operations</h2>
<table>
  <tr>
    <td>GET /v1/:resource</td>
    <td>List all objects of this type</td>
  </tr>
  <tr>
    <td>GET /v1/:resource/:id</td>
    <td>Retrieve a resource by id</td>
  </tr>
  <tr>
    <td>POST /v1/:resource</td>
    <td>Create a resource of this type</td>
  </tr>
  <tr>
    <td>PATCH /v1/:resource/:id</td>
    <td>Update the resource by id</td>
  </tr>
  <tr>
    <td>DELETE /v1/:resource/:id</td>
    <td>Delete the resource by id</td>
  </tr>
</table>
<hr />

<h1 id="roles">Roles</h1>
<p>The Access Tokens will have owner permission on the account</p>
<hr />

<h1 id="filters">Filters</h1>
<p>
  Some of the list endpoints allow to filter results by certain conditions.
  Refer to specific resources to find out what criteria are allowed. Below is a
  list of the different conditions.
</p>

<h4 id="eq"><code>$eq</code></h4>
<p>Find all results matching the attribute value specified.</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[fieldName][$eq]=value</code></pre>
</div>
<p>Can also be simplified like this.</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[fieldName]=value</code></pre>
</div>

<h4 id="neq"><code>$neq</code></h4>
<p>Find all results not matching the attribute value specified.</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[fieldName][$neq]=value</code></pre>
</div>

<h4 id="gt"><code>$gt</code>, <code>$gte</code></h4>
<p>
  Find all results where the value is more (<code>$gt</code>) or more and equal
  (<code>$gte</code>) to a given value.
</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[startDate][$gte]=2020-01-01</code></pre>
</div>
<hr />

<h4 id="lt"><code>$lt</code>, <code>$lte</code></h4>
<p>
  Find all results where the value is less (<code>$lt</code>) or less and equal
  (<code>$lte</code>) to a given value.
</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[startDate][$lte]=2020-01-01</code></pre>
</div>
<hr />

<h4 id="in"><code>$in</code>, <code>$nin</code></h4>
<p>
  Find all results matching (<code>$in</code>) or not matching
  (<code>$nin</code>) any of the attribute values specified.
</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[fieldName][$in][]=value1&filters[fieldName][$in][]=value2</code></pre>
</div>
<hr />

<h4 id="between"><code>$between</code></h4>
<p>Find all results between two values specified.</p>
<div>
  <pre><code class="language-shell" data-lang="shell">GET /v1/example?filters[startDate][$between][]=2020-01-01&filters[startDate][$between][]=2020-12-31</code></pre>
</div>
<hr />

<h1 id="versioning">Versioning</h1>
<p>
  Each version of the API is guaranteed to be compatible with the resources of
  the same version. When we make breaking changes to the API a new version will
  be published
</p>
<hr />

<h1 id="changelog">Changelog</h1>
<h3>2023-12-20</h3>
<p>Field [updated] added for filter & select for Get Many Employments and Get Many Employees.</p>
<h3>2021-03-15</h3>
<p>First draft was published</p>
<hr />

# Authentication

<!-- ReDoc-Inject: <security-definitions> -->

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=AlexisHR&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>alexis-hr-java-sdk</artifactId>
  <version>v1-preview</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:alexis-hr-java-sdk:v1-preview"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/alexis-hr-java-sdk-v1-preview.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChildApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.alexishr.com/v1";
    
    // Configure HTTP bearer authorization: bearer
    configuration.token = "BEARER TOKEN";
    AlexisHr client = new AlexisHr(configuration);
    String employeeId = "employeeId_example";
    String name = "name_example";
    OffsetDateTime birthdate = OffsetDateTime.now();
    try {
      ChildResponseMapped result = client
              .child
              .createOne(employeeId, name, birthdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChildApi#createOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChildResponseMapped> response = client
              .child
              .createOne(employeeId, name, birthdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChildApi#createOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.alexishr.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChildApi* | [**createOne**](docs/ChildApi.md#createOne) | **POST** /child | Create One Child
*ChildApi* | [**deleteChild**](docs/ChildApi.md#deleteChild) | **DELETE** /child/{id} | Delete One Child
*ChildApi* | [**getMany**](docs/ChildApi.md#getMany) | **GET** /child | Get Many Children
*ChildApi* | [**getOneChild**](docs/ChildApi.md#getOneChild) | **GET** /child/{id} | Get One Child
*ChildApi* | [**replaceChildData**](docs/ChildApi.md#replaceChildData) | **PUT** /child/{id} | Replace One Child
*ChildApi* | [**updateChildData**](docs/ChildApi.md#updateChildData) | **PATCH** /child/{id} | Update One Child
*CompanyApi* | [**getOne**](docs/CompanyApi.md#getOne) | **GET** /company/{id} | Get One Company
*CompanyApi* | [**listManyCompanies**](docs/CompanyApi.md#listManyCompanies) | **GET** /company | Get Many Companies
*CompensationApi* | [**createOneCompensation**](docs/CompensationApi.md#createOneCompensation) | **POST** /compensation | Create One Compensation
*CompensationApi* | [**deleteOne**](docs/CompensationApi.md#deleteOne) | **DELETE** /compensation/{id} | Delete One Compensation
*CompensationApi* | [**getManyCompensations**](docs/CompensationApi.md#getManyCompensations) | **GET** /compensation | Get Many Compensations
*CompensationApi* | [**getOne**](docs/CompensationApi.md#getOne) | **GET** /compensation/{id} | Get One Compensation
*CompensationApi* | [**replaceOneCompensation**](docs/CompensationApi.md#replaceOneCompensation) | **PUT** /compensation/{id} | Replace One Compensation
*CompensationApi* | [**updateOne**](docs/CompensationApi.md#updateOne) | **PATCH** /compensation/{id} | Update One Compensation
*CostCenterApi* | [**createOneCostCenter**](docs/CostCenterApi.md#createOneCostCenter) | **POST** /cost-center | Create One Cost Center
*CostCenterApi* | [**deleteOneCostCenter**](docs/CostCenterApi.md#deleteOneCostCenter) | **DELETE** /cost-center/{id} | Delete One Cost Center
*CostCenterApi* | [**getMany**](docs/CostCenterApi.md#getMany) | **GET** /cost-center | Get Many Cost Centers
*CostCenterApi* | [**getOneCostCenter**](docs/CostCenterApi.md#getOneCostCenter) | **GET** /cost-center/{id} | Get One Cost Center
*CostCenterApi* | [**replaceOneCostCenter**](docs/CostCenterApi.md#replaceOneCostCenter) | **PUT** /cost-center/{id} | Replace One Cost Center
*CostCenterApi* | [**updateOneCostCenter**](docs/CostCenterApi.md#updateOneCostCenter) | **PATCH** /cost-center/{id} | Update One Cost Center
*DepartmentApi* | [**createOne**](docs/DepartmentApi.md#createOne) | **POST** /department | Create One Department
*DepartmentApi* | [**deleteOneDepartment**](docs/DepartmentApi.md#deleteOneDepartment) | **DELETE** /department/{id} | Delete One Department
*DepartmentApi* | [**getOne**](docs/DepartmentApi.md#getOne) | **GET** /department/{id} | Get One Department
*DepartmentApi* | [**listManyDepartments**](docs/DepartmentApi.md#listManyDepartments) | **GET** /department | Get Many Departments
*DepartmentApi* | [**replaceOne**](docs/DepartmentApi.md#replaceOne) | **PUT** /department/{id} | Replace One Department
*DepartmentApi* | [**updateOneDepartment**](docs/DepartmentApi.md#updateOneDepartment) | **PATCH** /department/{id} | Update One Department
*EmployeeApi* | [**createOneEmployee**](docs/EmployeeApi.md#createOneEmployee) | **POST** /employee | Create One Employee
*EmployeeApi* | [**getOne**](docs/EmployeeApi.md#getOne) | **GET** /employee/{id} | Get One Employee
*EmployeeApi* | [**listManyEmployees**](docs/EmployeeApi.md#listManyEmployees) | **GET** /employee | Get Many Employees
*EmployeeApi* | [**removeEmployee**](docs/EmployeeApi.md#removeEmployee) | **DELETE** /employee/{id} | Delete One Employee
*EmployeeApi* | [**replaceOneEmployee**](docs/EmployeeApi.md#replaceOneEmployee) | **PUT** /employee/{id} | Replace One Employee
*EmployeeApi* | [**updateOne**](docs/EmployeeApi.md#updateOne) | **PATCH** /employee/{id} | Update One Employee
*EmployeeTeamReferenceApi* | [**createOneEmployeeTeamReference**](docs/EmployeeTeamReferenceApi.md#createOneEmployeeTeamReference) | **POST** /employee-team-reference | Create One EmployeeTeamReference
*EmployeeTeamReferenceApi* | [**deleteOne**](docs/EmployeeTeamReferenceApi.md#deleteOne) | **DELETE** /employee-team-reference/{id} | Delete One EmployeeTeamReference
*EmployeeTeamReferenceApi* | [**getMany**](docs/EmployeeTeamReferenceApi.md#getMany) | **GET** /employee-team-reference | Get Many EmployeeTeamReferences
*EmployeeTeamReferenceApi* | [**getOneEmployeeTeamReference**](docs/EmployeeTeamReferenceApi.md#getOneEmployeeTeamReference) | **GET** /employee-team-reference/{id} | Get One EmployeeTeamReference
*EmployeeTeamReferenceApi* | [**replaceOne**](docs/EmployeeTeamReferenceApi.md#replaceOne) | **PUT** /employee-team-reference/{id} | Replace One EmployeeTeamReference
*EmployeeTeamReferenceApi* | [**updateOneEmployeeTeamReference**](docs/EmployeeTeamReferenceApi.md#updateOneEmployeeTeamReference) | **PATCH** /employee-team-reference/{id} | Update One EmployeeTeamReference
*EmploymentApi* | [**createOneEmployment**](docs/EmploymentApi.md#createOneEmployment) | **POST** /employment | Create One Employment
*EmploymentApi* | [**getOne**](docs/EmploymentApi.md#getOne) | **GET** /employment/{id} | Get One Employment
*EmploymentApi* | [**listManyEmployments**](docs/EmploymentApi.md#listManyEmployments) | **GET** /employment | Get Many Employments
*EmploymentApi* | [**removeOne**](docs/EmploymentApi.md#removeOne) | **DELETE** /employment/{id} | Delete One Employment
*EmploymentApi* | [**replaceOne**](docs/EmploymentApi.md#replaceOne) | **PUT** /employment/{id} | Replace One Employment
*EmploymentApi* | [**updateEmploymentData**](docs/EmploymentApi.md#updateEmploymentData) | **PATCH** /employment/{id} | Update One Employment
*EmploymentTypeApi* | [**createOneEmploymentType**](docs/EmploymentTypeApi.md#createOneEmploymentType) | **POST** /employment-type | Create One Employment Type
*EmploymentTypeApi* | [**deleteOneType**](docs/EmploymentTypeApi.md#deleteOneType) | **DELETE** /employment-type/{id} | Delete One Employment Type
*EmploymentTypeApi* | [**getManyEmploymentTypes**](docs/EmploymentTypeApi.md#getManyEmploymentTypes) | **GET** /employment-type | Get Many Employment Types
*EmploymentTypeApi* | [**getOne**](docs/EmploymentTypeApi.md#getOne) | **GET** /employment-type/{id} | Get One Employment Type
*EmploymentTypeApi* | [**updateOneEmploymentType**](docs/EmploymentTypeApi.md#updateOneEmploymentType) | **PUT** /employment-type/{id} | Replace One Employment Type
*EmploymentTypeApi* | [**updateOneEmploymentType_0**](docs/EmploymentTypeApi.md#updateOneEmploymentType_0) | **PATCH** /employment-type/{id} | Update One Employment Type
*LeaveApi* | [**createOne**](docs/LeaveApi.md#createOne) | **POST** /leave | Create One Leave
*LeaveApi* | [**deleteOneLeave**](docs/LeaveApi.md#deleteOneLeave) | **DELETE** /leave/{id} | Delete One Leave
*LeaveApi* | [**getManyLeaves**](docs/LeaveApi.md#getManyLeaves) | **GET** /leave | Get Many Leaves
*LeaveApi* | [**getOneLeave**](docs/LeaveApi.md#getOneLeave) | **GET** /leave/{id} | Get One Leave
*LeaveApi* | [**replaceOne**](docs/LeaveApi.md#replaceOne) | **PUT** /leave/{id} | Replace One Leave
*LeaveApi* | [**updateOneLeave**](docs/LeaveApi.md#updateOneLeave) | **PATCH** /leave/{id} | Update One Leave
*LeaveTransactionApi* | [**getOneLeaveTransaction**](docs/LeaveTransactionApi.md#getOneLeaveTransaction) | **GET** /leave-transaction/{id} | Get One LeaveTransaction
*LeaveTransactionApi* | [**listManyTransactions**](docs/LeaveTransactionApi.md#listManyTransactions) | **GET** /leave-transaction | Get Many LeaveTransactions
*LeaveTypeApi* | [**createOneLeaveType**](docs/LeaveTypeApi.md#createOneLeaveType) | **POST** /leave-type | Create One LeaveType
*LeaveTypeApi* | [**deleteOneLeaveType**](docs/LeaveTypeApi.md#deleteOneLeaveType) | **DELETE** /leave-type/{id} | Delete One LeaveType
*LeaveTypeApi* | [**getManyLeaveTypes**](docs/LeaveTypeApi.md#getManyLeaveTypes) | **GET** /leave-type | Get Many LeaveTypes
*LeaveTypeApi* | [**getOneLeaveType**](docs/LeaveTypeApi.md#getOneLeaveType) | **GET** /leave-type/{id} | Get One LeaveType
*LeaveTypeApi* | [**replaceLeaveType**](docs/LeaveTypeApi.md#replaceLeaveType) | **PUT** /leave-type/{id} | Replace One LeaveType
*LeaveTypeApi* | [**updateOneLeaveType**](docs/LeaveTypeApi.md#updateOneLeaveType) | **PATCH** /leave-type/{id} | Update One LeaveType
*OfficeApi* | [**createOneOffice**](docs/OfficeApi.md#createOneOffice) | **POST** /office | Create One Office
*OfficeApi* | [**deleteOne**](docs/OfficeApi.md#deleteOne) | **DELETE** /office/{id} | Delete One Office
*OfficeApi* | [**getOneOffice**](docs/OfficeApi.md#getOneOffice) | **GET** /office/{id} | Get One Office
*OfficeApi* | [**listManyOffices**](docs/OfficeApi.md#listManyOffices) | **GET** /office | Get Many Offices
*OfficeApi* | [**replaceOne**](docs/OfficeApi.md#replaceOne) | **PUT** /office/{id} | Replace One Office
*OfficeApi* | [**updateOne**](docs/OfficeApi.md#updateOne) | **PATCH** /office/{id} | Update One Office
*TeamApi* | [**createOneTeam**](docs/TeamApi.md#createOneTeam) | **POST** /team | Create One Team
*TeamApi* | [**deleteOne**](docs/TeamApi.md#deleteOne) | **DELETE** /team/{id} | Delete One Team
*TeamApi* | [**getOneTeam**](docs/TeamApi.md#getOneTeam) | **GET** /team/{id} | Get One Team
*TeamApi* | [**listTeams**](docs/TeamApi.md#listTeams) | **GET** /team | Get Many Teams
*TeamApi* | [**replaceTeam**](docs/TeamApi.md#replaceTeam) | **PUT** /team/{id} | Replace One Team
*TeamApi* | [**updateTeam**](docs/TeamApi.md#updateTeam) | **PATCH** /team/{id} | Update One Team
*TimesheetApi* | [**get**](docs/TimesheetApi.md#get) | **GET** /timesheet/{id} | Get One Timesheet
*TimesheetApi* | [**getMany**](docs/TimesheetApi.md#getMany) | **GET** /timesheet | Get Many Timesheets
*TimesheetEntryApi* | [**createOneEntry**](docs/TimesheetEntryApi.md#createOneEntry) | **POST** /timesheet-entry | Create One TimesheetEntry
*TimesheetEntryApi* | [**deleteOneEntry**](docs/TimesheetEntryApi.md#deleteOneEntry) | **DELETE** /timesheet-entry/{id} | Delete One TimesheetEntry
*TimesheetEntryApi* | [**getOneEntry**](docs/TimesheetEntryApi.md#getOneEntry) | **GET** /timesheet-entry/{id} | Get One TimesheetEntry
*TimesheetEntryApi* | [**listManyEntries**](docs/TimesheetEntryApi.md#listManyEntries) | **GET** /timesheet-entry | Get Many TimesheetEntries
*TimesheetEntryApi* | [**updateOneEntry**](docs/TimesheetEntryApi.md#updateOneEntry) | **PUT** /timesheet-entry/{id} | Replace One TimesheetEntry
*TimesheetEntryApi* | [**updateOneEntry_0**](docs/TimesheetEntryApi.md#updateOneEntry_0) | **PATCH** /timesheet-entry/{id} | Update One TimesheetEntry
*TimesheetEntryTypeApi* | [**getOneTimesheetEntryType**](docs/TimesheetEntryTypeApi.md#getOneTimesheetEntryType) | **GET** /timesheet-entry-type/{id} | Get One TimesheetEntryType
*TimesheetEntryTypeApi* | [**listManyTimesheetEntryTypes**](docs/TimesheetEntryTypeApi.md#listManyTimesheetEntryTypes) | **GET** /timesheet-entry-type | Get Many TimesheetEntryTypes
*WorkWeekApi* | [**createOneWorkweek**](docs/WorkWeekApi.md#createOneWorkweek) | **POST** /work-week | Create One WorkWeek
*WorkWeekApi* | [**deleteOne**](docs/WorkWeekApi.md#deleteOne) | **DELETE** /work-week/{id} | Delete One WorkWeek
*WorkWeekApi* | [**getMany**](docs/WorkWeekApi.md#getMany) | **GET** /work-week | Get Many WorkWeeks
*WorkWeekApi* | [**getOne**](docs/WorkWeekApi.md#getOne) | **GET** /work-week/{id} | Get One WorkWeek
*WorkWeekApi* | [**replaceOne**](docs/WorkWeekApi.md#replaceOne) | **PUT** /work-week/{id} | Replace One WorkWeek
*WorkWeekApi* | [**updateOne**](docs/WorkWeekApi.md#updateOne) | **PATCH** /work-week/{id} | Update One WorkWeek


## Documentation for Models

 - [BankAccountRequest](docs/BankAccountRequest.md)
 - [BankAccountResponse](docs/BankAccountResponse.md)
 - [ChildGetManyFiltersParameter](docs/ChildGetManyFiltersParameter.md)
 - [ChildGetManySortParameter](docs/ChildGetManySortParameter.md)
 - [ChildGetOneResponseMapped](docs/ChildGetOneResponseMapped.md)
 - [ChildResponse](docs/ChildResponse.md)
 - [ChildResponseMapped](docs/ChildResponseMapped.md)
 - [ChildrenGetManyResponseMapped](docs/ChildrenGetManyResponseMapped.md)
 - [CompaniesGetManyResponseMapped](docs/CompaniesGetManyResponseMapped.md)
 - [CompanyGetOneResponseMapped](docs/CompanyGetOneResponseMapped.md)
 - [CompanyListManyCompaniesFiltersParameter](docs/CompanyListManyCompaniesFiltersParameter.md)
 - [CompanyListManyCompaniesFiltersParameterId](docs/CompanyListManyCompaniesFiltersParameterId.md)
 - [CompanyListManyCompaniesSortParameter](docs/CompanyListManyCompaniesSortParameter.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CompensationGetManyCompensationsFiltersParameter](docs/CompensationGetManyCompensationsFiltersParameter.md)
 - [CompensationGetManyCompensationsSortParameter](docs/CompensationGetManyCompensationsSortParameter.md)
 - [CompensationGetOneResponseMapped](docs/CompensationGetOneResponseMapped.md)
 - [CompensationResponse](docs/CompensationResponse.md)
 - [CompensationResponseMapped](docs/CompensationResponseMapped.md)
 - [CompensationsGetManyResponseMapped](docs/CompensationsGetManyResponseMapped.md)
 - [CostCenterGetOneResponseMapped](docs/CostCenterGetOneResponseMapped.md)
 - [CostCenterResponse](docs/CostCenterResponse.md)
 - [CostCenterResponseMapped](docs/CostCenterResponseMapped.md)
 - [CostCentersGetManyResponseMapped](docs/CostCentersGetManyResponseMapped.md)
 - [CostcenterGetManyFiltersParameter](docs/CostcenterGetManyFiltersParameter.md)
 - [CostcenterGetManySortParameter](docs/CostcenterGetManySortParameter.md)
 - [CreateChildRequest](docs/CreateChildRequest.md)
 - [CreateCompensationRequest](docs/CreateCompensationRequest.md)
 - [CreateCostCenterRequest](docs/CreateCostCenterRequest.md)
 - [CreateDepartmentRequest](docs/CreateDepartmentRequest.md)
 - [CreateEmployeeRequest](docs/CreateEmployeeRequest.md)
 - [CreateEmployeeTeamReferenceRequest](docs/CreateEmployeeTeamReferenceRequest.md)
 - [CreateEmploymentRequest](docs/CreateEmploymentRequest.md)
 - [CreateEmploymentTypeRequest](docs/CreateEmploymentTypeRequest.md)
 - [CreateLeaveRequest](docs/CreateLeaveRequest.md)
 - [CreateLeaveTypeRequest](docs/CreateLeaveTypeRequest.md)
 - [CreateOfficeRequest](docs/CreateOfficeRequest.md)
 - [CreateTeamRequest](docs/CreateTeamRequest.md)
 - [CreateTimesheetEntryRequest](docs/CreateTimesheetEntryRequest.md)
 - [CreateWorkWeekRequest](docs/CreateWorkWeekRequest.md)
 - [DepartmentGetOneResponseMapped](docs/DepartmentGetOneResponseMapped.md)
 - [DepartmentListManyDepartmentsFiltersParameter](docs/DepartmentListManyDepartmentsFiltersParameter.md)
 - [DepartmentListManyDepartmentsSortParameter](docs/DepartmentListManyDepartmentsSortParameter.md)
 - [DepartmentRelationsResponse](docs/DepartmentRelationsResponse.md)
 - [DepartmentResponse](docs/DepartmentResponse.md)
 - [DepartmentResponseMapped](docs/DepartmentResponseMapped.md)
 - [DepartmentsGetManyResponseMapped](docs/DepartmentsGetManyResponseMapped.md)
 - [EmergencyContactResponse](docs/EmergencyContactResponse.md)
 - [EmployeeGetManyRelationsResponse](docs/EmployeeGetManyRelationsResponse.md)
 - [EmployeeGetOneRelationsResponse](docs/EmployeeGetOneRelationsResponse.md)
 - [EmployeeGetOneResponseMapped](docs/EmployeeGetOneResponseMapped.md)
 - [EmployeeListManyEmployeesFiltersParameter](docs/EmployeeListManyEmployeesFiltersParameter.md)
 - [EmployeeListManyEmployeesSortParameter](docs/EmployeeListManyEmployeesSortParameter.md)
 - [EmployeeResponse](docs/EmployeeResponse.md)
 - [EmployeeResponseMapped](docs/EmployeeResponseMapped.md)
 - [EmployeeTaxRequest](docs/EmployeeTaxRequest.md)
 - [EmployeeTaxResponse](docs/EmployeeTaxResponse.md)
 - [EmployeeTeamReferenceGetOneResponseMapped](docs/EmployeeTeamReferenceGetOneResponseMapped.md)
 - [EmployeeTeamReferenceRelationsResponse](docs/EmployeeTeamReferenceRelationsResponse.md)
 - [EmployeeTeamReferenceResponse](docs/EmployeeTeamReferenceResponse.md)
 - [EmployeeTeamReferenceResponseMapped](docs/EmployeeTeamReferenceResponseMapped.md)
 - [EmployeeTeamReferencesGetManyResponseMapped](docs/EmployeeTeamReferencesGetManyResponseMapped.md)
 - [EmployeesGetManyResponseMapped](docs/EmployeesGetManyResponseMapped.md)
 - [EmployeeteamreferenceGetManyFiltersParameter](docs/EmployeeteamreferenceGetManyFiltersParameter.md)
 - [EmployeeteamreferenceGetManySortParameter](docs/EmployeeteamreferenceGetManySortParameter.md)
 - [EmploymentGetOneResponseMapped](docs/EmploymentGetOneResponseMapped.md)
 - [EmploymentListManyEmploymentsFiltersParameter](docs/EmploymentListManyEmploymentsFiltersParameter.md)
 - [EmploymentListManyEmploymentsSortParameter](docs/EmploymentListManyEmploymentsSortParameter.md)
 - [EmploymentRelationsResponse](docs/EmploymentRelationsResponse.md)
 - [EmploymentResponse](docs/EmploymentResponse.md)
 - [EmploymentResponseMapped](docs/EmploymentResponseMapped.md)
 - [EmploymentTypeGetOneResponseMapped](docs/EmploymentTypeGetOneResponseMapped.md)
 - [EmploymentTypeResponse](docs/EmploymentTypeResponse.md)
 - [EmploymentTypeResponseMapped](docs/EmploymentTypeResponseMapped.md)
 - [EmploymentTypesGetManyResponseMapped](docs/EmploymentTypesGetManyResponseMapped.md)
 - [EmploymentsGetManyResponseMapped](docs/EmploymentsGetManyResponseMapped.md)
 - [EmploymenttypeGetManyEmploymentTypesFiltersParameter](docs/EmploymenttypeGetManyEmploymentTypesFiltersParameter.md)
 - [EmploymenttypeGetManyEmploymentTypesSortParameter](docs/EmploymenttypeGetManyEmploymentTypesSortParameter.md)
 - [EmptyResponseMapped](docs/EmptyResponseMapped.md)
 - [HomeAddressRequest](docs/HomeAddressRequest.md)
 - [HomeAddressResponse](docs/HomeAddressResponse.md)
 - [LeaveGetManyLeavesFiltersParameter](docs/LeaveGetManyLeavesFiltersParameter.md)
 - [LeaveGetManyLeavesSortParameter](docs/LeaveGetManyLeavesSortParameter.md)
 - [LeaveGetOneResponseMapped](docs/LeaveGetOneResponseMapped.md)
 - [LeaveRelationsResponse](docs/LeaveRelationsResponse.md)
 - [LeaveResponse](docs/LeaveResponse.md)
 - [LeaveResponseMapped](docs/LeaveResponseMapped.md)
 - [LeaveTransactionGetOneResponseMapped](docs/LeaveTransactionGetOneResponseMapped.md)
 - [LeaveTransactionParentResponse](docs/LeaveTransactionParentResponse.md)
 - [LeaveTransactionRelationsResponse](docs/LeaveTransactionRelationsResponse.md)
 - [LeaveTransactionResponse](docs/LeaveTransactionResponse.md)
 - [LeaveTransactionsGetManyResponseMapped](docs/LeaveTransactionsGetManyResponseMapped.md)
 - [LeaveTypeCodeResponse](docs/LeaveTypeCodeResponse.md)
 - [LeaveTypeGetManyRelationsResponse](docs/LeaveTypeGetManyRelationsResponse.md)
 - [LeaveTypeGetOneRelationResponse](docs/LeaveTypeGetOneRelationResponse.md)
 - [LeaveTypeGetOneResponseMapped](docs/LeaveTypeGetOneResponseMapped.md)
 - [LeaveTypeResponse](docs/LeaveTypeResponse.md)
 - [LeaveTypeResponseMapped](docs/LeaveTypeResponseMapped.md)
 - [LeaveTypesGetManyResponseMapped](docs/LeaveTypesGetManyResponseMapped.md)
 - [LeavesGetManyResponseMapped](docs/LeavesGetManyResponseMapped.md)
 - [LeavetransactionListManyTransactionsFiltersParameter](docs/LeavetransactionListManyTransactionsFiltersParameter.md)
 - [LeavetransactionListManyTransactionsSortParameter](docs/LeavetransactionListManyTransactionsSortParameter.md)
 - [LeavetypeGetManyLeaveTypesFiltersParameter](docs/LeavetypeGetManyLeaveTypesFiltersParameter.md)
 - [LeavetypeGetManyLeaveTypesSortParameter](docs/LeavetypeGetManyLeaveTypesSortParameter.md)
 - [OfficeGetOneResponseMapped](docs/OfficeGetOneResponseMapped.md)
 - [OfficeListManyOfficesFiltersParameter](docs/OfficeListManyOfficesFiltersParameter.md)
 - [OfficeListManyOfficesSortParameter](docs/OfficeListManyOfficesSortParameter.md)
 - [OfficeResponse](docs/OfficeResponse.md)
 - [OfficeResponseMapped](docs/OfficeResponseMapped.md)
 - [OfficesGetManyResponseMapped](docs/OfficesGetManyResponseMapped.md)
 - [PointResponse](docs/PointResponse.md)
 - [TeamGetOneResponseMapped](docs/TeamGetOneResponseMapped.md)
 - [TeamListTeamsFiltersParameter](docs/TeamListTeamsFiltersParameter.md)
 - [TeamListTeamsSortParameter](docs/TeamListTeamsSortParameter.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamResponseMapped](docs/TeamResponseMapped.md)
 - [TeamsGetManyResponseMapped](docs/TeamsGetManyResponseMapped.md)
 - [TimesheetEntriesGetManyResponseMapped](docs/TimesheetEntriesGetManyResponseMapped.md)
 - [TimesheetEntryGetOneResponseMapped](docs/TimesheetEntryGetOneResponseMapped.md)
 - [TimesheetEntryRelationsResponse](docs/TimesheetEntryRelationsResponse.md)
 - [TimesheetEntryResponse](docs/TimesheetEntryResponse.md)
 - [TimesheetEntryResponseMapped](docs/TimesheetEntryResponseMapped.md)
 - [TimesheetEntryTypeGetOneResponseMapped](docs/TimesheetEntryTypeGetOneResponseMapped.md)
 - [TimesheetEntryTypeResponse](docs/TimesheetEntryTypeResponse.md)
 - [TimesheetEntryTypesGetManyResponseMapped](docs/TimesheetEntryTypesGetManyResponseMapped.md)
 - [TimesheetGetManyFiltersParameter](docs/TimesheetGetManyFiltersParameter.md)
 - [TimesheetGetManySortParameter](docs/TimesheetGetManySortParameter.md)
 - [TimesheetGetOneResponseMapped](docs/TimesheetGetOneResponseMapped.md)
 - [TimesheetRelationsResponse](docs/TimesheetRelationsResponse.md)
 - [TimesheetResponse](docs/TimesheetResponse.md)
 - [TimesheetentryListManyEntriesFiltersParameter](docs/TimesheetentryListManyEntriesFiltersParameter.md)
 - [TimesheetentryListManyEntriesSortParameter](docs/TimesheetentryListManyEntriesSortParameter.md)
 - [TimesheetentrytypeListManyTimesheetEntryTypesFiltersParameter](docs/TimesheetentrytypeListManyTimesheetEntryTypesFiltersParameter.md)
 - [TimesheetentrytypeListManyTimesheetEntryTypesSortParameter](docs/TimesheetentrytypeListManyTimesheetEntryTypesSortParameter.md)
 - [TimesheetsGetManyResponseMapped](docs/TimesheetsGetManyResponseMapped.md)
 - [UpdateChildRequest](docs/UpdateChildRequest.md)
 - [UpdateCompensationRequest](docs/UpdateCompensationRequest.md)
 - [UpdateCostCenterRequest](docs/UpdateCostCenterRequest.md)
 - [UpdateDepartmentRequest](docs/UpdateDepartmentRequest.md)
 - [UpdateEmployeeRequest](docs/UpdateEmployeeRequest.md)
 - [UpdateEmployeeTeamReferenceRequest](docs/UpdateEmployeeTeamReferenceRequest.md)
 - [UpdateEmploymentRequest](docs/UpdateEmploymentRequest.md)
 - [UpdateEmploymentTypeRequest](docs/UpdateEmploymentTypeRequest.md)
 - [UpdateLeaveRequest](docs/UpdateLeaveRequest.md)
 - [UpdateLeaveTypeRequest](docs/UpdateLeaveTypeRequest.md)
 - [UpdateOfficeRequest](docs/UpdateOfficeRequest.md)
 - [UpdateTeamRequest](docs/UpdateTeamRequest.md)
 - [UpdateTimesheetEntryRequest](docs/UpdateTimesheetEntryRequest.md)
 - [UpdateWorkWeekRequest](docs/UpdateWorkWeekRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [WorkShiftRequest](docs/WorkShiftRequest.md)
 - [WorkShiftResponse](docs/WorkShiftResponse.md)
 - [WorkWeekDayRequest](docs/WorkWeekDayRequest.md)
 - [WorkWeekDayResponse](docs/WorkWeekDayResponse.md)
 - [WorkWeekGetOneResponseMapped](docs/WorkWeekGetOneResponseMapped.md)
 - [WorkWeekRelationsResponse](docs/WorkWeekRelationsResponse.md)
 - [WorkWeekResponse](docs/WorkWeekResponse.md)
 - [WorkWeekResponseMapped](docs/WorkWeekResponseMapped.md)
 - [WorkWeeksGetManyResponseMapped](docs/WorkWeeksGetManyResponseMapped.md)
 - [WorkweekGetManyFiltersParameter](docs/WorkweekGetManyFiltersParameter.md)
 - [WorkweekGetManySortParameter](docs/WorkweekGetManySortParameter.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
