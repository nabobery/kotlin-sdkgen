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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions/anyOf/0/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668(
  public val interval:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalXaf08ea67,
  public val nextBilling:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNextBillingX9739f2b0,
  public val reference: String,
  public val intervalCount: Int? = null,
  public val name: String? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalXaf08ea67? = null

    public var interval:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalXaf08ea67
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var nextBillingValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNextBillingX9739f2b0? = null

    public var nextBilling:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNextBillingX9739f2b0
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

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 {
      check(intervalValue != null) { "interval is required" }
      check(nextBillingValue != null) { "nextBilling is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668(
        interval = interval,
        nextBilling = nextBilling,
        reference = reference,
        intervalCount = intervalCount,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 must be a JSON object")
      val interval = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaIntervalXaf08ea67>(rawObject, "interval")
      val nextBilling = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNextBillingX9739f2b0>(rawObject, "next_billing")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668(
        interval = interval,
        nextBilling = nextBilling,
        reference = reference,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
