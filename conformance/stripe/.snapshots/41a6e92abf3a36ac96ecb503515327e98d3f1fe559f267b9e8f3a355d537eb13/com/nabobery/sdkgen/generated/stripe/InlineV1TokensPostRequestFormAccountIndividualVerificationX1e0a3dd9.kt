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
 * roperties/account/properties/individual/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/verification
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9(
  public val additionalDocument:
      InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd? = null,
  public val document:
      InlineV1TokensPostRequestFormAccountIndividualVerificationDocumentXa38dc845? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd? = null

    public var document:
        InlineV1TokensPostRequestFormAccountIndividualVerificationDocumentXa38dc845? = null

    public fun build(): InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9 = InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9 must be a JSON object")
      return InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualAdditionalDocumentX118cd0bd>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualVerificationDocumentXa38dc845>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9(block: InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9 = InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9.build(block)
