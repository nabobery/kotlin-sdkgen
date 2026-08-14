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

public enum class InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Branch {
  InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce,
  InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670,
}

public sealed class InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4NoMatchException(
  message: String,
) : InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4DecodingException(message)

internal data class InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Inspection(
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce: Boolean,
  public val matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce, matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4/properties/type
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4.Serializer::class)
public class InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Inspection,
) {
  public val inlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce:
      InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce>(raw) else null }

  public val inlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670:
      InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670) json.decodeFromJsonElement<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670>(raw) else null }

  public val matchedBranches: Set<InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Branch>
    get() = buildSet {
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce) add(InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Branch.InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce)
      if (inspection.matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670) add(InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Branch.InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4 {
      val inspection = inspectInlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4(raw)
      if (inspection.matchCount == 0) {
        throw InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4NoMatchException("InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4) {
      encoder.requireJsonEncoder("InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4(element: JsonElement): InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Inspection {
  val matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce>()
  val matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670 = element.isJsonDecodable<InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670>()
  return InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4Inspection(
    matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce = matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce,
    matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670 = matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670,
    failures = buildList {
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce) add("InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce: value does not match InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf1Xda649bce")
      if (!matchesInlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670) add("InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670: value does not match InlineOpenAiResponsesToolChoiceAnyOf5TypeAnyOf2Xd7d32670")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
