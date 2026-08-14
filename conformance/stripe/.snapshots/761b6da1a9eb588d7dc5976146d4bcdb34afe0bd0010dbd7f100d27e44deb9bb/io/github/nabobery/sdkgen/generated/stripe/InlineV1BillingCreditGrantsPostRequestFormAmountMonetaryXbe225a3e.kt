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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/amount/properties/monetary.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/amount/properties/monetary
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val `value`: Int,
) {
  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e {
      check(currencyValue != null) { "currency is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e(
        currency = currency,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e(
        currency = currency,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e(block: InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e = InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
