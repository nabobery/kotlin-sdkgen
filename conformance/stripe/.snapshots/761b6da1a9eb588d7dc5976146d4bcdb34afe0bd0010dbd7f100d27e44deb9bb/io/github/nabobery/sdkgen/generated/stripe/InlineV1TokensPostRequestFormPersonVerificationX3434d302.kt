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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/verification
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonVerificationX3434d302.Serializer::class)
public class InlineV1TokensPostRequestFormPersonVerificationX3434d302(
  public val additionalDocument:
      InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964? = null,
  public val document: InlineV1TokensPostRequestFormPersonVerificationDocumentX1a908000? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964? = null

    public var document: InlineV1TokensPostRequestFormPersonVerificationDocumentX1a908000? = null

    public fun build(): InlineV1TokensPostRequestFormPersonVerificationX3434d302 = InlineV1TokensPostRequestFormPersonVerificationX3434d302(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonVerificationX3434d302 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonVerificationX3434d302> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonVerificationX3434d302 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonVerificationX3434d302")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonVerificationX3434d302 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonVerificationX3434d302(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonVerificationAdditionalDocumentXa7053964>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonVerificationDocumentX1a908000>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonVerificationX3434d302) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonVerificationX3434d302")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonVerificationX3434d302(block: InlineV1TokensPostRequestFormPersonVerificationX3434d302.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonVerificationX3434d302 = InlineV1TokensPostRequestFormPersonVerificationX3434d302.build(block)
