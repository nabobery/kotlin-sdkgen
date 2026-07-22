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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentBranch {
  Branch1,
  AnthropicWebSearchToolResultError,
}

public sealed class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesAnthropicWebSearchToolResultError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAnthropicWebSearchToolResultError).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResult/properties/content.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent.Serializer::class)
public class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentInspection,
) {
  public val branch1: List<AnthropicWebSearchResult>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<List<AnthropicWebSearchResult>>(raw) else null }

  public val anthropicWebSearchToolResultError: AnthropicWebSearchToolResultError? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAnthropicWebSearchToolResultError) json
        .decodeFromJsonElement<AnthropicWebSearchToolResultError>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentBranch
        .Branch1)
      if (inspection
        .matchesAnthropicWebSearchToolResultError) add(InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentBranch.AnthropicWebSearchToolResultError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent {
      val inspection = inspectInlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentNoMatchException("InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent(element: JsonElement): InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentInspection {
  val matchesBranch1 = element.isJsonDecodable<List<AnthropicWebSearchResult>>() &&
    (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesAnthropicWebSearchToolResultError = element.isJsonDecodable<AnthropicWebSearchToolResultError>()
  return InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContentInspection(
    matchesBranch1 = matchesBranch1,
    matchesAnthropicWebSearchToolResultError = matchesAnthropicWebSearchToolResultError,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesAnthropicWebSearchToolResultError) add("AnthropicWebSearchToolResultError: value does not match " +
        "AnthropicWebSearchToolResultError")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
