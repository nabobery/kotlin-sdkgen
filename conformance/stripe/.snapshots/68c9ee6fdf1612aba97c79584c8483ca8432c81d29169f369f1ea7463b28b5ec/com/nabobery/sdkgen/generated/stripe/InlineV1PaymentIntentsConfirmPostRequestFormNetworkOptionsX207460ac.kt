package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/network_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/network_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac(
  public val cartesBancaires:
      InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e? = null,
) {
  public class Builder {
    public var cartesBancaires:
        InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac = InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac(
      cartesBancaires = cartesBancaires,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac(
        cartesBancaires = rawObject["cartes_bancaires"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cartesBancaires?.let { put("cartes_bancaires", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac(block: InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac = InlineV1PaymentIntentsConfirmPostRequestFormNetworkOptionsX207460ac.build(block)
