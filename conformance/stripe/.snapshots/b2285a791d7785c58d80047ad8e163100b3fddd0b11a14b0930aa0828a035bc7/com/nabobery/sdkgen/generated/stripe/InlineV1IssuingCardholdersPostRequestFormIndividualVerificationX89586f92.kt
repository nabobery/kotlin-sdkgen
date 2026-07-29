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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/verification
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92(
  public val document:
      InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentX643bd902? = null,
) {
  public class Builder {
    public var document:
        InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentX643bd902? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92 = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92 must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentX643bd902>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92(block: InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92 = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92.build(block)
