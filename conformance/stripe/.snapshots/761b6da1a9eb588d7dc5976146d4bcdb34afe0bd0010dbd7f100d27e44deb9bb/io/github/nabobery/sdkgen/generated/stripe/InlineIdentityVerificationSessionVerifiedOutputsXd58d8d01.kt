package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Branch {
  GelatoVerifiedOutputs,
}

public sealed class InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01DecodingException(message)

internal data class InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Inspection(
  public val matchesGelatoVerifiedOutputs: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoVerifiedOutputs).count { it }
}

/**
 * The user’s verified data.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/verified_outputs
 */
@Serializable(with = InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01.Serializer::class)
public class InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Inspection,
) {
  public val gelatoVerifiedOutputs: GelatoVerifiedOutputsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoVerifiedOutputs) json.decodeFromJsonElement<GelatoVerifiedOutputsView>(raw) else null }

  public val matchedBranches: Set<InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Branch>
    get() = buildSet {
      if (inspection.matchesGelatoVerifiedOutputs) add(InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Branch.GelatoVerifiedOutputs)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01 {
      val inspection = inspectInlineIdentityVerificationSessionVerifiedOutputsXd58d8d01(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01NoMatchException("InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionVerifiedOutputsXd58d8d01(element: JsonElement): InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Inspection {
  val raw = element as? JsonObject ?: return InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Inspection(
    matchesGelatoVerifiedOutputs = false,
    failures = listOf("GelatoVerifiedOutputs: expected JSON object"),
  )
  val matchesGelatoVerifiedOutputs = true
  return InlineIdentityVerificationSessionVerifiedOutputsXd58d8d01Inspection(
    matchesGelatoVerifiedOutputs = matchesGelatoVerifiedOutputs,
    failures = buildList {
      if (!matchesGelatoVerifiedOutputs) add("GelatoVerifiedOutputs: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
