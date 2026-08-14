package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd(
  public val back: String? = null,
  public val front: String? = null,
) {
  public class Builder {
    public var back: String? = null

    public var front: String? = null

    public fun build(): InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd = InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd must be a JSON object")
      return InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd(
        back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
        front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", it) }
        value.front?.let { put("front", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd(block: InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd = InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd.build(block)
