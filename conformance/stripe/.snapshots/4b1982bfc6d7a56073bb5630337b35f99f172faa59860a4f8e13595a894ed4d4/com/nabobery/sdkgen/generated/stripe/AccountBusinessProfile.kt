package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class AccountBusinessProfileView internal constructor(
  @SerialName("annual_revenue")
  public val annualRevenue: InlineAccountBusinessProfileAnnualRevenueX7589bbd6? = null,
  @SerialName("estimated_worker_count")
  public val estimatedWorkerCount: Int? = null,
  public val mcc: String? = null,
  @SerialName("minority_owned_business_designation")
  public val minorityOwnedBusinessDesignation:
      List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>? = null,
  @SerialName("monthly_estimated_revenue")
  public val monthlyEstimatedRevenue: AccountMonthlyEstimatedRevenue? = null,
  public val name: String? = null,
  @SerialName("product_description")
  public val productDescription: String? = null,
  @SerialName("support_address")
  public val supportAddress: InlineAccountBusinessProfileSupportAddressX4693a646? = null,
  @SerialName("support_email")
  public val supportEmail: String? = null,
  @SerialName("support_phone")
  public val supportPhone: String? = null,
  @SerialName("support_url")
  public val supportUrl: String? = null,
  public val url: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_business_profile
 */
@Serializable(with = AccountBusinessProfile.Serializer::class)
public class AccountBusinessProfile(
  /**
   * The applicant's gross annual revenue for its preceding fiscal year.
   */
  public val annualRevenue: InlineAccountBusinessProfileAnnualRevenueX7589bbd6? = null,
  /**
   * An estimated upper bound of employees, contractors, vendors, etc. currently working for the business.
   */
  public val estimatedWorkerCount: Int? = null,
  /**
   * [The merchant category code for the account](/connect/setting-mcc). MCCs are used to classify businesses based on
   * the goods or services they provide.
   */
  public val mcc: String? = null,
  minorityOwnedBusinessDesignation: List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>? = null,
  public val monthlyEstimatedRevenue: AccountMonthlyEstimatedRevenue? = null,
  /**
   * The customer-facing business name.
   */
  public val name: String? = null,
  /**
   * Internal-only description of the product sold or service provided by the business. It's used by Stripe for risk and
   * underwriting purposes.
   */
  public val productDescription: String? = null,
  /**
   * A publicly available mailing address for sending support issues to.
   */
  public val supportAddress: InlineAccountBusinessProfileSupportAddressX4693a646? = null,
  /**
   * A publicly available email address for sending support issues to.
   */
  public val supportEmail: String? = null,
  /**
   * A publicly available phone number to call with support issues.
   */
  public val supportPhone: String? = null,
  /**
   * A publicly available website for handling support issues.
   */
  public val supportUrl: String? = null,
  /**
   * The business's publicly available website.
   */
  public val url: String? = null,
) {
  /**
   * Whether the business is a minority-owned, women-owned, and/or LGBTQI+ -owned business.
   */
  public val minorityOwnedBusinessDesignation:
      List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>? =
      minorityOwnedBusinessDesignation?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The applicant's gross annual revenue for its preceding fiscal year.
     */
    public var annualRevenue: InlineAccountBusinessProfileAnnualRevenueX7589bbd6? = null

    /**
     * An estimated upper bound of employees, contractors, vendors, etc. currently working for the business.
     */
    public var estimatedWorkerCount: Int? = null

    /**
     * [The merchant category code for the account](/connect/setting-mcc). MCCs are used to classify businesses based on
     * the goods or services they provide.
     */
    public var mcc: String? = null

    private var minorityOwnedBusinessDesignationValue:
        List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>? = null

    /**
     * Whether the business is a minority-owned, women-owned, and/or LGBTQI+ -owned business.
     */
    public var minorityOwnedBusinessDesignation:
        List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>?
      get() = minorityOwnedBusinessDesignationValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        minorityOwnedBusinessDesignationValue = value?.let { collection0 -> collection0.toList() }
      }

    public var monthlyEstimatedRevenue: AccountMonthlyEstimatedRevenue? = null

    /**
     * The customer-facing business name.
     */
    public var name: String? = null

    /**
     * Internal-only description of the product sold or service provided by the business. It's used by Stripe for risk
     * and underwriting purposes.
     */
    public var productDescription: String? = null

    /**
     * A publicly available mailing address for sending support issues to.
     */
    public var supportAddress: InlineAccountBusinessProfileSupportAddressX4693a646? = null

    /**
     * A publicly available email address for sending support issues to.
     */
    public var supportEmail: String? = null

    /**
     * A publicly available phone number to call with support issues.
     */
    public var supportPhone: String? = null

    /**
     * A publicly available website for handling support issues.
     */
    public var supportUrl: String? = null

    /**
     * The business's publicly available website.
     */
    public var url: String? = null

    public fun build(): AccountBusinessProfile = AccountBusinessProfile(
      annualRevenue = annualRevenue,
      estimatedWorkerCount = estimatedWorkerCount,
      mcc = mcc,
      minorityOwnedBusinessDesignation = minorityOwnedBusinessDesignation,
      monthlyEstimatedRevenue = monthlyEstimatedRevenue,
      name = name,
      productDescription = productDescription,
      supportAddress = supportAddress,
      supportEmail = supportEmail,
      supportPhone = supportPhone,
      supportUrl = supportUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountBusinessProfile = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountBusinessProfile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountBusinessProfile {
      val jsonDecoder = decoder.requireJsonDecoder("AccountBusinessProfile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountBusinessProfile must be a JSON object")
      return AccountBusinessProfile(
        annualRevenue = rawObject["annual_revenue"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountBusinessProfileAnnualRevenueX7589bbd6?>(element) },
        estimatedWorkerCount = rawObject["estimated_worker_count"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        mcc = rawObject["mcc"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        minorityOwnedBusinessDesignation = rawObject["minority_owned_business_designation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineAccountBusinessProfileMinorityOwnedBusinessDesignationItemX7ae94485>?>(element) },
        monthlyEstimatedRevenue = rawObject["monthly_estimated_revenue"]?.let { json.decodeFromJsonElement<AccountMonthlyEstimatedRevenue>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        productDescription = rawObject["product_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        supportAddress = rawObject["support_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountBusinessProfileSupportAddressX4693a646?>(element) },
        supportEmail = rawObject["support_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        supportPhone = rawObject["support_phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        supportUrl = rawObject["support_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountBusinessProfile) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountBusinessProfile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.annualRevenue?.let { put("annual_revenue", json.encodeToJsonElement(it)) }
        value.estimatedWorkerCount?.let { put("estimated_worker_count", json.encodeToJsonElement(it)) }
        value.mcc?.let { put("mcc", it) }
        value.minorityOwnedBusinessDesignation?.let { put("minority_owned_business_designation", json.encodeToJsonElement(it)) }
        value.monthlyEstimatedRevenue?.let { put("monthly_estimated_revenue", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.productDescription?.let { put("product_description", it) }
        value.supportAddress?.let { put("support_address", json.encodeToJsonElement(it)) }
        value.supportEmail?.let { put("support_email", it) }
        value.supportPhone?.let { put("support_phone", it) }
        value.supportUrl?.let { put("support_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountBusinessProfile(block: AccountBusinessProfile.Builder.() -> Unit): AccountBusinessProfile = AccountBusinessProfile.build(block)
