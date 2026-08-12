package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66(
  public val type: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2,
  public val flexible:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2? = null

    public var type: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 {
      check(typeValue != null) { "type is required" }
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 must be a JSON object")
      val type = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2>(rawObject, "type")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataFlexibleXc069d0b2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
