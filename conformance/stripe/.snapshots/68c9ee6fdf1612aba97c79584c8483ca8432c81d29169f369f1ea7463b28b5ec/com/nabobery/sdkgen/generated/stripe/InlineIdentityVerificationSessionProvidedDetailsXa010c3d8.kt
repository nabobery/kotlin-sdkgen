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

public enum class InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Branch {
  GelatoProvidedDetails,
}

public sealed class InlineIdentityVerificationSessionProvidedDetailsXa010c3d8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionProvidedDetailsXa010c3d8NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionProvidedDetailsXa010c3d8DecodingException(message)

internal data class InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Inspection(
  public val matchesGelatoProvidedDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoProvidedDetails).count { it }
}

/**
 * Details provided about the user being verified. These details may be shown to the user.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/provided_details
 */
@Serializable(with = InlineIdentityVerificationSessionProvidedDetailsXa010c3d8.Serializer::class)
public class InlineIdentityVerificationSessionProvidedDetailsXa010c3d8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Inspection,
) {
  public val gelatoProvidedDetails: GelatoProvidedDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoProvidedDetails) json.decodeFromJsonElement<GelatoProvidedDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Branch>
    get() = buildSet {
      if (inspection.matchesGelatoProvidedDetails) add(InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Branch.GelatoProvidedDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionProvidedDetailsXa010c3d8 {
      val inspection = inspectInlineIdentityVerificationSessionProvidedDetailsXa010c3d8(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionProvidedDetailsXa010c3d8NoMatchException("InlineIdentityVerificationSessionProvidedDetailsXa010c3d8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionProvidedDetailsXa010c3d8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionProvidedDetailsXa010c3d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionProvidedDetailsXa010c3d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionProvidedDetailsXa010c3d8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionProvidedDetailsXa010c3d8) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionProvidedDetailsXa010c3d8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionProvidedDetailsXa010c3d8(element: JsonElement): InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Inspection {
  val raw = element as? JsonObject ?: return InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Inspection(
    matchesGelatoProvidedDetails = false,
    failures = listOf("GelatoProvidedDetails: expected JSON object"),
  )
  val matchesGelatoProvidedDetails = true
  return InlineIdentityVerificationSessionProvidedDetailsXa010c3d8Inspection(
    matchesGelatoProvidedDetails = matchesGelatoProvidedDetails,
    failures = buildList {
      if (!matchesGelatoProvidedDetails) add("GelatoProvidedDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
