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
import com.konfigthis.client.model.ChildResponse;
import com.konfigthis.client.model.CompensationResponse;
import com.konfigthis.client.model.CostCenterResponse;
import com.konfigthis.client.model.DepartmentResponse;
import com.konfigthis.client.model.EmergencyContactResponse;
import com.konfigthis.client.model.EmployeeResponse;
import com.konfigthis.client.model.EmployeeTeamReferenceResponse;
import com.konfigthis.client.model.EmploymentResponse;
import com.konfigthis.client.model.EmploymentTypeResponse;
import com.konfigthis.client.model.OfficeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * EmployeeGetOneRelationsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeGetOneRelationsResponse {
  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private List<OfficeResponse> office = null;

  public static final String SERIALIZED_NAME_COST_CENTER = "costCenter";
  @SerializedName(SERIALIZED_NAME_COST_CENTER)
  private List<CostCenterResponse> costCenter = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_COST_CENTER = "effectiveCostCenter";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_COST_CENTER)
  private List<CostCenterResponse> effectiveCostCenter = null;

  public static final String SERIALIZED_NAME_CHILD = "child";
  @SerializedName(SERIALIZED_NAME_CHILD)
  private List<ChildResponse> child = null;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private List<DepartmentResponse> department = null;

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACT = "emergencyContact";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACT)
  private List<EmergencyContactResponse> emergencyContact = null;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  private List<EmploymentResponse> employment = null;

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employmentType";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  private List<EmploymentTypeResponse> employmentType = null;

  public static final String SERIALIZED_NAME_COMPENSATION = "compensation";
  @SerializedName(SERIALIZED_NAME_COMPENSATION)
  private List<CompensationResponse> compensation = null;

  public static final String SERIALIZED_NAME_MANAGER_EMPLOYEE = "managerEmployee";
  @SerializedName(SERIALIZED_NAME_MANAGER_EMPLOYEE)
  private List<EmployeeResponse> managerEmployee = null;

  public static final String SERIALIZED_NAME_TEAM_REFERENCE = "teamReference";
  @SerializedName(SERIALIZED_NAME_TEAM_REFERENCE)
  private List<EmployeeTeamReferenceResponse> teamReference = null;

  public EmployeeGetOneRelationsResponse() {
  }

  public EmployeeGetOneRelationsResponse office(List<OfficeResponse> office) {
    
    
    
    
    this.office = office;
    return this;
  }

  public EmployeeGetOneRelationsResponse addOfficeItem(OfficeResponse officeItem) {
    if (this.office == null) {
      this.office = new ArrayList<>();
    }
    this.office.add(officeItem);
    return this;
  }

   /**
   * Get office
   * @return office
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OfficeResponse> getOffice() {
    return office;
  }


  public void setOffice(List<OfficeResponse> office) {
    
    
    
    this.office = office;
  }


  public EmployeeGetOneRelationsResponse costCenter(List<CostCenterResponse> costCenter) {
    
    
    
    
    this.costCenter = costCenter;
    return this;
  }

  public EmployeeGetOneRelationsResponse addCostCenterItem(CostCenterResponse costCenterItem) {
    if (this.costCenter == null) {
      this.costCenter = new ArrayList<>();
    }
    this.costCenter.add(costCenterItem);
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CostCenterResponse> getCostCenter() {
    return costCenter;
  }


  public void setCostCenter(List<CostCenterResponse> costCenter) {
    
    
    
    this.costCenter = costCenter;
  }


  public EmployeeGetOneRelationsResponse effectiveCostCenter(List<CostCenterResponse> effectiveCostCenter) {
    
    
    
    
    this.effectiveCostCenter = effectiveCostCenter;
    return this;
  }

  public EmployeeGetOneRelationsResponse addEffectiveCostCenterItem(CostCenterResponse effectiveCostCenterItem) {
    if (this.effectiveCostCenter == null) {
      this.effectiveCostCenter = new ArrayList<>();
    }
    this.effectiveCostCenter.add(effectiveCostCenterItem);
    return this;
  }

   /**
   * Get effectiveCostCenter
   * @return effectiveCostCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CostCenterResponse> getEffectiveCostCenter() {
    return effectiveCostCenter;
  }


  public void setEffectiveCostCenter(List<CostCenterResponse> effectiveCostCenter) {
    
    
    
    this.effectiveCostCenter = effectiveCostCenter;
  }


  public EmployeeGetOneRelationsResponse child(List<ChildResponse> child) {
    
    
    
    
    this.child = child;
    return this;
  }

  public EmployeeGetOneRelationsResponse addChildItem(ChildResponse childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChildResponse> getChild() {
    return child;
  }


  public void setChild(List<ChildResponse> child) {
    
    
    
    this.child = child;
  }


  public EmployeeGetOneRelationsResponse department(List<DepartmentResponse> department) {
    
    
    
    
    this.department = department;
    return this;
  }

  public EmployeeGetOneRelationsResponse addDepartmentItem(DepartmentResponse departmentItem) {
    if (this.department == null) {
      this.department = new ArrayList<>();
    }
    this.department.add(departmentItem);
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DepartmentResponse> getDepartment() {
    return department;
  }


  public void setDepartment(List<DepartmentResponse> department) {
    
    
    
    this.department = department;
  }


  public EmployeeGetOneRelationsResponse emergencyContact(List<EmergencyContactResponse> emergencyContact) {
    
    
    
    
    this.emergencyContact = emergencyContact;
    return this;
  }

  public EmployeeGetOneRelationsResponse addEmergencyContactItem(EmergencyContactResponse emergencyContactItem) {
    if (this.emergencyContact == null) {
      this.emergencyContact = new ArrayList<>();
    }
    this.emergencyContact.add(emergencyContactItem);
    return this;
  }

   /**
   * Get emergencyContact
   * @return emergencyContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmergencyContactResponse> getEmergencyContact() {
    return emergencyContact;
  }


  public void setEmergencyContact(List<EmergencyContactResponse> emergencyContact) {
    
    
    
    this.emergencyContact = emergencyContact;
  }


  public EmployeeGetOneRelationsResponse employment(List<EmploymentResponse> employment) {
    
    
    
    
    this.employment = employment;
    return this;
  }

  public EmployeeGetOneRelationsResponse addEmploymentItem(EmploymentResponse employmentItem) {
    if (this.employment == null) {
      this.employment = new ArrayList<>();
    }
    this.employment.add(employmentItem);
    return this;
  }

   /**
   * Get employment
   * @return employment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmploymentResponse> getEmployment() {
    return employment;
  }


  public void setEmployment(List<EmploymentResponse> employment) {
    
    
    
    this.employment = employment;
  }


  public EmployeeGetOneRelationsResponse employmentType(List<EmploymentTypeResponse> employmentType) {
    
    
    
    
    this.employmentType = employmentType;
    return this;
  }

  public EmployeeGetOneRelationsResponse addEmploymentTypeItem(EmploymentTypeResponse employmentTypeItem) {
    if (this.employmentType == null) {
      this.employmentType = new ArrayList<>();
    }
    this.employmentType.add(employmentTypeItem);
    return this;
  }

   /**
   * Get employmentType
   * @return employmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmploymentTypeResponse> getEmploymentType() {
    return employmentType;
  }


  public void setEmploymentType(List<EmploymentTypeResponse> employmentType) {
    
    
    
    this.employmentType = employmentType;
  }


  public EmployeeGetOneRelationsResponse compensation(List<CompensationResponse> compensation) {
    
    
    
    
    this.compensation = compensation;
    return this;
  }

  public EmployeeGetOneRelationsResponse addCompensationItem(CompensationResponse compensationItem) {
    if (this.compensation == null) {
      this.compensation = new ArrayList<>();
    }
    this.compensation.add(compensationItem);
    return this;
  }

   /**
   * Get compensation
   * @return compensation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CompensationResponse> getCompensation() {
    return compensation;
  }


  public void setCompensation(List<CompensationResponse> compensation) {
    
    
    
    this.compensation = compensation;
  }


  public EmployeeGetOneRelationsResponse managerEmployee(List<EmployeeResponse> managerEmployee) {
    
    
    
    
    this.managerEmployee = managerEmployee;
    return this;
  }

  public EmployeeGetOneRelationsResponse addManagerEmployeeItem(EmployeeResponse managerEmployeeItem) {
    if (this.managerEmployee == null) {
      this.managerEmployee = new ArrayList<>();
    }
    this.managerEmployee.add(managerEmployeeItem);
    return this;
  }

   /**
   * Get managerEmployee
   * @return managerEmployee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmployeeResponse> getManagerEmployee() {
    return managerEmployee;
  }


  public void setManagerEmployee(List<EmployeeResponse> managerEmployee) {
    
    
    
    this.managerEmployee = managerEmployee;
  }


  public EmployeeGetOneRelationsResponse teamReference(List<EmployeeTeamReferenceResponse> teamReference) {
    
    
    
    
    this.teamReference = teamReference;
    return this;
  }

  public EmployeeGetOneRelationsResponse addTeamReferenceItem(EmployeeTeamReferenceResponse teamReferenceItem) {
    if (this.teamReference == null) {
      this.teamReference = new ArrayList<>();
    }
    this.teamReference.add(teamReferenceItem);
    return this;
  }

   /**
   * Get teamReference
   * @return teamReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmployeeTeamReferenceResponse> getTeamReference() {
    return teamReference;
  }


  public void setTeamReference(List<EmployeeTeamReferenceResponse> teamReference) {
    
    
    
    this.teamReference = teamReference;
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
   * @return the EmployeeGetOneRelationsResponse instance itself
   */
  public EmployeeGetOneRelationsResponse putAdditionalProperty(String key, Object value) {
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
    EmployeeGetOneRelationsResponse employeeGetOneRelationsResponse = (EmployeeGetOneRelationsResponse) o;
    return Objects.equals(this.office, employeeGetOneRelationsResponse.office) &&
        Objects.equals(this.costCenter, employeeGetOneRelationsResponse.costCenter) &&
        Objects.equals(this.effectiveCostCenter, employeeGetOneRelationsResponse.effectiveCostCenter) &&
        Objects.equals(this.child, employeeGetOneRelationsResponse.child) &&
        Objects.equals(this.department, employeeGetOneRelationsResponse.department) &&
        Objects.equals(this.emergencyContact, employeeGetOneRelationsResponse.emergencyContact) &&
        Objects.equals(this.employment, employeeGetOneRelationsResponse.employment) &&
        Objects.equals(this.employmentType, employeeGetOneRelationsResponse.employmentType) &&
        Objects.equals(this.compensation, employeeGetOneRelationsResponse.compensation) &&
        Objects.equals(this.managerEmployee, employeeGetOneRelationsResponse.managerEmployee) &&
        Objects.equals(this.teamReference, employeeGetOneRelationsResponse.teamReference)&&
        Objects.equals(this.additionalProperties, employeeGetOneRelationsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(office, costCenter, effectiveCostCenter, child, department, emergencyContact, employment, employmentType, compensation, managerEmployee, teamReference, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeGetOneRelationsResponse {\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    effectiveCostCenter: ").append(toIndentedString(effectiveCostCenter)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    emergencyContact: ").append(toIndentedString(emergencyContact)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    managerEmployee: ").append(toIndentedString(managerEmployee)).append("\n");
    sb.append("    teamReference: ").append(toIndentedString(teamReference)).append("\n");
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
    openapiFields.add("office");
    openapiFields.add("costCenter");
    openapiFields.add("effectiveCostCenter");
    openapiFields.add("child");
    openapiFields.add("department");
    openapiFields.add("emergencyContact");
    openapiFields.add("employment");
    openapiFields.add("employmentType");
    openapiFields.add("compensation");
    openapiFields.add("managerEmployee");
    openapiFields.add("teamReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeGetOneRelationsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeGetOneRelationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeGetOneRelationsResponse is not found in the empty JSON string", EmployeeGetOneRelationsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("office") != null && !jsonObj.get("office").isJsonNull()) {
        JsonArray jsonArrayoffice = jsonObj.getAsJsonArray("office");
        if (jsonArrayoffice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("office").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `office` to be an array in the JSON string but got `%s`", jsonObj.get("office").toString()));
          }

          // validate the optional field `office` (array)
          for (int i = 0; i < jsonArrayoffice.size(); i++) {
            OfficeResponse.validateJsonObject(jsonArrayoffice.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("costCenter") != null && !jsonObj.get("costCenter").isJsonNull()) {
        JsonArray jsonArraycostCenter = jsonObj.getAsJsonArray("costCenter");
        if (jsonArraycostCenter != null) {
          // ensure the json data is an array
          if (!jsonObj.get("costCenter").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `costCenter` to be an array in the JSON string but got `%s`", jsonObj.get("costCenter").toString()));
          }

          // validate the optional field `costCenter` (array)
          for (int i = 0; i < jsonArraycostCenter.size(); i++) {
            CostCenterResponse.validateJsonObject(jsonArraycostCenter.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("effectiveCostCenter") != null && !jsonObj.get("effectiveCostCenter").isJsonNull()) {
        JsonArray jsonArrayeffectiveCostCenter = jsonObj.getAsJsonArray("effectiveCostCenter");
        if (jsonArrayeffectiveCostCenter != null) {
          // ensure the json data is an array
          if (!jsonObj.get("effectiveCostCenter").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `effectiveCostCenter` to be an array in the JSON string but got `%s`", jsonObj.get("effectiveCostCenter").toString()));
          }

          // validate the optional field `effectiveCostCenter` (array)
          for (int i = 0; i < jsonArrayeffectiveCostCenter.size(); i++) {
            CostCenterResponse.validateJsonObject(jsonArrayeffectiveCostCenter.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("child") != null && !jsonObj.get("child").isJsonNull()) {
        JsonArray jsonArraychild = jsonObj.getAsJsonArray("child");
        if (jsonArraychild != null) {
          // ensure the json data is an array
          if (!jsonObj.get("child").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `child` to be an array in the JSON string but got `%s`", jsonObj.get("child").toString()));
          }

          // validate the optional field `child` (array)
          for (int i = 0; i < jsonArraychild.size(); i++) {
            ChildResponse.validateJsonObject(jsonArraychild.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) {
        JsonArray jsonArraydepartment = jsonObj.getAsJsonArray("department");
        if (jsonArraydepartment != null) {
          // ensure the json data is an array
          if (!jsonObj.get("department").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `department` to be an array in the JSON string but got `%s`", jsonObj.get("department").toString()));
          }

          // validate the optional field `department` (array)
          for (int i = 0; i < jsonArraydepartment.size(); i++) {
            DepartmentResponse.validateJsonObject(jsonArraydepartment.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("emergencyContact") != null && !jsonObj.get("emergencyContact").isJsonNull()) {
        JsonArray jsonArrayemergencyContact = jsonObj.getAsJsonArray("emergencyContact");
        if (jsonArrayemergencyContact != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emergencyContact").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emergencyContact` to be an array in the JSON string but got `%s`", jsonObj.get("emergencyContact").toString()));
          }

          // validate the optional field `emergencyContact` (array)
          for (int i = 0; i < jsonArrayemergencyContact.size(); i++) {
            EmergencyContactResponse.validateJsonObject(jsonArrayemergencyContact.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("employment") != null && !jsonObj.get("employment").isJsonNull()) {
        JsonArray jsonArrayemployment = jsonObj.getAsJsonArray("employment");
        if (jsonArrayemployment != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employment").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employment` to be an array in the JSON string but got `%s`", jsonObj.get("employment").toString()));
          }

          // validate the optional field `employment` (array)
          for (int i = 0; i < jsonArrayemployment.size(); i++) {
            EmploymentResponse.validateJsonObject(jsonArrayemployment.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("employmentType") != null && !jsonObj.get("employmentType").isJsonNull()) {
        JsonArray jsonArrayemploymentType = jsonObj.getAsJsonArray("employmentType");
        if (jsonArrayemploymentType != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employmentType").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employmentType` to be an array in the JSON string but got `%s`", jsonObj.get("employmentType").toString()));
          }

          // validate the optional field `employmentType` (array)
          for (int i = 0; i < jsonArrayemploymentType.size(); i++) {
            EmploymentTypeResponse.validateJsonObject(jsonArrayemploymentType.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("compensation") != null && !jsonObj.get("compensation").isJsonNull()) {
        JsonArray jsonArraycompensation = jsonObj.getAsJsonArray("compensation");
        if (jsonArraycompensation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compensation").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `compensation` to be an array in the JSON string but got `%s`", jsonObj.get("compensation").toString()));
          }

          // validate the optional field `compensation` (array)
          for (int i = 0; i < jsonArraycompensation.size(); i++) {
            CompensationResponse.validateJsonObject(jsonArraycompensation.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("managerEmployee") != null && !jsonObj.get("managerEmployee").isJsonNull()) {
        JsonArray jsonArraymanagerEmployee = jsonObj.getAsJsonArray("managerEmployee");
        if (jsonArraymanagerEmployee != null) {
          // ensure the json data is an array
          if (!jsonObj.get("managerEmployee").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `managerEmployee` to be an array in the JSON string but got `%s`", jsonObj.get("managerEmployee").toString()));
          }

          // validate the optional field `managerEmployee` (array)
          for (int i = 0; i < jsonArraymanagerEmployee.size(); i++) {
            EmployeeResponse.validateJsonObject(jsonArraymanagerEmployee.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teamReference") != null && !jsonObj.get("teamReference").isJsonNull()) {
        JsonArray jsonArrayteamReference = jsonObj.getAsJsonArray("teamReference");
        if (jsonArrayteamReference != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teamReference").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teamReference` to be an array in the JSON string but got `%s`", jsonObj.get("teamReference").toString()));
          }

          // validate the optional field `teamReference` (array)
          for (int i = 0; i < jsonArrayteamReference.size(); i++) {
            EmployeeTeamReferenceResponse.validateJsonObject(jsonArrayteamReference.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeGetOneRelationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeGetOneRelationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeGetOneRelationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeGetOneRelationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeGetOneRelationsResponse>() {
           @Override
           public void write(JsonWriter out, EmployeeGetOneRelationsResponse value) throws IOException {
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
           public EmployeeGetOneRelationsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeGetOneRelationsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeGetOneRelationsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeGetOneRelationsResponse
  * @throws IOException if the JSON string is invalid with respect to EmployeeGetOneRelationsResponse
  */
  public static EmployeeGetOneRelationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeGetOneRelationsResponse.class);
  }

 /**
  * Convert an instance of EmployeeGetOneRelationsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

