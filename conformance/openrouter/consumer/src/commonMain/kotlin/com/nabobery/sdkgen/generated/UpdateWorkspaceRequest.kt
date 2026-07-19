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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateWorkspaceRequest.
 */
@Serializable(with = UpdateWorkspaceRequest.Serializer::class)
public class UpdateWorkspaceRequest internal constructor(
  private val defaultImageModelState: FieldState<String?>,
  private val defaultProviderSortState: FieldState<String?>,
  private val defaultTextModelState: FieldState<String?>,
  private val descriptionState: FieldState<String?>,
  private val ioLoggingApiKeyIdsState: FieldState<List<Int>?>,
  private val ioLoggingSamplingRateState: FieldState<Double>,
  private val isDataDiscountLoggingEnabledState: FieldState<Boolean>,
  private val isObservabilityBroadcastEnabledState: FieldState<Boolean>,
  private val isObservabilityIoLoggingEnabledState: FieldState<Boolean>,
  private val nameState: FieldState<String>,
  private val slugState: FieldState<String>,
) {
  /**
   * Default image model for this workspace
   */
  public val defaultImageModel: String?
    get() = defaultImageModelState.valueOrNull()

  /**
   * Default provider sort preference (price, throughput, latency, exacto)
   */
  public val defaultProviderSort: String?
    get() = defaultProviderSortState.valueOrNull()

  /**
   * Default text model for this workspace
   */
  public val defaultTextModel: String?
    get() = defaultTextModelState.valueOrNull()

  /**
   * New description for the workspace
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Optional array of API key IDs to filter I/O logging
   */
  public val ioLoggingApiKeyIds: List<Int>?
    get() = ioLoggingApiKeyIdsState.valueOrNull()

  /**
   * Sampling rate for I/O logging (0.0001-1)
   */
  public val ioLoggingSamplingRate: Double?
    get() = ioLoggingSamplingRateState.valueOrNull()

  /**
   * Whether data discount logging is enabled
   */
  public val isDataDiscountLoggingEnabled: Boolean?
    get() = isDataDiscountLoggingEnabledState.valueOrNull()

  /**
   * Whether broadcast is enabled
   */
  public val isObservabilityBroadcastEnabled: Boolean?
    get() = isObservabilityBroadcastEnabledState.valueOrNull()

  /**
   * Whether private logging is enabled
   */
  public val isObservabilityIoLoggingEnabled: Boolean?
    get() = isObservabilityIoLoggingEnabledState.valueOrNull()

  /**
   * New name for the workspace
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * New URL-friendly slug (lowercase alphanumeric segments separated by single hyphens, no leading/trailing hyphens)
   */
  public val slug: String?
    get() = slugState.valueOrNull()

  public constructor() : this(defaultImageModelState = FieldState.Absent,
  defaultProviderSortState = FieldState.Absent,
  defaultTextModelState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  ioLoggingApiKeyIdsState = FieldState.Absent,
  ioLoggingSamplingRateState = FieldState.Absent,
  isDataDiscountLoggingEnabledState = FieldState.Absent,
  isObservabilityBroadcastEnabledState = FieldState.Absent,
  isObservabilityIoLoggingEnabledState = FieldState.Absent,
  nameState = FieldState.Absent,
  slugState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `default_image_model`.
   */
  public fun defaultImageModelPresence(): FieldPresence = defaultImageModelState.presence

  /**
   * Returns the wire presence of `default_provider_sort`.
   */
  public fun defaultProviderSortPresence(): FieldPresence = defaultProviderSortState.presence

  /**
   * Returns the wire presence of `default_text_model`.
   */
  public fun defaultTextModelPresence(): FieldPresence = defaultTextModelState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `io_logging_api_key_ids`.
   */
  public fun ioLoggingApiKeyIdsPresence(): FieldPresence = ioLoggingApiKeyIdsState.presence

  /**
   * Returns the wire presence of `io_logging_sampling_rate`.
   */
  public fun ioLoggingSamplingRatePresence(): FieldPresence = ioLoggingSamplingRateState.presence

  /**
   * Returns the wire presence of `is_data_discount_logging_enabled`.
   */
  public fun isDataDiscountLoggingEnabledPresence(): FieldPresence = isDataDiscountLoggingEnabledState.presence

  /**
   * Returns the wire presence of `is_observability_broadcast_enabled`.
   */
  public fun isObservabilityBroadcastEnabledPresence(): FieldPresence = isObservabilityBroadcastEnabledState.presence

  /**
   * Returns the wire presence of `is_observability_io_logging_enabled`.
   */
  public fun isObservabilityIoLoggingEnabledPresence(): FieldPresence = isObservabilityIoLoggingEnabledState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `slug`.
   */
  public fun slugPresence(): FieldPresence = slugState.presence

  public class Builder {
    private var defaultImageModelState: FieldState<String?> = FieldState.Absent

    /**
     * Default image model for this workspace
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultImageModel: String?
      get() = defaultImageModelState.valueOrNull()
      set(`value`) {
        defaultImageModelState = value.toNullableFieldState()
      }

    private var defaultProviderSortState: FieldState<String?> = FieldState.Absent

    /**
     * Default provider sort preference (price, throughput, latency, exacto)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultProviderSort: String?
      get() = defaultProviderSortState.valueOrNull()
      set(`value`) {
        defaultProviderSortState = value.toNullableFieldState()
      }

    private var defaultTextModelState: FieldState<String?> = FieldState.Absent

    /**
     * Default text model for this workspace
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultTextModel: String?
      get() = defaultTextModelState.valueOrNull()
      set(`value`) {
        defaultTextModelState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * New description for the workspace
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var ioLoggingApiKeyIdsState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * Optional array of API key IDs to filter I/O logging
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var ioLoggingApiKeyIds: List<Int>?
      get() = ioLoggingApiKeyIdsState.valueOrNull()
      set(`value`) {
        ioLoggingApiKeyIdsState = value.toNullableFieldState()
      }

    private var ioLoggingSamplingRateState: FieldState<Double> = FieldState.Absent

    /**
     * Sampling rate for I/O logging (0.0001-1)
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var ioLoggingSamplingRate: Double?
      get() = ioLoggingSamplingRateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) {
          "ioLoggingSamplingRate is not nullable; call unsetIoLoggingSamplingRate() to omit it" }
        ioLoggingSamplingRateState = FieldState.Value(present)
      }

    private var isDataDiscountLoggingEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether data discount logging is enabled
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isDataDiscountLoggingEnabled: Boolean?
      get() = isDataDiscountLoggingEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) {
          "isDataDiscountLoggingEnabled is not nullable; call unsetIsDataDiscountLoggingEnabled() to omit it" }
        isDataDiscountLoggingEnabledState = FieldState.Value(present)
      }

    private var isObservabilityBroadcastEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether broadcast is enabled
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isObservabilityBroadcastEnabled: Boolean?
      get() = isObservabilityBroadcastEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) {
          "isObservabilityBroadcastEnabled is not nullable; call unsetIsObservabilityBroadcastEnabled() to omit it" }
        isObservabilityBroadcastEnabledState = FieldState.Value(present)
      }

    private var isObservabilityIoLoggingEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether private logging is enabled
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isObservabilityIoLoggingEnabled: Boolean?
      get() = isObservabilityIoLoggingEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) {
          "isObservabilityIoLoggingEnabled is not nullable; call unsetIsObservabilityIoLoggingEnabled() to omit it" }
        isObservabilityIoLoggingEnabledState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * New name for the workspace
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var slugState: FieldState<String> = FieldState.Absent

    /**
     * New URL-friendly slug (lowercase alphanumeric segments separated by single hyphens, no leading/trailing hyphens)
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var slug: String?
      get() = slugState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "slug is not nullable; call unsetSlug() to omit it" }
        slugState = FieldState.Value(present)
      }

    /**
     * Omits `default_image_model` from serialized output.
     */
    public fun unsetDefaultImageModel() {
      defaultImageModelState = FieldState.Absent
    }

    /**
     * Omits `default_provider_sort` from serialized output.
     */
    public fun unsetDefaultProviderSort() {
      defaultProviderSortState = FieldState.Absent
    }

    /**
     * Omits `default_text_model` from serialized output.
     */
    public fun unsetDefaultTextModel() {
      defaultTextModelState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `io_logging_api_key_ids` from serialized output.
     */
    public fun unsetIoLoggingApiKeyIds() {
      ioLoggingApiKeyIdsState = FieldState.Absent
    }

    /**
     * Omits `io_logging_sampling_rate` from serialized output.
     */
    public fun unsetIoLoggingSamplingRate() {
      ioLoggingSamplingRateState = FieldState.Absent
    }

    /**
     * Omits `is_data_discount_logging_enabled` from serialized output.
     */
    public fun unsetIsDataDiscountLoggingEnabled() {
      isDataDiscountLoggingEnabledState = FieldState.Absent
    }

    /**
     * Omits `is_observability_broadcast_enabled` from serialized output.
     */
    public fun unsetIsObservabilityBroadcastEnabled() {
      isObservabilityBroadcastEnabledState = FieldState.Absent
    }

    /**
     * Omits `is_observability_io_logging_enabled` from serialized output.
     */
    public fun unsetIsObservabilityIoLoggingEnabled() {
      isObservabilityIoLoggingEnabledState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `slug` from serialized output.
     */
    public fun unsetSlug() {
      slugState = FieldState.Absent
    }

    public fun build(): UpdateWorkspaceRequest = UpdateWorkspaceRequest(
      defaultImageModelState = defaultImageModelState,
      defaultProviderSortState = defaultProviderSortState,
      defaultTextModelState = defaultTextModelState,
      descriptionState = descriptionState,
      ioLoggingApiKeyIdsState = ioLoggingApiKeyIdsState,
      ioLoggingSamplingRateState = ioLoggingSamplingRateState,
      isDataDiscountLoggingEnabledState = isDataDiscountLoggingEnabledState,
      isObservabilityBroadcastEnabledState = isObservabilityBroadcastEnabledState,
      isObservabilityIoLoggingEnabledState = isObservabilityIoLoggingEnabledState,
      nameState = nameState,
      slugState = slugState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateWorkspaceRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<UpdateWorkspaceRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateWorkspaceRequest {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateWorkspaceRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("UpdateWorkspaceRequest must be a JSON object")
      return UpdateWorkspaceRequest(
        defaultImageModelState = json.decodeOptional(raw, "default_image_model", nullable = true),
        defaultProviderSortState = json.decodeOptional(raw, "default_provider_sort", nullable = true),
        defaultTextModelState = json.decodeOptional(raw, "default_text_model", nullable = true),
        descriptionState = json.decodeOptional(raw, "description", nullable = true),
        ioLoggingApiKeyIdsState = json.decodeOptional(raw, "io_logging_api_key_ids", nullable = true),
        ioLoggingSamplingRateState = json.decodeOptional(raw, "io_logging_sampling_rate", nullable = false),
        isDataDiscountLoggingEnabledState = json.decodeOptional(raw, "is_data_discount_logging_enabled", nullable =
          false),
        isObservabilityBroadcastEnabledState = json.decodeOptional(raw, "is_observability_broadcast_enabled",
          nullable = false),
        isObservabilityIoLoggingEnabledState = json.decodeOptional(raw, "is_observability_io_logging_enabled",
          nullable = false),
        nameState = json.decodeOptional(raw, "name", nullable = false),
        slugState = json.decodeOptional(raw, "slug", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateWorkspaceRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateWorkspaceRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("default_image_model", value.defaultImageModelState, json::encodeToJsonElement)
        putState("default_provider_sort", value.defaultProviderSortState, json::encodeToJsonElement)
        putState("default_text_model", value.defaultTextModelState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("io_logging_api_key_ids", value.ioLoggingApiKeyIdsState, json::encodeToJsonElement)
        putState("io_logging_sampling_rate", value.ioLoggingSamplingRateState, json::encodeToJsonElement)
        putState("is_data_discount_logging_enabled", value.isDataDiscountLoggingEnabledState, json::encodeToJsonElement)
        putState("is_observability_broadcast_enabled", value.isObservabilityBroadcastEnabledState,
          json::encodeToJsonElement)
        putState("is_observability_io_logging_enabled", value.isObservabilityIoLoggingEnabledState,
          json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("slug", value.slugState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateWorkspaceRequest(block: UpdateWorkspaceRequest.Builder.() -> Unit): UpdateWorkspaceRequest =
  UpdateWorkspaceRequest.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("UpdateWorkspaceRequest property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
