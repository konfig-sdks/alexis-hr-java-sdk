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
 * LeavetypeGetManyLeaveTypesFiltersParameter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeavetypeGetManyLeaveTypesFiltersParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private CompanyListManyCompaniesFiltersParameterId id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private CompanyListManyCompaniesFiltersParameterId name;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private CompanyListManyCompaniesFiltersParameterId kind;

  public static final String SERIALIZED_NAME_MINIMUM_DURATION = "minimumDuration";
  @SerializedName(SERIALIZED_NAME_MINIMUM_DURATION)
  private CompanyListManyCompaniesFiltersParameterId minimumDuration;

  public static final String SERIALIZED_NAME_DEDUCTIBLE = "deductible";
  @SerializedName(SERIALIZED_NAME_DEDUCTIBLE)
  private CompanyListManyCompaniesFiltersParameterId deductible;

  public static final String SERIALIZED_NAME_PAID = "paid";
  @SerializedName(SERIALIZED_NAME_PAID)
  private CompanyListManyCompaniesFiltersParameterId paid;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private CompanyListManyCompaniesFiltersParameterId disabled;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private CompanyListManyCompaniesFiltersParameterId archived;

  public LeavetypeGetManyLeaveTypesFiltersParameter() {
  }

  public LeavetypeGetManyLeaveTypesFiltersParameter id(CompanyListManyCompaniesFiltersParameterId id) {
    
    
    
    
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


  public LeavetypeGetManyLeaveTypesFiltersParameter name(CompanyListManyCompaniesFiltersParameterId name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getName() {
    return name;
  }


  public void setName(CompanyListManyCompaniesFiltersParameterId name) {
    
    
    
    this.name = name;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter kind(CompanyListManyCompaniesFiltersParameterId kind) {
    
    
    
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getKind() {
    return kind;
  }


  public void setKind(CompanyListManyCompaniesFiltersParameterId kind) {
    
    
    
    this.kind = kind;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter minimumDuration(CompanyListManyCompaniesFiltersParameterId minimumDuration) {
    
    
    
    
    this.minimumDuration = minimumDuration;
    return this;
  }

   /**
   * Get minimumDuration
   * @return minimumDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getMinimumDuration() {
    return minimumDuration;
  }


  public void setMinimumDuration(CompanyListManyCompaniesFiltersParameterId minimumDuration) {
    
    
    
    this.minimumDuration = minimumDuration;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter deductible(CompanyListManyCompaniesFiltersParameterId deductible) {
    
    
    
    
    this.deductible = deductible;
    return this;
  }

   /**
   * Get deductible
   * @return deductible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getDeductible() {
    return deductible;
  }


  public void setDeductible(CompanyListManyCompaniesFiltersParameterId deductible) {
    
    
    
    this.deductible = deductible;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter paid(CompanyListManyCompaniesFiltersParameterId paid) {
    
    
    
    
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getPaid() {
    return paid;
  }


  public void setPaid(CompanyListManyCompaniesFiltersParameterId paid) {
    
    
    
    this.paid = paid;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter disabled(CompanyListManyCompaniesFiltersParameterId disabled) {
    
    
    
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getDisabled() {
    return disabled;
  }


  public void setDisabled(CompanyListManyCompaniesFiltersParameterId disabled) {
    
    
    
    this.disabled = disabled;
  }


  public LeavetypeGetManyLeaveTypesFiltersParameter archived(CompanyListManyCompaniesFiltersParameterId archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyListManyCompaniesFiltersParameterId getArchived() {
    return archived;
  }


  public void setArchived(CompanyListManyCompaniesFiltersParameterId archived) {
    
    
    
    this.archived = archived;
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
   * @return the LeavetypeGetManyLeaveTypesFiltersParameter instance itself
   */
  public LeavetypeGetManyLeaveTypesFiltersParameter putAdditionalProperty(String key, Object value) {
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
    LeavetypeGetManyLeaveTypesFiltersParameter leavetypeGetManyLeaveTypesFiltersParameter = (LeavetypeGetManyLeaveTypesFiltersParameter) o;
    return Objects.equals(this.id, leavetypeGetManyLeaveTypesFiltersParameter.id) &&
        Objects.equals(this.name, leavetypeGetManyLeaveTypesFiltersParameter.name) &&
        Objects.equals(this.kind, leavetypeGetManyLeaveTypesFiltersParameter.kind) &&
        Objects.equals(this.minimumDuration, leavetypeGetManyLeaveTypesFiltersParameter.minimumDuration) &&
        Objects.equals(this.deductible, leavetypeGetManyLeaveTypesFiltersParameter.deductible) &&
        Objects.equals(this.paid, leavetypeGetManyLeaveTypesFiltersParameter.paid) &&
        Objects.equals(this.disabled, leavetypeGetManyLeaveTypesFiltersParameter.disabled) &&
        Objects.equals(this.archived, leavetypeGetManyLeaveTypesFiltersParameter.archived)&&
        Objects.equals(this.additionalProperties, leavetypeGetManyLeaveTypesFiltersParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, kind, minimumDuration, deductible, paid, disabled, archived, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavetypeGetManyLeaveTypesFiltersParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    minimumDuration: ").append(toIndentedString(minimumDuration)).append("\n");
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("kind");
    openapiFields.add("minimumDuration");
    openapiFields.add("deductible");
    openapiFields.add("paid");
    openapiFields.add("disabled");
    openapiFields.add("archived");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeavetypeGetManyLeaveTypesFiltersParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeavetypeGetManyLeaveTypesFiltersParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeavetypeGetManyLeaveTypesFiltersParameter is not found in the empty JSON string", LeavetypeGetManyLeaveTypesFiltersParameter.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("id"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("kind"));
      }
      // validate the optional field `minimumDuration`
      if (jsonObj.get("minimumDuration") != null && !jsonObj.get("minimumDuration").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("minimumDuration"));
      }
      // validate the optional field `deductible`
      if (jsonObj.get("deductible") != null && !jsonObj.get("deductible").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("deductible"));
      }
      // validate the optional field `paid`
      if (jsonObj.get("paid") != null && !jsonObj.get("paid").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("paid"));
      }
      // validate the optional field `disabled`
      if (jsonObj.get("disabled") != null && !jsonObj.get("disabled").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("disabled"));
      }
      // validate the optional field `archived`
      if (jsonObj.get("archived") != null && !jsonObj.get("archived").isJsonNull()) {
        CompanyListManyCompaniesFiltersParameterId.validateJsonObject(jsonObj.getAsJsonObject("archived"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeavetypeGetManyLeaveTypesFiltersParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeavetypeGetManyLeaveTypesFiltersParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeavetypeGetManyLeaveTypesFiltersParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeavetypeGetManyLeaveTypesFiltersParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<LeavetypeGetManyLeaveTypesFiltersParameter>() {
           @Override
           public void write(JsonWriter out, LeavetypeGetManyLeaveTypesFiltersParameter value) throws IOException {
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
           public LeavetypeGetManyLeaveTypesFiltersParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeavetypeGetManyLeaveTypesFiltersParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LeavetypeGetManyLeaveTypesFiltersParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeavetypeGetManyLeaveTypesFiltersParameter
  * @throws IOException if the JSON string is invalid with respect to LeavetypeGetManyLeaveTypesFiltersParameter
  */
  public static LeavetypeGetManyLeaveTypesFiltersParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeavetypeGetManyLeaveTypesFiltersParameter.class);
  }

 /**
  * Convert an instance of LeavetypeGetManyLeaveTypesFiltersParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

