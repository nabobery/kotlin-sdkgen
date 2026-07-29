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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0/properties/networks
 */
@Serializable(with = InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0.Serializer::class)
public class InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0(
  public val preferred: InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d? = null,
) {
  public class Builder {
    public var preferred: InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d? = null

    public fun build(): InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0 = InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0(
      preferred = preferred,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0 must be a JSON object")
      return InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0(
        preferred = rawObject["preferred"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferred?.let { put("preferred", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0(block: InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0.Builder.() -> Unit): InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0 = InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0.build(block)
