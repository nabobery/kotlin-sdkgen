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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/installments/properties/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/installments/properties/plan
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417(
  public val type: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsTypeXc4cd9e6d,
  public val count: Int? = null,
  public val interval: InlineV1TestHelpersConfirmafd4PostRequestFormIntervalX9d460ce1? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsTypeXc4cd9e6d? = null

    public var type: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsTypeXc4cd9e6d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var count: Int? = null

    public var interval: InlineV1TestHelpersConfirmafd4PostRequestFormIntervalX9d460ce1? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 {
      check(typeValue != null) { "type is required" }
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417(
        type = type,
        count = count,
        interval = interval,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 must be a JSON object")
      val type = json.decodeRequired<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsTypeXc4cd9e6d>(rawObject, "type")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417(
        type = type,
        count = rawObject["count"]?.let { json.decodeFromJsonElement<Int>(it) },
        interval = rawObject["interval"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormIntervalX9d460ce1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.count?.let { put("count", json.encodeToJsonElement(it)) }
        value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
