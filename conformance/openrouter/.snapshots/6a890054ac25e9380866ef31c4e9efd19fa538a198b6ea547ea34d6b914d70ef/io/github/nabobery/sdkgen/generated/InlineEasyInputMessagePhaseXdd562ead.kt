package io.github.nabobery.sdkgen.generated

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

public enum class InlineEasyInputMessagePhaseXdd562eadBranch {
  InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7,
  InlineEasyInputMessagePhaseAnyOf2X75a4cfa3,
  Branch3,
}

public sealed class InlineEasyInputMessagePhaseXdd562eadDecodingException(
  message: String,
) : SerializationException(message)

public class InlineEasyInputMessagePhaseXdd562eadNoMatchException(
  message: String,
) : InlineEasyInputMessagePhaseXdd562eadDecodingException(message)

internal data class InlineEasyInputMessagePhaseXdd562eadInspection(
  public val matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7: Boolean,
  public val matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7, matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3, matchesBranch3).count { it }
}

/**
 * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for the
 * final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend phase
 * on all assistant messages. Omitting it can degrade performance. Not used for user messages.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/phase
 */
@Serializable(with = InlineEasyInputMessagePhaseXdd562ead.Serializer::class)
public class InlineEasyInputMessagePhaseXdd562ead internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineEasyInputMessagePhaseXdd562eadInspection,
) {
  public val inlineEasyInputMessagePhaseAnyOf1Xfc95b4d7: InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7) json.decodeFromJsonElement<InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7>(raw) else null }

  public val inlineEasyInputMessagePhaseAnyOf2X75a4cfa3: InlineEasyInputMessagePhaseAnyOf2X75a4cfa3?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3) json.decodeFromJsonElement<InlineEasyInputMessagePhaseAnyOf2X75a4cfa3>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineEasyInputMessagePhaseXdd562eadBranch>
    get() = buildSet {
      if (inspection.matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7) add(InlineEasyInputMessagePhaseXdd562eadBranch.InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7)
      if (inspection.matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3) add(InlineEasyInputMessagePhaseXdd562eadBranch.InlineEasyInputMessagePhaseAnyOf2X75a4cfa3)
      if (inspection.matchesBranch3) add(InlineEasyInputMessagePhaseXdd562eadBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEasyInputMessagePhaseXdd562ead {
      val inspection = inspectInlineEasyInputMessagePhaseXdd562ead(raw)
      if (inspection.matchCount == 0) {
        throw InlineEasyInputMessagePhaseXdd562eadNoMatchException("InlineEasyInputMessagePhaseXdd562ead matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEasyInputMessagePhaseXdd562ead(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessagePhaseXdd562ead> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEasyInputMessagePhaseXdd562ead {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEasyInputMessagePhaseXdd562ead")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessagePhaseXdd562ead) {
      encoder.requireJsonEncoder("InlineEasyInputMessagePhaseXdd562ead").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEasyInputMessagePhaseXdd562ead(element: JsonElement): InlineEasyInputMessagePhaseXdd562eadInspection {
  val matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7 = element.isJsonDecodable<InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7>()
  val matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3 = element.isJsonDecodable<InlineEasyInputMessagePhaseAnyOf2X75a4cfa3>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineEasyInputMessagePhaseXdd562eadInspection(
    matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7 = matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7,
    matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3 = matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineEasyInputMessagePhaseAnyOf1Xfc95b4d7) add("InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7: value does not match InlineEasyInputMessagePhaseAnyOf1Xfc95b4d7")
      if (!matchesInlineEasyInputMessagePhaseAnyOf2X75a4cfa3) add("InlineEasyInputMessagePhaseAnyOf2X75a4cfa3: value does not match InlineEasyInputMessagePhaseAnyOf2X75a4cfa3")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
