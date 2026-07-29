package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/1
 */
@Serializable(with = InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5.Serializer::class)
public class InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 internal constructor(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val afterId: Double?,
  private val archivedState: FieldState<Boolean>,
  private val columnIdState: FieldState<Int>,
  private val columnUrlState: FieldState<String>,
  private val createdAtState: FieldState<String>,
  private val creatorState:
      FieldState<InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?>,
  private val idState: FieldState<Int>,
  private val nodeIdState: FieldState<String>,
  private val noteState: FieldState<String?>,
  private val projectUrlState: FieldState<String>,
  private val updatedAtState: FieldState<String>,
  private val urlState: FieldState<String>,
) {
  public val archived: Boolean?
    get() = archivedState.valueOrNull()

  public val columnId: Int?
    get() = columnIdState.valueOrNull()

  public val columnUrl: String?
    get() = columnUrlState.valueOrNull()

  public val createdAt: String?
    get() = createdAtState.valueOrNull()

  public val creator: InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?
    get() = creatorState.valueOrNull()

  public val id: Int?
    get() = idState.valueOrNull()

  public val nodeId: String?
    get() = nodeIdState.valueOrNull()

  public val note: String?
    get() = noteState.valueOrNull()

  public val projectUrl: String?
    get() = projectUrlState.valueOrNull()

  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public val url: String?
    get() = urlState.valueOrNull()

  public constructor(afterId: Double?) : this(afterId = afterId,
  archivedState = FieldState.Absent,
  columnIdState = FieldState.Absent,
  columnUrlState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  creatorState = FieldState.Absent,
  idState = FieldState.Absent,
  nodeIdState = FieldState.Absent,
  noteState = FieldState.Absent,
  projectUrlState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  urlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `archived`.
   */
  public fun archivedPresence(): FieldPresence = archivedState.presence

  /**
   * Returns the wire presence of `column_id`.
   */
  public fun columnIdPresence(): FieldPresence = columnIdState.presence

  /**
   * Returns the wire presence of `column_url`.
   */
  public fun columnUrlPresence(): FieldPresence = columnUrlState.presence

  /**
   * Returns the wire presence of `created_at`.
   */
  public fun createdAtPresence(): FieldPresence = createdAtState.presence

  /**
   * Returns the wire presence of `creator`.
   */
  public fun creatorPresence(): FieldPresence = creatorState.presence

  /**
   * Returns the wire presence of `id`.
   */
  public fun idPresence(): FieldPresence = idState.presence

  /**
   * Returns the wire presence of `node_id`.
   */
  public fun nodeIdPresence(): FieldPresence = nodeIdState.presence

  /**
   * Returns the wire presence of `note`.
   */
  public fun notePresence(): FieldPresence = noteState.presence

  /**
   * Returns the wire presence of `project_url`.
   */
  public fun projectUrlPresence(): FieldPresence = projectUrlState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  /**
   * Returns the wire presence of `url`.
   */
  public fun urlPresence(): FieldPresence = urlState.presence

  public class Builder {
    private var afterIdState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var afterId: Double?
      get() = afterIdState.valueOrNull()
      set(`value`) {
        afterIdState = value.toNullableFieldState()
      }

    private var archivedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var archived: Boolean?
      get() = archivedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "archived is not nullable; call unsetArchived() to omit it" }
        archivedState = FieldState.Value(present)
      }

    private var columnIdState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var columnId: Int?
      get() = columnIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "columnId is not nullable; call unsetColumnId() to omit it" }
        columnIdState = FieldState.Value(present)
      }

    private var columnUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var columnUrl: String?
      get() = columnUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "columnUrl is not nullable; call unsetColumnUrl() to omit it" }
        columnUrlState = FieldState.Value(present)
      }

    private var createdAtState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "createdAt is not nullable; call unsetCreatedAt() to omit it" }
        createdAtState = FieldState.Value(present)
      }

    private var creatorState:
        FieldState<InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var creator: InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
      }

    private var idState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var id: Int?
      get() = idState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "id is not nullable; call unsetId() to omit it" }
        idState = FieldState.Value(present)
      }

    private var nodeIdState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var nodeId: String?
      get() = nodeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "nodeId is not nullable; call unsetNodeId() to omit it" }
        nodeIdState = FieldState.Value(present)
      }

    private var noteState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var note: String?
      get() = noteState.valueOrNull()
      set(`value`) {
        noteState = value.toNullableFieldState()
      }

    private var projectUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var projectUrl: String?
      get() = projectUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "projectUrl is not nullable; call unsetProjectUrl() to omit it" }
        projectUrlState = FieldState.Value(present)
      }

    private var updatedAtState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "updatedAt is not nullable; call unsetUpdatedAt() to omit it" }
        updatedAtState = FieldState.Value(present)
      }

    private var urlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "url is not nullable; call unsetUrl() to omit it" }
        urlState = FieldState.Value(present)
      }

    /**
     * Omits `archived` from serialized output.
     */
    public fun unsetArchived() {
      archivedState = FieldState.Absent
    }

    /**
     * Omits `column_id` from serialized output.
     */
    public fun unsetColumnId() {
      columnIdState = FieldState.Absent
    }

    /**
     * Omits `column_url` from serialized output.
     */
    public fun unsetColumnUrl() {
      columnUrlState = FieldState.Absent
    }

    /**
     * Omits `created_at` from serialized output.
     */
    public fun unsetCreatedAt() {
      createdAtState = FieldState.Absent
    }

    /**
     * Omits `creator` from serialized output.
     */
    public fun unsetCreator() {
      creatorState = FieldState.Absent
    }

    /**
     * Omits `id` from serialized output.
     */
    public fun unsetId() {
      idState = FieldState.Absent
    }

    /**
     * Omits `node_id` from serialized output.
     */
    public fun unsetNodeId() {
      nodeIdState = FieldState.Absent
    }

    /**
     * Omits `note` from serialized output.
     */
    public fun unsetNote() {
      noteState = FieldState.Absent
    }

    /**
     * Omits `project_url` from serialized output.
     */
    public fun unsetProjectUrl() {
      projectUrlState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    /**
     * Omits `url` from serialized output.
     */
    public fun unsetUrl() {
      urlState = FieldState.Absent
    }

    public fun build(): InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 {
      check(afterIdState !== FieldState.Absent) { "afterId is required, even when null" }
      return InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5(
        afterId = afterIdState.valueOrNull(),
        archivedState = archivedState,
        columnIdState = columnIdState,
        columnUrlState = columnUrlState,
        createdAtState = createdAtState,
        creatorState = creatorState,
        idState = idState,
        nodeIdState = nodeIdState,
        noteState = noteState,
        projectUrlState = projectUrlState,
        updatedAtState = updatedAtState,
        urlState = urlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 must be a JSON object")
      if (!rawObject.containsKey("after_id")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 is missing required property 'after_id'")
      }
      val afterId = rawObject["after_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      return InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5(
        afterId = afterId,
        archivedState = json.decodeOptional(rawObject, "archived", nullable = false),
        columnIdState = json.decodeOptional(rawObject, "column_id", nullable = false),
        columnUrlState = json.decodeOptional(rawObject, "column_url", nullable = false),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = false),
        creatorState = json.decodeOptional(rawObject, "creator", nullable = true),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
        nodeIdState = json.decodeOptional(rawObject, "node_id", nullable = false),
        noteState = json.decodeOptional(rawObject, "note", nullable = true),
        projectUrlState = json.decodeOptional(rawObject, "project_url", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = false),
        urlState = json.decodeOptional(rawObject, "url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after_id", value.afterId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("archived", value.archivedState, json::encodeToJsonElement)
        putState("column_id", value.columnIdState, json::encodeToJsonElement)
        putState("column_url", value.columnUrlState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("creator", value.creatorState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
        putState("node_id", value.nodeIdState, json::encodeToJsonElement)
        putState("note", value.noteState, json::encodeToJsonElement)
        putState("project_url", value.projectUrlState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
        putState("url", value.urlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5(block: InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5.Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 = InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf2X4edb08a5 property '" + name + "' is not nullable")
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
