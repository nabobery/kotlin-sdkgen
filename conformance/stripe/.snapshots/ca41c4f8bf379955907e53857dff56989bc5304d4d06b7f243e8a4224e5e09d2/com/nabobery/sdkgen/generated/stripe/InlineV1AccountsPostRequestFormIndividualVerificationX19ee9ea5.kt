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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5(
  public val additionalDocument:
      InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de? = null,
  public val document:
      InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0? = null,
) {
  public class Builder {
    public var additionalDocument:
        InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de? = null

    public var document: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0? =
        null

    public fun build(): InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5 = InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5(
      additionalDocument = additionalDocument,
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5 must be a JSON object")
      return InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5(
        additionalDocument = rawObject["additional_document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationAdditionalDocumentX632419de>(it) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5(block: InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5.Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5 = InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5.build(block)
