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
 * LeavetransactionListManyTransactionsSortParameter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeavetransactionListManyTransactionsSortParameter {
  /**
   * Gets or Sets description
   */
  @JsonAdapter(DescriptionEnum.Adapter.class)
 public enum DescriptionEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DescriptionEnum fromValue(String value) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DescriptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private DescriptionEnum description;

  /**
   * Gets or Sets id
   */
  @JsonAdapter(IdEnum.Adapter.class)
 public enum IdEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private IdEnum id;

  /**
   * Gets or Sets leaveTypeId
   */
  @JsonAdapter(LeaveTypeIdEnum.Adapter.class)
 public enum LeaveTypeIdEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    LeaveTypeIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeaveTypeIdEnum fromValue(String value) {
      for (LeaveTypeIdEnum b : LeaveTypeIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LeaveTypeIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeaveTypeIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeaveTypeIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LeaveTypeIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEAVE_TYPE_ID = "leaveTypeId";
  @SerializedName(SERIALIZED_NAME_LEAVE_TYPE_ID)
  private LeaveTypeIdEnum leaveTypeId;

  /**
   * Gets or Sets employeeId
   */
  @JsonAdapter(EmployeeIdEnum.Adapter.class)
 public enum EmployeeIdEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    EmployeeIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmployeeIdEnum fromValue(String value) {
      for (EmployeeIdEnum b : EmployeeIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmployeeIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmployeeIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmployeeIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmployeeIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private EmployeeIdEnum employeeId;

  /**
   * Gets or Sets childId
   */
  @JsonAdapter(ChildIdEnum.Adapter.class)
 public enum ChildIdEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    ChildIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChildIdEnum fromValue(String value) {
      for (ChildIdEnum b : ChildIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChildIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChildIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChildIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChildIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHILD_ID = "childId";
  @SerializedName(SERIALIZED_NAME_CHILD_ID)
  private ChildIdEnum childId;

  /**
   * Gets or Sets date
   */
  @JsonAdapter(DateEnum.Adapter.class)
 public enum DateEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateEnum fromValue(String value) {
      for (DateEnum b : DateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private DateEnum date;

  /**
   * Gets or Sets hours
   */
  @JsonAdapter(HoursEnum.Adapter.class)
 public enum HoursEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    HoursEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HoursEnum fromValue(String value) {
      for (HoursEnum b : HoursEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HoursEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HoursEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HoursEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HoursEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private HoursEnum hours;

  /**
   * Gets or Sets extent
   */
  @JsonAdapter(ExtentEnum.Adapter.class)
 public enum ExtentEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    ExtentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtentEnum fromValue(String value) {
      for (ExtentEnum b : ExtentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXTENT = "extent";
  @SerializedName(SERIALIZED_NAME_EXTENT)
  private ExtentEnum extent;

  public LeavetransactionListManyTransactionsSortParameter() {
  }

  public LeavetransactionListManyTransactionsSortParameter description(DescriptionEnum description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DescriptionEnum getDescription() {
    return description;
  }


  public void setDescription(DescriptionEnum description) {
    
    
    
    this.description = description;
  }


  public LeavetransactionListManyTransactionsSortParameter id(IdEnum id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdEnum getId() {
    return id;
  }


  public void setId(IdEnum id) {
    
    
    
    this.id = id;
  }


  public LeavetransactionListManyTransactionsSortParameter leaveTypeId(LeaveTypeIdEnum leaveTypeId) {
    
    
    
    
    this.leaveTypeId = leaveTypeId;
    return this;
  }

   /**
   * Get leaveTypeId
   * @return leaveTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LeaveTypeIdEnum getLeaveTypeId() {
    return leaveTypeId;
  }


  public void setLeaveTypeId(LeaveTypeIdEnum leaveTypeId) {
    
    
    
    this.leaveTypeId = leaveTypeId;
  }


  public LeavetransactionListManyTransactionsSortParameter employeeId(EmployeeIdEnum employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeIdEnum getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(EmployeeIdEnum employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public LeavetransactionListManyTransactionsSortParameter childId(ChildIdEnum childId) {
    
    
    
    
    this.childId = childId;
    return this;
  }

   /**
   * Get childId
   * @return childId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChildIdEnum getChildId() {
    return childId;
  }


  public void setChildId(ChildIdEnum childId) {
    
    
    
    this.childId = childId;
  }


  public LeavetransactionListManyTransactionsSortParameter date(DateEnum date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateEnum getDate() {
    return date;
  }


  public void setDate(DateEnum date) {
    
    
    
    this.date = date;
  }


  public LeavetransactionListManyTransactionsSortParameter hours(HoursEnum hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HoursEnum getHours() {
    return hours;
  }


  public void setHours(HoursEnum hours) {
    
    
    
    this.hours = hours;
  }


  public LeavetransactionListManyTransactionsSortParameter extent(ExtentEnum extent) {
    
    
    
    
    this.extent = extent;
    return this;
  }

   /**
   * Get extent
   * @return extent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtentEnum getExtent() {
    return extent;
  }


  public void setExtent(ExtentEnum extent) {
    
    
    
    this.extent = extent;
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
   * @return the LeavetransactionListManyTransactionsSortParameter instance itself
   */
  public LeavetransactionListManyTransactionsSortParameter putAdditionalProperty(String key, Object value) {
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
    LeavetransactionListManyTransactionsSortParameter leavetransactionListManyTransactionsSortParameter = (LeavetransactionListManyTransactionsSortParameter) o;
    return Objects.equals(this.description, leavetransactionListManyTransactionsSortParameter.description) &&
        Objects.equals(this.id, leavetransactionListManyTransactionsSortParameter.id) &&
        Objects.equals(this.leaveTypeId, leavetransactionListManyTransactionsSortParameter.leaveTypeId) &&
        Objects.equals(this.employeeId, leavetransactionListManyTransactionsSortParameter.employeeId) &&
        Objects.equals(this.childId, leavetransactionListManyTransactionsSortParameter.childId) &&
        Objects.equals(this.date, leavetransactionListManyTransactionsSortParameter.date) &&
        Objects.equals(this.hours, leavetransactionListManyTransactionsSortParameter.hours) &&
        Objects.equals(this.extent, leavetransactionListManyTransactionsSortParameter.extent)&&
        Objects.equals(this.additionalProperties, leavetransactionListManyTransactionsSortParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, leaveTypeId, employeeId, childId, date, hours, extent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavetransactionListManyTransactionsSortParameter {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaveTypeId: ").append(toIndentedString(leaveTypeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    extent: ").append(toIndentedString(extent)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("leaveTypeId");
    openapiFields.add("employeeId");
    openapiFields.add("childId");
    openapiFields.add("date");
    openapiFields.add("hours");
    openapiFields.add("extent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeavetransactionListManyTransactionsSortParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeavetransactionListManyTransactionsSortParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeavetransactionListManyTransactionsSortParameter is not found in the empty JSON string", LeavetransactionListManyTransactionsSortParameter.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("leaveTypeId") != null && !jsonObj.get("leaveTypeId").isJsonNull()) && !jsonObj.get("leaveTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaveTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaveTypeId").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("childId") != null && !jsonObj.get("childId").isJsonNull()) && !jsonObj.get("childId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `childId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("childId").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
      if ((jsonObj.get("extent") != null && !jsonObj.get("extent").isJsonNull()) && !jsonObj.get("extent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeavetransactionListManyTransactionsSortParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeavetransactionListManyTransactionsSortParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeavetransactionListManyTransactionsSortParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeavetransactionListManyTransactionsSortParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<LeavetransactionListManyTransactionsSortParameter>() {
           @Override
           public void write(JsonWriter out, LeavetransactionListManyTransactionsSortParameter value) throws IOException {
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
           public LeavetransactionListManyTransactionsSortParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeavetransactionListManyTransactionsSortParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LeavetransactionListManyTransactionsSortParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeavetransactionListManyTransactionsSortParameter
  * @throws IOException if the JSON string is invalid with respect to LeavetransactionListManyTransactionsSortParameter
  */
  public static LeavetransactionListManyTransactionsSortParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeavetransactionListManyTransactionsSortParameter.class);
  }

 /**
  * Convert an instance of LeavetransactionListManyTransactionsSortParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

