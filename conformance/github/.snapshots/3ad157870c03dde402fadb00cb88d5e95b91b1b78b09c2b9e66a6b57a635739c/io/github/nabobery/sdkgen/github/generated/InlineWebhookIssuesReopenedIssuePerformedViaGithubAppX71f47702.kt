package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
 * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
 * first class actors within GitHub.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702.Serializer::class)
public class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val externalUrl: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the GitHub app
   */
  public val id: Int?,
  /**
   * The name of the GitHub app
   */
  public val name: String,
  public val nodeId: String,
  public val owner: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOwnerX6a36167e?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  eventsState: FieldState<List<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEventsItemXa47acfa0>>,
  private val permissionsState:
      FieldState<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d>,
  private val slugState: FieldState<String>,
) {
  private val eventsState:
      FieldState<List<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEventsItemXa47acfa0>> =
      eventsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The list of events for the GitHub app
   */
  public val events: List<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEventsItemXa47acfa0>?
    get() = eventsState.valueOrNull()

  /**
   * The set of permissions for the GitHub app
   */
  public val permissions: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d?
    get() = permissionsState.valueOrNull()

  /**
   * The slug name of the GitHub app
   */
  public val slug: String?
    get() = slugState.valueOrNull()

  public constructor(
    createdAt: String?,
    description: String?,
    externalUrl: String?,
    htmlUrl: String,
    id: Int?,
    name: String,
    nodeId: String,
    owner: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOwnerX6a36167e?,
    updatedAt: String?,
  ) : this(createdAt = createdAt,
  description = description,
  externalUrl = externalUrl,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  owner = owner,
  updatedAt = updatedAt,
  eventsState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  slugState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `events`.
   */
  public fun eventsPresence(): FieldPresence = eventsState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `slug`.
   */
  public fun slugPresence(): FieldPresence = slugState.presence

  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
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

    private var externalUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var externalUrl: String?
      get() = externalUrlState.valueOrNull()
      set(`value`) {
        externalUrlState = value.toNullableFieldState()
      }

    private var idState: FieldState<Int?> = FieldState.Absent

    /**
     * Unique identifier of the GitHub app
     * Required nullable field; assigning `null` records present-null.
     */
    public var id: Int?
      get() = idState.valueOrNull()
      set(`value`) {
        idState = value.toNullableFieldState()
      }

    private var ownerState:
        FieldState<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOwnerX6a36167e?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var owner: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOwnerX6a36167e?
      get() = ownerState.valueOrNull()
      set(`value`) {
        ownerState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var eventsState:
        FieldState<List<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEventsItemXa47acfa0>> =
        FieldState.Absent

    /**
     * The list of events for the GitHub app
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var events:
        List<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEventsItemXa47acfa0>?
      get() = eventsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "events is not nullable; call unsetEvents() to omit it" }
        eventsState = FieldState.Value(present.toList())
      }

    private var permissionsState:
        FieldState<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d> =
        FieldState.Absent

    /**
     * The set of permissions for the GitHub app
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var slugState: FieldState<String> = FieldState.Absent

    /**
     * The slug name of the GitHub app
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var slug: String?
      get() = slugState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "slug is not nullable; call unsetSlug() to omit it" }
        slugState = FieldState.Value(present)
      }

    /**
     * Omits `events` from serialized output.
     */
    public fun unsetEvents() {
      eventsState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    /**
     * Omits `slug` from serialized output.
     */
    public fun unsetSlug() {
      slugState = FieldState.Absent
    }

    public fun build(): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(externalUrlState !== FieldState.Absent) { "externalUrl is required, even when null" }
      check(idState !== FieldState.Absent) { "id is required, even when null" }
      check(ownerState !== FieldState.Absent) { "owner is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702(
        createdAt = createdAtState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        externalUrl = externalUrlState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = idState.valueOrNull(),
        name = name,
        nodeId = nodeId,
        owner = ownerState.valueOrNull(),
        updatedAt = updatedAtState.valueOrNull(),
        eventsState = eventsState,
        permissionsState = permissionsState,
        slugState = slugState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("external_url")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'external_url'")
      }
      val externalUrl = rawObject["external_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("id")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'id'")
      }
      val id = rawObject["id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("owner")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'owner'")
      }
      val owner = rawObject["owner"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOwnerX6a36167e?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702(
        createdAt = createdAt,
        description = description,
        externalUrl = externalUrl,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        owner = owner,
        updatedAt = updatedAt,
        eventsState = json.decodeOptional(rawObject, "events", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        slugState = json.decodeOptional(rawObject, "slug", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("external_url", value.externalUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", value.id?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("owner", value.owner?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("events", value.eventsState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("slug", value.slugState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702(block: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702.Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppX71f47702 property '" + name + "' is not nullable")
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
