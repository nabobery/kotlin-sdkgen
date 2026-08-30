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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/verification
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c(
  public val document:
      InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentXd6f59e6a? = null,
) {
  public class Builder {
    public var document:
        InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentXd6f59e6a? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationDocumentXd6f59e6a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c(block: InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c = InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c.build(block)
