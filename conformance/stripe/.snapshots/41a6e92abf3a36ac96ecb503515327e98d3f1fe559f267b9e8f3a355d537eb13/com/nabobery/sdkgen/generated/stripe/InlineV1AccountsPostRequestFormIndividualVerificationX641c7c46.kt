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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46(
  public val additionalDocument:
      InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX45890154? = null,
  public val document:
      InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX45890154? = null

    public var document: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365? =
        null

    public fun build(): InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46 = InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46 must be a JSON object")
      return InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX45890154>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationDocumentX8f8b6365>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormIndividualVerificationX641c7c46(block: InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46.Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46 = InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46.build(block)
