package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235(
  public val claimedBy:
      InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470,
  public val type: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158,
) {
  public class Builder {
    private var claimedByValue:
        InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470? = null

    public var claimedBy:
        InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470
      get() = requireNotNull(claimedByValue) { "claimedBy is required" }
      set(`value`) {
        claimedByValue = value
      }

    private var typeValue:
        InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158? = null

    public var type: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 {
      check(claimedByValue != null) { "claimedBy is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235(
        claimedBy = claimedBy,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 must be a JSON object")
      val claimedBy = json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470>(rawObject, "claimed_by")
      val type = json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158>(rawObject, "type")
      return InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235(
        claimedBy = claimedBy,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("claimed_by", json.encodeToJsonElement(value.claimedBy))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235(block: InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 = InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormAuthenticationExemptionXc9b11235 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
