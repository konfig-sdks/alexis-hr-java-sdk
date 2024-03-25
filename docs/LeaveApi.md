# LeaveApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOne**](LeaveApi.md#createOne) | **POST** /leave | Create One Leave |
| [**deleteOneLeave**](LeaveApi.md#deleteOneLeave) | **DELETE** /leave/{id} | Delete One Leave |
| [**getManyLeaves**](LeaveApi.md#getManyLeaves) | **GET** /leave | Get Many Leaves |
| [**getOneLeave**](LeaveApi.md#getOneLeave) | **GET** /leave/{id} | Get One Leave |
| [**replaceOne**](LeaveApi.md#replaceOne) | **PUT** /leave/{id} | Replace One Leave |
| [**updateOneLeave**](LeaveApi.md#updateOneLeave) | **PATCH** /leave/{id} | Update One Leave |


<a name="createOne"></a>
# **createOne**
> LeaveResponseMapped createOne(createLeaveRequest).execute();

Create One Leave

Create One Leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
    String typeId = "typeId_example";
    String duration = "minutes";
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    String description = "description_example";
    String childId = "childId_example";
    Double extent = 3.4D;
    Object morning = null;
    Object afternoon = null;
    try {
      LeaveResponseMapped result = client
              .leave
              .createOne(employeeId, typeId, duration, startDate, endDate)
              .description(description)
              .childId(childId)
              .extent(extent)
              .morning(morning)
              .afternoon(afternoon)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#createOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveResponseMapped> response = client
              .leave
              .createOne(employeeId, typeId, duration, startDate, endDate)
              .description(description)
              .childId(childId)
              .extent(extent)
              .morning(morning)
              .afternoon(afternoon)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#createOne");
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
| **createLeaveRequest** | [**CreateLeaveRequest**](CreateLeaveRequest.md)|  | |

### Return type

[**LeaveResponseMapped**](LeaveResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteOneLeave"></a>
# **deleteOneLeave**
> EmptyResponseMapped deleteOneLeave(id).execute();

Delete One Leave

Delete One Leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
              .leave
              .deleteOneLeave(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#deleteOneLeave");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .leave
              .deleteOneLeave(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#deleteOneLeave");
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

<a name="getManyLeaves"></a>
# **getManyLeaves**
> LeavesGetManyResponseMapped getManyLeaves().select(select).relations(relations).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many Leaves

Get Many Leaves

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
    List<String> select = Arrays.asList(); // Select Leave fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Leave resources, comma-separated. (e.g. `relations=office,department`)
    LeaveGetManyLeavesFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received Leaves. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received Leaves. (e.g. `offset=20`)
    LeaveGetManyLeavesSortParameter sort = new HashMap(); // Sort received Leaves by field. (e.g. `sort[id]=asc`)
    try {
      LeavesGetManyResponseMapped result = client
              .leave
              .getManyLeaves()
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
      System.err.println("Exception when calling LeaveApi#getManyLeaves");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeavesGetManyResponseMapped> response = client
              .leave
              .getManyLeaves()
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
      System.err.println("Exception when calling LeaveApi#getManyLeaves");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Leave fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, employeeId, typeId, status, duration, startDate, endDate] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Leave resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: type, employee] |
| **filters** | [**LeaveGetManyLeavesFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received Leaves. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received Leaves. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**LeaveGetManyLeavesSortParameter**](.md)| Sort received Leaves by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**LeavesGetManyResponseMapped**](LeavesGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getOneLeave"></a>
# **getOneLeave**
> LeaveGetOneResponseMapped getOneLeave(id).select(select).relations(relations).execute();

Get One Leave

Get One Leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
    List<String> select = Arrays.asList(); // Select Leave fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related Leave resources, comma-separated. (e.g. `relations=office,department`)
    try {
      LeaveGetOneResponseMapped result = client
              .leave
              .getOneLeave(id)
              .select(select)
              .relations(relations)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#getOneLeave");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveGetOneResponseMapped> response = client
              .leave
              .getOneLeave(id)
              .select(select)
              .relations(relations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#getOneLeave");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Leave fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, employeeId, typeId, status, duration, startDate, endDate] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related Leave resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: type, employee] |

### Return type

[**LeaveGetOneResponseMapped**](LeaveGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="replaceOne"></a>
# **replaceOne**
> LeaveResponseMapped replaceOne(id, updateLeaveRequest).execute();

Replace One Leave

Replace One Leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
    Double extent = 3.4D;
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    String description = "description_example";
    String childId = "childId_example";
    String duration = "minutes";
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    Boolean morning = true;
    Boolean afternoon = true;
    String status = "status_example";
    String approvalNote = "approvalNote_example";
    try {
      LeaveResponseMapped result = client
              .leave
              .replaceOne(extent, id)
              .description(description)
              .childId(childId)
              .duration(duration)
              .startDate(startDate)
              .endDate(endDate)
              .morning(morning)
              .afternoon(afternoon)
              .status(status)
              .approvalNote(approvalNote)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#replaceOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveResponseMapped> response = client
              .leave
              .replaceOne(extent, id)
              .description(description)
              .childId(childId)
              .duration(duration)
              .startDate(startDate)
              .endDate(endDate)
              .morning(morning)
              .afternoon(afternoon)
              .status(status)
              .approvalNote(approvalNote)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#replaceOne");
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
| **updateLeaveRequest** | [**UpdateLeaveRequest**](UpdateLeaveRequest.md)|  | |

### Return type

[**LeaveResponseMapped**](LeaveResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOneLeave"></a>
# **updateOneLeave**
> LeaveResponseMapped updateOneLeave(id, updateLeaveRequest).execute();

Update One Leave

Update One Leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveApi;
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
    Double extent = 3.4D;
    String id = "507f1f77bcf86cd799439011"; // Resource Id
    String description = "description_example";
    String childId = "childId_example";
    String duration = "minutes";
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    Boolean morning = true;
    Boolean afternoon = true;
    String status = "status_example";
    String approvalNote = "approvalNote_example";
    try {
      LeaveResponseMapped result = client
              .leave
              .updateOneLeave(extent, id)
              .description(description)
              .childId(childId)
              .duration(duration)
              .startDate(startDate)
              .endDate(endDate)
              .morning(morning)
              .afternoon(afternoon)
              .status(status)
              .approvalNote(approvalNote)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#updateOneLeave");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveResponseMapped> response = client
              .leave
              .updateOneLeave(extent, id)
              .description(description)
              .childId(childId)
              .duration(duration)
              .startDate(startDate)
              .endDate(endDate)
              .morning(morning)
              .afternoon(afternoon)
              .status(status)
              .approvalNote(approvalNote)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveApi#updateOneLeave");
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
| **updateLeaveRequest** | [**UpdateLeaveRequest**](UpdateLeaveRequest.md)|  | |

### Return type

[**LeaveResponseMapped**](LeaveResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

