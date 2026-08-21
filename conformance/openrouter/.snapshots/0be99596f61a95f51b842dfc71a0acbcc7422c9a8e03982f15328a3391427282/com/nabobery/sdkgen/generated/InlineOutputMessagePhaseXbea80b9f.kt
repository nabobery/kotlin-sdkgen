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

public enum class InlineOutputMessagePhaseXbea80b9fBranch {
  InlineOutputMessagePhaseAnyOf1X1a54f402,
  InlineOutputMessagePhaseAnyOf2X7583cd79,
  Branch3,
}

public sealed class InlineOutputMessagePhaseXbea80b9fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputMessagePhaseXbea80b9fNoMatchException(
  message: String,
) : InlineOutputMessagePhaseXbea80b9fDecodingException(message)

internal data class InlineOutputMessagePhaseXbea80b9fInspection(
  public val matchesInlineOutputMessagePhaseAnyOf1X1a54f402: Boolean,
  public val matchesInlineOutputMessagePhaseAnyOf2X7583cd79: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOutputMessagePhaseAnyOf1X1a54f402, matchesInlineOutputMessagePhaseAnyOf2X7583cd79, matchesBranch3).count { it }
}

/**
 * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for the
 * final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend phase
 * on all assistant messages. Omitting it can degrade performance. Not used for user messages.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase
 */
@Serializable(with = InlineOutputMessagePhaseXbea80b9f.Serializer::class)
public class InlineOutputMessagePhaseXbea80b9f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOutputMessagePhaseXbea80b9fInspection,
) {
  public val inlineOutputMessagePhaseAnyOf1X1a54f402: InlineOutputMessagePhaseAnyOf1X1a54f402? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputMessagePhaseAnyOf1X1a54f402) json.decodeFromJsonElement<InlineOutputMessagePhaseAnyOf1X1a54f402>(raw) else null }

  public val inlineOutputMessagePhaseAnyOf2X7583cd79: InlineOutputMessagePhaseAnyOf2X7583cd79? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputMessagePhaseAnyOf2X7583cd79) json.decodeFromJsonElement<InlineOutputMessagePhaseAnyOf2X7583cd79>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineOutputMessagePhaseXbea80b9fBranch>
    get() = buildSet {
      if (inspection.matchesInlineOutputMessagePhaseAnyOf1X1a54f402) add(InlineOutputMessagePhaseXbea80b9fBranch.InlineOutputMessagePhaseAnyOf1X1a54f402)
      if (inspection.matchesInlineOutputMessagePhaseAnyOf2X7583cd79) add(InlineOutputMessagePhaseXbea80b9fBranch.InlineOutputMessagePhaseAnyOf2X7583cd79)
      if (inspection.matchesBranch3) add(InlineOutputMessagePhaseXbea80b9fBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutputMessagePhaseXbea80b9f {
      val inspection = inspectInlineOutputMessagePhaseXbea80b9f(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutputMessagePhaseXbea80b9fNoMatchException("InlineOutputMessagePhaseXbea80b9f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutputMessagePhaseXbea80b9f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessagePhaseXbea80b9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputMessagePhaseXbea80b9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputMessagePhaseXbea80b9f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessagePhaseXbea80b9f) {
      encoder.requireJsonEncoder("InlineOutputMessagePhaseXbea80b9f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutputMessagePhaseXbea80b9f(element: JsonElement): InlineOutputMessagePhaseXbea80b9fInspection {
  val matchesInlineOutputMessagePhaseAnyOf1X1a54f402 = element.isJsonDecodable<InlineOutputMessagePhaseAnyOf1X1a54f402>()
  val matchesInlineOutputMessagePhaseAnyOf2X7583cd79 = element.isJsonDecodable<InlineOutputMessagePhaseAnyOf2X7583cd79>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineOutputMessagePhaseXbea80b9fInspection(
    matchesInlineOutputMessagePhaseAnyOf1X1a54f402 = matchesInlineOutputMessagePhaseAnyOf1X1a54f402,
    matchesInlineOutputMessagePhaseAnyOf2X7583cd79 = matchesInlineOutputMessagePhaseAnyOf2X7583cd79,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineOutputMessagePhaseAnyOf1X1a54f402) add("InlineOutputMessagePhaseAnyOf1X1a54f402: value does not match InlineOutputMessagePhaseAnyOf1X1a54f402")
      if (!matchesInlineOutputMessagePhaseAnyOf2X7583cd79) add("InlineOutputMessagePhaseAnyOf2X7583cd79: value does not match InlineOutputMessagePhaseAnyOf2X7583cd79")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
