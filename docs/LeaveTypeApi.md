# LeaveTypeApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneLeaveType**](LeaveTypeApi.md#createOneLeaveType) | **POST** /leave-type | Create One LeaveType |
| [**deleteOneLeaveType**](LeaveTypeApi.md#deleteOneLeaveType) | **DELETE** /leave-type/{id} | Delete One LeaveType |
| [**getManyLeaveTypes**](LeaveTypeApi.md#getManyLeaveTypes) | **GET** /leave-type | Get Many LeaveTypes |
| [**getOneLeaveType**](LeaveTypeApi.md#getOneLeaveType) | **GET** /leave-type/{id} | Get One LeaveType |
| [**replaceLeaveType**](LeaveTypeApi.md#replaceLeaveType) | **PUT** /leave-type/{id} | Replace One LeaveType |
| [**updateOneLeaveType**](LeaveTypeApi.md#updateOneLeaveType) | **PATCH** /leave-type/{id} | Update One LeaveType |


<a name="createOneLeaveType"></a>
# **createOneLeaveType**
> LeaveTypeResponseMapped createOneLeaveType(createLeaveTypeRequest).execute();

Create One LeaveType

Create One LeaveType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
    String name = "name_example";
    String kind = "kind_example";
    String minimumDuration = "minimumDuration_example";
    Boolean deductible = true;
    Boolean paid = true;
    Boolean disabled = true;
    Boolean archived = true;
    try {
      LeaveTypeResponseMapped result = client
              .leaveType
              .createOneLeaveType(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#createOneLeaveType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveTypeResponseMapped> response = client
              .leaveType
              .createOneLeaveType(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#createOneLeaveType");
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
| **createLeaveTypeRequest** | [**CreateLeaveTypeRequest**](CreateLeaveTypeRequest.md)|  | |

### Return type

[**LeaveTypeResponseMapped**](LeaveTypeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteOneLeaveType"></a>
# **deleteOneLeaveType**
> EmptyResponseMapped deleteOneLeaveType(id).execute();

Delete One LeaveType

Delete One LeaveType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
              .leaveType
              .deleteOneLeaveType(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#deleteOneLeaveType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .leaveType
              .deleteOneLeaveType(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#deleteOneLeaveType");
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

<a name="getManyLeaveTypes"></a>
# **getManyLeaveTypes**
> LeaveTypesGetManyResponseMapped getManyLeaveTypes().select(select).relations(relations).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many LeaveTypes

Get Many LeaveTypes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
    List<String> select = Arrays.asList(); // Select LeaveType fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related LeaveType resources, comma-separated. (e.g. `relations=office,department`)
    LeavetypeGetManyLeaveTypesFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received LeaveTypes. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received LeaveTypes. (e.g. `offset=20`)
    LeavetypeGetManyLeaveTypesSortParameter sort = new HashMap(); // Sort received LeaveTypes by field. (e.g. `sort[id]=asc`)
    try {
      LeaveTypesGetManyResponseMapped result = client
              .leaveType
              .getManyLeaveTypes()
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
      System.err.println("Exception when calling LeaveTypeApi#getManyLeaveTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveTypesGetManyResponseMapped> response = client
              .leaveType
              .getManyLeaveTypes()
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
      System.err.println("Exception when calling LeaveTypeApi#getManyLeaveTypes");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select LeaveType fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, name, kind, minimumDuration, deductible, paid, disabled, archived] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related LeaveType resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: leaveTypeCode] |
| **filters** | [**LeavetypeGetManyLeaveTypesFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received LeaveTypes. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received LeaveTypes. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**LeavetypeGetManyLeaveTypesSortParameter**](.md)| Sort received LeaveTypes by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**LeaveTypesGetManyResponseMapped**](LeaveTypesGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getOneLeaveType"></a>
# **getOneLeaveType**
> LeaveTypeGetOneResponseMapped getOneLeaveType(id).select(select).relations(relations).execute();

Get One LeaveType

Get One LeaveType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
    List<String> select = Arrays.asList(); // Select LeaveType fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related LeaveType resources, comma-separated. (e.g. `relations=office,department`)
    try {
      LeaveTypeGetOneResponseMapped result = client
              .leaveType
              .getOneLeaveType(id)
              .select(select)
              .relations(relations)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#getOneLeaveType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveTypeGetOneResponseMapped> response = client
              .leaveType
              .getOneLeaveType(id)
              .select(select)
              .relations(relations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#getOneLeaveType");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select LeaveType fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, name, kind, minimumDuration, deductible, paid, disabled, archived] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related LeaveType resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: leaveTypeCode] |

### Return type

[**LeaveTypeGetOneResponseMapped**](LeaveTypeGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="replaceLeaveType"></a>
# **replaceLeaveType**
> LeaveTypeResponseMapped replaceLeaveType(id, updateLeaveTypeRequest).execute();

Replace One LeaveType

Replace One LeaveType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
    String name = "name_example";
    String kind = "kind_example";
    String minimumDuration = "minimumDuration_example";
    Boolean deductible = true;
    Boolean paid = true;
    Boolean disabled = true;
    Boolean archived = true;
    try {
      LeaveTypeResponseMapped result = client
              .leaveType
              .replaceLeaveType(id)
              .name(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#replaceLeaveType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveTypeResponseMapped> response = client
              .leaveType
              .replaceLeaveType(id)
              .name(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#replaceLeaveType");
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
| **updateLeaveTypeRequest** | [**UpdateLeaveTypeRequest**](UpdateLeaveTypeRequest.md)|  | |

### Return type

[**LeaveTypeResponseMapped**](LeaveTypeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOneLeaveType"></a>
# **updateOneLeaveType**
> LeaveTypeResponseMapped updateOneLeaveType(id, updateLeaveTypeRequest).execute();

Update One LeaveType

Update One LeaveType

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveTypeApi;
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
    String name = "name_example";
    String kind = "kind_example";
    String minimumDuration = "minimumDuration_example";
    Boolean deductible = true;
    Boolean paid = true;
    Boolean disabled = true;
    Boolean archived = true;
    try {
      LeaveTypeResponseMapped result = client
              .leaveType
              .updateOneLeaveType(id)
              .name(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#updateOneLeaveType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveTypeResponseMapped> response = client
              .leaveType
              .updateOneLeaveType(id)
              .name(name)
              .kind(kind)
              .minimumDuration(minimumDuration)
              .deductible(deductible)
              .paid(paid)
              .disabled(disabled)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveTypeApi#updateOneLeaveType");
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
| **updateLeaveTypeRequest** | [**UpdateLeaveTypeRequest**](UpdateLeaveTypeRequest.md)|  | |

### Return type

[**LeaveTypeResponseMapped**](LeaveTypeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

