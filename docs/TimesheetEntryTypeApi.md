# TimesheetEntryTypeApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOneTimesheetEntryType**](TimesheetEntryTypeApi.md#getOneTimesheetEntryType) | **GET** /timesheet-entry-type/{id} | Get One TimesheetEntryType |
| [**listManyTimesheetEntryTypes**](TimesheetEntryTypeApi.md#listManyTimesheetEntryTypes) | **GET** /timesheet-entry-type | Get Many TimesheetEntryTypes |


<a name="getOneTimesheetEntryType"></a>
# **getOneTimesheetEntryType**
> TimesheetEntryTypeGetOneResponseMapped getOneTimesheetEntryType(id).select(select).execute();

Get One TimesheetEntryType

Get One TimesheetEntryType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetEntryTypeApi;
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
    List<String> select = Arrays.asList(); // Select TimesheetEntryType fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    try {
      TimesheetEntryTypeGetOneResponseMapped result = client
              .timesheetEntryType
              .getOneTimesheetEntryType(id)
              .select(select)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetEntryTypeApi#getOneTimesheetEntryType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetEntryTypeGetOneResponseMapped> response = client
              .timesheetEntryType
              .getOneTimesheetEntryType(id)
              .select(select)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetEntryTypeApi#getOneTimesheetEntryType");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select TimesheetEntryType fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, name, kind] |

### Return type

[**TimesheetEntryTypeGetOneResponseMapped**](TimesheetEntryTypeGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listManyTimesheetEntryTypes"></a>
# **listManyTimesheetEntryTypes**
> TimesheetEntryTypesGetManyResponseMapped listManyTimesheetEntryTypes().select(select).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many TimesheetEntryTypes

Get Many TimesheetEntryTypes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetEntryTypeApi;
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
    List<String> select = Arrays.asList(); // Select TimesheetEntryType fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    TimesheetentrytypeListManyTimesheetEntryTypesFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received TimesheetEntryTypes. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received TimesheetEntryTypes. (e.g. `offset=20`)
    TimesheetentrytypeListManyTimesheetEntryTypesSortParameter sort = new HashMap(); // Sort received TimesheetEntryTypes by field. (e.g. `sort[id]=asc`)
    try {
      TimesheetEntryTypesGetManyResponseMapped result = client
              .timesheetEntryType
              .listManyTimesheetEntryTypes()
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
      System.err.println("Exception when calling TimesheetEntryTypeApi#listManyTimesheetEntryTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetEntryTypesGetManyResponseMapped> response = client
              .timesheetEntryType
              .listManyTimesheetEntryTypes()
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
      System.err.println("Exception when calling TimesheetEntryTypeApi#listManyTimesheetEntryTypes");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select TimesheetEntryType fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, name, kind] |
| **filters** | [**TimesheetentrytypeListManyTimesheetEntryTypesFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received TimesheetEntryTypes. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received TimesheetEntryTypes. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**TimesheetentrytypeListManyTimesheetEntryTypesSortParameter**](.md)| Sort received TimesheetEntryTypes by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**TimesheetEntryTypesGetManyResponseMapped**](TimesheetEntryTypesGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

