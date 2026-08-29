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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d(
  public val interval: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIntervalXdc8ec107,
  public val nextBilling:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNextBillingXeeb216ca,
  public val reference: String,
  public val intervalCount: Int? = null,
  public val name: String? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIntervalXdc8ec107? = null

    public var interval:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIntervalXdc8ec107
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var nextBillingValue:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNextBillingXeeb216ca? = null

    public var nextBilling:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNextBillingXeeb216ca
      get() = requireNotNull(nextBillingValue) { "nextBilling is required" }
      set(`value`) {
        nextBillingValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    public var intervalCount: Int? = null

    public var name: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d {
      check(intervalValue != null) { "interval is required" }
      check(nextBillingValue != null) { "nextBilling is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d(
        interval = interval,
        nextBilling = nextBilling,
        reference = reference,
        intervalCount = intervalCount,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d must be a JSON object")
      val interval = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIntervalXdc8ec107>(rawObject, "interval")
      val nextBilling = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNextBillingXeeb216ca>(rawObject, "next_billing")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d(
        interval = interval,
        nextBilling = nextBilling,
        reference = reference,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        put("next_billing", json.encodeToJsonElement(value.nextBilling))
        put("reference", value.reference)
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
