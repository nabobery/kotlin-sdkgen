package com.nabobery.sdkgen.generated

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

public enum class AnthropicUsageIterationBranch {
  AnthropicCompactionUsageIteration,
  AnthropicMessageUsageIteration,
  AnthropicAdvisorMessageUsageIteration,
  AnthropicUnknownUsageIteration,
}

public sealed class AnthropicUsageIterationDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicUsageIterationNoMatchException(
  message: String,
) : AnthropicUsageIterationDecodingException(message)

internal data class AnthropicUsageIterationInspection(
  public val matchesAnthropicCompactionUsageIteration: Boolean,
  public val matchesAnthropicMessageUsageIteration: Boolean,
  public val matchesAnthropicAdvisorMessageUsageIteration: Boolean,
  public val matchesAnthropicUnknownUsageIteration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAnthropicCompactionUsageIteration, matchesAnthropicMessageUsageIteration, matchesAnthropicAdvisorMessageUsageIteration, matchesAnthropicUnknownUsageIteration).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUsageIteration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUsageIteration
 */
@Serializable(with = AnthropicUsageIteration.Serializer::class)
public class AnthropicUsageIteration internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: AnthropicUsageIterationInspection,
) {
  public val anthropicCompactionUsageIteration: AnthropicCompactionUsageIterationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicCompactionUsageIteration) json.decodeFromJsonElement<AnthropicCompactionUsageIterationView>(raw) else null }

  public val anthropicMessageUsageIteration: AnthropicMessageUsageIterationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicMessageUsageIteration) json.decodeFromJsonElement<AnthropicMessageUsageIterationView>(raw) else null }

  public val anthropicAdvisorMessageUsageIteration: AnthropicAdvisorMessageUsageIterationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicAdvisorMessageUsageIteration) json.decodeFromJsonElement<AnthropicAdvisorMessageUsageIterationView>(raw) else null }

  public val anthropicUnknownUsageIteration: AnthropicUnknownUsageIterationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicUnknownUsageIteration) json.decodeFromJsonElement<AnthropicUnknownUsageIterationView>(raw) else null }

  public val matchedBranches: Set<AnthropicUsageIterationBranch>
    get() = buildSet {
      if (inspection.matchesAnthropicCompactionUsageIteration) add(AnthropicUsageIterationBranch.AnthropicCompactionUsageIteration)
      if (inspection.matchesAnthropicMessageUsageIteration) add(AnthropicUsageIterationBranch.AnthropicMessageUsageIteration)
      if (inspection.matchesAnthropicAdvisorMessageUsageIteration) add(AnthropicUsageIterationBranch.AnthropicAdvisorMessageUsageIteration)
      if (inspection.matchesAnthropicUnknownUsageIteration) add(AnthropicUsageIterationBranch.AnthropicUnknownUsageIteration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): AnthropicUsageIteration {
      val inspection = inspectAnthropicUsageIteration(raw)
      if (inspection.matchCount == 0) {
        throw AnthropicUsageIterationNoMatchException("AnthropicUsageIteration matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return AnthropicUsageIteration(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<AnthropicUsageIteration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicUsageIteration {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicUsageIteration")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicUsageIteration) {
      encoder.requireJsonEncoder("AnthropicUsageIteration").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectAnthropicUsageIteration(element: JsonElement): AnthropicUsageIterationInspection {
  val raw = element as? JsonObject ?: return AnthropicUsageIterationInspection(
    matchesAnthropicCompactionUsageIteration = false,
    matchesAnthropicMessageUsageIteration = false,
    matchesAnthropicAdvisorMessageUsageIteration = false,
    matchesAnthropicUnknownUsageIteration = false,
    failures = listOf("AnthropicCompactionUsageIteration: expected JSON object", "AnthropicMessageUsageIteration: expected JSON object", "AnthropicAdvisorMessageUsageIteration: expected JSON object", "AnthropicUnknownUsageIteration: expected JSON object"),
  )
  val matchesAnthropicCompactionUsageIteration = raw["type"] != null
  val matchesAnthropicMessageUsageIteration = raw["type"] != null
  val matchesAnthropicAdvisorMessageUsageIteration = raw["model"].isString() && raw["type"] != null
  val matchesAnthropicUnknownUsageIteration = raw["type"].isString()
  return AnthropicUsageIterationInspection(
    matchesAnthropicCompactionUsageIteration = matchesAnthropicCompactionUsageIteration,
    matchesAnthropicMessageUsageIteration = matchesAnthropicMessageUsageIteration,
    matchesAnthropicAdvisorMessageUsageIteration = matchesAnthropicAdvisorMessageUsageIteration,
    matchesAnthropicUnknownUsageIteration = matchesAnthropicUnknownUsageIteration,
    failures = buildList {
      if (!matchesAnthropicCompactionUsageIteration) add("AnthropicCompactionUsageIteration: required properties 'type' do not match their declared types")
      if (!matchesAnthropicMessageUsageIteration) add("AnthropicMessageUsageIteration: required properties 'type' do not match their declared types")
      if (!matchesAnthropicAdvisorMessageUsageIteration) add("AnthropicAdvisorMessageUsageIteration: required properties 'model', 'type' do not match their declared types")
      if (!matchesAnthropicUnknownUsageIteration) add("AnthropicUnknownUsageIteration: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
