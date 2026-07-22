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

public enum class InlineComponentsSchemasOutputMessagePropertiesPhaseBranch {
  InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0,
  InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1,
  Branch3,
}

public sealed class InlineComponentsSchemasOutputMessagePropertiesPhaseDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputMessagePropertiesPhaseNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputMessagePropertiesPhaseDecodingException(message)

internal data class InlineComponentsSchemasOutputMessagePropertiesPhaseInspection(
  public val matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0,
      matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1, matchesBranch3).count { it }
}

/**
 * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for the
 * final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend phase
 * on all assistant messages. Omitting it can degrade performance. Not used for user messages.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesPhase.Serializer::class)
public class InlineComponentsSchemasOutputMessagePropertiesPhase internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasOutputMessagePropertiesPhaseInspection,
) {
  public val inlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0:
      InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1:
      InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasOutputMessagePropertiesPhaseBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0) add(InlineComponentsSchemasOutputMessagePropertiesPhaseBranch.InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1) add(InlineComponentsSchemasOutputMessagePropertiesPhaseBranch.InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasOutputMessagePropertiesPhaseBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasOutputMessagePropertiesPhase {
      val inspection = inspectInlineComponentsSchemasOutputMessagePropertiesPhase(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOutputMessagePropertiesPhaseNoMatchException("InlineComponentsSchemasOutputMessagePropertiesPhase " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOutputMessagePropertiesPhase(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesPhase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesPhase {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputMessagePropertiesPhase")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesPhase) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputMessagePropertiesPhase").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOutputMessagePropertiesPhase(element: JsonElement): InlineComponentsSchemasOutputMessagePropertiesPhaseInspection {
  val matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0>()
  val matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasOutputMessagePropertiesPhaseInspection(
    matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0 =
      matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0,
    matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1 =
      matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0) add("InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0: " +
        "value does not match InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf0")
      if (!matchesInlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1) add("InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1: " +
        "value does not match InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
