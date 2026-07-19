package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationResponse.
 */
@Serializable(with = VideoGenerationResponse.Serializer::class)
public class VideoGenerationResponse(
  public val id: String,
  public val pollingUrl: String,
  public val status: InlineComponentsSchemasVideoGenerationResponsePropertiesStatus,
  public val error: String? = null,
  /**
   * The generation ID associated with this video generation job. Available once the job has been processed.
   */
  public val generationId: String? = null,
  public val unsignedUrls: List<String>? = null,
  public val usage: VideoGenerationUsage? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var pollingUrlValue: String? = null

    public var pollingUrl: String
      get() = requireNotNull(pollingUrlValue) { "pollingUrl is required" }
      set(`value`) {
        pollingUrlValue = value
      }

    private var statusValue: InlineComponentsSchemasVideoGenerationResponsePropertiesStatus? = null

    public var status: InlineComponentsSchemasVideoGenerationResponsePropertiesStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var error: String? = null

    /**
     * The generation ID associated with this video generation job. Available once the job has been processed.
     */
    public var generationId: String? = null

    public var unsignedUrls: List<String>? = null

    public var usage: VideoGenerationUsage? = null

    public fun build(): VideoGenerationResponse {
      check(idValue != null) { "id is required" }
      check(pollingUrlValue != null) { "pollingUrl is required" }
      check(statusValue != null) { "status is required" }
      return VideoGenerationResponse(
        id = id,
        pollingUrl = pollingUrl,
        status = status,
        error = error,
        generationId = generationId,
        unsignedUrls = unsignedUrls,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VideoGenerationResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<VideoGenerationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoGenerationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("VideoGenerationResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("VideoGenerationResponse must be a JSON object")
      val id = json.decodeRequired<String>(raw, "id")
      val pollingUrl = json.decodeRequired<String>(raw, "polling_url")
      val status = json.decodeRequired<InlineComponentsSchemasVideoGenerationResponsePropertiesStatus>(raw, "status")
      return VideoGenerationResponse(
        id = id,
        pollingUrl = pollingUrl,
        status = status,
        error = raw["error"]?.let { json.decodeFromJsonElement<String>(it) },
        generationId = raw["generation_id"]?.let { json.decodeFromJsonElement<String>(it) },
        unsignedUrls = raw["unsigned_urls"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        usage = raw["usage"]?.let { json.decodeFromJsonElement<VideoGenerationUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: VideoGenerationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("VideoGenerationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("polling_url", value.pollingUrl)
        put("status", json.encodeToJsonElement(value.status))
        value.error?.let { put("error", it) }
        value.generationId?.let { put("generation_id", it) }
        value.unsignedUrls?.let { put("unsigned_urls", json.encodeToJsonElement(it)) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun videoGenerationResponse(block: VideoGenerationResponse.Builder.() -> Unit): VideoGenerationResponse =
  VideoGenerationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("VideoGenerationResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
