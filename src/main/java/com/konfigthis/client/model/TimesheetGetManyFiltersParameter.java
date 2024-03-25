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
import com.konfigthis.client.model.CompanyListManyCompaniesFiltersParameterId;
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
 * TimesheetGetManyFiltersParameter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimesheetGetManyFiltersParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private CompanyListManyCompaniesFiltersParameterId id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CompanyListManyCompaniesFiltersParameterId status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private CompanyListManyCompaniesFiltersParameterId startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private CompanyListManyCompaniesFiltersParameterId endDate;

  public static final String SERIALIZED_NAME_LOCAL_CUT_OFF_DATE = "localCutOffDate";
  @SerializedName(SERIALIZED_NAME_LOCAL_CUT_OFF_DATE)
  private CompanyListManyCompaniesFiltersParameterId localCutOffDate;

  public static final String SERIALIZED_NAME_UTC_CUT_OFF_DATE = "utcCutOffDate";
  @SerializedName(SERIALIZED_NAME_UTC_CUT_OFF_DATE)
  private CompanyListManyCompaniesFiltersParameterId utcCutOffDate;

  public static final String SERIALIZED_NAME_APPROVAL_DEADLINE_DATE = "approvalDeadlineDate";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DEADLINE_DATE)
  private CompanyListManyCompaniesFiltersParameterId approvalDeadlineDate;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private CompanyListManyCompaniesFiltersParameterId interval;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private CompanyListManyCompaniesFiltersParameterId note;

  public static final String SERIALIZED_NAME_APPROVER_EMPLOYEE_ID = "approverEmployeeId";
  @SerializedName(SERIALIZED_NAME_APPROVER_EMPLOYEE_ID)
  private CompanyListManyCompaniesFiltersParameterId approverEmployeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private CompanyListManyCompaniesFiltersParameterId employeeId;

  public static final String SERIALIZED_NAME_SUBMIT_DATE = "submitDate";
  @SerializedName(SERIALIZED_NAME_SUBMIT_DATE)
  private CompanyListManyCompaniesFiltersParameterId submitDate;

  public static final String SERIALIZED_NAME_APPROVAL_DATE = "approvalDate";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DATE)
  private CompanyListManyCompaniesFiltersParameterId approvalDate;

  public static final String SERIALIZED_NAME_REJECTED_DATE = "rejectedDate";
  @SerializedName(SERIALIZED_NAME_REJECTED_DATE)
  private CompanyListManyCompaniesFiltersParameterId rejectedDate;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private CompanyListManyCompaniesFiltersParameterId updated;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private CompanyListManyCompaniesFiltersParameterId timezone;

  public TimesheetGetManyFiltersParameter() {
  }

  public TimesheetGetManyFiltersParameter id(CompanyListManyCompaniesFiltersParameterId id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getId() {
    return id;
  }


  public void setId(CompanyListManyCompaniesFiltersParameterId id) {
    
    
    
    this.id = id;
  }


  public TimesheetGetManyFiltersParameter status(CompanyListManyCompaniesFiltersParameterId status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getStatus() {
    return status;
  }


  public void setStatus(CompanyListManyCompaniesFiltersParameterId status) {
    
    
    
    this.status = status;
  }


  public TimesheetGetManyFiltersParameter startDate(CompanyListManyCompaniesFiltersParameterId startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getStartDate() {
    return startDate;
  }


  public void setStartDate(CompanyListManyCompaniesFiltersParameterId startDate) {
    
    
    
    this.startDate = startDate;
  }


  public TimesheetGetManyFiltersParameter endDate(CompanyListManyCompaniesFiltersParameterId endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getEndDate() {
    return endDate;
  }


  public void setEndDate(CompanyListManyCompaniesFiltersParameterId endDate) {
    
    
    
    this.endDate = endDate;
  }


  public TimesheetGetManyFiltersParameter localCutOffDate(CompanyListManyCompaniesFiltersParameterId localCutOffDate) {
    
    
    
    
    this.localCutOffDate = localCutOffDate;
    return this;
  }

   /**
   * Get localCutOffDate
   * @return localCutOffDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getLocalCutOffDate() {
    return localCutOffDate;
  }


  public void setLocalCutOffDate(CompanyListManyCompaniesFiltersParameterId localCutOffDate) {
    
    
    
    this.localCutOffDate = localCutOffDate;
  }


  public TimesheetGetManyFiltersParameter utcCutOffDate(CompanyListManyCompaniesFiltersParameterId utcCutOffDate) {
    
    
    
    
    this.utcCutOffDate = utcCutOffDate;
    return this;
  }

   /**
   * Get utcCutOffDate
   * @return utcCutOffDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getUtcCutOffDate() {
    return utcCutOffDate;
  }


  public void setUtcCutOffDate(CompanyListManyCompaniesFiltersParameterId utcCutOffDate) {
    
    
    
    this.utcCutOffDate = utcCutOffDate;
  }


  public TimesheetGetManyFiltersParameter approvalDeadlineDate(CompanyListManyCompaniesFiltersParameterId approvalDeadlineDate) {
    
    
    
    
    this.approvalDeadlineDate = approvalDeadlineDate;
    return this;
  }

   /**
   * Get approvalDeadlineDate
   * @return approvalDeadlineDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getApprovalDeadlineDate() {
    return approvalDeadlineDate;
  }


  public void setApprovalDeadlineDate(CompanyListManyCompaniesFiltersParameterId approvalDeadlineDate) {
    
    
    
    this.approvalDeadlineDate = approvalDeadlineDate;
  }


  public TimesheetGetManyFiltersParameter interval(CompanyListManyCompaniesFiltersParameterId interval) {
    
    
    
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getInterval() {
    return interval;
  }


  public void setInterval(CompanyListManyCompaniesFiltersParameterId interval) {
    
    
    
    this.interval = interval;
  }


  public TimesheetGetManyFiltersParameter note(CompanyListManyCompaniesFiltersParameterId note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getNote() {
    return note;
  }


  public void setNote(CompanyListManyCompaniesFiltersParameterId note) {
    
    
    
    this.note = note;
  }


  public TimesheetGetManyFiltersParameter approverEmployeeId(CompanyListManyCompaniesFiltersParameterId approverEmployeeId) {
    
    
    
    
    this.approverEmployeeId = approverEmployeeId;
    return this;
  }

   /**
   * Get approverEmployeeId
   * @return approverEmployeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getApproverEmployeeId() {
    return approverEmployeeId;
  }


  public void setApproverEmployeeId(CompanyListManyCompaniesFiltersParameterId approverEmployeeId) {
    
    
    
    this.approverEmployeeId = approverEmployeeId;
  }


  public TimesheetGetManyFiltersParameter employeeId(CompanyListManyCompaniesFiltersParameterId employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(CompanyListManyCompaniesFiltersParameterId employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public TimesheetGetManyFiltersParameter submitDate(CompanyListManyCompaniesFiltersParameterId submitDate) {
    
    
    
    
    this.submitDate = submitDate;
    return this;
  }

   /**
   * Get submitDate
   * @return submitDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getSubmitDate() {
    return submitDate;
  }


  public void setSubmitDate(CompanyListManyCompaniesFiltersParameterId submitDate) {
    
    
    
    this.submitDate = submitDate;
  }


  public TimesheetGetManyFiltersParameter approvalDate(CompanyListManyCompaniesFiltersParameterId approvalDate) {
    
    
    
    
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * Get approvalDate
   * @return approvalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getApprovalDate() {
    return approvalDate;
  }


  public void setApprovalDate(CompanyListManyCompaniesFiltersParameterId approvalDate) {
    
    
    
    this.approvalDate = approvalDate;
  }


  public TimesheetGetManyFiltersParameter rejectedDate(CompanyListManyCompaniesFiltersParameterId rejectedDate) {
    
    
    
    
    this.rejectedDate = rejectedDate;
    return this;
  }

   /**
   * Get rejectedDate
   * @return rejectedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getRejectedDate() {
    return rejectedDate;
  }


  public void setRejectedDate(CompanyListManyCompaniesFiltersParameterId rejectedDate) {
    
    
    
    this.rejectedDate = rejectedDate;
  }


  public TimesheetGetManyFiltersParameter updated(CompanyListManyCompaniesFiltersParameterId updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getUpdated() {
    return updated;
  }


  public void setUpdated(CompanyListManyCompaniesFiltersParameterId updated) {
    
    
    
    this.updated = updated;
  }


  public TimesheetGetManyFiltersParameter timezone(CompanyListManyCompaniesFiltersParameterId timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getTimezone() {
    return timezone;
  }


  public void setTimezone(CompanyListManyCompaniesFiltersParameterId timezone) {
    
    
    
    this.timezone = timezone;
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
   * @return the TimesheetGetManyFiltersParameter instance itself
   */
  public TimesheetGetManyFiltersParameter putAdditionalProperty(String key, Object value) {
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
    TimesheetGetManyFiltersParameter timesheetGetManyFiltersParameter = (TimesheetGetManyFiltersParameter) o;
    return Objects.equals(this.id, timesheetGetManyFiltersParameter.id) &&
        Objects.equals(this.status, timesheetGetManyFiltersParameter.status) &&
        Objects.equals(this.startDate, timesheetGetManyFiltersParameter.startDate) &&
        Objects.equals(this.endDate, timesheetGetManyFiltersParameter.endDate) &&
        Objects.equals(this.localCutOffDate, timesheetGetManyFiltersParameter.localCutOffDate) &&
        Objects.equals(this.utcCutOffDate, timesheetGetManyFiltersParameter.utcCutOffDate) &&
        Objects.equals(this.approvalDeadlineDate, timesheetGetManyFiltersParameter.approvalDeadlineDate) &&
        Objects.equals(this.interval, timesheetGetManyFiltersParameter.interval) &&
        Objects.equals(this.note, timesheetGetManyFiltersParameter.note) &&
        Objects.equals(this.approverEmployeeId, timesheetGetManyFiltersParameter.approverEmployeeId) &&
        Objects.equals(this.employeeId, timesheetGetManyFiltersParameter.employeeId) &&
        Objects.equals(this.submitDate, timesheetGetManyFiltersParameter.submitDate) &&
        Objects.equals(this.approvalDate, timesheetGetManyFiltersParameter.approvalDate) &&
        Objects.equals(this.rejectedDate, timesheetGetManyFiltersParameter.rejectedDate) &&
        Objects.equals(this.updated, timesheetGetManyFiltersParameter.updated) &&
        Objects.equals(this.timezone, timesheetGetManyFiltersParameter.timezone)&&
        Objects.equals(this.additionalProperties, timesheetGetManyFiltersParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, startDate, endDate, localCutOffDate, utcCutOffDate, approvalDeadlineDate, interval, note, approverEmployeeId, employeeId, submitDate, approvalDate, rejectedDate, updated, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetGetManyFiltersParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    localCutOffDate: ").append(toIndentedString(localCutOffDate)).append("\n");
    sb.append("    utcCutOffDate: ").append(toIndentedString(utcCutOffDate)).append("\n");
    sb.append("    approvalDeadlineDate: ").append(toIndentedString(approvalDeadlineDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    approverEmployeeId: ").append(toIndentedString(approverEmployeeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    submitDate: ").append(toIndentedString(submitDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("localCutOffDate");
    openapiFields.add("utcCutOffDate");
    openapiFields.add("approvalDeadlineDate");
    openapiFields.add("interval");
    openapiFields.add("note");
    openapiFields.add("approverEmployeeId");
    openapiFields.add("employeeId");
    openapiFields.add("submitDate");
    openapiFields.add("approvalDate");
    openapiFields.add("rejectedDate");
    openapiFields.add("updated");
    openapiFields.add("timezone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimesheetGetManyFiltersParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimesheetGetManyFiltersParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimesheetGetManyFiltersParameter is not found in the empty JSON string", TimesheetGetManyFiltersParameter.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("id"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `startDate`
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("startDate"));
      }
      // validate the optional field `endDate`
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("endDate"));
      }
      // validate the optional field `localCutOffDate`
      if (jsonObj.get("localCutOffDate") != null && !jsonObj.get("localCutOffDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("localCutOffDate"));
      }
      // validate the optional field `utcCutOffDate`
      if (jsonObj.get("utcCutOffDate") != null && !jsonObj.get("utcCutOffDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("utcCutOffDate"));
      }
      // validate the optional field `approvalDeadlineDate`
      if (jsonObj.get("approvalDeadlineDate") != null && !jsonObj.get("approvalDeadlineDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("approvalDeadlineDate"));
      }
      // validate the optional field `interval`
      if (jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("interval"));
      }
      // validate the optional field `note`
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("note"));
      }
      // validate the optional field `approverEmployeeId`
      if (jsonObj.get("approverEmployeeId") != null && !jsonObj.get("approverEmployeeId").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("approverEmployeeId"));
      }
      // validate the optional field `employeeId`
      if (jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("employeeId"));
      }
      // validate the optional field `submitDate`
      if (jsonObj.get("submitDate") != null && !jsonObj.get("submitDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("submitDate"));
      }
      // validate the optional field `approvalDate`
      if (jsonObj.get("approvalDate") != null && !jsonObj.get("approvalDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("approvalDate"));
      }
      // validate the optional field `rejectedDate`
      if (jsonObj.get("rejectedDate") != null && !jsonObj.get("rejectedDate").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("rejectedDate"));
      }
      // validate the optional field `updated`
      if (jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("updated"));
      }
      // validate the optional field `timezone`
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("timezone"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimesheetGetManyFiltersParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimesheetGetManyFiltersParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimesheetGetManyFiltersParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimesheetGetManyFiltersParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<TimesheetGetManyFiltersParameter>() {
           @Override
           public void write(JsonWriter out, TimesheetGetManyFiltersParameter value) throws IOException {
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
           public TimesheetGetManyFiltersParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimesheetGetManyFiltersParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimesheetGetManyFiltersParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimesheetGetManyFiltersParameter
  * @throws IOException if the JSON string is invalid with respect to TimesheetGetManyFiltersParameter
  */
  public static TimesheetGetManyFiltersParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimesheetGetManyFiltersParameter.class);
  }

 /**
  * Convert an instance of TimesheetGetManyFiltersParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

