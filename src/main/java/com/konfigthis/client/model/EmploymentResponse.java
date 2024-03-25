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
 * EmploymentResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private String typeId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public static final String SERIALIZED_NAME_TERMINATED = "terminated";
  @SerializedName(SERIALIZED_NAME_TERMINATED)
  private Boolean terminated;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  /**
   * Gets or Sets country
   */
  @JsonAdapter(CountryEnum.Adapter.class)
 public enum CountryEnum {
    SE("SE"),
    
    FALSE("false"),
    
    DK("DK"),
    
    FI("FI"),
    
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    DZ("DZ"),
    
    AS("AS"),
    
    AD("AD"),
    
    AO("AO"),
    
    AI("AI"),
    
    AQ("AQ"),
    
    AG("AG"),
    
    AR("AR"),
    
    AM("AM"),
    
    AW("AW"),
    
    AU("AU"),
    
    AT("AT"),
    
    AZ("AZ"),
    
    BS("BS"),
    
    BH("BH"),
    
    BD("BD"),
    
    BB("BB"),
    
    BY("BY"),
    
    BE("BE"),
    
    BZ("BZ"),
    
    BJ("BJ"),
    
    BM("BM"),
    
    BT("BT"),
    
    BO("BO"),
    
    BA("BA"),
    
    BW("BW"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    BN("BN"),
    
    BG("BG"),
    
    BF("BF"),
    
    BI("BI"),
    
    KH("KH"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    KY("KY"),
    
    CF("CF"),
    
    TD("TD"),
    
    CL("CL"),
    
    CN("CN"),
    
    CX("CX"),
    
    CC("CC"),
    
    CO("CO"),
    
    KM("KM"),
    
    CG("CG"),
    
    CD("CD"),
    
    CK("CK"),
    
    CR("CR"),
    
    CI("CI"),
    
    HR("HR"),
    
    CU("CU"),
    
    CY("CY"),
    
    CZ("CZ"),
    
    DJ("DJ"),
    
    DM("DM"),
    
    DO("DO"),
    
    EC("EC"),
    
    EG("EG"),
    
    SV("SV"),
    
    GQ("GQ"),
    
    ER("ER"),
    
    EE("EE"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FJ("FJ"),
    
    FR("FR"),
    
    GF("GF"),
    
    PF("PF"),
    
    TF("TF"),
    
    GA("GA"),
    
    GM("GM"),
    
    GE("GE"),
    
    DE("DE"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GD("GD"),
    
    GP("GP"),
    
    GU("GU"),
    
    GT("GT"),
    
    GG("GG"),
    
    GN("GN"),
    
    GW("GW"),
    
    GY("GY"),
    
    HT("HT"),
    
    HM("HM"),
    
    VA("VA"),
    
    HN("HN"),
    
    HK("HK"),
    
    HU("HU"),
    
    IS("IS"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IQ("IQ"),
    
    IE("IE"),
    
    IM("IM"),
    
    IL("IL"),
    
    IT("IT"),
    
    JM("JM"),
    
    JP("JP"),
    
    JE("JE"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KI("KI"),
    
    KP("KP"),
    
    KR("KR"),
    
    KW("KW"),
    
    KG("KG"),
    
    LA("LA"),
    
    LV("LV"),
    
    LB("LB"),
    
    LS("LS"),
    
    LR("LR"),
    
    LY("LY"),
    
    LI("LI"),
    
    LT("LT"),
    
    LU("LU"),
    
    MO("MO"),
    
    MK("MK"),
    
    MG("MG"),
    
    MW("MW"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    MH("MH"),
    
    MQ("MQ"),
    
    MR("MR"),
    
    MU("MU"),
    
    YT("YT"),
    
    MX("MX"),
    
    FM("FM"),
    
    MD("MD"),
    
    MC("MC"),
    
    MN("MN"),
    
    MS("MS"),
    
    MA("MA"),
    
    MZ("MZ"),
    
    MM("MM"),
    
    NA("NA"),
    
    NR("NR"),
    
    NP("NP"),
    
    NL("NL"),
    
    AN("AN"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NI("NI"),
    
    NE("NE"),
    
    NG("NG"),
    
    NU("NU"),
    
    NF("NF"),
    
    MP("MP"),
    
    OM("OM"),
    
    PK("PK"),
    
    PW("PW"),
    
    PS("PS"),
    
    PA("PA"),
    
    PG("PG"),
    
    PY("PY"),
    
    PE("PE"),
    
    PH("PH"),
    
    PN("PN"),
    
    PL("PL"),
    
    PT("PT"),
    
    PR("PR"),
    
    QA("QA"),
    
    RE("RE"),
    
    RO("RO"),
    
    RU("RU"),
    
    RW("RW"),
    
    SH("SH"),
    
    KN("KN"),
    
    LC("LC"),
    
    PM("PM"),
    
    VC("VC"),
    
    WS("WS"),
    
    SM("SM"),
    
    ST("ST"),
    
    SA("SA"),
    
    SN("SN"),
    
    CS("CS"),
    
    SC("SC"),
    
    SL("SL"),
    
    SG("SG"),
    
    SK("SK"),
    
    SI("SI"),
    
    SB("SB"),
    
    SO("SO"),
    
    ZA("ZA"),
    
    GS("GS"),
    
    ES("ES"),
    
    LK("LK"),
    
    SD("SD"),
    
    SR("SR"),
    
    SJ("SJ"),
    
    SZ("SZ"),
    
    CH("CH"),
    
    SY("SY"),
    
    TW("TW"),
    
    TJ("TJ"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TL("TL"),
    
    TG("TG"),
    
    TK("TK"),
    
    TO("TO"),
    
    TT("TT"),
    
    TN("TN"),
    
    TR("TR"),
    
    TM("TM"),
    
    TC("TC"),
    
    TV("TV"),
    
    UG("UG"),
    
    UA("UA"),
    
    AE("AE"),
    
    GB("GB"),
    
    US("US"),
    
    UM("UM"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    VU("VU"),
    
    VE("VE"),
    
    VN("VN"),
    
    VG("VG"),
    
    VI("VI"),
    
    WF("WF"),
    
    EH("EH"),
    
    YE("YE"),
    
    ZM("ZM"),
    
    ZW("ZW");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryEnum fromValue(String value) {
      for (CountryEnum b : CountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryEnum country;

  public EmploymentResponse() {
  }

  public EmploymentResponse id(String id) {
    
    
    
    
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


  public EmploymentResponse companyId(String companyId) {
    
    
    
    
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


  public EmploymentResponse employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public EmploymentResponse typeId(String typeId) {
    
    
    
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")

  public String getTypeId() {
    return typeId;
  }


  public void setTypeId(String typeId) {
    
    
    
    this.typeId = typeId;
  }


  public EmploymentResponse startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public EmploymentResponse endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public EmploymentResponse updated(OffsetDateTime updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    
    
    
    this.updated = updated;
  }


  public EmploymentResponse effectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Get effectiveEndDate
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    this.effectiveEndDate = effectiveEndDate;
  }


  public EmploymentResponse terminated(Boolean terminated) {
    
    
    
    
    this.terminated = terminated;
    return this;
  }

   /**
   * Get terminated
   * @return terminated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTerminated() {
    return terminated;
  }


  public void setTerminated(Boolean terminated) {
    
    
    
    this.terminated = terminated;
  }


  public EmploymentResponse rate(Double rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

  public EmploymentResponse rate(Integer rate) {
    
    
    
    
    this.rate = rate.doubleValue();
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    
    
    
    this.rate = rate;
  }


  public EmploymentResponse note(String note) {
    
    
    
    
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


  public EmploymentResponse country(CountryEnum country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SE", required = true, value = "")

  public CountryEnum getCountry() {
    return country;
  }


  public void setCountry(CountryEnum country) {
    
    
    
    this.country = country;
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
   * @return the EmploymentResponse instance itself
   */
  public EmploymentResponse putAdditionalProperty(String key, Object value) {
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
    EmploymentResponse employmentResponse = (EmploymentResponse) o;
    return Objects.equals(this.id, employmentResponse.id) &&
        Objects.equals(this.companyId, employmentResponse.companyId) &&
        Objects.equals(this.employeeId, employmentResponse.employeeId) &&
        Objects.equals(this.typeId, employmentResponse.typeId) &&
        Objects.equals(this.startDate, employmentResponse.startDate) &&
        Objects.equals(this.endDate, employmentResponse.endDate) &&
        Objects.equals(this.updated, employmentResponse.updated) &&
        Objects.equals(this.effectiveEndDate, employmentResponse.effectiveEndDate) &&
        Objects.equals(this.terminated, employmentResponse.terminated) &&
        Objects.equals(this.rate, employmentResponse.rate) &&
        Objects.equals(this.note, employmentResponse.note) &&
        Objects.equals(this.country, employmentResponse.country)&&
        Objects.equals(this.additionalProperties, employmentResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, employeeId, typeId, startDate, endDate, updated, effectiveEndDate, terminated, rate, note, country, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("typeId");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("updated");
    openapiFields.add("effectiveEndDate");
    openapiFields.add("terminated");
    openapiFields.add("rate");
    openapiFields.add("note");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("companyId");
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("typeId");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("terminated");
    openapiRequiredFields.add("rate");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentResponse is not found in the empty JSON string", EmploymentResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmploymentResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("typeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeId").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentResponse>() {
           @Override
           public void write(JsonWriter out, EmploymentResponse value) throws IOException {
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
           public EmploymentResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentResponse
  * @throws IOException if the JSON string is invalid with respect to EmploymentResponse
  */
  public static EmploymentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentResponse.class);
  }

 /**
  * Convert an instance of EmploymentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

