package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateWorkspaceRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreateWorkspaceRequest
 */
@Serializable(with = CreateWorkspaceRequest.Serializer::class)
public class CreateWorkspaceRequest(
  /**
   * Name for the new workspace
   */
  public val name: String,
  /**
   * URL-friendly slug (lowercase alphanumeric segments separated by single hyphens, no leading/trailing hyphens)
   */
  public val slug: String,
  /**
   * Default image model for this workspace
   */
  public val defaultImageModel: String? = null,
  /**
   * Default provider sort preference (price, throughput, latency, exacto)
   */
  public val defaultProviderSort: String? = null,
  /**
   * Default text model for this workspace
   */
  public val defaultTextModel: String? = null,
  /**
   * Description of the workspace
   */
  public val description: String? = null,
  ioLoggingApiKeyIds: List<Int>? = null,
  /**
   * Sampling rate for I/O logging (0.0001-1)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val ioLoggingSamplingRate: Double? = null,
  /**
   * Whether data discount logging is enabled
   */
  public val isDataDiscountLoggingEnabled: Boolean? = null,
  /**
   * Whether broadcast is enabled
   */
  public val isObservabilityBroadcastEnabled: Boolean? = null,
  /**
   * Whether private logging is enabled
   */
  public val isObservabilityIoLoggingEnabled: Boolean? = null,
) {
  /**
   * Optional array of API key IDs to filter I/O logging
   */
  public val ioLoggingApiKeyIds: List<Int>? =
      ioLoggingApiKeyIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    /**
     * Default image model for this workspace
     */
    public var defaultImageModel: String? = null

    /**
     * Default provider sort preference (price, throughput, latency, exacto)
     */
    public var defaultProviderSort: String? = null

    /**
     * Default text model for this workspace
     */
    public var defaultTextModel: String? = null

    /**
     * Description of the workspace
     */
    public var description: String? = null

    private var ioLoggingApiKeyIdsValue: List<Int>? = null

    /**
     * Optional array of API key IDs to filter I/O logging
     */
    public var ioLoggingApiKeyIds: List<Int>?
      get() = ioLoggingApiKeyIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ioLoggingApiKeyIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Sampling rate for I/O logging (0.0001-1)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var ioLoggingSamplingRate: Double? = null

    /**
     * Whether data discount logging is enabled
     */
    public var isDataDiscountLoggingEnabled: Boolean? = null

    /**
     * Whether broadcast is enabled
     */
    public var isObservabilityBroadcastEnabled: Boolean? = null

    /**
     * Whether private logging is enabled
     */
    public var isObservabilityIoLoggingEnabled: Boolean? = null

    public fun build(): CreateWorkspaceRequest {
      check(nameValue != null) { "name is required" }
      check(slugValue != null) { "slug is required" }
      return CreateWorkspaceRequest(
        name = name,
        slug = slug,
        defaultImageModel = defaultImageModel,
        defaultProviderSort = defaultProviderSort,
        defaultTextModel = defaultTextModel,
        description = description,
        ioLoggingApiKeyIds = ioLoggingApiKeyIds,
        ioLoggingSamplingRate = ioLoggingSamplingRate,
        isDataDiscountLoggingEnabled = isDataDiscountLoggingEnabled,
        isObservabilityBroadcastEnabled = isObservabilityBroadcastEnabled,
        isObservabilityIoLoggingEnabled = isObservabilityIoLoggingEnabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateWorkspaceRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateWorkspaceRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateWorkspaceRequest {
      val jsonDecoder = decoder.requireJsonDecoder("CreateWorkspaceRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateWorkspaceRequest must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      return CreateWorkspaceRequest(
        name = name,
        slug = slug,
        defaultImageModel = rawObject["default_image_model"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultProviderSort = rawObject["default_provider_sort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultTextModel = rawObject["default_text_model"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ioLoggingApiKeyIds = rawObject["io_logging_api_key_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Int>?>(element) },
        ioLoggingSamplingRate = rawObject["io_logging_sampling_rate"]?.let { json.decodeFromJsonElement<Double>(it) },
        isDataDiscountLoggingEnabled = rawObject["is_data_discount_logging_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isObservabilityBroadcastEnabled = rawObject["is_observability_broadcast_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isObservabilityIoLoggingEnabled = rawObject["is_observability_io_logging_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateWorkspaceRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateWorkspaceRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("slug", value.slug)
        value.defaultImageModel?.let { put("default_image_model", it) }
        value.defaultProviderSort?.let { put("default_provider_sort", it) }
        value.defaultTextModel?.let { put("default_text_model", it) }
        value.description?.let { put("description", it) }
        value.ioLoggingApiKeyIds?.let { put("io_logging_api_key_ids", json.encodeToJsonElement(it)) }
        value.ioLoggingSamplingRate?.let { put("io_logging_sampling_rate", json.encodeToJsonElement(it)) }
        value.isDataDiscountLoggingEnabled?.let { put("is_data_discount_logging_enabled", json.encodeToJsonElement(it)) }
        value.isObservabilityBroadcastEnabled?.let { put("is_observability_broadcast_enabled", json.encodeToJsonElement(it)) }
        value.isObservabilityIoLoggingEnabled?.let { put("is_observability_io_logging_enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createWorkspaceRequest(block: CreateWorkspaceRequest.Builder.() -> Unit): CreateWorkspaceRequest = CreateWorkspaceRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateWorkspaceRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
