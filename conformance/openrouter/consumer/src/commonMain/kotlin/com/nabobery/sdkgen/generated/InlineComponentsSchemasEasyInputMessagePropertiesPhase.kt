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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasEasyInputMessagePropertiesPhaseBranch {
  InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0,
  InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1,
  Branch3,
}

public sealed class InlineComponentsSchemasEasyInputMessagePropertiesPhaseDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasEasyInputMessagePropertiesPhaseNoMatchException(
  message: String,
) : InlineComponentsSchemasEasyInputMessagePropertiesPhaseDecodingException(message)

internal data class InlineComponentsSchemasEasyInputMessagePropertiesPhaseInspection(
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0,
      matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1, matchesBranch3).count { it }
}

/**
 * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for the
 * final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend phase
 * on all assistant messages. Omitting it can degrade performance. Not used for user messages.
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesPhase.Serializer::class)
public class InlineComponentsSchemasEasyInputMessagePropertiesPhase internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasEasyInputMessagePropertiesPhaseInspection,
) {
  public val inlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0:
      InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0>(raw) else null }

  public val inlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1:
      InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasEasyInputMessagePropertiesPhaseBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0) add(InlineComponentsSchemasEasyInputMessagePropertiesPhaseBranch.InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1) add(InlineComponentsSchemasEasyInputMessagePropertiesPhaseBranch.InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasEasyInputMessagePropertiesPhaseBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasEasyInputMessagePropertiesPhase {
      val inspection = inspectInlineComponentsSchemasEasyInputMessagePropertiesPhase(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasEasyInputMessagePropertiesPhaseNoMatchException("InlineComponentsSchemasEasyInputMessagePropertiesPhase " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasEasyInputMessagePropertiesPhase(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesPhase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesPhase {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasEasyInputMessagePropertiesPhase")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesPhase) {
      encoder.requireJsonEncoder("InlineComponentsSchemasEasyInputMessagePropertiesPhase").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasEasyInputMessagePropertiesPhase(element: JsonElement): InlineComponentsSchemasEasyInputMessagePropertiesPhaseInspection {
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0>()
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasEasyInputMessagePropertiesPhaseInspection(
    matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0,
    matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0) add("InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf0")
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1) add("InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesPhaseAnyOf1")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
