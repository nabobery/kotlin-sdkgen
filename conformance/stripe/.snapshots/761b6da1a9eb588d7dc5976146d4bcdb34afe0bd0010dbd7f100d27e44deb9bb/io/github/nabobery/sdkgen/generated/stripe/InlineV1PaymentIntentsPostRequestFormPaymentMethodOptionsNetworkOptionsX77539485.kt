package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/network_option
 * s.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/network_option
 * s
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485(
  public val cartesBancaires: InlineV1PaymentIntentsPostRequestFormCartesBancairesX0a270aa6? = null,
) {
  public class Builder {
    public var cartesBancaires: InlineV1PaymentIntentsPostRequestFormCartesBancairesX0a270aa6? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485(
      cartesBancaires = cartesBancaires,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485(
        cartesBancaires = rawObject["cartes_bancaires"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCartesBancairesX0a270aa6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cartesBancaires?.let { put("cartes_bancaires", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX77539485.build(block)
