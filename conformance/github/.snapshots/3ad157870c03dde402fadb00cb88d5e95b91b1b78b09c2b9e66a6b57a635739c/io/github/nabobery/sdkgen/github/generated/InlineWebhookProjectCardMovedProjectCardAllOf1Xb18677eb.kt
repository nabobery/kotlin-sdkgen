package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/0
 */
@Serializable(with = InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb.Serializer::class)
public class InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb internal constructor(
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
  public val creator: InlineWebhookProjectCardMovedProjectCardAllOf1CreatorXd47f83bb?,
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
  private val afterIdState: FieldState<Int?>,
  private val contentUrlState: FieldState<String>,
) {
  public val afterId: Int?
    get() = afterIdState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contentUrl: String?
    get() = contentUrlState.valueOrNull()

  public constructor(
    archived: Boolean,
    columnId: Int,
    columnUrl: String,
    createdAt: String,
    creator: InlineWebhookProjectCardMovedProjectCardAllOf1CreatorXd47f83bb?,
    id: Int,
    nodeId: String,
    note: String?,
    projectUrl: String,
    updatedAt: String,
    url: String,
  ) : this(archived = archived,
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
  afterIdState = FieldState.Absent,
  contentUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `after_id`.
   */
  public fun afterIdPresence(): FieldPresence = afterIdState.presence

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

    private var creatorState:
        FieldState<InlineWebhookProjectCardMovedProjectCardAllOf1CreatorXd47f83bb?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhookProjectCardMovedProjectCardAllOf1CreatorXd47f83bb?
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

    private var afterIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var afterId: Int?
      get() = afterIdState.valueOrNull()
      set(`value`) {
        afterIdState = value.toNullableFieldState()
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
     * Omits `after_id` from serialized output.
     */
    public fun unsetAfterId() {
      afterIdState = FieldState.Absent
    }

    /**
     * Omits `content_url` from serialized output.
     */
    public fun unsetContentUrl() {
      contentUrlState = FieldState.Absent
    }

    public fun build(): InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb {
      check(archivedValue != null) { "archived is required" }
      check(columnIdValue != null) { "columnId is required" }
      check(columnUrlValue != null) { "columnUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      check(noteState !== FieldState.Absent) { "note is required, even when null" }
      return InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb(
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
        afterIdState = afterIdState,
        contentUrlState = contentUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb must be a JSON object")
      val archived = json.decodeRequired<Boolean>(rawObject, "archived")
      val columnId = json.decodeRequired<Int>(rawObject, "column_id")
      val columnUrl = json.decodeRequired<String>(rawObject, "column_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectCardMovedProjectCardAllOf1CreatorXd47f83bb?>(requireNotNull(element)) }
      if (!rawObject.containsKey("note")) {
        throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb is missing required property 'note'")
      }
      val note = rawObject["note"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb(
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
        afterIdState = json.decodeOptional(rawObject, "after_id", nullable = true),
        contentUrlState = json.decodeOptional(rawObject, "content_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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
        putState("after_id", value.afterIdState, json::encodeToJsonElement)
        putState("content_url", value.contentUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb(block: InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb.Builder.() -> Unit): InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb = InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookProjectCardMovedProjectCardAllOf1Xb18677eb property '" + name + "' is not nullable")
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
