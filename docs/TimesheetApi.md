# TimesheetApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](TimesheetApi.md#get) | **GET** /timesheet/{id} | Get One Timesheet |
| [**getMany**](TimesheetApi.md#getMany) | **GET** /timesheet | Get Many Timesheets |


<a name="get"></a>
# **get**
> TimesheetGetOneResponseMapped get(id).select(select).relations(relations).execute();

Get One Timesheet

Get One Timesheet

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetApi;
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
    List<String> select = Arrays.asList(); // Select Timesheet fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Timesheet resources, comma-separated. (e.g. `relations=office,department`)
    try {
      TimesheetGetOneResponseMapped result = client
              .timesheet
              .get(id)
              .select(select)
              .relations(relations)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetGetOneResponseMapped> response = client
              .timesheet
              .get(id)
              .select(select)
              .relations(relations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetApi#get");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Timesheet fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, status, startDate, endDate, localCutOffDate, utcCutOffDate, approvalDeadlineDate, interval, note, approverEmployeeId, employeeId, submitDate, approvalDate, rejectedDate, updated, timezone] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Timesheet resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: approverEmployee, employee] |

### Return type

[**TimesheetGetOneResponseMapped**](TimesheetGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getMany"></a>
# **getMany**
> TimesheetsGetManyResponseMapped getMany().select(select).relations(relations).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many Timesheets

Get Many Timesheets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetApi;
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
    List<String> select = Arrays.asList(); // Select Timesheet fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Timesheet resources, comma-separated. (e.g. `relations=office,department`)
    TimesheetGetManyFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received Timesheets. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received Timesheets. (e.g. `offset=20`)
    TimesheetGetManySortParameter sort = new HashMap(); // Sort received Timesheets by field. (e.g. `sort[id]=asc`)
    try {
      TimesheetsGetManyResponseMapped result = client
              .timesheet
              .getMany()
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
      System.err.println("Exception when calling TimesheetApi#getMany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsGetManyResponseMapped> response = client
              .timesheet
              .getMany()
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
      System.err.println("Exception when calling TimesheetApi#getMany");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Timesheet fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, status, startDate, endDate, localCutOffDate, utcCutOffDate, approvalDeadlineDate, interval, note, approverEmployeeId, employeeId, submitDate, approvalDate, rejectedDate, updated, timezone] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Timesheet resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: approverEmployee, employee] |
| **filters** | [**TimesheetGetManyFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received Timesheets. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received Timesheets. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**TimesheetGetManySortParameter**](.md)| Sort received Timesheets by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**TimesheetsGetManyResponseMapped**](TimesheetsGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

