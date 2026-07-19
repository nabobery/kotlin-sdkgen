package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class CitationMetadata(
  public val citations: List<String>,
)

@Serializable
public data class CacheMetadata(
  @SerialName("cache_control")
  public val cacheControl: String,
)

public enum class MessageMetadataBranch {
  Citations,
  CacheControl,
}

public sealed class MessageMetadataAnyOfDecodingException(
  message: String,
) : SerializationException(message)

public class MessageMetadataAnyOfNoMatchException(
  message: String,
) : MessageMetadataAnyOfDecodingException(message)

internal data class MetadataInspection(
  public val matchesCitations: Boolean,
  public val matchesCacheControl: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCitations, matchesCacheControl).count { it }
}

/**
 * Lossless anyOf wrapper. Retained raw JSON is the sole serialization authority.
 */
@Serializable(with = MessageMetadataAnyOf.Serializer::class)
public class MessageMetadataAnyOf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: MetadataInspection,
) {
  public val citations: CitationMetadata? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCitations) json
        .decodeFromJsonElement<CitationMetadata>(raw) else null }

  public val cache: CacheMetadata? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCacheControl) json
        .decodeFromJsonElement<CacheMetadata>(raw) else null }

  public val matchedBranches: Set<MessageMetadataBranch>
    get() = buildSet {
      if (inspection.matchesCitations) add(MessageMetadataBranch.Citations)
      if (inspection.matchesCacheControl) add(MessageMetadataBranch.CacheControl)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): MessageMetadataAnyOf {
      val inspection = inspectMessageMetadataAnyOf(raw)
      if (inspection.matchCount == 0) {
        throw MessageMetadataAnyOfNoMatchException("MessageMetadataAnyOf matched 0 branches: " + inspection.failures
          .joinToString("; "))
      }
      return MessageMetadataAnyOf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<MessageMetadataAnyOf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessageMetadataAnyOf {
      val jsonDecoder = decoder.requireJsonDecoder("MessageMetadataAnyOf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: MessageMetadataAnyOf) {
      encoder.requireJsonEncoder("MessageMetadataAnyOf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectMessageMetadataAnyOf(element: JsonElement): MetadataInspection {
  val raw = element as? JsonObject ?: return MetadataInspection(
    matchesCitations = false,
    matchesCacheControl = false,
    failures = listOf("Citations: expected JSON object", "CacheControl: expected JSON object"),
  )
  val matchesCitations = raw["citations"].isStringArray()
  val matchesCacheControl = raw["cache_control"].isString()
  return MetadataInspection(
    matchesCitations = matchesCitations,
    matchesCacheControl = matchesCacheControl,
    failures = buildList {
      if (!matchesCitations) add("Citations: required properties 'citations' do not match their declared types")
      if (!matchesCacheControl) add("CacheControl: required properties 'cache_control' do not match their declared " +
        "types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
