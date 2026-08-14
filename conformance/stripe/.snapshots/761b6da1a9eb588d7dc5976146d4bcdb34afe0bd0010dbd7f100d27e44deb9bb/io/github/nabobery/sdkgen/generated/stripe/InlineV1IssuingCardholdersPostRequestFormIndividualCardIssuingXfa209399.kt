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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/card_issuing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual/properties/card_issuing
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399(
  public val userTermsAcceptance:
      InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceX28eab510? = null,
) {
  public class Builder {
    public var userTermsAcceptance:
        InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceX28eab510? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399 = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399(
      userTermsAcceptance = userTermsAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399 must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399(
        userTermsAcceptance = rawObject["user_terms_acceptance"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceX28eab510>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.userTermsAcceptance?.let { put("user_terms_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399(block: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399 = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399.build(block)
