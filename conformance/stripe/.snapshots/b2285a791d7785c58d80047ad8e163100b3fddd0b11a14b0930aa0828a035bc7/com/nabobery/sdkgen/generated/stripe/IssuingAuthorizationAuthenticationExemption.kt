package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingAuthorizationAuthenticationExemptionView(
  @SerialName("claimed_by")
  public val claimedBy: InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb,
  public val type: InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_authentication_exemption
 */
@Serializable(with = IssuingAuthorizationAuthenticationExemption.Serializer::class)
public class IssuingAuthorizationAuthenticationExemption(
  /**
   * The entity that requested the exemption, either the acquiring merchant or the Issuing user.
   */
  public val claimedBy: InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb,
  /**
   * The specific exemption claimed for this authorization.
   */
  public val type: InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416,
) {
  public class Builder {
    private var claimedByValue: InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb?
        = null

    public var claimedBy: InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb
      get() = requireNotNull(claimedByValue) { "claimedBy is required" }
      set(`value`) {
        claimedByValue = value
      }

    private var typeValue: InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416? = null

    public var type: InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): IssuingAuthorizationAuthenticationExemption {
      check(claimedByValue != null) { "claimedBy is required" }
      check(typeValue != null) { "type is required" }
      return IssuingAuthorizationAuthenticationExemption(
        claimedBy = claimedBy,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationAuthenticationExemption = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingAuthorizationAuthenticationExemption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationAuthenticationExemption {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationAuthenticationExemption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationAuthenticationExemption must be a JSON object")
      val claimedBy = json.decodeRequired<InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb>(rawObject, "claimed_by")
      val type = json.decodeRequired<InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416>(rawObject, "type")
      return IssuingAuthorizationAuthenticationExemption(
        claimedBy = claimedBy,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationAuthenticationExemption) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationAuthenticationExemption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("claimed_by", json.encodeToJsonElement(value.claimedBy))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationAuthenticationExemption(block: IssuingAuthorizationAuthenticationExemption.Builder.() -> Unit): IssuingAuthorizationAuthenticationExemption = IssuingAuthorizationAuthenticationExemption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingAuthorizationAuthenticationExemption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
