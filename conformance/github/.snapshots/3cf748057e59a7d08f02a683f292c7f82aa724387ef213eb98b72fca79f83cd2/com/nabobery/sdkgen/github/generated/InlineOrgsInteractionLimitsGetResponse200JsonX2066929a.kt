package com.nabobery.sdkgen.github.generated

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
public class InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch2View()

public enum class InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch {
  InteractionLimitResponse,
  Branch2,
}

public sealed class InlineOrgsInteractionLimitsGetResponse200JsonX2066929aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsInteractionLimitsGetResponse200JsonX2066929aNoMatchException(
  message: String,
) : InlineOrgsInteractionLimitsGetResponse200JsonX2066929aDecodingException(message)

internal data class InlineOrgsInteractionLimitsGetResponse200JsonX2066929aInspection(
  public val matchesInteractionLimitResponse: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInteractionLimitResponse, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1interaction-limits/get/responses/200/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1interaction-limits/get/responses/200/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsInteractionLimitsGetResponse200JsonX2066929a.Serializer::class)
public class InlineOrgsInteractionLimitsGetResponse200JsonX2066929a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOrgsInteractionLimitsGetResponse200JsonX2066929aInspection,
) {
  public val interactionLimitResponse: InteractionLimitResponseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInteractionLimitResponse) json.decodeFromJsonElement<InteractionLimitResponseView>(raw) else null }

  public val branch2: InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch2View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch2View>(raw) else null }

  public val matchedBranches: Set<InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch>
    get() = buildSet {
      if (inspection.matchesInteractionLimitResponse) add(InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch.InteractionLimitResponse)
      if (inspection.matchesBranch2) add(InlineOrgsInteractionLimitsGetResponse200JsonX2066929aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOrgsInteractionLimitsGetResponse200JsonX2066929a {
      val inspection = inspectInlineOrgsInteractionLimitsGetResponse200JsonX2066929a(raw)
      if (inspection.matchCount == 0) {
        throw InlineOrgsInteractionLimitsGetResponse200JsonX2066929aNoMatchException("InlineOrgsInteractionLimitsGetResponse200JsonX2066929a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOrgsInteractionLimitsGetResponse200JsonX2066929a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineOrgsInteractionLimitsGetResponse200JsonX2066929a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsInteractionLimitsGetResponse200JsonX2066929a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsInteractionLimitsGetResponse200JsonX2066929a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInteractionLimitsGetResponse200JsonX2066929a) {
      encoder.requireJsonEncoder("InlineOrgsInteractionLimitsGetResponse200JsonX2066929a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOrgsInteractionLimitsGetResponse200JsonX2066929a(element: JsonElement): InlineOrgsInteractionLimitsGetResponse200JsonX2066929aInspection {
  val raw = element as? JsonObject ?: return InlineOrgsInteractionLimitsGetResponse200JsonX2066929aInspection(
    matchesInteractionLimitResponse = false,
    matchesBranch2 = false,
    failures = listOf("InteractionLimitResponse: expected JSON object", "Branch2: expected JSON object"),
  )
  val matchesInteractionLimitResponse = raw["expires_at"].isString() && raw["limit"] != null && raw["origin"].isString()
  val matchesBranch2 = true
  return InlineOrgsInteractionLimitsGetResponse200JsonX2066929aInspection(
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
