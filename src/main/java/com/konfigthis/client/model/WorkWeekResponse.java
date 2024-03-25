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
import com.konfigthis.client.model.WorkWeekDayResponse;
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
 * WorkWeekResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkWeekResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private String officeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;

  public static final String SERIALIZED_NAME_EFFECTIVE_TO = "effectiveTo";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_TO)
  private OffsetDateTime effectiveTo;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  public static final String SERIALIZED_NAME_MONDAY = "monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private WorkWeekDayResponse monday;

  public static final String SERIALIZED_NAME_TUESDAY = "tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private WorkWeekDayResponse tuesday;

  public static final String SERIALIZED_NAME_WEDNESDAY = "wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private WorkWeekDayResponse wednesday;

  public static final String SERIALIZED_NAME_THURSDAY = "thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private WorkWeekDayResponse thursday;

  public static final String SERIALIZED_NAME_FRIDAY = "friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private WorkWeekDayResponse friday;

  public static final String SERIALIZED_NAME_SATURDAY = "saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private WorkWeekDayResponse saturday;

  public static final String SERIALIZED_NAME_SUNDAY = "sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private WorkWeekDayResponse sunday;

  public WorkWeekResponse() {
  }

  public WorkWeekResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WorkWeekResponse companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public WorkWeekResponse officeId(String officeId) {
    
    
    
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", value = "")

  public String getOfficeId() {
    return officeId;
  }


  public void setOfficeId(String officeId) {
    
    
    
    this.officeId = officeId;
  }


  public WorkWeekResponse employeeId(String employeeId) {
    
    
    
    
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


  public WorkWeekResponse effectiveFrom(OffsetDateTime effectiveFrom) {
    
    
    
    
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }


  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    
    
    
    this.effectiveFrom = effectiveFrom;
  }


  public WorkWeekResponse effectiveTo(OffsetDateTime effectiveTo) {
    
    
    
    
    this.effectiveTo = effectiveTo;
    return this;
  }

   /**
   * Get effectiveTo
   * @return effectiveTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEffectiveTo() {
    return effectiveTo;
  }


  public void setEffectiveTo(OffsetDateTime effectiveTo) {
    
    
    
    this.effectiveTo = effectiveTo;
  }


  public WorkWeekResponse timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public WorkWeekResponse duration(Double duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

  public WorkWeekResponse duration(Integer duration) {
    
    
    
    
    this.duration = duration.doubleValue();
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    
    
    
    this.duration = duration;
  }


  public WorkWeekResponse monday(WorkWeekDayResponse monday) {
    
    
    
    
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getMonday() {
    return monday;
  }


  public void setMonday(WorkWeekDayResponse monday) {
    
    
    
    this.monday = monday;
  }


  public WorkWeekResponse tuesday(WorkWeekDayResponse tuesday) {
    
    
    
    
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getTuesday() {
    return tuesday;
  }


  public void setTuesday(WorkWeekDayResponse tuesday) {
    
    
    
    this.tuesday = tuesday;
  }


  public WorkWeekResponse wednesday(WorkWeekDayResponse wednesday) {
    
    
    
    
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getWednesday() {
    return wednesday;
  }


  public void setWednesday(WorkWeekDayResponse wednesday) {
    
    
    
    this.wednesday = wednesday;
  }


  public WorkWeekResponse thursday(WorkWeekDayResponse thursday) {
    
    
    
    
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getThursday() {
    return thursday;
  }


  public void setThursday(WorkWeekDayResponse thursday) {
    
    
    
    this.thursday = thursday;
  }


  public WorkWeekResponse friday(WorkWeekDayResponse friday) {
    
    
    
    
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getFriday() {
    return friday;
  }


  public void setFriday(WorkWeekDayResponse friday) {
    
    
    
    this.friday = friday;
  }


  public WorkWeekResponse saturday(WorkWeekDayResponse saturday) {
    
    
    
    
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getSaturday() {
    return saturday;
  }


  public void setSaturday(WorkWeekDayResponse saturday) {
    
    
    
    this.saturday = saturday;
  }


  public WorkWeekResponse sunday(WorkWeekDayResponse sunday) {
    
    
    
    
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkWeekDayResponse getSunday() {
    return sunday;
  }


  public void setSunday(WorkWeekDayResponse sunday) {
    
    
    
    this.sunday = sunday;
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
   * @return the WorkWeekResponse instance itself
   */
  public WorkWeekResponse putAdditionalProperty(String key, Object value) {
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
    WorkWeekResponse workWeekResponse = (WorkWeekResponse) o;
    return Objects.equals(this.id, workWeekResponse.id) &&
        Objects.equals(this.companyId, workWeekResponse.companyId) &&
        Objects.equals(this.officeId, workWeekResponse.officeId) &&
        Objects.equals(this.employeeId, workWeekResponse.employeeId) &&
        Objects.equals(this.effectiveFrom, workWeekResponse.effectiveFrom) &&
        Objects.equals(this.effectiveTo, workWeekResponse.effectiveTo) &&
        Objects.equals(this.timezone, workWeekResponse.timezone) &&
        Objects.equals(this.duration, workWeekResponse.duration) &&
        Objects.equals(this.monday, workWeekResponse.monday) &&
        Objects.equals(this.tuesday, workWeekResponse.tuesday) &&
        Objects.equals(this.wednesday, workWeekResponse.wednesday) &&
        Objects.equals(this.thursday, workWeekResponse.thursday) &&
        Objects.equals(this.friday, workWeekResponse.friday) &&
        Objects.equals(this.saturday, workWeekResponse.saturday) &&
        Objects.equals(this.sunday, workWeekResponse.sunday)&&
        Objects.equals(this.additionalProperties, workWeekResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, officeId, employeeId, effectiveFrom, effectiveTo, timezone, duration, monday, tuesday, wednesday, thursday, friday, saturday, sunday, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkWeekResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("companyId");
    openapiFields.add("officeId");
    openapiFields.add("employeeId");
    openapiFields.add("effectiveFrom");
    openapiFields.add("effectiveTo");
    openapiFields.add("timezone");
    openapiFields.add("duration");
    openapiFields.add("monday");
    openapiFields.add("tuesday");
    openapiFields.add("wednesday");
    openapiFields.add("thursday");
    openapiFields.add("friday");
    openapiFields.add("saturday");
    openapiFields.add("sunday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("companyId");
    openapiRequiredFields.add("effectiveFrom");
    openapiRequiredFields.add("timezone");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("monday");
    openapiRequiredFields.add("tuesday");
    openapiRequiredFields.add("wednesday");
    openapiRequiredFields.add("thursday");
    openapiRequiredFields.add("friday");
    openapiRequiredFields.add("saturday");
    openapiRequiredFields.add("sunday");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkWeekResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkWeekResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkWeekResponse is not found in the empty JSON string", WorkWeekResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkWeekResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("officeId") != null && !jsonObj.get("officeId").isJsonNull()) && !jsonObj.get("officeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeId").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // validate the required field `monday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("monday"));
      // validate the required field `tuesday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("tuesday"));
      // validate the required field `wednesday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("wednesday"));
      // validate the required field `thursday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("thursday"));
      // validate the required field `friday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("friday"));
      // validate the required field `saturday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("saturday"));
      // validate the required field `sunday`
      WorkWeekDayResponse.validateJsonObject(jsonObj.getAsJsonObject("sunday"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkWeekResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkWeekResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkWeekResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkWeekResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkWeekResponse>() {
           @Override
           public void write(JsonWriter out, WorkWeekResponse value) throws IOException {
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
           public WorkWeekResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkWeekResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkWeekResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkWeekResponse
  * @throws IOException if the JSON string is invalid with respect to WorkWeekResponse
  */
  public static WorkWeekResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkWeekResponse.class);
  }

 /**
  * Convert an instance of WorkWeekResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
