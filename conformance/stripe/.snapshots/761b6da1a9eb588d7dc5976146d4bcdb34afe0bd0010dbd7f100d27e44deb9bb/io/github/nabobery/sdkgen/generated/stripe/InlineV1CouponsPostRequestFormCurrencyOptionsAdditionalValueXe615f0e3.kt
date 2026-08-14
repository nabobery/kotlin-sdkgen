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
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3.Serializer::class)
public class InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3(
  public val amountOff: Int,
) {
  public class Builder {
    private var amountOffValue: Int? = null

    public var amountOff: Int
      get() = requireNotNull(amountOffValue) { "amountOff is required" }
      set(`value`) {
        amountOffValue = value
      }

    public fun build(): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 {
      check(amountOffValue != null) { "amountOff is required" }
      return InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3(
        amountOff = amountOff,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 must be a JSON object")
      val amountOff = json.decodeRequired<Int>(rawObject, "amount_off")
      return InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3(
        amountOff = amountOff,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_off", json.encodeToJsonElement(value.amountOff))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3(block: InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3.Builder.() -> Unit): InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 = InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
