package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
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

@Serializable
public data class SubscriptionItemBillingThresholdsView(
  @SerialName("usage_gte")
  public val usageGte: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_item_billing_thresholds
 */
@Serializable(with = SubscriptionItemBillingThresholds.Serializer::class)
public class SubscriptionItemBillingThresholds(
  /**
   * Usage threshold that triggers the subscription to create an invoice
   */
  public val usageGte: Int? = null,
) {
  public class Builder {
    /**
     * Usage threshold that triggers the subscription to create an invoice
     */
    public var usageGte: Int? = null

    public fun build(): SubscriptionItemBillingThresholds = SubscriptionItemBillingThresholds(
      usageGte = usageGte,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionItemBillingThresholds = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionItemBillingThresholds> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionItemBillingThresholds {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionItemBillingThresholds")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionItemBillingThresholds must be a JSON object")
      return SubscriptionItemBillingThresholds(
        usageGte = rawObject["usage_gte"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionItemBillingThresholds) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionItemBillingThresholds")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.usageGte?.let { put("usage_gte", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionItemBillingThresholds(block: SubscriptionItemBillingThresholds.Builder.() -> Unit): SubscriptionItemBillingThresholds = SubscriptionItemBillingThresholds.build(block)
