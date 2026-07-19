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

public enum class OpenAiResponsesToolChoiceBranch {
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4,
  ToolChoiceAllowed,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6,
  InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7,
}

public sealed class OpenAiResponsesToolChoiceDecodingException(
  message: String,
) : SerializationException(message)

public class OpenAiResponsesToolChoiceNoMatchException(
  message: String,
) : OpenAiResponsesToolChoiceDecodingException(message)

internal data class OpenAiResponsesToolChoiceInspection(
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4: Boolean,
  public val matchesToolChoiceAllowed: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6: Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0,
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1,
        matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2,
          matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3,
            matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4, matchesToolChoiceAllowed,
              matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6,
                matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice.
 */
@Serializable(with = OpenAiResponsesToolChoice.Serializer::class)
public class OpenAiResponsesToolChoice internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: OpenAiResponsesToolChoiceInspection,
) {
  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4>(raw) else null }

  public val toolChoiceAllowed: ToolChoiceAllowed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesToolChoiceAllowed) json
        .decodeFromJsonElement<ToolChoiceAllowed>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7:
      InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7) json
          .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7>(raw) else null }

  public val matchedBranches: Set<OpenAiResponsesToolChoiceBranch>
    get() = buildSet {
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4)
      if (inspection.matchesToolChoiceAllowed) add(OpenAiResponsesToolChoiceBranch.ToolChoiceAllowed)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6)
      if (inspection.matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7) add(OpenAiResponsesToolChoiceBranch
        .InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): OpenAiResponsesToolChoice {
      val inspection = inspectOpenAiResponsesToolChoice(raw)
      if (inspection.matchCount == 0) {
        throw OpenAiResponsesToolChoiceNoMatchException("OpenAiResponsesToolChoice matched 0 branches: " + inspection
          .failures.joinToString("; "))
      }
      return OpenAiResponsesToolChoice(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<OpenAiResponsesToolChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesToolChoice {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesToolChoice")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesToolChoice) {
      encoder.requireJsonEncoder("OpenAiResponsesToolChoice").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectOpenAiResponsesToolChoice(element: JsonElement): OpenAiResponsesToolChoiceInspection {
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4>()
  val matchesToolChoiceAllowed = element.isJsonDecodable<ToolChoiceAllowed>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6>()
  val matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7>()
  return OpenAiResponsesToolChoiceInspection(
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4,
    matchesToolChoiceAllowed = matchesToolChoiceAllowed,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6,
    matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7 =
      matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf0")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf1")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf2")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4")
      if (!matchesToolChoiceAllowed) add("ToolChoiceAllowed: value does not match ToolChoiceAllowed")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6")
      if (!matchesInlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7) add("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7: " +
        "value does not match InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
