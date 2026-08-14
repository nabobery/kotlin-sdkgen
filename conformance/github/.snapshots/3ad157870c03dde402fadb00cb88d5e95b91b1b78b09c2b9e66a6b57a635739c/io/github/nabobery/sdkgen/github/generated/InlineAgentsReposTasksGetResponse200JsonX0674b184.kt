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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonX0674b184.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonX0674b184(
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
  public val state: InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145,
  /**
   * Timestamp when the task was archived, null if not archived
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archivedAt: String? = null,
  artifacts: List<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemX37fb0ebc>? = null,
  /**
   * The entity who created this task
   */
  public val creator: InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorX3fd2f44c? = null,
  /**
   * Type of the task creator
   */
  public val creatorType:
      InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24? = null,
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
  public val owner: InlineAgentsReposTasksGetResponse200JsonAllOf1OwnerX094ddf20? = null,
  /**
   * The repository this task belongs to
   */
  public val repository: InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163? = null,
  /**
   * Number of sessions in this task
   */
  public val sessionCount: Int? = null,
  sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? = null,
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
  userCollaborators: List<InlineAgentsReposTasksGetResponse200JsonAllOf1UserCollaboratorsItemX8f53e495>? = null,
) {
  /**
   * Resources created by this task (PRs, branches, etc.)
   */
  public val artifacts: List<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemX37fb0ebc>?
      = artifacts?.let { collection0 -> collection0.toList() }

  /**
   * Sessions associated with this task
   */
  public val sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? =
      sessions?.let { collection0 -> collection0.toList() }

  /**
   * User objects of collaborators on this task
   */
  public val userCollaborators:
      List<InlineAgentsReposTasksGetResponse200JsonAllOf1UserCollaboratorsItemX8f53e495>? =
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

    private var stateValue: InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145? = null

    public var state: InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145
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
        List<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemX37fb0ebc>? = null

    /**
     * Resources created by this task (PRs, branches, etc.)
     */
    public var artifacts:
        List<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemX37fb0ebc>?
      get() = artifactsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        artifactsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The entity who created this task
     */
    public var creator: InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorX3fd2f44c? = null

    /**
     * Type of the task creator
     */
    public var creatorType: InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24? =
        null

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
    public var owner: InlineAgentsReposTasksGetResponse200JsonAllOf1OwnerX094ddf20? = null

    /**
     * The repository this task belongs to
     */
    public var repository: InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163? = null

    /**
     * Number of sessions in this task
     */
    public var sessionCount: Int? = null

    private var sessionsValue:
        List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? = null

    /**
     * Sessions associated with this task
     */
    public var sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>?
      get() = sessionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sessionsValue = value?.let { collection0 -> collection0.toList() }
      }

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
        List<InlineAgentsReposTasksGetResponse200JsonAllOf1UserCollaboratorsItemX8f53e495>? = null

    /**
     * User objects of collaborators on this task
     */
    public var userCollaborators:
        List<InlineAgentsReposTasksGetResponse200JsonAllOf1UserCollaboratorsItemX8f53e495>?
      get() = userCollaboratorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        userCollaboratorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksGetResponse200JsonX0674b184 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsReposTasksGetResponse200JsonX0674b184(
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
        sessions = sessions,
        updatedAt = updatedAt,
        url = url,
        userCollaborators = userCollaborators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonX0674b184 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonX0674b184> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonX0674b184 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonX0674b184")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonX0674b184 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145>(rawObject, "state")
      return InlineAgentsReposTasksGetResponse200JsonX0674b184(
        createdAt = createdAt,
        id = id,
        state = state,
        archivedAt = rawObject["archived_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        artifacts = rawObject["artifacts"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemX37fb0ebc>>(it) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorX3fd2f44c>(it) },
        creatorType = rawObject["creator_type"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf1OwnerX094ddf20>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163>(it) },
        sessionCount = rawObject["session_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        sessions = rawObject["sessions"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userCollaborators = rawObject["user_collaborators"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksGetResponse200JsonAllOf1UserCollaboratorsItemX8f53e495>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonX0674b184) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonX0674b184")
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
        value.sessions?.let { put("sessions", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.userCollaborators?.let { put("user_collaborators", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonX0674b184(block: InlineAgentsReposTasksGetResponse200JsonX0674b184.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonX0674b184 = InlineAgentsReposTasksGetResponse200JsonX0674b184.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonX0674b184 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
