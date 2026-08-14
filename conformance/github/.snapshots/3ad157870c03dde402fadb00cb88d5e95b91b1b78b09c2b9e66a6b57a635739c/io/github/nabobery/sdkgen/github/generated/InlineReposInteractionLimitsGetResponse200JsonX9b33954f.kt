package io.github.nabobery.sdkgen.github.generated

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

@Serializable
public class InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch2View()

public enum class InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch {
  InteractionLimitResponse,
  Branch2,
}

public sealed class InlineReposInteractionLimitsGetResponse200JsonX9b33954fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposInteractionLimitsGetResponse200JsonX9b33954fNoMatchException(
  message: String,
) : InlineReposInteractionLimitsGetResponse200JsonX9b33954fDecodingException(message)

internal data class InlineReposInteractionLimitsGetResponse200JsonX9b33954fInspection(
  public val matchesInteractionLimitResponse: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInteractionLimitResponse, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits/get/responses/200/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits/get/responses/200/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposInteractionLimitsGetResponse200JsonX9b33954f.Serializer::class)
public class InlineReposInteractionLimitsGetResponse200JsonX9b33954f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposInteractionLimitsGetResponse200JsonX9b33954fInspection,
) {
  public val interactionLimitResponse: InteractionLimitResponseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInteractionLimitResponse) json.decodeFromJsonElement<InteractionLimitResponseView>(raw) else null }

  public val branch2: InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch2View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch2View>(raw) else null }

  public val matchedBranches: Set<InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch>
    get() = buildSet {
      if (inspection.matchesInteractionLimitResponse) add(InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch.InteractionLimitResponse)
      if (inspection.matchesBranch2) add(InlineReposInteractionLimitsGetResponse200JsonX9b33954fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposInteractionLimitsGetResponse200JsonX9b33954f {
      val inspection = inspectInlineReposInteractionLimitsGetResponse200JsonX9b33954f(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposInteractionLimitsGetResponse200JsonX9b33954fNoMatchException("InlineReposInteractionLimitsGetResponse200JsonX9b33954f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposInteractionLimitsGetResponse200JsonX9b33954f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposInteractionLimitsGetResponse200JsonX9b33954f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposInteractionLimitsGetResponse200JsonX9b33954f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposInteractionLimitsGetResponse200JsonX9b33954f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposInteractionLimitsGetResponse200JsonX9b33954f) {
      encoder.requireJsonEncoder("InlineReposInteractionLimitsGetResponse200JsonX9b33954f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposInteractionLimitsGetResponse200JsonX9b33954f(element: JsonElement): InlineReposInteractionLimitsGetResponse200JsonX9b33954fInspection {
  val raw = element as? JsonObject ?: return InlineReposInteractionLimitsGetResponse200JsonX9b33954fInspection(
    matchesInteractionLimitResponse = false,
    matchesBranch2 = false,
    failures = listOf("InteractionLimitResponse: expected JSON object", "Branch2: expected JSON object"),
  )
  val matchesInteractionLimitResponse = raw["expires_at"].isString() && raw["limit"] != null && raw["origin"].isString()
  val matchesBranch2 = true
  return InlineReposInteractionLimitsGetResponse200JsonX9b33954fInspection(
    matchesInteractionLimitResponse = matchesInteractionLimitResponse,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInteractionLimitResponse) add("InteractionLimitResponse: required properties 'expires_at', 'limit', 'origin' do not match their declared types")
      if (!matchesBranch2) add("Branch2: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
