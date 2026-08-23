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
public data class UnlabeledIssueEventView(
  public val actor: SimpleUser,
  @SerialName("commit_id")
  public val commitId: String?,
  @SerialName("commit_url")
  public val commitUrl: String?,
  @SerialName("created_at")
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  public val label: InlineUnlabeledIssueEventLabelXd6068f36,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("performed_via_github_app")
  public val performedViaGithubApp: NullableIntegration?,
  public val url: String,
)

/**
 * Unlabeled Issue Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/unlabeled-issue-event
 */
@Serializable(with = UnlabeledIssueEvent.Serializer::class)
public class UnlabeledIssueEvent(
  public val actor: SimpleUser,
  public val commitId: String?,
  public val commitUrl: String?,
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  public val label: InlineUnlabeledIssueEventLabelXd6068f36,
  public val nodeId: String,
  public val performedViaGithubApp: NullableIntegration?,
  public val url: String,
) {
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

    private var labelValue: InlineUnlabeledIssueEventLabelXd6068f36? = null

    public var label: InlineUnlabeledIssueEventLabelXd6068f36
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
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

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var performedViaGithubApp: NullableIntegration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    public fun build(): UnlabeledIssueEvent {
      check(actorValue != null) { "actor is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventValue != null) { "event is required" }
      check(idValue != null) { "id is required" }
      check(labelValue != null) { "label is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(urlValue != null) { "url is required" }
      check(commitIdState !== FieldState.Absent) { "commitId is required, even when null" }
      check(commitUrlState !== FieldState.Absent) { "commitUrl is required, even when null" }
      check(performedViaGithubAppState !== FieldState.Absent) { "performedViaGithubApp is required, even when null" }
      return UnlabeledIssueEvent(
        actor = actor,
        commitId = commitIdState.valueOrNull(),
        commitUrl = commitUrlState.valueOrNull(),
        createdAt = createdAt,
        event = event,
        id = id,
        label = label,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubAppState.valueOrNull(),
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnlabeledIssueEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnlabeledIssueEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnlabeledIssueEvent {
      val jsonDecoder = decoder.requireJsonDecoder("UnlabeledIssueEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnlabeledIssueEvent must be a JSON object")
      val actor = json.decodeRequired<SimpleUser>(rawObject, "actor")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val event = json.decodeRequired<String>(rawObject, "event")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val label = json.decodeRequired<InlineUnlabeledIssueEventLabelXd6068f36>(rawObject, "label")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("commit_id")) {
        throw SerializationException("UnlabeledIssueEvent is missing required property 'commit_id'")
      }
      val commitId = rawObject["commit_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("commit_url")) {
        throw SerializationException("UnlabeledIssueEvent is missing required property 'commit_url'")
      }
      val commitUrl = rawObject["commit_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("performed_via_github_app")) {
        throw SerializationException("UnlabeledIssueEvent is missing required property 'performed_via_github_app'")
      }
      val performedViaGithubApp = rawObject["performed_via_github_app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(requireNotNull(element)) }
      return UnlabeledIssueEvent(
        actor = actor,
        commitId = commitId,
        commitUrl = commitUrl,
        createdAt = createdAt,
        event = event,
        id = id,
        label = label,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubApp,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnlabeledIssueEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("UnlabeledIssueEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("commit_id", value.commitId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_url", value.commitUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("event", value.event)
        put("id", json.encodeToJsonElement(value.id))
        put("label", json.encodeToJsonElement(value.label))
        put("node_id", value.nodeId)
        put("performed_via_github_app", value.performedViaGithubApp?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unlabeledIssueEvent(block: UnlabeledIssueEvent.Builder.() -> Unit): UnlabeledIssueEvent = UnlabeledIssueEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnlabeledIssueEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("UnlabeledIssueEvent property '" + name + "' is not nullable")
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
