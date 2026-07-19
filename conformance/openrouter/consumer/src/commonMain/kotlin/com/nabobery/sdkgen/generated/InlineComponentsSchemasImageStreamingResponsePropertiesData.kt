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

public enum class InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch {
  ImageGenPartialImageEvent,
  ImageGenTextChunkEvent,
  ImageGenCompletedEvent,
  ImageGenStreamErrorEvent,
}

public sealed class InlineComponentsSchemasImageStreamingResponsePropertiesDataDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageStreamingResponsePropertiesDataNoMatchException(
  message: String,
) : InlineComponentsSchemasImageStreamingResponsePropertiesDataDecodingException(message)

internal data class InlineComponentsSchemasImageStreamingResponsePropertiesDataInspection(
  public val matchesImageGenPartialImageEvent: Boolean,
  public val matchesImageGenTextChunkEvent: Boolean,
  public val matchesImageGenCompletedEvent: Boolean,
  public val matchesImageGenStreamErrorEvent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesImageGenPartialImageEvent, matchesImageGenTextChunkEvent, matchesImageGenCompletedEvent,
      matchesImageGenStreamErrorEvent).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ImageStreamingResponse/properties/data.
 */
@Serializable(with = InlineComponentsSchemasImageStreamingResponsePropertiesData.Serializer::class)
public class InlineComponentsSchemasImageStreamingResponsePropertiesData internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasImageStreamingResponsePropertiesDataInspection,
) {
  public val imageGenPartialImageEvent: ImageGenPartialImageEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenPartialImageEvent) json
        .decodeFromJsonElement<ImageGenPartialImageEventView>(raw) else null }

  public val imageGenTextChunkEvent: ImageGenTextChunkEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenTextChunkEvent) json
        .decodeFromJsonElement<ImageGenTextChunkEventView>(raw) else null }

  public val imageGenCompletedEvent: ImageGenCompletedEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenCompletedEvent) json
        .decodeFromJsonElement<ImageGenCompletedEventView>(raw) else null }

  public val imageGenStreamErrorEvent: ImageGenStreamErrorEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesImageGenStreamErrorEvent) json
        .decodeFromJsonElement<ImageGenStreamErrorEventView>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch>
    get() = buildSet {
      if (inspection
        .matchesImageGenPartialImageEvent) add(InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch
          .ImageGenPartialImageEvent)
      if (inspection
        .matchesImageGenTextChunkEvent) add(InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch
          .ImageGenTextChunkEvent)
      if (inspection
        .matchesImageGenCompletedEvent) add(InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch
          .ImageGenCompletedEvent)
      if (inspection
        .matchesImageGenStreamErrorEvent) add(InlineComponentsSchemasImageStreamingResponsePropertiesDataBranch
          .ImageGenStreamErrorEvent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasImageStreamingResponsePropertiesData {
      val inspection = inspectInlineComponentsSchemasImageStreamingResponsePropertiesData(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageStreamingResponsePropertiesDataNoMatchException("InlineComponentsSchemasImageStreamingResponsePropertiesData " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageStreamingResponsePropertiesData(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageStreamingResponsePropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageStreamingResponsePropertiesData {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasImageStreamingResponsePropertiesData")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageStreamingResponsePropertiesData) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageStreamingResponsePropertiesData").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageStreamingResponsePropertiesData(element: JsonElement): InlineComponentsSchemasImageStreamingResponsePropertiesDataInspection {
  val raw = element as? JsonObject ?: return InlineComponentsSchemasImageStreamingResponsePropertiesDataInspection(
    matchesImageGenPartialImageEvent = false,
    matchesImageGenTextChunkEvent = false,
    matchesImageGenCompletedEvent = false,
    matchesImageGenStreamErrorEvent = false,
    failures = listOf("ImageGenPartialImageEvent: expected JSON object",
      "ImageGenTextChunkEvent: expected JSON object", "ImageGenCompletedEvent: expected JSON object",
        "ImageGenStreamErrorEvent: expected JSON object"),
  )
  val matchesImageGenPartialImageEvent = raw["b64_json"].isString() && raw["partial_image_index"] != null &&
    raw["type"] != null
  val matchesImageGenTextChunkEvent = raw["phase"] != null && raw["text"].isString() && raw["type"] != null
  val matchesImageGenCompletedEvent = raw["b64_json"].isString() && raw["created"] != null && raw["type"] != null
  val matchesImageGenStreamErrorEvent = raw["error"] != null && raw["type"] != null
  return InlineComponentsSchemasImageStreamingResponsePropertiesDataInspection(
    matchesImageGenPartialImageEvent = matchesImageGenPartialImageEvent,
    matchesImageGenTextChunkEvent = matchesImageGenTextChunkEvent,
    matchesImageGenCompletedEvent = matchesImageGenCompletedEvent,
    matchesImageGenStreamErrorEvent = matchesImageGenStreamErrorEvent,
    failures = buildList {
      if (!matchesImageGenPartialImageEvent) add("ImageGenPartialImageEvent: required properties 'b64_json', " +
        "'partial_image_index', 'type' do not match their declared types")
      if (!matchesImageGenTextChunkEvent) add("ImageGenTextChunkEvent: required properties 'phase', 'text', 'type' do " +
        "not match their declared types")
      if (!matchesImageGenCompletedEvent) add("ImageGenCompletedEvent: required properties 'b64_json', 'created', " +
        "'type' do not match their declared types")
      if (!matchesImageGenStreamErrorEvent) add("ImageGenStreamErrorEvent: required properties 'error', 'type' do not " +
        "match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
