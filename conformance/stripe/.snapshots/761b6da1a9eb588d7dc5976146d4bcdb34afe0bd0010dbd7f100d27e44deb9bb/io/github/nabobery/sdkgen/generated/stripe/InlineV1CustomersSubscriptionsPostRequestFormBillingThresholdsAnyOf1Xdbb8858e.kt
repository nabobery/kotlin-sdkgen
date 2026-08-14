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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e(
  public val amountGte: Int? = null,
  public val resetBillingCycleAnchor: Boolean? = null,
) {
  public class Builder {
    public var amountGte: Int? = null

    public var resetBillingCycleAnchor: Boolean? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e = InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e(
      amountGte = amountGte,
      resetBillingCycleAnchor = resetBillingCycleAnchor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e(
        amountGte = rawObject["amount_gte"]?.let { json.decodeFromJsonElement<Int>(it) },
        resetBillingCycleAnchor = rawObject["reset_billing_cycle_anchor"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountGte?.let { put("amount_gte", json.encodeToJsonElement(it)) }
        value.resetBillingCycleAnchor?.let { put("reset_billing_cycle_anchor", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e(block: InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e = InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e.build(block)
