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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0/properties/networks
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f(
  public val preferred:
      InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc? = null,
) {
  public class Builder {
    public var preferred: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc?
        = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f = InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f(
      preferred = preferred,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f(
        preferred = rawObject["preferred"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferred?.let { put("preferred", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f(block: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f = InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f.build(block)
