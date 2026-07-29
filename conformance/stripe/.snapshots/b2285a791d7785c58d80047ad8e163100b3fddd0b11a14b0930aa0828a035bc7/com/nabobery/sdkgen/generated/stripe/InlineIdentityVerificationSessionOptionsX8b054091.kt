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

public enum class InlineIdentityVerificationSessionOptionsX8b054091Branch {
  GelatoVerificationSessionOptions,
}

public sealed class InlineIdentityVerificationSessionOptionsX8b054091DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionOptionsX8b054091NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionOptionsX8b054091DecodingException(message)

internal data class InlineIdentityVerificationSessionOptionsX8b054091Inspection(
  public val matchesGelatoVerificationSessionOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoVerificationSessionOptions).count { it }
}

/**
 * A set of options for the session’s verification checks.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/options
 */
@Serializable(with = InlineIdentityVerificationSessionOptionsX8b054091.Serializer::class)
public class InlineIdentityVerificationSessionOptionsX8b054091 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIdentityVerificationSessionOptionsX8b054091Inspection,
) {
  public val gelatoVerificationSessionOptions: GelatoVerificationSessionOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoVerificationSessionOptions) json.decodeFromJsonElement<GelatoVerificationSessionOptionsView>(raw) else null }

  public val matchedBranches: Set<InlineIdentityVerificationSessionOptionsX8b054091Branch>
    get() = buildSet {
      if (inspection.matchesGelatoVerificationSessionOptions) add(InlineIdentityVerificationSessionOptionsX8b054091Branch.GelatoVerificationSessionOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionOptionsX8b054091 {
      val inspection = inspectInlineIdentityVerificationSessionOptionsX8b054091(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionOptionsX8b054091NoMatchException("InlineIdentityVerificationSessionOptionsX8b054091 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionOptionsX8b054091(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIdentityVerificationSessionOptionsX8b054091> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionOptionsX8b054091 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionOptionsX8b054091")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionOptionsX8b054091) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionOptionsX8b054091").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionOptionsX8b054091(element: JsonElement): InlineIdentityVerificationSessionOptionsX8b054091Inspection {
  val raw = element as? JsonObject ?: return InlineIdentityVerificationSessionOptionsX8b054091Inspection(
    matchesGelatoVerificationSessionOptions = false,
    failures = listOf("GelatoVerificationSessionOptions: expected JSON object"),
  )
  val matchesGelatoVerificationSessionOptions = true
  return InlineIdentityVerificationSessionOptionsX8b054091Inspection(
    matchesGelatoVerificationSessionOptions = matchesGelatoVerificationSessionOptions,
    failures = buildList {
      if (!matchesGelatoVerificationSessionOptions) add("GelatoVerificationSessionOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
