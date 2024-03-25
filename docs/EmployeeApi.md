# EmployeeApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneEmployee**](EmployeeApi.md#createOneEmployee) | **POST** /employee | Create One Employee |
| [**getOne**](EmployeeApi.md#getOne) | **GET** /employee/{id} | Get One Employee |
| [**listManyEmployees**](EmployeeApi.md#listManyEmployees) | **GET** /employee | Get Many Employees |
| [**removeEmployee**](EmployeeApi.md#removeEmployee) | **DELETE** /employee/{id} | Delete One Employee |
| [**replaceOneEmployee**](EmployeeApi.md#replaceOneEmployee) | **PUT** /employee/{id} | Replace One Employee |
| [**updateOne**](EmployeeApi.md#updateOne) | **PATCH** /employee/{id} | Update One Employee |


<a name="createOneEmployee"></a>
# **createOneEmployee**
> EmployeeResponseMapped createOneEmployee(createEmployeeRequest).execute();

Create One Employee

Create One Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String title = "title_example";
    String officeId = "officeId_example";
    String managerEmployeeId = "managerEmployeeId_example";
    String departmentId = "departmentId_example";
    String costCenterId = "costCenterId_example";
    String userName = "userName_example";
    String division = "division_example";
    String organization = "organization_example";
    String employeeNumber = "employeeNumber_example";
    EmployeeTaxRequest tax = new EmployeeTaxRequest();
    String workEmail = "workEmail_example";
    String workPhone = "workPhone_example";
    Boolean hasOccupationalPension = true;
    String privateEmail = "privateEmail_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String ssn = "ssn_example";
    String privatePhone = "privatePhone_example";
    String birthDate = "birthDate_example";
    String avatarUrl = "avatarUrl_example";
    String nationality = "nationality_example";
    String gender = "gender_example";
    String pronoun = "pronoun_example";
    BankAccountRequest bankAccount = new BankAccountRequest();
    HomeAddressRequest homeAddress = new HomeAddressRequest();
    Object custom = null;
    try {
      EmployeeResponseMapped result = client
              .employee
              .createOneEmployee()
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#createOneEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeResponseMapped> response = client
              .employee
              .createOneEmployee()
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#createOneEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmployeeRequest** | [**CreateEmployeeRequest**](CreateEmployeeRequest.md)|  | |

### Return type

[**EmployeeResponseMapped**](EmployeeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getOne"></a>
# **getOne**
> EmployeeGetOneResponseMapped getOne(id).select(select).relations(relations).execute();

Get One Employee

Get One Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    List<String> select = Arrays.asList(); // Select Employee fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Employee resources, comma-separated. (e.g. `relations=office,department`)
    try {
      EmployeeGetOneResponseMapped result = client
              .employee
              .getOne(id)
              .select(select)
              .relations(relations)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGetOneResponseMapped> response = client
              .employee
              .getOne(id)
              .select(select)
              .relations(relations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Resource Id | |
| **select** | [**List&lt;String&gt;**](String.md)| Select Employee fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, title, active, companyId, officeId, managerEmployeeId, departmentId, costCenterId, employmentId, employmentTypeId, employmentCountry, compensationId, userId, userName, division, organization, employeeNumber, workEmail, workPhone, workPhoneSanitized, hireDate, endDate, hasOccupationalPension, privateEmail, firstName, lastName, ssn, privatePhone, privatePhoneSanitized, birthDate, age, nationality, gender, pronoun, created, updated] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Employee resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: office, costCenter, effectiveCostCenter, child, department, emergencyContact, employment, employmentType, compensation, managerEmployee, teamReference] |

### Return type

[**EmployeeGetOneResponseMapped**](EmployeeGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listManyEmployees"></a>
# **listManyEmployees**
> EmployeesGetManyResponseMapped listManyEmployees().select(select).relations(relations).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many Employees

Get Many Employees

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    List<String> select = Arrays.asList(); // Select Employee fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Employee resources, comma-separated. (e.g. `relations=office,department`)
    EmployeeListManyEmployeesFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received Employees. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received Employees. (e.g. `offset=20`)
    EmployeeListManyEmployeesSortParameter sort = new HashMap(); // Sort received Employees by field. (e.g. `sort[id]=asc`)
    try {
      EmployeesGetManyResponseMapped result = client
              .employee
              .listManyEmployees()
              .select(select)
              .relations(relations)
              .filters(filters)
              .limit(limit)
              .offset(offset)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getTotal());
      System.out.println(result.getCount());
      System.out.println(result.getOffset());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listManyEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetManyResponseMapped> response = client
              .employee
              .listManyEmployees()
              .select(select)
              .relations(relations)
              .filters(filters)
              .limit(limit)
              .offset(offset)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listManyEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **select** | [**List&lt;String&gt;**](String.md)| Select Employee fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, title, active, companyId, officeId, managerEmployeeId, departmentId, costCenterId, employmentId, employmentTypeId, employmentCountry, compensationId, userId, userName, division, organization, employeeNumber, workEmail, workPhone, workPhoneSanitized, hireDate, endDate, hasOccupationalPension, privateEmail, firstName, lastName, ssn, privatePhone, privatePhoneSanitized, birthDate, age, nationality, gender, pronoun, created, updated] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Employee resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: office, costCenter, effectiveCostCenter, child, department, emergencyContact, employment, employmentType, compensation, managerEmployee, teamReference] |
| **filters** | [**EmployeeListManyEmployeesFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received Employees. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received Employees. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**EmployeeListManyEmployeesSortParameter**](.md)| Sort received Employees by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**EmployeesGetManyResponseMapped**](EmployeesGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeEmployee"></a>
# **removeEmployee**
> EmptyResponseMapped removeEmployee(id).execute();

Delete One Employee

Delete One Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    try {
      EmptyResponseMapped result = client
              .employee
              .removeEmployee(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#removeEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .employee
              .removeEmployee(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#removeEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Resource Id | |

### Return type

[**EmptyResponseMapped**](EmptyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="replaceOneEmployee"></a>
# **replaceOneEmployee**
> EmployeeResponseMapped replaceOneEmployee(id, updateEmployeeRequest).execute();

Replace One Employee

Replace One Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    String title = "title_example";
    String officeId = "officeId_example";
    String managerEmployeeId = "managerEmployeeId_example";
    String departmentId = "departmentId_example";
    String costCenterId = "costCenterId_example";
    String userName = "userName_example";
    String division = "division_example";
    String organization = "organization_example";
    String employeeNumber = "employeeNumber_example";
    EmployeeTaxRequest tax = new EmployeeTaxRequest();
    String workEmail = "workEmail_example";
    String workPhone = "workPhone_example";
    Boolean hasOccupationalPension = true;
    String privateEmail = "privateEmail_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String ssn = "ssn_example";
    String privatePhone = "privatePhone_example";
    String birthDate = "birthDate_example";
    String avatarUrl = "avatarUrl_example";
    String nationality = "nationality_example";
    String gender = "gender_example";
    String pronoun = "pronoun_example";
    BankAccountRequest bankAccount = new BankAccountRequest();
    HomeAddressRequest homeAddress = new HomeAddressRequest();
    Object custom = null;
    Boolean active = true;
    try {
      EmployeeResponseMapped result = client
              .employee
              .replaceOneEmployee(id)
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#replaceOneEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeResponseMapped> response = client
              .employee
              .replaceOneEmployee(id)
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#replaceOneEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Resource Id | |
| **updateEmployeeRequest** | [**UpdateEmployeeRequest**](UpdateEmployeeRequest.md)|  | |

### Return type

[**EmployeeResponseMapped**](EmployeeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOne"></a>
# **updateOne**
> EmployeeResponseMapped updateOne(id, updateEmployeeRequest).execute();

Update One Employee

Update One Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    String title = "title_example";
    String officeId = "officeId_example";
    String managerEmployeeId = "managerEmployeeId_example";
    String departmentId = "departmentId_example";
    String costCenterId = "costCenterId_example";
    String userName = "userName_example";
    String division = "division_example";
    String organization = "organization_example";
    String employeeNumber = "employeeNumber_example";
    EmployeeTaxRequest tax = new EmployeeTaxRequest();
    String workEmail = "workEmail_example";
    String workPhone = "workPhone_example";
    Boolean hasOccupationalPension = true;
    String privateEmail = "privateEmail_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String ssn = "ssn_example";
    String privatePhone = "privatePhone_example";
    String birthDate = "birthDate_example";
    String avatarUrl = "avatarUrl_example";
    String nationality = "nationality_example";
    String gender = "gender_example";
    String pronoun = "pronoun_example";
    BankAccountRequest bankAccount = new BankAccountRequest();
    HomeAddressRequest homeAddress = new HomeAddressRequest();
    Object custom = null;
    Boolean active = true;
    try {
      EmployeeResponseMapped result = client
              .employee
              .updateOne(id)
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeResponseMapped> response = client
              .employee
              .updateOne(id)
              .title(title)
              .officeId(officeId)
              .managerEmployeeId(managerEmployeeId)
              .departmentId(departmentId)
              .costCenterId(costCenterId)
              .userName(userName)
              .division(division)
              .organization(organization)
              .employeeNumber(employeeNumber)
              .tax(tax)
              .workEmail(workEmail)
              .workPhone(workPhone)
              .hasOccupationalPension(hasOccupationalPension)
              .privateEmail(privateEmail)
              .firstName(firstName)
              .lastName(lastName)
              .ssn(ssn)
              .privatePhone(privatePhone)
              .birthDate(birthDate)
              .avatarUrl(avatarUrl)
              .nationality(nationality)
              .gender(gender)
              .pronoun(pronoun)
              .bankAccount(bankAccount)
              .homeAddress(homeAddress)
              .custom(custom)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Resource Id | |
| **updateEmployeeRequest** | [**UpdateEmployeeRequest**](UpdateEmployeeRequest.md)|  | |

### Return type

[**EmployeeResponseMapped**](EmployeeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

