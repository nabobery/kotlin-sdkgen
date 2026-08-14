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
 * The person's verification status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/verification
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormVerificationX56400555.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormVerificationX56400555(
  public val additionalDocument:
      InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d? = null,
  public val document: InlineV1AccountsPersonsPostRequestFormVerificationDocumentX9ab234ad? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d? = null

    public var document: InlineV1AccountsPersonsPostRequestFormVerificationDocumentX9ab234ad? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormVerificationX56400555 = InlineV1AccountsPersonsPostRequestFormVerificationX56400555(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationX56400555 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormVerificationX56400555> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormVerificationX56400555 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormVerificationX56400555")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormVerificationX56400555 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormVerificationX56400555(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX8ec7b06d>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormVerificationDocumentX9ab234ad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormVerificationX56400555) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormVerificationX56400555")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormVerificationX56400555(block: InlineV1AccountsPersonsPostRequestFormVerificationX56400555.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationX56400555 = InlineV1AccountsPersonsPostRequestFormVerificationX56400555.build(block)
