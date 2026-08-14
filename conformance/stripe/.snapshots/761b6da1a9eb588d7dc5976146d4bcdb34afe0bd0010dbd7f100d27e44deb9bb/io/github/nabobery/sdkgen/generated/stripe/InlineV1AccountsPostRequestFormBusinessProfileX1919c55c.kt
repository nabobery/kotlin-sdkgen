package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Business information about the account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_profile
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileX1919c55c.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileX1919c55c(
  public val annualRevenue:
      InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueXdc054527? = null,
  public val estimatedWorkerCount: Int? = null,
  public val mcc: String? = null,
  minorityOwnedBusinessDesignation: List<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613>? = null,
  public val monthlyEstimatedRevenue:
      InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueXcb3827a2? = null,
  public val name: String? = null,
  public val productDescription: String? = null,
  public val supportAddress:
      InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX8ce68f99? = null,
  public val supportEmail: String? = null,
  public val supportPhone: String? = null,
  public val supportUrl: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8? = null,
  public val url: String? = null,
) {
  public val minorityOwnedBusinessDesignation:
      List<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613>? =
      minorityOwnedBusinessDesignation?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var annualRevenue: InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueXdc054527?
        = null

    public var estimatedWorkerCount: Int? = null

    public var mcc: String? = null

    private var minorityOwnedBusinessDesignationValue:
        List<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613>? = null

    public var minorityOwnedBusinessDesignation:
        List<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613>?
      get() = minorityOwnedBusinessDesignationValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        minorityOwnedBusinessDesignationValue = value?.let { collection0 -> collection0.toList() }
      }

    public var monthlyEstimatedRevenue:
        InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueXcb3827a2? = null

    public var name: String? = null

    public var productDescription: String? = null

    public var supportAddress:
        InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX8ce68f99? = null

    public var supportEmail: String? = null

    public var supportPhone: String? = null

    public var supportUrl: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8? = null

    public var url: String? = null

    public fun build(): InlineV1AccountsPostRequestFormBusinessProfileX1919c55c = InlineV1AccountsPostRequestFormBusinessProfileX1919c55c(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileX1919c55c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileX1919c55c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileX1919c55c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBusinessProfileX1919c55c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileX1919c55c must be a JSON object")
      return InlineV1AccountsPostRequestFormBusinessProfileX1919c55c(
        annualRevenue = rawObject["annual_revenue"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueXdc054527>(it) },
        estimatedWorkerCount = rawObject["estimated_worker_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        mcc = rawObject["mcc"]?.let { json.decodeFromJsonElement<String>(it) },
        minorityOwnedBusinessDesignation = rawObject["minority_owned_business_designation"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613>>(it) },
        monthlyEstimatedRevenue = rawObject["monthly_estimated_revenue"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueXcb3827a2>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<String>(it) },
        supportAddress = rawObject["support_address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX8ce68f99>(it) },
        supportEmail = rawObject["support_email"]?.let { json.decodeFromJsonElement<String>(it) },
        supportPhone = rawObject["support_phone"]?.let { json.decodeFromJsonElement<String>(it) },
        supportUrl = rawObject["support_url"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileX1919c55c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormBusinessProfileX1919c55c")
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
        value.supportUrl?.let { put("support_url", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormBusinessProfileX1919c55c(block: InlineV1AccountsPostRequestFormBusinessProfileX1919c55c.Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileX1919c55c = InlineV1AccountsPostRequestFormBusinessProfileX1919c55c.build(block)
