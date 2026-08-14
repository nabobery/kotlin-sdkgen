package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0(
  public val amountGte: Int? = null,
  public val resetBillingCycleAnchor: Boolean? = null,
) {
  public class Builder {
    public var amountGte: Int? = null

    public var resetBillingCycleAnchor: Boolean? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 = InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0(
      amountGte = amountGte,
      resetBillingCycleAnchor = resetBillingCycleAnchor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0(
        amountGte = rawObject["amount_gte"]?.let { json.decodeFromJsonElement<Int>(it) },
        resetBillingCycleAnchor = rawObject["reset_billing_cycle_anchor"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountGte?.let { put("amount_gte", json.encodeToJsonElement(it)) }
        value.resetBillingCycleAnchor?.let { put("reset_billing_cycle_anchor", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0(block: InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 = InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0.build(block)
