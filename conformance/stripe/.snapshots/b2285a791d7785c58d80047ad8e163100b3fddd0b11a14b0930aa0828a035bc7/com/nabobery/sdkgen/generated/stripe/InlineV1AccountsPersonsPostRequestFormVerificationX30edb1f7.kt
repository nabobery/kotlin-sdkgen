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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/verification
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7(
  public val additionalDocument:
      InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX7fb0edd9? = null,
  public val document: InlineV1AccountsPersonsPostRequestFormVerificationDocumentXa2eaad71? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX7fb0edd9? = null

    public var document: InlineV1AccountsPersonsPostRequestFormVerificationDocumentXa2eaad71? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7 = InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormVerificationAdditionalDocumentX7fb0edd9>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormVerificationDocumentXa2eaad71>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7(block: InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7 = InlineV1AccountsPersonsPostRequestFormVerificationX30edb1f7.build(block)
