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

public enum class InlineIdentityVerificationSessionLastErrorXbe973247Branch {
  GelatoSessionLastError,
}

public sealed class InlineIdentityVerificationSessionLastErrorXbe973247DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionLastErrorXbe973247NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionLastErrorXbe973247DecodingException(message)

internal data class InlineIdentityVerificationSessionLastErrorXbe973247Inspection(
  public val matchesGelatoSessionLastError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoSessionLastError).count { it }
}

/**
 * If present, this property tells you the last error encountered when processing the verification.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/last_error
 */
@Serializable(with = InlineIdentityVerificationSessionLastErrorXbe973247.Serializer::class)
public class InlineIdentityVerificationSessionLastErrorXbe973247 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIdentityVerificationSessionLastErrorXbe973247Inspection,
) {
  public val gelatoSessionLastError: GelatoSessionLastErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoSessionLastError) json.decodeFromJsonElement<GelatoSessionLastErrorView>(raw) else null }

  public val matchedBranches: Set<InlineIdentityVerificationSessionLastErrorXbe973247Branch>
    get() = buildSet {
      if (inspection.matchesGelatoSessionLastError) add(InlineIdentityVerificationSessionLastErrorXbe973247Branch.GelatoSessionLastError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionLastErrorXbe973247 {
      val inspection = inspectInlineIdentityVerificationSessionLastErrorXbe973247(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionLastErrorXbe973247NoMatchException("InlineIdentityVerificationSessionLastErrorXbe973247 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionLastErrorXbe973247(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionLastErrorXbe973247> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionLastErrorXbe973247 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionLastErrorXbe973247")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionLastErrorXbe973247) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionLastErrorXbe973247").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionLastErrorXbe973247(element: JsonElement): InlineIdentityVerificationSessionLastErrorXbe973247Inspection {
  val raw = element as? JsonObject ?: return InlineIdentityVerificationSessionLastErrorXbe973247Inspection(
    matchesGelatoSessionLastError = false,
    failures = listOf("GelatoSessionLastError: expected JSON object"),
  )
  val matchesGelatoSessionLastError = true
  return InlineIdentityVerificationSessionLastErrorXbe973247Inspection(
    matchesGelatoSessionLastError = matchesGelatoSessionLastError,
    failures = buildList {
      if (!matchesGelatoSessionLastError) add("GelatoSessionLastError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
