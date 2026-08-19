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

public enum class InlineToolChoiceAllowedModeX9d3cd891Branch {
  InlineToolChoiceAllowedModeAnyOf1Xd1439a46,
  InlineToolChoiceAllowedModeAnyOf2Xd9d0df50,
}

public sealed class InlineToolChoiceAllowedModeX9d3cd891DecodingException(
  message: String,
) : SerializationException(message)

public class InlineToolChoiceAllowedModeX9d3cd891NoMatchException(
  message: String,
) : InlineToolChoiceAllowedModeX9d3cd891DecodingException(message)

internal data class InlineToolChoiceAllowedModeX9d3cd891Inspection(
  public val matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46: Boolean,
  public val matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46, matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode
 */
@Serializable(with = InlineToolChoiceAllowedModeX9d3cd891.Serializer::class)
public class InlineToolChoiceAllowedModeX9d3cd891 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineToolChoiceAllowedModeX9d3cd891Inspection,
) {
  public val inlineToolChoiceAllowedModeAnyOf1Xd1439a46: InlineToolChoiceAllowedModeAnyOf1Xd1439a46?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46) json.decodeFromJsonElement<InlineToolChoiceAllowedModeAnyOf1Xd1439a46>(raw) else null }

  public val inlineToolChoiceAllowedModeAnyOf2Xd9d0df50: InlineToolChoiceAllowedModeAnyOf2Xd9d0df50?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50) json.decodeFromJsonElement<InlineToolChoiceAllowedModeAnyOf2Xd9d0df50>(raw) else null }

  public val matchedBranches: Set<InlineToolChoiceAllowedModeX9d3cd891Branch>
    get() = buildSet {
      if (inspection.matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46) add(InlineToolChoiceAllowedModeX9d3cd891Branch.InlineToolChoiceAllowedModeAnyOf1Xd1439a46)
      if (inspection.matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50) add(InlineToolChoiceAllowedModeX9d3cd891Branch.InlineToolChoiceAllowedModeAnyOf2Xd9d0df50)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineToolChoiceAllowedModeX9d3cd891 {
      val inspection = inspectInlineToolChoiceAllowedModeX9d3cd891(raw)
      if (inspection.matchCount == 0) {
        throw InlineToolChoiceAllowedModeX9d3cd891NoMatchException("InlineToolChoiceAllowedModeX9d3cd891 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineToolChoiceAllowedModeX9d3cd891(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineToolChoiceAllowedModeX9d3cd891> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineToolChoiceAllowedModeX9d3cd891 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineToolChoiceAllowedModeX9d3cd891")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineToolChoiceAllowedModeX9d3cd891) {
      encoder.requireJsonEncoder("InlineToolChoiceAllowedModeX9d3cd891").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineToolChoiceAllowedModeX9d3cd891(element: JsonElement): InlineToolChoiceAllowedModeX9d3cd891Inspection {
  val matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46 = element.isJsonDecodable<InlineToolChoiceAllowedModeAnyOf1Xd1439a46>()
  val matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50 = element.isJsonDecodable<InlineToolChoiceAllowedModeAnyOf2Xd9d0df50>()
  return InlineToolChoiceAllowedModeX9d3cd891Inspection(
    matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46 = matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46,
    matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50 = matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50,
    failures = buildList {
      if (!matchesInlineToolChoiceAllowedModeAnyOf1Xd1439a46) add("InlineToolChoiceAllowedModeAnyOf1Xd1439a46: value does not match InlineToolChoiceAllowedModeAnyOf1Xd1439a46")
      if (!matchesInlineToolChoiceAllowedModeAnyOf2Xd9d0df50) add("InlineToolChoiceAllowedModeAnyOf2Xd9d0df50: value does not match InlineToolChoiceAllowedModeAnyOf2Xd9d0df50")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
