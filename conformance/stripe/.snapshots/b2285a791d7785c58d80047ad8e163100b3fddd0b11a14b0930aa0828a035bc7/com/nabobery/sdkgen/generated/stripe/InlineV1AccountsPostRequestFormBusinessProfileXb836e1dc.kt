package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc(
  public val annualRevenue:
      InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd? = null,
  public val estimatedWorkerCount: Int? = null,
  public val mcc: String? = null,
  minorityOwnedBusinessDesignation: List<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd>? = null,
  public val monthlyEstimatedRevenue:
      InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c? = null,
  public val name: String? = null,
  public val productDescription: String? = null,
  public val supportAddress:
      InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX33768a9c? = null,
  public val supportEmail: String? = null,
  public val supportPhone: String? = null,
  public val supportUrl: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd? = null,
  public val url: String? = null,
) {
  public val minorityOwnedBusinessDesignation:
      List<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd>? =
      minorityOwnedBusinessDesignation?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var annualRevenue: InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd?
        = null

    public var estimatedWorkerCount: Int? = null

    public var mcc: String? = null

    private var minorityOwnedBusinessDesignationValue:
        List<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd>? = null

    public var minorityOwnedBusinessDesignation:
        List<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd>?
      get() = minorityOwnedBusinessDesignationValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        minorityOwnedBusinessDesignationValue = value?.let { collection0 -> collection0.toList() }
      }

    public var monthlyEstimatedRevenue:
        InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c? = null

    public var name: String? = null

    public var productDescription: String? = null

    public var supportAddress:
        InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX33768a9c? = null

    public var supportEmail: String? = null

    public var supportPhone: String? = null

    public var supportUrl: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd? = null

    public var url: String? = null

    public fun build(): InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc = InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc must be a JSON object")
      return InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc(
        annualRevenue = rawObject["annual_revenue"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd>(it) },
        estimatedWorkerCount = rawObject["estimated_worker_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        mcc = rawObject["mcc"]?.let { json.decodeFromJsonElement<String>(it) },
        minorityOwnedBusinessDesignation = rawObject["minority_owned_business_designation"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd>>(it) },
        monthlyEstimatedRevenue = rawObject["monthly_estimated_revenue"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<String>(it) },
        supportAddress = rawObject["support_address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportAddressX33768a9c>(it) },
        supportEmail = rawObject["support_email"]?.let { json.decodeFromJsonElement<String>(it) },
        supportPhone = rawObject["support_phone"]?.let { json.decodeFromJsonElement<String>(it) },
        supportUrl = rawObject["support_url"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc")
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

public fun inlineV1AccountsPostRequestFormBusinessProfileXb836e1dc(block: InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc.Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc = InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc.build(block)
