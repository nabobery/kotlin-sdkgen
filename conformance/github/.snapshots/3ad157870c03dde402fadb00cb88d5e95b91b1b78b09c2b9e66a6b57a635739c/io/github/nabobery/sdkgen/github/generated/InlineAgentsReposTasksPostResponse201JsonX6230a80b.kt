package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonX6230a80b.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonX6230a80b(
  /**
   * Timestamp when the task was created
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Unique task identifier
   */
  public val id: String,
  /**
   * Current state of the task, derived from its most recent session
   */
  public val state: InlineAgentsReposTasksPostResponse201JsonStateX5bff4246,
  /**
   * Timestamp when the task was archived, null if not archived
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archivedAt: String? = null,
  artifacts: List<InlineAgentsReposTasksPostResponse201JsonArtifactsItemXa414a636>? = null,
  /**
   * The entity who created this task
   */
  public val creator: InlineAgentsReposTasksPostResponse201JsonCreatorXb3244646? = null,
  /**
   * Type of the task creator
   */
  public val creatorType: InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e? = null,
  /**
   * Web URL for this task
   */
  public val htmlUrl: String? = null,
  /**
   * Human-readable name derived from the task prompt
   */
  public val name: String? = null,
  /**
   * The owner of the repository
   */
  public val owner: InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99? = null,
  /**
   * The repository this task belongs to
   */
  public val repository: InlineAgentsReposTasksPostResponse201JsonRepositoryXccdbf570? = null,
  /**
   * Number of sessions in this task
   */
  public val sessionCount: Int? = null,
  /**
   * Timestamp of the most recent update
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * API URL for this task
   */
  public val url: String? = null,
  userCollaborators: List<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3>? = null,
) {
  /**
   * Resources created by this task (PRs, branches, etc.)
   */
  public val artifacts: List<InlineAgentsReposTasksPostResponse201JsonArtifactsItemXa414a636>? =
      artifacts?.let { collection0 -> collection0.toList() }

  /**
   * User objects of collaborators on this task
   */
  public val userCollaborators:
      List<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3>? =
      userCollaborators?.let { collection0 -> collection0.toList() }

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

    private var stateValue: InlineAgentsReposTasksPostResponse201JsonStateX5bff4246? = null

    public var state: InlineAgentsReposTasksPostResponse201JsonStateX5bff4246
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Timestamp when the task was archived, null if not archived
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var archivedAt: String? = null

    private var artifactsValue:
        List<InlineAgentsReposTasksPostResponse201JsonArtifactsItemXa414a636>? = null

    /**
     * Resources created by this task (PRs, branches, etc.)
     */
    public var artifacts: List<InlineAgentsReposTasksPostResponse201JsonArtifactsItemXa414a636>?
      get() = artifactsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        artifactsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The entity who created this task
     */
    public var creator: InlineAgentsReposTasksPostResponse201JsonCreatorXb3244646? = null

    /**
     * Type of the task creator
     */
    public var creatorType: InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e? = null

    /**
     * Web URL for this task
     */
    public var htmlUrl: String? = null

    /**
     * Human-readable name derived from the task prompt
     */
    public var name: String? = null

    /**
     * The owner of the repository
     */
    public var owner: InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99? = null

    /**
     * The repository this task belongs to
     */
    public var repository: InlineAgentsReposTasksPostResponse201JsonRepositoryXccdbf570? = null

    /**
     * Number of sessions in this task
     */
    public var sessionCount: Int? = null

    /**
     * Timestamp of the most recent update
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * API URL for this task
     */
    public var url: String? = null

    private var userCollaboratorsValue:
        List<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3>? = null

    /**
     * User objects of collaborators on this task
     */
    public var userCollaborators:
        List<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3>?
      get() = userCollaboratorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        userCollaboratorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksPostResponse201JsonX6230a80b {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsReposTasksPostResponse201JsonX6230a80b(
        createdAt = createdAt,
        id = id,
        state = state,
        archivedAt = archivedAt,
        artifacts = artifacts,
        creator = creator,
        creatorType = creatorType,
        htmlUrl = htmlUrl,
        name = name,
        owner = owner,
        repository = repository,
        sessionCount = sessionCount,
        updatedAt = updatedAt,
        url = url,
        userCollaborators = userCollaborators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonX6230a80b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonX6230a80b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonX6230a80b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonX6230a80b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonX6230a80b must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsReposTasksPostResponse201JsonStateX5bff4246>(rawObject, "state")
      return InlineAgentsReposTasksPostResponse201JsonX6230a80b(
        createdAt = createdAt,
        id = id,
        state = state,
        archivedAt = rawObject["archived_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        artifacts = rawObject["artifacts"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksPostResponse201JsonArtifactsItemXa414a636>>(it) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksPostResponse201JsonCreatorXb3244646>(it) },
        creatorType = rawObject["creator_type"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksPostResponse201JsonRepositoryXccdbf570>(it) },
        sessionCount = rawObject["session_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userCollaborators = rawObject["user_collaborators"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonX6230a80b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonX6230a80b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", value.id)
        put("state", json.encodeToJsonElement(value.state))
        value.archivedAt?.let { put("archived_at", it) }
        value.artifacts?.let { put("artifacts", json.encodeToJsonElement(it)) }
        value.creator?.let { put("creator", json.encodeToJsonElement(it)) }
        value.creatorType?.let { put("creator_type", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.name?.let { put("name", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sessionCount?.let { put("session_count", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.userCollaborators?.let { put("user_collaborators", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonX6230a80b(block: InlineAgentsReposTasksPostResponse201JsonX6230a80b.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonX6230a80b = InlineAgentsReposTasksPostResponse201JsonX6230a80b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonX6230a80b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
