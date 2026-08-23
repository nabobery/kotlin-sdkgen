package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/address/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/address/anyOf/0
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c(
  public val city: String? = null,
  public val country: String? = null,
  public val line1: String? = null,
  public val line2: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
) {
  public class Builder {
    public var city: String? = null

    public var country: String? = null

    public var line1: String? = null

    public var line2: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c(
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<String>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c.build(block)
