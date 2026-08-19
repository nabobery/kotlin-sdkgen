package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * A preset without version details.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preset
 */
@Serializable(with = Preset.Serializer::class)
public class Preset(
  public val createdAt: String,
  public val creatorUserId: String?,
  public val description: String?,
  public val designatedVersionId: String?,
  public val id: String,
  public val name: String,
  public val slug: String,
  public val status: PresetStatus,
  public val statusUpdatedAt: String?,
  public val updatedAt: String,
  public val workspaceId: String?,
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

    private var statusValue: PresetStatus? = null

    public var status: PresetStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var creatorUserIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creatorUserId: String?
      get() = creatorUserIdState.valueOrNull()
      set(`value`) {
        creatorUserIdState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var designatedVersionIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var designatedVersionId: String?
      get() = designatedVersionIdState.valueOrNull()
      set(`value`) {
        designatedVersionIdState = value.toNullableFieldState()
      }

    private var statusUpdatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var statusUpdatedAt: String?
      get() = statusUpdatedAtState.valueOrNull()
      set(`value`) {
        statusUpdatedAtState = value.toNullableFieldState()
      }

    private var workspaceIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var workspaceId: String?
      get() = workspaceIdState.valueOrNull()
      set(`value`) {
        workspaceIdState = value.toNullableFieldState()
      }

    public fun build(): Preset {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(slugValue != null) { "slug is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(creatorUserIdState !== FieldState.Absent) { "creatorUserId is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(designatedVersionIdState !== FieldState.Absent) { "designatedVersionId is required, even when null" }
      check(statusUpdatedAtState !== FieldState.Absent) { "statusUpdatedAt is required, even when null" }
      check(workspaceIdState !== FieldState.Absent) { "workspaceId is required, even when null" }
      return Preset(
        createdAt = createdAt,
        creatorUserId = creatorUserIdState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        designatedVersionId = designatedVersionIdState.valueOrNull(),
        id = id,
        name = name,
        slug = slug,
        status = status,
        statusUpdatedAt = statusUpdatedAtState.valueOrNull(),
        updatedAt = updatedAt,
        workspaceId = workspaceIdState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Preset = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Preset> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Preset {
      val jsonDecoder = decoder.requireJsonDecoder("Preset")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Preset must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val status = json.decodeRequired<PresetStatus>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("creator_user_id")) {
        throw SerializationException("Preset is missing required property 'creator_user_id'")
      }
      val creatorUserId = rawObject["creator_user_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("Preset is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("designated_version_id")) {
        throw SerializationException("Preset is missing required property 'designated_version_id'")
      }
      val designatedVersionId = rawObject["designated_version_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status_updated_at")) {
        throw SerializationException("Preset is missing required property 'status_updated_at'")
      }
      val statusUpdatedAt = rawObject["status_updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("workspace_id")) {
        throw SerializationException("Preset is missing required property 'workspace_id'")
      }
      val workspaceId = rawObject["workspace_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Preset(
        createdAt = createdAt,
        creatorUserId = creatorUserId,
        description = description,
        designatedVersionId = designatedVersionId,
        id = id,
        name = name,
        slug = slug,
        status = status,
        statusUpdatedAt = statusUpdatedAt,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Preset) {
      val jsonEncoder = encoder.requireJsonEncoder("Preset")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("creator_user_id", value.creatorUserId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("designated_version_id", value.designatedVersionId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("name", value.name)
        put("slug", value.slug)
        put("status", json.encodeToJsonElement(value.status))
        put("status_updated_at", value.statusUpdatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("workspace_id", value.workspaceId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun preset(block: Preset.Builder.() -> Unit): Preset = Preset.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Preset is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Preset property '" + name + "' is not nullable")
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
