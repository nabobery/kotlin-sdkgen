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
 * coded/schema/properties/individual/properties/card_issuing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461(
  public val userTermsAcceptance:
      InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c? = null,
) {
  public class Builder {
    public var userTermsAcceptance:
        InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461 = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461(
      userTermsAcceptance = userTermsAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461 must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461(
        userTermsAcceptance = rawObject["user_terms_acceptance"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.userTermsAcceptance?.let { put("user_terms_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461(block: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461 = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461.build(block)
