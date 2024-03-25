# CompensationApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneCompensation**](CompensationApi.md#createOneCompensation) | **POST** /compensation | Create One Compensation |
| [**deleteOne**](CompensationApi.md#deleteOne) | **DELETE** /compensation/{id} | Delete One Compensation |
| [**getManyCompensations**](CompensationApi.md#getManyCompensations) | **GET** /compensation | Get Many Compensations |
| [**getOne**](CompensationApi.md#getOne) | **GET** /compensation/{id} | Get One Compensation |
| [**replaceOneCompensation**](CompensationApi.md#replaceOneCompensation) | **PUT** /compensation/{id} | Replace One Compensation |
| [**updateOne**](CompensationApi.md#updateOne) | **PATCH** /compensation/{id} | Update One Compensation |


<a name="createOneCompensation"></a>
# **createOneCompensation**
> CompensationResponseMapped createOneCompensation(createCompensationRequest).execute();

Create One Compensation

Create One Compensation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
    String userId = "userId_example";
    Double amount = 3.4D;
    String effectiveDate = "effectiveDate_example";
    String currency = "SEK";
    Double payoutDay = 3.4D;
    String payoutPeriod = "HOURLY";
    String payoutFrequency = "WEEK";
    Boolean paidOvertime = true;
    String companyId = "companyId_example";
    String salarySchedule = "ADVANCE";
    String note = "note_example";
    try {
      CompensationResponseMapped result = client
              .compensation
              .createOneCompensation(employeeId, userId, amount, effectiveDate, currency, payoutDay, payoutPeriod, payoutFrequency, paidOvertime)
              .companyId(companyId)
              .salarySchedule(salarySchedule)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#createOneCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationResponseMapped> response = client
              .compensation
              .createOneCompensation(employeeId, userId, amount, effectiveDate, currency, payoutDay, payoutPeriod, payoutFrequency, paidOvertime)
              .companyId(companyId)
              .salarySchedule(salarySchedule)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#createOneCompensation");
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
| **createCompensationRequest** | [**CreateCompensationRequest**](CreateCompensationRequest.md)|  | |

### Return type

[**CompensationResponseMapped**](CompensationResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteOne"></a>
# **deleteOne**
> EmptyResponseMapped deleteOne(id).execute();

Delete One Compensation

Delete One Compensation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
              .compensation
              .deleteOne(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#deleteOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .compensation
              .deleteOne(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#deleteOne");
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

<a name="getManyCompensations"></a>
# **getManyCompensations**
> CompensationsGetManyResponseMapped getManyCompensations().select(select).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many Compensations

Get Many Compensations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
    List<String> select = Arrays.asList(); // Select Compensation fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    CompensationGetManyCompensationsFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received Compensations. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received Compensations. (e.g. `offset=20`)
    CompensationGetManyCompensationsSortParameter sort = new HashMap(); // Sort received Compensations by field. (e.g. `sort[id]=asc`)
    try {
      CompensationsGetManyResponseMapped result = client
              .compensation
              .getManyCompensations()
              .select(select)
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
      System.err.println("Exception when calling CompensationApi#getManyCompensations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationsGetManyResponseMapped> response = client
              .compensation
              .getManyCompensations()
              .select(select)
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
      System.err.println("Exception when calling CompensationApi#getManyCompensations");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Compensation fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, employeeId, companyId, amount, effectiveDate, baseAmount, exchangeRate, currency, payoutDay, payoutPeriod, payoutFrequency, salarySchedule, paidOvertime, note] |
| **filters** | [**CompensationGetManyCompensationsFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received Compensations. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received Compensations. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**CompensationGetManyCompensationsSortParameter**](.md)| Sort received Compensations by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**CompensationsGetManyResponseMapped**](CompensationsGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getOne"></a>
# **getOne**
> CompensationGetOneResponseMapped getOne(id).select(select).execute();

Get One Compensation

Get One Compensation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
    List<String> select = Arrays.asList(); // Select Compensation fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    try {
      CompensationGetOneResponseMapped result = client
              .compensation
              .getOne(id)
              .select(select)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationGetOneResponseMapped> response = client
              .compensation
              .getOne(id)
              .select(select)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getOne");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Compensation fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, employeeId, companyId, amount, effectiveDate, baseAmount, exchangeRate, currency, payoutDay, payoutPeriod, payoutFrequency, salarySchedule, paidOvertime, note] |

### Return type

[**CompensationGetOneResponseMapped**](CompensationGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="replaceOneCompensation"></a>
# **replaceOneCompensation**
> CompensationResponseMapped replaceOneCompensation(id, updateCompensationRequest).execute();

Replace One Compensation

Replace One Compensation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
    String employeeId = "employeeId_example";
    String userId = "userId_example";
    Double amount = 3.4D;
    String currency = "SEK";
    Double payoutDay = 3.4D;
    String payoutPeriod = "HOURLY";
    String payoutFrequency = "WEEK";
    String salarySchedule = "ADVANCE";
    Boolean paidOvertime = true;
    String note = "note_example";
    try {
      CompensationResponseMapped result = client
              .compensation
              .replaceOneCompensation(id)
              .employeeId(employeeId)
              .userId(userId)
              .amount(amount)
              .currency(currency)
              .payoutDay(payoutDay)
              .payoutPeriod(payoutPeriod)
              .payoutFrequency(payoutFrequency)
              .salarySchedule(salarySchedule)
              .paidOvertime(paidOvertime)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#replaceOneCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationResponseMapped> response = client
              .compensation
              .replaceOneCompensation(id)
              .employeeId(employeeId)
              .userId(userId)
              .amount(amount)
              .currency(currency)
              .payoutDay(payoutDay)
              .payoutPeriod(payoutPeriod)
              .payoutFrequency(payoutFrequency)
              .salarySchedule(salarySchedule)
              .paidOvertime(paidOvertime)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#replaceOneCompensation");
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
| **updateCompensationRequest** | [**UpdateCompensationRequest**](UpdateCompensationRequest.md)|  | |

### Return type

[**CompensationResponseMapped**](CompensationResponseMapped.md)

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
> CompensationResponseMapped updateOne(id, updateCompensationRequest).execute();

Update One Compensation

Update One Compensation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
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
    String employeeId = "employeeId_example";
    String userId = "userId_example";
    Double amount = 3.4D;
    String currency = "SEK";
    Double payoutDay = 3.4D;
    String payoutPeriod = "HOURLY";
    String payoutFrequency = "WEEK";
    String salarySchedule = "ADVANCE";
    Boolean paidOvertime = true;
    String note = "note_example";
    try {
      CompensationResponseMapped result = client
              .compensation
              .updateOne(id)
              .employeeId(employeeId)
              .userId(userId)
              .amount(amount)
              .currency(currency)
              .payoutDay(payoutDay)
              .payoutPeriod(payoutPeriod)
              .payoutFrequency(payoutFrequency)
              .salarySchedule(salarySchedule)
              .paidOvertime(paidOvertime)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#updateOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationResponseMapped> response = client
              .compensation
              .updateOne(id)
              .employeeId(employeeId)
              .userId(userId)
              .amount(amount)
              .currency(currency)
              .payoutDay(payoutDay)
              .payoutPeriod(payoutPeriod)
              .payoutFrequency(payoutFrequency)
              .salarySchedule(salarySchedule)
              .paidOvertime(paidOvertime)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#updateOne");
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
| **updateCompensationRequest** | [**UpdateCompensationRequest**](UpdateCompensationRequest.md)|  | |

### Return type

[**CompensationResponseMapped**](CompensationResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

