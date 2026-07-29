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
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505.Serializer::class)
public class InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505(
  public val amountOff: Int,
) {
  public class Builder {
    private var amountOffValue: Int? = null

    public var amountOff: Int
      get() = requireNotNull(amountOffValue) { "amountOff is required" }
      set(`value`) {
        amountOffValue = value
      }

    public fun build(): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 {
      check(amountOffValue != null) { "amountOff is required" }
      return InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505(
        amountOff = amountOff,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 must be a JSON object")
      val amountOff = json.decodeRequired<Int>(rawObject, "amount_off")
      return InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505(
        amountOff = amountOff,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_off", json.encodeToJsonElement(value.amountOff))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505(block: InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505.Builder.() -> Unit): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 = InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
