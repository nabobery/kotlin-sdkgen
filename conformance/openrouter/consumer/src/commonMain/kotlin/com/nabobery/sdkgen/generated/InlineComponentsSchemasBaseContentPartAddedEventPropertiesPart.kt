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

public enum class InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartBranch {
  ResponseOutputText,
  OpenAiResponsesRefusalContent,
}

public sealed class InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartDecodingException(message)

internal data class InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartInspection(
  public val matchesResponseOutputText: Boolean,
  public val matchesOpenAiResponsesRefusalContent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesResponseOutputText, matchesOpenAiResponsesRefusalContent).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/part.
 */
@Serializable(with = InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart.Serializer::class)
public class InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartInspection,
) {
  public val responseOutputText: ResponseOutputTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesResponseOutputText) json
        .decodeFromJsonElement<ResponseOutputTextView>(raw) else null }

  public val openAiResponsesRefusalContent: OpenAiResponsesRefusalContentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOpenAiResponsesRefusalContent) json
        .decodeFromJsonElement<OpenAiResponsesRefusalContentView>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartBranch>
    get() = buildSet {
      if (inspection
        .matchesResponseOutputText) add(InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartBranch
          .ResponseOutputText)
      if (inspection
        .matchesOpenAiResponsesRefusalContent) add(InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartBranch
          .OpenAiResponsesRefusalContent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart {
      val inspection = inspectInlineComponentsSchemasBaseContentPartAddedEventPropertiesPart(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartNoMatchException("InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseContentPartAddedEventPropertiesPart")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasBaseContentPartAddedEventPropertiesPart(element: JsonElement): InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartInspection(
    matchesResponseOutputText = false,
    matchesOpenAiResponsesRefusalContent = false,
    failures = listOf("ResponseOutputText: expected JSON object",
      "OpenAiResponsesRefusalContent: expected JSON object"),
  )
  val matchesResponseOutputText = raw["text"].isString() && raw["type"] != null
  val matchesOpenAiResponsesRefusalContent = raw["refusal"].isString() && raw["type"] != null
  return InlineComponentsSchemasBaseContentPartAddedEventPropertiesPartInspection(
    matchesResponseOutputText = matchesResponseOutputText,
    matchesOpenAiResponsesRefusalContent = matchesOpenAiResponsesRefusalContent,
    failures = buildList {
      if (!matchesResponseOutputText) add("ResponseOutputText: required properties 'text', 'type' do not match their " +
        "declared types")
      if (!matchesOpenAiResponsesRefusalContent) add("OpenAiResponsesRefusalContent: required properties 'refusal', " +
        "'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
