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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_option
 * s.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_option
 * s
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f(
  public val cartesBancaires:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac? = null,
) {
  public class Builder {
    public var cartesBancaires:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f(
      cartesBancaires = cartesBancaires,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f(
        cartesBancaires = rawObject["cartes_bancaires"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCartesBancairesX6e6a49ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cartesBancaires?.let { put("cartes_bancaires", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworkOptionsX6cb4c02f.build(block)
