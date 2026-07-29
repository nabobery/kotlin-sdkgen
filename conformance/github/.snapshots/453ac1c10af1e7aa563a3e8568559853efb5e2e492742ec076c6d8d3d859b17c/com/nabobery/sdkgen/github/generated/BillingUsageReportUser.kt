package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report-user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report-user
 */
@Serializable(with = BillingUsageReportUser.Serializer::class)
public class BillingUsageReportUser(
  usageItems: List<InlineBillingUsageReportUserUsageItemsItemXf9c1023b>? = null,
) {
  public val usageItems: List<InlineBillingUsageReportUserUsageItemsItemXf9c1023b>? =
      usageItems?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var usageItemsValue: List<InlineBillingUsageReportUserUsageItemsItemXf9c1023b>? = null

    public var usageItems: List<InlineBillingUsageReportUserUsageItemsItemXf9c1023b>?
      get() = usageItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        usageItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): BillingUsageReportUser = BillingUsageReportUser(
      usageItems = usageItems,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingUsageReportUser = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingUsageReportUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingUsageReportUser {
      val jsonDecoder = decoder.requireJsonDecoder("BillingUsageReportUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingUsageReportUser must be a JSON object")
      return BillingUsageReportUser(
        usageItems = rawObject["usageItems"]?.let { json.decodeFromJsonElement<List<InlineBillingUsageReportUserUsageItemsItemXf9c1023b>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingUsageReportUser) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingUsageReportUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.usageItems?.let { put("usageItems", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingUsageReportUser(block: BillingUsageReportUser.Builder.() -> Unit): BillingUsageReportUser = BillingUsageReportUser.build(block)
