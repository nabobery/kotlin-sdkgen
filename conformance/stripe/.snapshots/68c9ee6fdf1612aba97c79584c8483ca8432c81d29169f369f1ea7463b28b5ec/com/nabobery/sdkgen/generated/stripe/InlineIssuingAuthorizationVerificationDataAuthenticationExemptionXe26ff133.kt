package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Branch {
  IssuingAuthorizationAuthenticationExemption,
}

public sealed class InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133NoMatchException(
  message: String,
) : InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133DecodingException(message)

internal data class InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Inspection(
  public val matchesIssuingAuthorizationAuthenticationExemption: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationAuthenticationExemption).count { it }
}

/**
 * The exemption applied to this authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/authentication_ex
 * emption
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133.Serializer::class)
public class InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Inspection,
) {
  public val issuingAuthorizationAuthenticationExemption:
      IssuingAuthorizationAuthenticationExemptionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationAuthenticationExemption) json.decodeFromJsonElement<IssuingAuthorizationAuthenticationExemptionView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationAuthenticationExemption) add(InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Branch.IssuingAuthorizationAuthenticationExemption)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133 {
      val inspection = inspectInlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133NoMatchException("InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133(element: JsonElement): InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Inspection(
    matchesIssuingAuthorizationAuthenticationExemption = false,
    failures = listOf("IssuingAuthorizationAuthenticationExemption: expected JSON object"),
  )
  val matchesIssuingAuthorizationAuthenticationExemption = raw["claimed_by"] != null && raw["type"] != null
  return InlineIssuingAuthorizationVerificationDataAuthenticationExemptionXe26ff133Inspection(
    matchesIssuingAuthorizationAuthenticationExemption = matchesIssuingAuthorizationAuthenticationExemption,
    failures = buildList {
      if (!matchesIssuingAuthorizationAuthenticationExemption) add("IssuingAuthorizationAuthenticationExemption: required properties 'claimed_by', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
