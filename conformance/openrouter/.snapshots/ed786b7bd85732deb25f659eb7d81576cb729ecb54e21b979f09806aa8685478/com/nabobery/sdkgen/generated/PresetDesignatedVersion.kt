package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * A specific version of a preset, containing config and optional system prompt.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PresetDesignatedVersion
 */
@Serializable(with = PresetDesignatedVersion.Serializer::class)
public class PresetDesignatedVersion(
  config: Map<String, JsonElement?>,
  public val createdAt: String,
  public val creatorId: String,
  public val id: String,
  public val presetId: String,
  public val systemPrompt: String?,
  public val updatedAt: String,
  public val version: Int,
) {
  public val config: Map<String, JsonElement?> = config.toMap()

  public class Builder {
    private var configValue: Map<String, JsonElement?>? = null

    public var config: Map<String, JsonElement?>
      get() = requireNotNull(configValue) { "config is required" }.toMap()
      set(`value`) {
        configValue = value.toMap()
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var creatorIdValue: String? = null

    public var creatorId: String
      get() = requireNotNull(creatorIdValue) { "creatorId is required" }
      set(`value`) {
        creatorIdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var presetIdValue: String? = null

    public var presetId: String
      get() = requireNotNull(presetIdValue) { "presetId is required" }
      set(`value`) {
        presetIdValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var versionValue: Int? = null

    public var version: Int
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var systemPromptState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var systemPrompt: String?
      get() = systemPromptState.valueOrNull()
      set(`value`) {
        systemPromptState = value.toNullableFieldState()
      }

    public fun build(): PresetDesignatedVersion {
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(creatorIdValue != null) { "creatorId is required" }
      check(idValue != null) { "id is required" }
      check(presetIdValue != null) { "presetId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(versionValue != null) { "version is required" }
      check(systemPromptState !== FieldState.Absent) { "systemPrompt is required, even when null" }
      return PresetDesignatedVersion(
        config = config,
        createdAt = createdAt,
        creatorId = creatorId,
        id = id,
        presetId = presetId,
        systemPrompt = systemPromptState.valueOrNull(),
        updatedAt = updatedAt,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PresetDesignatedVersion = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PresetDesignatedVersion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PresetDesignatedVersion {
      val jsonDecoder = decoder.requireJsonDecoder("PresetDesignatedVersion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PresetDesignatedVersion must be a JSON object")
      val config = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val creatorId = json.decodeRequired<String>(rawObject, "creator_id")
      val id = json.decodeRequired<String>(rawObject, "id")
      val presetId = json.decodeRequired<String>(rawObject, "preset_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val version = json.decodeRequired<Int>(rawObject, "version")
      if (!rawObject.containsKey("system_prompt")) {
        throw SerializationException("PresetDesignatedVersion is missing required property 'system_prompt'")
      }
      val systemPrompt = rawObject["system_prompt"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return PresetDesignatedVersion(
        config = config,
        createdAt = createdAt,
        creatorId = creatorId,
        id = id,
        presetId = presetId,
        systemPrompt = systemPrompt,
        updatedAt = updatedAt,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PresetDesignatedVersion) {
      val jsonEncoder = encoder.requireJsonEncoder("PresetDesignatedVersion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("creator_id", value.creatorId)
        put("id", value.id)
        put("preset_id", value.presetId)
        put("system_prompt", value.systemPrompt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("version", json.encodeToJsonElement(value.version))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun presetDesignatedVersion(block: PresetDesignatedVersion.Builder.() -> Unit): PresetDesignatedVersion = PresetDesignatedVersion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PresetDesignatedVersion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("PresetDesignatedVersion property '" + name + "' is not nullable")
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
