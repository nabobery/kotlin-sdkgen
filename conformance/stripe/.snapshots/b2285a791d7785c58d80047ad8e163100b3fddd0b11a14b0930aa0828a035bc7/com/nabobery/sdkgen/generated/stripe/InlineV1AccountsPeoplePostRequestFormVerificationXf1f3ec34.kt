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
 * The person's verification status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/verification
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34(
  public val additionalDocument:
      InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138? = null,
  public val document: InlineV1AccountsPeoplePostRequestFormVerificationDocumentXf8150ce9? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138? = null

    public var document: InlineV1AccountsPeoplePostRequestFormVerificationDocumentXf8150ce9? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34 = InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormVerificationAdditionalDocumentX8eb4a138>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormVerificationDocumentXf8150ce9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34(block: InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34 = InlineV1AccountsPeoplePostRequestFormVerificationXf1f3ec34.build(block)
