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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/verification/properties/additional_document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/verification/properties/additional_document
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d(
  public val back: String? = null,
  public val front: String? = null,
) {
  public class Builder {
    public var back: String? = null

    public var front: String? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d = InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d(
        back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
        front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", it) }
        value.front?.let { put("front", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d(block: InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d = InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d.build(block)
