package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ConvertedNoteToIssueIssueEventView(
  public val actor: SimpleUser,
  @SerialName("commit_id")
  public val commitId: String?,
  @SerialName("commit_url")
  public val commitUrl: String?,
  @SerialName("created_at")
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("performed_via_github_app")
  public val performedViaGithubApp: Integration?,
  @SerialName("project_card")
  public val projectCard: InlineConvertedNoteToIssueIssueEventProjectCardXac8fa5c9? = null,
  public val url: String,
)

/**
 * Converted Note to Issue Issue Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/converted-note-to-issue-issue-event
 */
@Serializable(with = ConvertedNoteToIssueIssueEvent.Serializer::class)
public class ConvertedNoteToIssueIssueEvent internal constructor(
  public val actor: SimpleUser,
  public val commitId: String?,
  public val commitUrl: String?,
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  public val nodeId: String,
  public val performedViaGithubApp: Integration?,
  public val url: String,
  private val projectCardState:
      FieldState<InlineConvertedNoteToIssueIssueEventProjectCardXac8fa5c9>,
) {
  public val projectCard: InlineConvertedNoteToIssueIssueEventProjectCardXac8fa5c9?
    get() = projectCardState.valueOrNull()

  public constructor(
    actor: SimpleUser,
    commitId: String?,
    commitUrl: String?,
    createdAt: String,
    event: String,
    id: Int,
    nodeId: String,
    performedViaGithubApp: Integration?,
    url: String,
  ) : this(actor = actor,
  commitId = commitId,
  commitUrl = commitUrl,
  createdAt = createdAt,
  event = event,
  id = id,
  nodeId = nodeId,
  performedViaGithubApp = performedViaGithubApp,
  url = url,
  projectCardState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `project_card`.
   */
  public fun projectCardPresence(): FieldPresence = projectCardState.presence

  public class Builder {
    private var actorValue: SimpleUser? = null

    public var actor: SimpleUser
      get() = requireNotNull(actorValue) { "actor is required" }
      set(`value`) {
        actorValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var commitIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitId: String?
      get() = commitIdState.valueOrNull()
      set(`value`) {
        commitIdState = value.toNullableFieldState()
      }

    private var commitUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitUrl: String?
      get() = commitUrlState.valueOrNull()
      set(`value`) {
        commitUrlState = value.toNullableFieldState()
      }

    private var performedViaGithubAppState: FieldState<Integration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var performedViaGithubApp: Integration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var projectCardState:
        FieldState<InlineConvertedNoteToIssueIssueEventProjectCardXac8fa5c9> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var projectCard: InlineConvertedNoteToIssueIssueEventProjectCardXac8fa5c9?
      get() = projectCardState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "projectCard is not nullable; call unsetProjectCard() to omit it" }
        projectCardState = FieldState.Value(present)
      }

    /**
     * Omits `project_card` from serialized output.
     */
    public fun unsetProjectCard() {
      projectCardState = FieldState.Absent
    }

    public fun build(): ConvertedNoteToIssueIssueEvent {
      check(actorValue != null) { "actor is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventValue != null) { "event is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(urlValue != null) { "url is required" }
      check(commitIdState !== FieldState.Absent) { "commitId is required, even when null" }
      check(commitUrlState !== FieldState.Absent) { "commitUrl is required, even when null" }
      check(performedViaGithubAppState !== FieldState.Absent) { "performedViaGithubApp is required, even when null" }
      return ConvertedNoteToIssueIssueEvent(
        actor = actor,
        commitId = commitIdState.valueOrNull(),
        commitUrl = commitUrlState.valueOrNull(),
        createdAt = createdAt,
        event = event,
        id = id,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubAppState.valueOrNull(),
        url = url,
        projectCardState = projectCardState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConvertedNoteToIssueIssueEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ConvertedNoteToIssueIssueEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConvertedNoteToIssueIssueEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ConvertedNoteToIssueIssueEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConvertedNoteToIssueIssueEvent must be a JSON object")
      val actor = json.decodeRequired<SimpleUser>(rawObject, "actor")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val event = json.decodeRequired<String>(rawObject, "event")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("commit_id")) {
        throw SerializationException("ConvertedNoteToIssueIssueEvent is missing required property 'commit_id'")
      }
      val commitId = rawObject["commit_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("commit_url")) {
        throw SerializationException("ConvertedNoteToIssueIssueEvent is missing required property 'commit_url'")
      }
      val commitUrl = rawObject["commit_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("performed_via_github_app")) {
        throw SerializationException("ConvertedNoteToIssueIssueEvent is missing required property 'performed_via_github_app'")
      }
      val performedViaGithubApp = rawObject["performed_via_github_app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Integration?>(requireNotNull(element)) }
      return ConvertedNoteToIssueIssueEvent(
        actor = actor,
        commitId = commitId,
        commitUrl = commitUrl,
        createdAt = createdAt,
        event = event,
        id = id,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubApp,
        url = url,
        projectCardState = json.decodeOptional(rawObject, "project_card", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConvertedNoteToIssueIssueEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ConvertedNoteToIssueIssueEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("commit_id", value.commitId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_url", value.commitUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("event", value.event)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("performed_via_github_app", value.performedViaGithubApp?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
        putState("project_card", value.projectCardState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun convertedNoteToIssueIssueEvent(block: ConvertedNoteToIssueIssueEvent.Builder.() -> Unit): ConvertedNoteToIssueIssueEvent = ConvertedNoteToIssueIssueEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConvertedNoteToIssueIssueEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ConvertedNoteToIssueIssueEvent property '" + name + "' is not nullable")
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
