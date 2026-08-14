package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions/anyOf
 * /0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions/anyOf
 * /0/items
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282(
  public val interval: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3cd35787,
  public val reference: String,
  public val intervalCount: Int? = null,
  public val name: String? = null,
  public val nextBilling: InlineV1PaymentIntentsConfirmPostRequestFormNextBillingX1f27d7ec? = null,
) {
  public class Builder {
    private var intervalValue: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3cd35787? = null

    public var interval: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3cd35787
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    public var intervalCount: Int? = null

    public var name: String? = null

    public var nextBilling: InlineV1PaymentIntentsConfirmPostRequestFormNextBillingX1f27d7ec? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 {
      check(intervalValue != null) { "interval is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282(
        interval = interval,
        reference = reference,
        intervalCount = intervalCount,
        name = name,
        nextBilling = nextBilling,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 must be a JSON object")
      val interval = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3cd35787>(rawObject, "interval")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282(
        interval = interval,
        reference = reference,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nextBilling = rawObject["next_billing"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormNextBillingX1f27d7ec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        put("reference", value.reference)
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nextBilling?.let { put("next_billing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXdbd9f282 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
