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

public enum class OpenAiResponsesAnnotationBranch {
  FileCitation,
  UrlCitation,
  FilePath,
}

public sealed class OpenAiResponsesAnnotationDecodingException(
  message: String,
) : SerializationException(message)

public class OpenAiResponsesAnnotationNoMatchException(
  message: String,
) : OpenAiResponsesAnnotationDecodingException(message)

internal data class OpenAiResponsesAnnotationInspection(
  public val matchesFileCitation: Boolean,
  public val matchesUrlCitation: Boolean,
  public val matchesFilePath: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesFileCitation, matchesUrlCitation, matchesFilePath).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesAnnotation.
 */
@Serializable(with = OpenAiResponsesAnnotation.Serializer::class)
public class OpenAiResponsesAnnotation internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: OpenAiResponsesAnnotationInspection,
) {
  public val fileCitation: FileCitationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFileCitation) json
        .decodeFromJsonElement<FileCitationView>(raw) else null }

  public val urlCitation: UrlCitationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesUrlCitation) json
        .decodeFromJsonElement<UrlCitationView>(raw) else null }

  public val filePath: FilePathView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFilePath) json
        .decodeFromJsonElement<FilePathView>(raw) else null }

  public val matchedBranches: Set<OpenAiResponsesAnnotationBranch>
    get() = buildSet {
      if (inspection.matchesFileCitation) add(OpenAiResponsesAnnotationBranch.FileCitation)
      if (inspection.matchesUrlCitation) add(OpenAiResponsesAnnotationBranch.UrlCitation)
      if (inspection.matchesFilePath) add(OpenAiResponsesAnnotationBranch.FilePath)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): OpenAiResponsesAnnotation {
      val inspection = inspectOpenAiResponsesAnnotation(raw)
      if (inspection.matchCount == 0) {
        throw OpenAiResponsesAnnotationNoMatchException("OpenAiResponsesAnnotation matched 0 branches: " + inspection
          .failures.joinToString("; "))
      }
      return OpenAiResponsesAnnotation(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<OpenAiResponsesAnnotation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesAnnotation {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesAnnotation")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesAnnotation) {
      encoder.requireJsonEncoder("OpenAiResponsesAnnotation").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectOpenAiResponsesAnnotation(element: JsonElement): OpenAiResponsesAnnotationInspection {
  val raw = element as? JsonObject ?: return OpenAiResponsesAnnotationInspection(
    matchesFileCitation = false,
    matchesUrlCitation = false,
    matchesFilePath = false,
    failures = listOf("FileCitation: expected JSON object", "UrlCitation: expected JSON object",
      "FilePath: expected JSON object"),
  )
  val matchesFileCitation = raw["file_id"].isString() && raw["filename"].isString() && raw["index"] != null &&
    raw["type"] != null
  val matchesUrlCitation = raw["end_index"] != null && raw["start_index"] != null && raw["title"].isString() &&
    raw["type"] != null && raw["url"].isString()
  val matchesFilePath = raw["file_id"].isString() && raw["index"] != null && raw["type"] != null
  return OpenAiResponsesAnnotationInspection(
    matchesFileCitation = matchesFileCitation,
    matchesUrlCitation = matchesUrlCitation,
    matchesFilePath = matchesFilePath,
    failures = buildList {
      if (!matchesFileCitation) add("FileCitation: required properties 'file_id', 'filename', 'index', 'type' do not " +
        "match their declared types")
      if (!matchesUrlCitation) add("UrlCitation: required properties 'end_index', 'start_index', 'title', 'type', " +
        "'url' do not match their declared types")
      if (!matchesFilePath) add("FilePath: required properties 'file_id', 'index', 'type' do not match their declared " +
        "types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive &&
  it.isString }
