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
  InlineOpenAiResponsesToolChoiceAnyOf1X505097cc,
  InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba,
  InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28,
  InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c,
  InlineOpenAiResponsesToolChoiceAnyOf5X204f2350,
  ToolChoiceAllowed,
  InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99,
  InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7,
}

public sealed class OpenAiResponsesToolChoiceDecodingException(
  message: String,
) : SerializationException(message)

public class OpenAiResponsesToolChoiceNoMatchException(
  message: String,
) : OpenAiResponsesToolChoiceDecodingException(message)

internal data class OpenAiResponsesToolChoiceInspection(
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350: Boolean,
  public val matchesToolChoiceAllowed: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc, matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba, matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28, matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c, matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350, matchesToolChoiceAllowed, matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99, matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice
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
  public val inlineOpenAiResponsesToolChoiceAnyOf1X505097cc:
      InlineOpenAiResponsesToolChoiceAnyOf1X505097cc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf1X505097cc>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba:
      InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf3X04d75c28:
      InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c:
      InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf5X204f2350:
      InlineOpenAiResponsesToolChoiceAnyOf5X204f2350? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf5X204f2350>(raw) else null }

  public val toolChoiceAllowed: ToolChoiceAllowed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesToolChoiceAllowed) json.decodeFromJsonElement<ToolChoiceAllowed>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99:
      InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7:
      InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7>(raw) else null }

  public val matchedBranches: Set<OpenAiResponsesToolChoiceBranch>
    get() = buildSet {
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf1X505097cc)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf5X204f2350)
      if (inspection.matchesToolChoiceAllowed) add(OpenAiResponsesToolChoiceBranch.ToolChoiceAllowed)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7) add(OpenAiResponsesToolChoiceBranch.InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): OpenAiResponsesToolChoice {
      val inspection = inspectOpenAiResponsesToolChoice(raw)
      if (inspection.matchCount == 0) {
        throw OpenAiResponsesToolChoiceNoMatchException("OpenAiResponsesToolChoice matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return OpenAiResponsesToolChoice(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<OpenAiResponsesToolChoice> {
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
  val matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf1X505097cc>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28 = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350 = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf5X204f2350>()
  val matchesToolChoiceAllowed = element.isJsonDecodable<ToolChoiceAllowed>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7>()
  return OpenAiResponsesToolChoiceInspection(
    matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc = matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc,
    matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba = matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba,
    matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28 = matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28,
    matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c = matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c,
    matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350 = matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350,
    matchesToolChoiceAllowed = matchesToolChoiceAllowed,
    matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 = matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99,
    matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 = matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7,
    failures = buildList {
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf1X505097cc) add("InlineOpenAiResponsesToolChoiceAnyOf1X505097cc: value does not match InlineOpenAiResponsesToolChoiceAnyOf1X505097cc")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba) add("InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba: value does not match InlineOpenAiResponsesToolChoiceAnyOf2X81ffd9ba")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf3X04d75c28) add("InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28: value does not match InlineOpenAiResponsesToolChoiceAnyOf3X04d75c28")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c) add("InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c: value does not match InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf5X204f2350) add("InlineOpenAiResponsesToolChoiceAnyOf5X204f2350: value does not match InlineOpenAiResponsesToolChoiceAnyOf5X204f2350")
      if (!matchesToolChoiceAllowed) add("ToolChoiceAllowed: value does not match ToolChoiceAllowed")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99) add("InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99: value does not match InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7) add("InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7: value does not match InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
