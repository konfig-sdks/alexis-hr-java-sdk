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
 * CreateCompensationRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateCompensationRequest {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  /**
   * Gets or Sets currency
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
 public enum CurrencyEnum {
    SEK("SEK"),
    
    NOK("NOK"),
    
    DKK("DKK"),
    
    EUR("EUR"),
    
    USD("USD"),
    
    AED("AED"),
    
    AFN("AFN"),
    
    ALL("ALL"),
    
    AMD("AMD"),
    
    ANG("ANG"),
    
    AOA("AOA"),
    
    ARS("ARS"),
    
    AUD("AUD"),
    
    AWG("AWG"),
    
    AZN("AZN"),
    
    BAM("BAM"),
    
    BBD("BBD"),
    
    BDT("BDT"),
    
    BGN("BGN"),
    
    BHD("BHD"),
    
    BIF("BIF"),
    
    BMD("BMD"),
    
    BND("BND"),
    
    BOB("BOB"),
    
    BRL("BRL"),
    
    BSD("BSD"),
    
    BTC("BTC"),
    
    BTN("BTN"),
    
    BWP("BWP"),
    
    BYN("BYN"),
    
    BZD("BZD"),
    
    CAD("CAD"),
    
    CDF("CDF"),
    
    CHF("CHF"),
    
    CLF("CLF"),
    
    CLP("CLP"),
    
    CNH("CNH"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    CRC("CRC"),
    
    CUC("CUC"),
    
    CUP("CUP"),
    
    CVE("CVE"),
    
    CZK("CZK"),
    
    DJF("DJF"),
    
    DOP("DOP"),
    
    DZD("DZD"),
    
    EGP("EGP"),
    
    ERN("ERN"),
    
    ETB("ETB"),
    
    FJD("FJD"),
    
    FKP("FKP"),
    
    GBP("GBP"),
    
    GEL("GEL"),
    
    GGP("GGP"),
    
    GHS("GHS"),
    
    GIP("GIP"),
    
    GMD("GMD"),
    
    GNF("GNF"),
    
    GTQ("GTQ"),
    
    GYD("GYD"),
    
    HKD("HKD"),
    
    HNL("HNL"),
    
    HRK("HRK"),
    
    HTG("HTG"),
    
    HUF("HUF"),
    
    IDR("IDR"),
    
    ILS("ILS"),
    
    IMP("IMP"),
    
    INR("INR"),
    
    IQD("IQD"),
    
    IRR("IRR"),
    
    ISK("ISK"),
    
    JEP("JEP"),
    
    JMD("JMD"),
    
    JOD("JOD"),
    
    JPY("JPY"),
    
    KES("KES"),
    
    KGS("KGS"),
    
    KHR("KHR"),
    
    KMF("KMF"),
    
    KPW("KPW"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KYD("KYD"),
    
    KZT("KZT"),
    
    LAK("LAK"),
    
    LBP("LBP"),
    
    LKR("LKR"),
    
    LRD("LRD"),
    
    LSL("LSL"),
    
    LYD("LYD"),
    
    MAD("MAD"),
    
    MDL("MDL"),
    
    MGA("MGA"),
    
    MKD("MKD"),
    
    MMK("MMK"),
    
    MNT("MNT"),
    
    MOP("MOP"),
    
    MRO("MRO"),
    
    MRU("MRU"),
    
    MUR("MUR"),
    
    MVR("MVR"),
    
    MWK("MWK"),
    
    MXN("MXN"),
    
    MYR("MYR"),
    
    MZN("MZN"),
    
    NAD("NAD"),
    
    NGN("NGN"),
    
    NIO("NIO"),
    
    NPR("NPR"),
    
    NZD("NZD"),
    
    OMR("OMR"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PGK("PGK"),
    
    PHP("PHP"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    PYG("PYG"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RSD("RSD"),
    
    RUB("RUB"),
    
    RWF("RWF"),
    
    SAR("SAR"),
    
    SBD("SBD"),
    
    SCR("SCR"),
    
    SDG("SDG"),
    
    SGD("SGD"),
    
    SHP("SHP"),
    
    SLL("SLL"),
    
    SOS("SOS"),
    
    SRD("SRD"),
    
    SSP("SSP"),
    
    STD("STD"),
    
    STN("STN"),
    
    SVC("SVC"),
    
    SYP("SYP"),
    
    SZL("SZL"),
    
    THB("THB"),
    
    TJS("TJS"),
    
    TMT("TMT"),
    
    TND("TND"),
    
    TOP("TOP"),
    
    TRY("TRY"),
    
    TTD("TTD"),
    
    TWD("TWD"),
    
    TZS("TZS"),
    
    UAH("UAH"),
    
    UGX("UGX"),
    
    UYU("UYU"),
    
    UZS("UZS"),
    
    VEF("VEF"),
    
    VND("VND"),
    
    VUV("VUV"),
    
    WST("WST"),
    
    XAF("XAF"),
    
    XAG("XAG"),
    
    XAU("XAU"),
    
    XCD("XCD"),
    
    XDR("XDR"),
    
    XOF("XOF"),
    
    XPD("XPD"),
    
    XPF("XPF"),
    
    XPT("XPT"),
    
    YER("YER"),
    
    ZAR("ZAR"),
    
    ZMW("ZMW"),
    
    ZWL("ZWL");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyEnum currency;

  public static final String SERIALIZED_NAME_PAYOUT_DAY = "payoutDay";
  @SerializedName(SERIALIZED_NAME_PAYOUT_DAY)
  private Double payoutDay;

  /**
   * Gets or Sets payoutPeriod
   */
  @JsonAdapter(PayoutPeriodEnum.Adapter.class)
 public enum PayoutPeriodEnum {
    HOURLY("HOURLY"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    BI_WEEKLY("BI_WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    ANNUAL("ANNUAL");

    private String value;

    PayoutPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutPeriodEnum fromValue(String value) {
      for (PayoutPeriodEnum b : PayoutPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayoutPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayoutPeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYOUT_PERIOD = "payoutPeriod";
  @SerializedName(SERIALIZED_NAME_PAYOUT_PERIOD)
  private PayoutPeriodEnum payoutPeriod;

  /**
   * Gets or Sets payoutFrequency
   */
  @JsonAdapter(PayoutFrequencyEnum.Adapter.class)
 public enum PayoutFrequencyEnum {
    WEEK("WEEK"),
    
    BI_WEEKLY("BI_WEEKLY"),
    
    MONTH("MONTH");

    private String value;

    PayoutFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutFrequencyEnum fromValue(String value) {
      for (PayoutFrequencyEnum b : PayoutFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayoutFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayoutFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYOUT_FREQUENCY = "payoutFrequency";
  @SerializedName(SERIALIZED_NAME_PAYOUT_FREQUENCY)
  private PayoutFrequencyEnum payoutFrequency;

  /**
   * Gets or Sets salarySchedule
   */
  @JsonAdapter(SalaryScheduleEnum.Adapter.class)
 public enum SalaryScheduleEnum {
    ADVANCE("ADVANCE"),
    
    DELAYED("DELAYED");

    private String value;

    SalaryScheduleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SalaryScheduleEnum fromValue(String value) {
      for (SalaryScheduleEnum b : SalaryScheduleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SalaryScheduleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalaryScheduleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SalaryScheduleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SalaryScheduleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SALARY_SCHEDULE = "salarySchedule";
  @SerializedName(SERIALIZED_NAME_SALARY_SCHEDULE)
  private SalaryScheduleEnum salarySchedule;

  public static final String SERIALIZED_NAME_PAID_OVERTIME = "paidOvertime";
  @SerializedName(SERIALIZED_NAME_PAID_OVERTIME)
  private Boolean paidOvertime;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public CreateCompensationRequest() {
  }

  public CreateCompensationRequest employeeId(String employeeId) {
    
    
    
    
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


  public CreateCompensationRequest userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", required = true, value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public CreateCompensationRequest companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public CreateCompensationRequest amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public CreateCompensationRequest amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public CreateCompensationRequest effectiveDate(String effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public CreateCompensationRequest currency(CurrencyEnum currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SEK", required = true, value = "")

  public CurrencyEnum getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyEnum currency) {
    
    
    
    this.currency = currency;
  }


  public CreateCompensationRequest payoutDay(Double payoutDay) {
    
    
    
    
    this.payoutDay = payoutDay;
    return this;
  }

  public CreateCompensationRequest payoutDay(Integer payoutDay) {
    
    
    
    
    this.payoutDay = payoutDay.doubleValue();
    return this;
  }

   /**
   * Get payoutDay
   * @return payoutDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "25", required = true, value = "")

  public Double getPayoutDay() {
    return payoutDay;
  }


  public void setPayoutDay(Double payoutDay) {
    
    
    
    this.payoutDay = payoutDay;
  }


  public CreateCompensationRequest payoutPeriod(PayoutPeriodEnum payoutPeriod) {
    
    
    
    
    this.payoutPeriod = payoutPeriod;
    return this;
  }

   /**
   * Get payoutPeriod
   * @return payoutPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MONTHLY", required = true, value = "")

  public PayoutPeriodEnum getPayoutPeriod() {
    return payoutPeriod;
  }


  public void setPayoutPeriod(PayoutPeriodEnum payoutPeriod) {
    
    
    
    this.payoutPeriod = payoutPeriod;
  }


  public CreateCompensationRequest payoutFrequency(PayoutFrequencyEnum payoutFrequency) {
    
    
    
    
    this.payoutFrequency = payoutFrequency;
    return this;
  }

   /**
   * Get payoutFrequency
   * @return payoutFrequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MONTH", required = true, value = "")

  public PayoutFrequencyEnum getPayoutFrequency() {
    return payoutFrequency;
  }


  public void setPayoutFrequency(PayoutFrequencyEnum payoutFrequency) {
    
    
    
    this.payoutFrequency = payoutFrequency;
  }


  public CreateCompensationRequest salarySchedule(SalaryScheduleEnum salarySchedule) {
    
    
    
    
    this.salarySchedule = salarySchedule;
    return this;
  }

   /**
   * Get salarySchedule
   * @return salarySchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADVANCE", value = "")

  public SalaryScheduleEnum getSalarySchedule() {
    return salarySchedule;
  }


  public void setSalarySchedule(SalaryScheduleEnum salarySchedule) {
    
    
    
    this.salarySchedule = salarySchedule;
  }


  public CreateCompensationRequest paidOvertime(Boolean paidOvertime) {
    
    
    
    
    this.paidOvertime = paidOvertime;
    return this;
  }

   /**
   * Get paidOvertime
   * @return paidOvertime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getPaidOvertime() {
    return paidOvertime;
  }


  public void setPaidOvertime(Boolean paidOvertime) {
    
    
    
    this.paidOvertime = paidOvertime;
  }


  public CreateCompensationRequest note(String note) {
    
    
    
    
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
   * @return the CreateCompensationRequest instance itself
   */
  public CreateCompensationRequest putAdditionalProperty(String key, Object value) {
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
    CreateCompensationRequest createCompensationRequest = (CreateCompensationRequest) o;
    return Objects.equals(this.employeeId, createCompensationRequest.employeeId) &&
        Objects.equals(this.userId, createCompensationRequest.userId) &&
        Objects.equals(this.companyId, createCompensationRequest.companyId) &&
        Objects.equals(this.amount, createCompensationRequest.amount) &&
        Objects.equals(this.effectiveDate, createCompensationRequest.effectiveDate) &&
        Objects.equals(this.currency, createCompensationRequest.currency) &&
        Objects.equals(this.payoutDay, createCompensationRequest.payoutDay) &&
        Objects.equals(this.payoutPeriod, createCompensationRequest.payoutPeriod) &&
        Objects.equals(this.payoutFrequency, createCompensationRequest.payoutFrequency) &&
        Objects.equals(this.salarySchedule, createCompensationRequest.salarySchedule) &&
        Objects.equals(this.paidOvertime, createCompensationRequest.paidOvertime) &&
        Objects.equals(this.note, createCompensationRequest.note)&&
        Objects.equals(this.additionalProperties, createCompensationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, userId, companyId, amount, effectiveDate, currency, payoutDay, payoutPeriod, payoutFrequency, salarySchedule, paidOvertime, note, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompensationRequest {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payoutDay: ").append(toIndentedString(payoutDay)).append("\n");
    sb.append("    payoutPeriod: ").append(toIndentedString(payoutPeriod)).append("\n");
    sb.append("    payoutFrequency: ").append(toIndentedString(payoutFrequency)).append("\n");
    sb.append("    salarySchedule: ").append(toIndentedString(salarySchedule)).append("\n");
    sb.append("    paidOvertime: ").append(toIndentedString(paidOvertime)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("userId");
    openapiFields.add("companyId");
    openapiFields.add("amount");
    openapiFields.add("effectiveDate");
    openapiFields.add("currency");
    openapiFields.add("payoutDay");
    openapiFields.add("payoutPeriod");
    openapiFields.add("payoutFrequency");
    openapiFields.add("salarySchedule");
    openapiFields.add("paidOvertime");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("effectiveDate");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("payoutDay");
    openapiRequiredFields.add("payoutPeriod");
    openapiRequiredFields.add("payoutFrequency");
    openapiRequiredFields.add("paidOvertime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCompensationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCompensationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompensationRequest is not found in the empty JSON string", CreateCompensationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompensationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if (!jsonObj.get("effectiveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveDate").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("payoutPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payoutPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payoutPeriod").toString()));
      }
      if (!jsonObj.get("payoutFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payoutFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payoutFrequency").toString()));
      }
      if ((jsonObj.get("salarySchedule") != null && !jsonObj.get("salarySchedule").isJsonNull()) && !jsonObj.get("salarySchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salarySchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salarySchedule").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompensationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompensationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompensationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompensationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompensationRequest>() {
           @Override
           public void write(JsonWriter out, CreateCompensationRequest value) throws IOException {
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
           public CreateCompensationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateCompensationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateCompensationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompensationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCompensationRequest
  */
  public static CreateCompensationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompensationRequest.class);
  }

 /**
  * Convert an instance of CreateCompensationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
