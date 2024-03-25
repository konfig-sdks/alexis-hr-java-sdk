# OfficeApi

All URIs are relative to *https://api.alexishr.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneOffice**](OfficeApi.md#createOneOffice) | **POST** /office | Create One Office |
| [**deleteOne**](OfficeApi.md#deleteOne) | **DELETE** /office/{id} | Delete One Office |
| [**getOneOffice**](OfficeApi.md#getOneOffice) | **GET** /office/{id} | Get One Office |
| [**listManyOffices**](OfficeApi.md#listManyOffices) | **GET** /office | Get Many Offices |
| [**replaceOne**](OfficeApi.md#replaceOne) | **PUT** /office/{id} | Replace One Office |
| [**updateOne**](OfficeApi.md#updateOne) | **PATCH** /office/{id} | Update One Office |


<a name="createOneOffice"></a>
# **createOneOffice**
> OfficeResponseMapped createOneOffice(createOfficeRequest).execute();

Create One Office

Create One Office

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
    String phone = "phone_example";
    String email = "email_example";
    String timezone = "timezone_example";
    String CFAR = "CFAR_example";
    String SCB = "SCB_example";
    String SNI = "SNI_example";
    try {
      OfficeResponseMapped result = client
              .office
              .createOneOffice(name, phone, email, timezone, CFAR, SCB, SNI)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#createOneOffice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficeResponseMapped> response = client
              .office
              .createOneOffice(name, phone, email, timezone, CFAR, SCB, SNI)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#createOneOffice");
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
| **createOfficeRequest** | [**CreateOfficeRequest**](CreateOfficeRequest.md)|  | |

### Return type

[**OfficeResponseMapped**](OfficeResponseMapped.md)

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

Delete One Office

Delete One Office

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
              .office
              .deleteOne(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#deleteOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponseMapped> response = client
              .office
              .deleteOne(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#deleteOne");
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

<a name="getOneOffice"></a>
# **getOneOffice**
> OfficeGetOneResponseMapped getOneOffice(id).select(select).execute();

Get One Office

Get One Office

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
    List<String> select = Arrays.asList(); // Select Office fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    try {
      OfficeGetOneResponseMapped result = client
              .office
              .getOneOffice(id)
              .select(select)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getRelations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#getOneOffice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficeGetOneResponseMapped> response = client
              .office
              .getOneOffice(id)
              .select(select)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#getOneOffice");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Office fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, companyId, name, phone, email, timezone, CFAR, SCB, SNI] |

### Return type

[**OfficeGetOneResponseMapped**](OfficeGetOneResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listManyOffices"></a>
# **listManyOffices**
> OfficesGetManyResponseMapped listManyOffices().select(select).filters(filters).limit(limit).offset(offset).sort(sort).execute();

Get Many Offices

Get Many Offices

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
    List<String> select = Arrays.asList(); // Select Office fields, comma-separated. (e.g. `select=id,firstName,lastName,workEmail`)
    OfficeListManyOfficesFiltersParameter filters = new HashMap(); // Filters conditions per field. (e.g. `filters[id][$eq]=507f1f77bcf86cd799439011`)
    Integer limit = 56; // Limit amount of received Offices. (e.g. `limit=20`)
    Integer offset = 56; // Offset amount of received Offices. (e.g. `offset=20`)
    OfficeListManyOfficesSortParameter sort = new HashMap(); // Sort received Offices by field. (e.g. `sort[id]=asc`)
    try {
      OfficesGetManyResponseMapped result = client
              .office
              .listManyOffices()
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
      System.err.println("Exception when calling OfficeApi#listManyOffices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficesGetManyResponseMapped> response = client
              .office
              .listManyOffices()
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
      System.err.println("Exception when calling OfficeApi#listManyOffices");
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
| **select** | [**List&lt;String&gt;**](String.md)| Select Office fields, comma-separated. (e.g. &#x60;select&#x3D;id,firstName,lastName,workEmail&#x60;) | [optional] [enum: id, companyId, name, phone, email, timezone, CFAR, SCB, SNI] |
| **filters** | [**OfficeListManyOfficesFiltersParameter**](.md)| Filters conditions per field. (e.g. &#x60;filters[id][$eq]&#x3D;507f1f77bcf86cd799439011&#x60;) | [optional] |
| **limit** | **Integer**| Limit amount of received Offices. (e.g. &#x60;limit&#x3D;20&#x60;) | [optional] |
| **offset** | **Integer**| Offset amount of received Offices. (e.g. &#x60;offset&#x3D;20&#x60;) | [optional] |
| **sort** | [**OfficeListManyOfficesSortParameter**](.md)| Sort received Offices by field. (e.g. &#x60;sort[id]&#x3D;asc&#x60;) | [optional] |

### Return type

[**OfficesGetManyResponseMapped**](OfficesGetManyResponseMapped.md)

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
> OfficeResponseMapped replaceOne(id, updateOfficeRequest).execute();

Replace One Office

Replace One Office

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
    String phone = "phone_example";
    String email = "email_example";
    String timezone = "timezone_example";
    String CFAR = "CFAR_example";
    String SCB = "SCB_example";
    String SNI = "SNI_example";
    try {
      OfficeResponseMapped result = client
              .office
              .replaceOne(id)
              .name(name)
              .phone(phone)
              .email(email)
              .timezone(timezone)
              .CFAR(CFAR)
              .SCB(SCB)
              .SNI(SNI)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#replaceOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficeResponseMapped> response = client
              .office
              .replaceOne(id)
              .name(name)
              .phone(phone)
              .email(email)
              .timezone(timezone)
              .CFAR(CFAR)
              .SCB(SCB)
              .SNI(SNI)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#replaceOne");
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
| **updateOfficeRequest** | [**UpdateOfficeRequest**](UpdateOfficeRequest.md)|  | |

### Return type

[**OfficeResponseMapped**](OfficeResponseMapped.md)

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
> OfficeResponseMapped updateOne(id, updateOfficeRequest).execute();

Update One Office

Update One Office

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AlexisHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficeApi;
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
    String phone = "phone_example";
    String email = "email_example";
    String timezone = "timezone_example";
    String CFAR = "CFAR_example";
    String SCB = "SCB_example";
    String SNI = "SNI_example";
    try {
      OfficeResponseMapped result = client
              .office
              .updateOne(id)
              .name(name)
              .phone(phone)
              .email(email)
              .timezone(timezone)
              .CFAR(CFAR)
              .SCB(SCB)
              .SNI(SNI)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#updateOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficeResponseMapped> response = client
              .office
              .updateOne(id)
              .name(name)
              .phone(phone)
              .email(email)
              .timezone(timezone)
              .CFAR(CFAR)
              .SCB(SCB)
              .SNI(SNI)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficeApi#updateOne");
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
| **updateOfficeRequest** | [**UpdateOfficeRequest**](UpdateOfficeRequest.md)|  | |

### Return type

[**OfficeResponseMapped**](OfficeResponseMapped.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

