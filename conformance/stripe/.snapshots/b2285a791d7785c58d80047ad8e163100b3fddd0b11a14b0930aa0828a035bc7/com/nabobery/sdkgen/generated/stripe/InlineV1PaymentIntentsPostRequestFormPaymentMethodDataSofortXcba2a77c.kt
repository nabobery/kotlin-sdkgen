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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sofort
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c(
  public val country: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc,
) {
  public class Builder {
    private var countryValue:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc? = null

    public var country: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c {
      check(countryValue != null) { "country is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c(
        country = country,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c must be a JSON object")
      val country = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc>(rawObject, "country")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c(
        country = country,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", json.encodeToJsonElement(value.country))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortXcba2a77c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
