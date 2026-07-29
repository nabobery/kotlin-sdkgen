package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450(
  public val interval:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalX52f30be5,
  public val reference: String,
  public val intervalCount: Int? = null,
  public val name: String? = null,
  public val nextBilling:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNextBillingXde086aa6? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalX52f30be5? = null

    public var interval:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalX52f30be5
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

    public var nextBilling:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNextBillingXde086aa6? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 {
      check(intervalValue != null) { "interval is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450(
        interval = interval,
        reference = reference,
        intervalCount = intervalCount,
        name = name,
        nextBilling = nextBilling,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 must be a JSON object")
      val interval = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalX52f30be5>(rawObject, "interval")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450(
        interval = interval,
        reference = reference,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nextBilling = rawObject["next_billing"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNextBillingXde086aa6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
