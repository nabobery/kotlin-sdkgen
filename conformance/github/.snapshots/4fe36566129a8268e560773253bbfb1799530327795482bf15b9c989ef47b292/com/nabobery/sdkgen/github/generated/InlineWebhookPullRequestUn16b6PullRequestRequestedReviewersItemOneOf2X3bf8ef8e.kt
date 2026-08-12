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
 * Groups of organization members that gives permissions on specified repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/r
 * equested_reviewers/items/oneOf/1
 */
@Serializable(with = InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e.Serializer::class)
public class InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e internal constructor(
  /**
   * Description of the team
   */
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the team
   */
  public val id: Int,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val membersUrl: String,
  /**
   * Name of the team
   */
  public val name: String,
  public val nodeId: String,
  /**
   * Permission that the team will have for its repositories
   */
  public val permission: String,
  public val privacy:
      InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemPrivacyX103b37cd,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String,
  public val slug: String,
  /**
   * URL for the team
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val deletedState: FieldState<Boolean>,
  private val parentState:
      FieldState<InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemParentX0a9e3a36?>,
) {
  public val deleted: Boolean?
    get() = deletedState.valueOrNull()

  public val parent: InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemParentX0a9e3a36?
    get() = parentState.valueOrNull()

  public constructor(
    description: String?,
    htmlUrl: String,
    id: Int,
    membersUrl: String,
    name: String,
    nodeId: String,
    permission: String,
    privacy: InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemPrivacyX103b37cd,
    repositoriesUrl: String,
    slug: String,
    url: String,
  ) : this(description = description,
  htmlUrl = htmlUrl,
  id = id,
  membersUrl = membersUrl,
  name = name,
  nodeId = nodeId,
  permission = permission,
  privacy = privacy,
  repositoriesUrl = repositoriesUrl,
  slug = slug,
  url = url,
  deletedState = FieldState.Absent,
  parentState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `deleted`.
   */
  public fun deletedPresence(): FieldPresence = deletedState.presence

  /**
   * Returns the wire presence of `parent`.
   */
  public fun parentPresence(): FieldPresence = parentState.presence

  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var membersUrlValue: String? = null

    public var membersUrl: String
      get() = requireNotNull(membersUrlValue) { "membersUrl is required" }
      set(`value`) {
        membersUrlValue = value
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

    private var permissionValue: String? = null

    public var permission: String
      get() = requireNotNull(permissionValue) { "permission is required" }
      set(`value`) {
        permissionValue = value
      }

    private var privacyValue:
        InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemPrivacyX103b37cd? = null

    public var privacy:
        InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemPrivacyX103b37cd
      get() = requireNotNull(privacyValue) { "privacy is required" }
      set(`value`) {
        privacyValue = value
      }

    private var repositoriesUrlValue: String? = null

    public var repositoriesUrl: String
      get() = requireNotNull(repositoriesUrlValue) { "repositoriesUrl is required" }
      set(`value`) {
        repositoriesUrlValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Description of the team
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var deletedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deleted: Boolean?
      get() = deletedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deleted is not nullable; call unsetDeleted() to omit it" }
        deletedState = FieldState.Value(present)
      }

    private var parentState:
        FieldState<InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemParentX0a9e3a36?>
        = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var parent:
        InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemParentX0a9e3a36?
      get() = parentState.valueOrNull()
      set(`value`) {
        parentState = value.toNullableFieldState()
      }

    /**
     * Omits `deleted` from serialized output.
     */
    public fun unsetDeleted() {
      deletedState = FieldState.Absent
    }

    /**
     * Omits `parent` from serialized output.
     */
    public fun unsetParent() {
      parentState = FieldState.Absent
    }

    public fun build(): InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(permissionValue != null) { "permission is required" }
      check(privacyValue != null) { "privacy is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(slugValue != null) { "slug is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e(
        description = descriptionState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        url = url,
        deletedState = deletedState,
        parentState = parentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val permission = json.decodeRequired<String>(rawObject, "permission")
      val privacy = json.decodeRequired<InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemPrivacyX103b37cd>(rawObject, "privacy")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        url = url,
        deletedState = json.decodeOptional(rawObject, "deleted", nullable = false),
        parentState = json.decodeOptional(rawObject, "parent", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("members_url", value.membersUrl)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("permission", value.permission)
        put("privacy", json.encodeToJsonElement(value.privacy))
        put("repositories_url", value.repositoriesUrl)
        put("slug", value.slug)
        put("url", value.url)
        putState("deleted", value.deletedState, json::encodeToJsonElement)
        putState("parent", value.parentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e(block: InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e.Builder.() -> Unit): InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e = InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestUn16b6PullRequestRequestedReviewersItemOneOf2X3bf8ef8e property '" + name + "' is not nullable")
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
