# EmployeeTeamReferenceApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneEmployeeTeamReference**](EmployeeTeamReferenceApi.md#createOneEmployeeTeamReference) | **POST** /employee-team-reference | Create One EmployeeTeamReference |
| [**deleteOne**](EmployeeTeamReferenceApi.md#deleteOne) | **DELETE** /employee-team-reference/{id} | Delete One EmployeeTeamReference |
| [**getMany**](EmployeeTeamReferenceApi.md#getMany) | **GET** /employee-team-reference | Get Many EmployeeTeamReferences |
| [**getOneEmployeeTeamReference**](EmployeeTeamReferenceApi.md#getOneEmployeeTeamReference) | **GET** /employee-team-reference/{id} | Get One EmployeeTeamReference |
| [**replaceOne**](EmployeeTeamReferenceApi.md#replaceOne) | **PUT** /employee-team-reference/{id} | Replace One EmployeeTeamReference |
| [**updateOneEmployeeTeamReference**](EmployeeTeamReferenceApi.md#updateOneEmployeeTeamReference) | **PATCH** /employee-team-reference/{id} | Update One EmployeeTeamReference |


<a name="createOneEmployeeTeamReference"></a>
# **createOneEmployeeTeamReference**
> EmployeeTeamReferenceResponseMapped createOneEmployeeTeamReference(createEmployeeTeamReferenceRequest).execute();

Create One EmployeeTeamReference

Create One EmployeeTeamReference

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
    String teamId = "teamId_example";
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String userId = "userId_example";
    try {
      EmployeeTeamReferenceResponseMapped result = client
              .employeeTeamReference
              .createOneEmployeeTeamReference(teamId, companyId, employeeId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#createOneEmployeeTeamReference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTeamReferenceResponseMapped> response = client
              .employeeTeamReference
              .createOneEmployeeTeamReference(teamId, companyId, employeeId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#createOneEmployeeTeamReference");
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
| **createEmployeeTeamReferenceRequest** | [**CreateEmployeeTeamReferenceRequest**](CreateEmployeeTeamReferenceRequest.md)|  | |

### Return type

[**EmployeeTeamReferenceResponseMapped**](EmployeeTeamReferenceResponseMapped.md)

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

Delete One EmployeeTeamReference

Delete One EmployeeTeamReference

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
              .employeeTeamReference
              .deleteOne(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#deleteOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .employeeTeamReference
              .deleteOne(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#deleteOne");
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

<a name="getMany"></a>
# **getMany**
> EmployeeTeamReferencesGetManyResponseMapped getMany().select(select).relations(relations).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many EmployeeTeamReferences

Get Many EmployeeTeamReferences

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
    List<String> select = Arrays.asList(); // Select EmployeeTeamReference fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related EmployeeTeamReference resources, comma-separated. (e.g. `relations=office,department`)
    EmployeeteamreferenceGetManyFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received EmployeeTeamReferences. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received EmployeeTeamReferences. (e.g. `offset=20`)
    EmployeeteamreferenceGetManySortParameter sort = new HashMap(); // Sort received EmployeeTeamReferences by field. (e.g. `sort[id]=asc`)
    try {
      EmployeeTeamReferencesGetManyResponseMapped result = client
              .employeeTeamReference
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
      System.err.println("Exception when calling EmployeeTeamReferenceApi#getMany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTeamReferencesGetManyResponseMapped> response = client
              .employeeTeamReference
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
      System.err.println("Exception when calling EmployeeTeamReferenceApi#getMany");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select EmployeeTeamReference fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, companyId, teamId, userId, employeeId] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related EmployeeTeamReference resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: employee, team, user] |
| **filters** | [**EmployeeteamreferenceGetManyFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received EmployeeTeamReferences. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received EmployeeTeamReferences. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**EmployeeteamreferenceGetManySortParameter**](.md)| Sort received EmployeeTeamReferences by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**EmployeeTeamReferencesGetManyResponseMapped**](EmployeeTeamReferencesGetManyResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getOneEmployeeTeamReference"></a>
# **getOneEmployeeTeamReference**
> EmployeeTeamReferenceGetOneResponseMapped getOneEmployeeTeamReference(id).select(select).relations(relations).execute();

Get One EmployeeTeamReference

Get One EmployeeTeamReference

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
    List<String> select = Arrays.asList(); // Select EmployeeTeamReference fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    List<String> relations = Arrays.asList(); // Select related EmployeeTeamReference resources, comma-separated. (e.g. `relations=office,department`)
    try {
      EmployeeTeamReferenceGetOneResponseMapped result = client
              .employeeTeamReference
              .getOneEmployeeTeamReference(id)
              .select(select)
              .relations(relations)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#getOneEmployeeTeamReference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTeamReferenceGetOneResponseMapped> response = client
              .employeeTeamReference
              .getOneEmployeeTeamReference(id)
              .select(select)
              .relations(relations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#getOneEmployeeTeamReference");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select EmployeeTeamReference fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, companyId, teamId, userId, employeeId] |
| **relations** | [**List&lt;String&gt;**](String.md)| Select related EmployeeTeamReference resources, comma-separated. (e.g. &#x60;relations&#x3D;office,department&#x60;) | [optional] [enum: employee, team, user] |

### Return type

[**EmployeeTeamReferenceGetOneResponseMapped**](EmployeeTeamReferenceGetOneResponseMapped.md)

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
> EmployeeTeamReferenceResponseMapped replaceOne(id, updateEmployeeTeamReferenceRequest).execute();

Replace One EmployeeTeamReference

Replace One EmployeeTeamReference

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
    String teamId = "teamId_example";
    try {
      EmployeeTeamReferenceResponseMapped result = client
              .employeeTeamReference
              .replaceOne(id)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#replaceOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTeamReferenceResponseMapped> response = client
              .employeeTeamReference
              .replaceOne(id)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#replaceOne");
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
| **updateEmployeeTeamReferenceRequest** | [**UpdateEmployeeTeamReferenceRequest**](UpdateEmployeeTeamReferenceRequest.md)|  | |

### Return type

[**EmployeeTeamReferenceResponseMapped**](EmployeeTeamReferenceResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOneEmployeeTeamReference"></a>
# **updateOneEmployeeTeamReference**
> EmployeeTeamReferenceResponseMapped updateOneEmployeeTeamReference(id, updateEmployeeTeamReferenceRequest).execute();

Update One EmployeeTeamReference

Update One EmployeeTeamReference

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
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
    String teamId = "teamId_example";
    try {
      EmployeeTeamReferenceResponseMapped result = client
              .employeeTeamReference
              .updateOneEmployeeTeamReference(id)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#updateOneEmployeeTeamReference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTeamReferenceResponseMapped> response = client
              .employeeTeamReference
              .updateOneEmployeeTeamReference(id)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTeamReferenceApi#updateOneEmployeeTeamReference");
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
| **updateEmployeeTeamReferenceRequest** | [**UpdateEmployeeTeamReferenceRequest**](UpdateEmployeeTeamReferenceRequest.md)|  | |

### Return type

[**EmployeeTeamReferenceResponseMapped**](EmployeeTeamReferenceResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

