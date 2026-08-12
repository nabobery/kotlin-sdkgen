package com.nabobery.sdkgen.generated.stripe

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
 * Details about the authorization, such as identifiers, set by the card network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/network_data
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458(
  public val acquiringInstitutionId: String? = null,
) {
  public class Builder {
    public var acquiringInstitutionId: String? = null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458(
      acquiringInstitutionId = acquiringInstitutionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458 must be a JSON object")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458(
        acquiringInstitutionId = rawObject["acquiring_institution_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acquiringInstitutionId?.let { put("acquiring_institution_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458.build(block)
