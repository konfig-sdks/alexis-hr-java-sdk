/*
 * AlexisHR API
 * <h1 id=\"introduction\">Introduction</h1>  <p>    AlexisHR API is currently in preview. This means that small, backward    incompatible changes might be introduced while in preview. The changes will be    documented and communicated.    <a      href=\"https://cdn.forms-content.sg-form.com/56c6a65c-90a2-11eb-a700-a6de1aea3a1a\"      target=\"_blank\"      ><button>Subscribe to updates</button></a    >  </p>    <h1 id=\"authentication\">Authentication</h1>  <pre class=\"click-to-expand-wrapper is-snippet-wrapper language-undefined\">  <code class=\"is-highlighted language-bash\">curl https://api.alexishr.com/v1/employee \\    -H \"Authorization: Bearer &lt;your_access_token&gt;\"</code>  </pre>  <p>    Authenticate your account when using the API by including your secret Access    Token in the request.    <a href=\"https://app.alexishr.com/access-tokens\">Manage your Access Tokens</a    >.  </p>  <p>    Authentication is performed by passing the Access Token in the Authorization    header.  </p>  <hr />    <h1 id=\"structure\">Structure</h1>  <p>    You will find the structure of the API to be highly uniform and consistent.    Typically every resource can be accessed via a top level endpoint, such as    <code>/v1/employee</code>. For every such resource, you can perform some of    the following operations:  </p>  <h2>Operations</h2>  <table>    <tr>      <td>GET /v1/:resource</td>      <td>List all objects of this type</td>    </tr>    <tr>      <td>GET /v1/:resource/:id</td>      <td>Retrieve a resource by id</td>    </tr>    <tr>      <td>POST /v1/:resource</td>      <td>Create a resource of this type</td>    </tr>    <tr>      <td>PATCH /v1/:resource/:id</td>      <td>Update the resource by id</td>    </tr>    <tr>      <td>DELETE /v1/:resource/:id</td>      <td>Delete the resource by id</td>    </tr>  </table>  <hr />    <h1 id=\"roles\">Roles</h1>  <p>The Access Tokens will have owner permission on the account</p>  <hr />    <h1 id=\"filters\">Filters</h1>  <p>    Some of the list endpoints allow to filter results by certain conditions.    Refer to specific resources to find out what criteria are allowed. Below is a    list of the different conditions.  </p>    <h4 id=\"eq\"><code>$eq</code></h4>  <p>Find all results matching the attribute value specified.</p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[fieldName][$eq]=value</code></pre>  </div>  <p>Can also be simplified like this.</p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[fieldName]=value</code></pre>  </div>    <h4 id=\"neq\"><code>$neq</code></h4>  <p>Find all results not matching the attribute value specified.</p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[fieldName][$neq]=value</code></pre>  </div>    <h4 id=\"gt\"><code>$gt</code>, <code>$gte</code></h4>  <p>    Find all results where the value is more (<code>$gt</code>) or more and equal    (<code>$gte</code>) to a given value.  </p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[startDate][$gte]=2020-01-01</code></pre>  </div>  <hr />    <h4 id=\"lt\"><code>$lt</code>, <code>$lte</code></h4>  <p>    Find all results where the value is less (<code>$lt</code>) or less and equal    (<code>$lte</code>) to a given value.  </p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[startDate][$lte]=2020-01-01</code></pre>  </div>  <hr />    <h4 id=\"in\"><code>$in</code>, <code>$nin</code></h4>  <p>    Find all results matching (<code>$in</code>) or not matching    (<code>$nin</code>) any of the attribute values specified.  </p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[fieldName][$in][]=value1&filters[fieldName][$in][]=value2</code></pre>  </div>  <hr />    <h4 id=\"between\"><code>$between</code></h4>  <p>Find all results between two values specified.</p>  <div>    <pre><code class=\"language-shell\" data-lang=\"shell\">GET /v1/example?filters[startDate][$between][]=2020-01-01&filters[startDate][$between][]=2020-12-31</code></pre>  </div>  <hr />    <h1 id=\"versioning\">Versioning</h1>  <p>    Each version of the API is guaranteed to be compatible with the resources of    the same version. When we make breaking changes to the API a new version will    be published  </p>  <hr />    <h1 id=\"changelog\">Changelog</h1>  <h3>2023-12-20</h3>  <p>Field [updated] added for filter & select for Get Many Employments and Get Many Employees.</p>  <h3>2021-03-15</h3>  <p>First draft was published</p>  <hr />   # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * The version of the OpenAPI document: v1-preview
 * Contact: support@alexishr.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UpdateTimesheetEntryRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateTimesheetEntryRequest {
  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private String typeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Double minutes;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public UpdateTimesheetEntryRequest() {
  }

  public UpdateTimesheetEntryRequest typeId(String typeId) {
    
    
    
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", value = "")

  public String getTypeId() {
    return typeId;
  }


  public void setTypeId(String typeId) {
    
    
    
    this.typeId = typeId;
  }


  public UpdateTimesheetEntryRequest employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public UpdateTimesheetEntryRequest date(OffsetDateTime date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    
    
    this.date = date;
  }


  public UpdateTimesheetEntryRequest minutes(Double minutes) {
    
    
    
    
    this.minutes = minutes;
    return this;
  }

  public UpdateTimesheetEntryRequest minutes(Integer minutes) {
    
    
    
    
    this.minutes = minutes.doubleValue();
    return this;
  }

   /**
   * Get minutes
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinutes() {
    return minutes;
  }


  public void setMinutes(Double minutes) {
    
    
    
    this.minutes = minutes;
  }


  public UpdateTimesheetEntryRequest note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateTimesheetEntryRequest instance itself
   */
  public UpdateTimesheetEntryRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimesheetEntryRequest updateTimesheetEntryRequest = (UpdateTimesheetEntryRequest) o;
    return Objects.equals(this.typeId, updateTimesheetEntryRequest.typeId) &&
        Objects.equals(this.employeeId, updateTimesheetEntryRequest.employeeId) &&
        Objects.equals(this.date, updateTimesheetEntryRequest.date) &&
        Objects.equals(this.minutes, updateTimesheetEntryRequest.minutes) &&
        Objects.equals(this.note, updateTimesheetEntryRequest.note)&&
        Objects.equals(this.additionalProperties, updateTimesheetEntryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, employeeId, date, minutes, note, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimesheetEntryRequest {\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("typeId");
    openapiFields.add("employeeId");
    openapiFields.add("date");
    openapiFields.add("minutes");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateTimesheetEntryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateTimesheetEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTimesheetEntryRequest is not found in the empty JSON string", UpdateTimesheetEntryRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("typeId") != null && !jsonObj.get("typeId").isJsonNull()) && !jsonObj.get("typeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeId").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTimesheetEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTimesheetEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTimesheetEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTimesheetEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTimesheetEntryRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTimesheetEntryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTimesheetEntryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateTimesheetEntryRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTimesheetEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTimesheetEntryRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTimesheetEntryRequest
  */
  public static UpdateTimesheetEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTimesheetEntryRequest.class);
  }

 /**
  * Convert an instance of UpdateTimesheetEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

