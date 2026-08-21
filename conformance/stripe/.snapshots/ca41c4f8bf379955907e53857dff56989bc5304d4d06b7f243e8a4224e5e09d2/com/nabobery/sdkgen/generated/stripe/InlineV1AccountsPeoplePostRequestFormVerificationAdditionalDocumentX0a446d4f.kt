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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f(
  public val back: String? = null,
  public val front: String? = null,
) {
  public class Builder {
    public var back: String? = null

    public var front: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f = InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f(
        back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
        front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", it) }
        value.front?.let { put("front", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f(block: InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f = InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX0a446d4f.build(block)
