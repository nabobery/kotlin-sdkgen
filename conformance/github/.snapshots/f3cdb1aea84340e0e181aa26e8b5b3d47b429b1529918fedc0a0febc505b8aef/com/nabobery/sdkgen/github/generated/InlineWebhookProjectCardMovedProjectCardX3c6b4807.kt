package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card
 */
@Serializable(with = InlineWebhookProjectCardMovedProjectCardX3c6b4807.Serializer::class)
public class InlineWebhookProjectCardMovedProjectCardX3c6b4807 internal constructor(
  public val afterId: Int?,
  /**
   * Whether or not the card is archived
   */
  public val archived: Boolean,
  public val columnId: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val columnUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val creator: InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?,
  /**
   * The project card's ID
   */
  public val id: Int,
  public val nodeId: String,
  public val note: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val projectUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val contentUrlState: FieldState<String>,
) {
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contentUrl: String?
    get() = contentUrlState.valueOrNull()

  public constructor(
    afterId: Int?,
    archived: Boolean,
    columnId: Int,
    columnUrl: String,
    createdAt: String,
    creator: InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?,
    id: Int,
    nodeId: String,
    note: String?,
    projectUrl: String,
    updatedAt: String,
    url: String,
  ) : this(afterId = afterId,
  archived = archived,
  columnId = columnId,
  columnUrl = columnUrl,
  createdAt = createdAt,
  creator = creator,
  id = id,
  nodeId = nodeId,
  note = note,
  projectUrl = projectUrl,
  updatedAt = updatedAt,
  url = url,
  contentUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content_url`.
   */
  public fun contentUrlPresence(): FieldPresence = contentUrlState.presence

  public class Builder {
    private var archivedValue: Boolean? = null

    public var archived: Boolean
      get() = requireNotNull(archivedValue) { "archived is required" }
      set(`value`) {
        archivedValue = value
      }

    private var columnIdValue: Int? = null

    public var columnId: Int
      get() = requireNotNull(columnIdValue) { "columnId is required" }
      set(`value`) {
        columnIdValue = value
      }

    private var columnUrlValue: String? = null

    public var columnUrl: String
      get() = requireNotNull(columnUrlValue) { "columnUrl is required" }
      set(`value`) {
        columnUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var projectUrlValue: String? = null

    public var projectUrl: String
      get() = requireNotNull(projectUrlValue) { "projectUrl is required" }
      set(`value`) {
        projectUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var afterIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var afterId: Int?
      get() = afterIdState.valueOrNull()
      set(`value`) {
        afterIdState = value.toNullableFieldState()
      }

    private var creatorState:
        FieldState<InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
      }

    private var noteState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var note: String?
      get() = noteState.valueOrNull()
      set(`value`) {
        noteState = value.toNullableFieldState()
      }

    private var contentUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var contentUrl: String?
      get() = contentUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "contentUrl is not nullable; call unsetContentUrl() to omit it" }
        contentUrlState = FieldState.Value(present)
      }

    /**
     * Omits `content_url` from serialized output.
     */
    public fun unsetContentUrl() {
      contentUrlState = FieldState.Absent
    }

    public fun build(): InlineWebhookProjectCardMovedProjectCardX3c6b4807 {
      check(archivedValue != null) { "archived is required" }
      check(columnIdValue != null) { "columnId is required" }
      check(columnUrlValue != null) { "columnUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(afterIdState !== FieldState.Absent) { "afterId is required, even when null" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      check(noteState !== FieldState.Absent) { "note is required, even when null" }
      return InlineWebhookProjectCardMovedProjectCardX3c6b4807(
        afterId = afterIdState.valueOrNull(),
        archived = archived,
        columnId = columnId,
        columnUrl = columnUrl,
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        id = id,
        nodeId = nodeId,
        note = noteState.valueOrNull(),
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        url = url,
        contentUrlState = contentUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardX3c6b4807 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardMovedProjectCardX3c6b4807> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedProjectCardX3c6b4807 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardMovedProjectCardX3c6b4807")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 must be a JSON object")
      val archived = json.decodeRequired<Boolean>(rawObject, "archived")
      val columnId = json.decodeRequired<Int>(rawObject, "column_id")
      val columnUrl = json.decodeRequired<String>(rawObject, "column_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("after_id")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 is missing required property 'after_id'")
      }
      val afterId = rawObject["after_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectCardMovedProjectCardAllOf2CreatorXe727d9c1?>(requireNotNull(element)) }
      if (!rawObject.containsKey("note")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 is missing required property 'note'")
      }
      val note = rawObject["note"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookProjectCardMovedProjectCardX3c6b4807(
        afterId = afterId,
        archived = archived,
        columnId = columnId,
        columnUrl = columnUrl,
        createdAt = createdAt,
        creator = creator,
        id = id,
        nodeId = nodeId,
        note = note,
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        url = url,
        contentUrlState = json.decodeOptional(rawObject, "content_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedProjectCardX3c6b4807) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardMovedProjectCardX3c6b4807")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after_id", value.afterId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("archived", json.encodeToJsonElement(value.archived))
        put("column_id", json.encodeToJsonElement(value.columnId))
        put("column_url", value.columnUrl)
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("note", value.note?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("project_url", value.projectUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("content_url", value.contentUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardMovedProjectCardX3c6b4807(block: InlineWebhookProjectCardMovedProjectCardX3c6b4807.Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardX3c6b4807 = InlineWebhookProjectCardMovedProjectCardX3c6b4807.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookProjectCardMovedProjectCardX3c6b4807 property '" + name + "' is not nullable")
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
