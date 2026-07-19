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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Workspace.
 */
@Serializable(with = Workspace.Serializer::class)
public class Workspace(
  /**
   * ISO 8601 timestamp of when the workspace was created
   */
  public val createdAt: String,
  /**
   * User ID of the workspace creator
   */
  public val createdBy: String?,
  /**
   * Default image model for this workspace
   */
  public val defaultImageModel: String?,
  /**
   * Default provider sort preference (price, throughput, latency, exacto)
   */
  public val defaultProviderSort: String?,
  /**
   * Default text model for this workspace
   */
  public val defaultTextModel: String?,
  /**
   * Description of the workspace
   */
  public val description: String?,
  /**
   * Unique identifier for the workspace
   */
  public val id: String,
  /**
   * Optional array of API key IDs to filter I/O logging. Null means all keys are logged.
   */
  public val ioLoggingApiKeyIds: List<Int>?,
  /**
   * Sampling rate for I/O logging (0.0001-1). 1 means 100% of requests are logged.
   */
  public val ioLoggingSamplingRate: Double,
  /**
   * Whether data discount logging is enabled for this workspace
   */
  public val isDataDiscountLoggingEnabled: Boolean,
  /**
   * Whether broadcast is enabled for this workspace
   */
  public val isObservabilityBroadcastEnabled: Boolean,
  /**
   * Whether private logging is enabled for this workspace
   */
  public val isObservabilityIoLoggingEnabled: Boolean,
  /**
   * Name of the workspace
   */
  public val name: String,
  /**
   * URL-friendly slug for the workspace
   */
  public val slug: String,
  /**
   * ISO 8601 timestamp of when the workspace was last updated
   */
  public val updatedAt: String?,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var ioLoggingSamplingRateValue: Double? = null

    public var ioLoggingSamplingRate: Double
      get() = requireNotNull(ioLoggingSamplingRateValue) { "ioLoggingSamplingRate is required" }
      set(`value`) {
        ioLoggingSamplingRateValue = value
      }

    private var isDataDiscountLoggingEnabledValue: Boolean? = null

    public var isDataDiscountLoggingEnabled: Boolean
      get() = requireNotNull(isDataDiscountLoggingEnabledValue) { "isDataDiscountLoggingEnabled is required" }
      set(`value`) {
        isDataDiscountLoggingEnabledValue = value
      }

    private var isObservabilityBroadcastEnabledValue: Boolean? = null

    public var isObservabilityBroadcastEnabled: Boolean
      get() = requireNotNull(isObservabilityBroadcastEnabledValue) { "isObservabilityBroadcastEnabled is required" }
      set(`value`) {
        isObservabilityBroadcastEnabledValue = value
      }

    private var isObservabilityIoLoggingEnabledValue: Boolean? = null

    public var isObservabilityIoLoggingEnabled: Boolean
      get() = requireNotNull(isObservabilityIoLoggingEnabledValue) { "isObservabilityIoLoggingEnabled is required" }
      set(`value`) {
        isObservabilityIoLoggingEnabledValue = value
      }

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

    private var createdByState: FieldState<String?> = FieldState.Absent

    /**
     * User ID of the workspace creator
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdBy: String?
      get() = createdByState.valueOrNull()
      set(`value`) {
        createdByState = value.toNullableFieldState()
      }

    private var defaultImageModelState: FieldState<String?> = FieldState.Absent

    /**
     * Default image model for this workspace
     * Required nullable field; assigning `null` records present-null.
     */
    public var defaultImageModel: String?
      get() = defaultImageModelState.valueOrNull()
      set(`value`) {
        defaultImageModelState = value.toNullableFieldState()
      }

    private var defaultProviderSortState: FieldState<String?> = FieldState.Absent

    /**
     * Default provider sort preference (price, throughput, latency, exacto)
     * Required nullable field; assigning `null` records present-null.
     */
    public var defaultProviderSort: String?
      get() = defaultProviderSortState.valueOrNull()
      set(`value`) {
        defaultProviderSortState = value.toNullableFieldState()
      }

    private var defaultTextModelState: FieldState<String?> = FieldState.Absent

    /**
     * Default text model for this workspace
     * Required nullable field; assigning `null` records present-null.
     */
    public var defaultTextModel: String?
      get() = defaultTextModelState.valueOrNull()
      set(`value`) {
        defaultTextModelState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Description of the workspace
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var ioLoggingApiKeyIdsState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * Optional array of API key IDs to filter I/O logging. Null means all keys are logged.
     * Required nullable field; assigning `null` records present-null.
     */
    public var ioLoggingApiKeyIds: List<Int>?
      get() = ioLoggingApiKeyIdsState.valueOrNull()
      set(`value`) {
        ioLoggingApiKeyIdsState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * ISO 8601 timestamp of when the workspace was last updated
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    public fun build(): Workspace {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(ioLoggingSamplingRateValue != null) { "ioLoggingSamplingRate is required" }
      check(isDataDiscountLoggingEnabledValue != null) { "isDataDiscountLoggingEnabled is required" }
      check(isObservabilityBroadcastEnabledValue != null) { "isObservabilityBroadcastEnabled is required" }
      check(isObservabilityIoLoggingEnabledValue != null) { "isObservabilityIoLoggingEnabled is required" }
      check(nameValue != null) { "name is required" }
      check(slugValue != null) { "slug is required" }
      check(createdByState !== FieldState.Absent) { "createdBy is required, even when null" }
      check(defaultImageModelState !== FieldState.Absent) { "defaultImageModel is required, even when null" }
      check(defaultProviderSortState !== FieldState.Absent) { "defaultProviderSort is required, even when null" }
      check(defaultTextModelState !== FieldState.Absent) { "defaultTextModel is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(ioLoggingApiKeyIdsState !== FieldState.Absent) { "ioLoggingApiKeyIds is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return Workspace(
        createdAt = createdAt,
        createdBy = createdByState.valueOrNull(),
        defaultImageModel = defaultImageModelState.valueOrNull(),
        defaultProviderSort = defaultProviderSortState.valueOrNull(),
        defaultTextModel = defaultTextModelState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        id = id,
        ioLoggingApiKeyIds = ioLoggingApiKeyIdsState.valueOrNull(),
        ioLoggingSamplingRate = ioLoggingSamplingRate,
        isDataDiscountLoggingEnabled = isDataDiscountLoggingEnabled,
        isObservabilityBroadcastEnabled = isObservabilityBroadcastEnabled,
        isObservabilityIoLoggingEnabled = isObservabilityIoLoggingEnabled,
        name = name,
        slug = slug,
        updatedAt = updatedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Workspace = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Workspace> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Workspace {
      val jsonDecoder = decoder.requireJsonDecoder("Workspace")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("Workspace must be a JSON object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val id = json.decodeRequired<String>(raw, "id")
      val ioLoggingSamplingRate = json.decodeRequired<Double>(raw, "io_logging_sampling_rate")
      val isDataDiscountLoggingEnabled = json.decodeRequired<Boolean>(raw, "is_data_discount_logging_enabled")
      val isObservabilityBroadcastEnabled = json.decodeRequired<Boolean>(raw, "is_observability_broadcast_enabled")
      val isObservabilityIoLoggingEnabled = json.decodeRequired<Boolean>(raw, "is_observability_io_logging_enabled")
      val name = json.decodeRequired<String>(raw, "name")
      val slug = json.decodeRequired<String>(raw, "slug")
      if (!raw.containsKey("created_by")) {
        throw SerializationException("Workspace is missing required property 'created_by'")
      }
      val createdBy = raw["created_by"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("default_image_model")) {
        throw SerializationException("Workspace is missing required property 'default_image_model'")
      }
      val defaultImageModel = raw["default_image_model"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("default_provider_sort")) {
        throw SerializationException("Workspace is missing required property 'default_provider_sort'")
      }
      val defaultProviderSort = raw["default_provider_sort"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("default_text_model")) {
        throw SerializationException("Workspace is missing required property 'default_text_model'")
      }
      val defaultTextModel = raw["default_text_model"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("description")) {
        throw SerializationException("Workspace is missing required property 'description'")
      }
      val description = raw["description"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("io_logging_api_key_ids")) {
        throw SerializationException("Workspace is missing required property 'io_logging_api_key_ids'")
      }
      val ioLoggingApiKeyIds = raw["io_logging_api_key_ids"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<Int>?>(requireNotNull(element)) }
      if (!raw.containsKey("updated_at")) {
        throw SerializationException("Workspace is missing required property 'updated_at'")
      }
      val updatedAt = raw["updated_at"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Workspace(
        createdAt = createdAt,
        createdBy = createdBy,
        defaultImageModel = defaultImageModel,
        defaultProviderSort = defaultProviderSort,
        defaultTextModel = defaultTextModel,
        description = description,
        id = id,
        ioLoggingApiKeyIds = ioLoggingApiKeyIds,
        ioLoggingSamplingRate = ioLoggingSamplingRate,
        isDataDiscountLoggingEnabled = isDataDiscountLoggingEnabled,
        isObservabilityBroadcastEnabled = isObservabilityBroadcastEnabled,
        isObservabilityIoLoggingEnabled = isObservabilityIoLoggingEnabled,
        name = name,
        slug = slug,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Workspace) {
      val jsonEncoder = encoder.requireJsonEncoder("Workspace")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("created_by", value.createdBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("default_image_model", value.defaultImageModel?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("default_provider_sort", value.defaultProviderSort?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("default_text_model", value.defaultTextModel?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("io_logging_api_key_ids", value.ioLoggingApiKeyIds?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("io_logging_sampling_rate", json.encodeToJsonElement(value.ioLoggingSamplingRate))
        put("is_data_discount_logging_enabled", json.encodeToJsonElement(value.isDataDiscountLoggingEnabled))
        put("is_observability_broadcast_enabled", json.encodeToJsonElement(value.isObservabilityBroadcastEnabled))
        put("is_observability_io_logging_enabled", json.encodeToJsonElement(value.isObservabilityIoLoggingEnabled))
        put("name", value.name)
        put("slug", value.slug)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workspace(block: Workspace.Builder.() -> Unit): Workspace = Workspace.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Workspace is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Workspace property '" + name + "' is not nullable")
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
