package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonXf398f1e0.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonXf398f1e0(
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
  public val state: InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3,
  /**
   * Timestamp when the task was archived, null if not archived
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archivedAt: String? = null,
  artifacts: List<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemX3044d72d>? = null,
  /**
   * The entity who created this task
   */
  public val creator: InlineAgentsTasksGetResponse200JsonAllOf1CreatorX730593c1? = null,
  /**
   * Type of the task creator
   */
  public val creatorType: InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79? = null,
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
  public val owner: InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43? = null,
  /**
   * The repository this task belongs to
   */
  public val repository: InlineAgentsTasksGetResponse200JsonAllOf1RepositoryXab6d0773? = null,
  /**
   * Number of sessions in this task
   */
  public val sessionCount: Int? = null,
  sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>? = null,
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
  userCollaborators: List<InlineAgentsTasksGetResponse200JsonAllOf1UserCollaboratorsItemX0718e965>? = null,
) {
  /**
   * Resources created by this task (PRs, branches, etc.)
   */
  public val artifacts: List<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemX3044d72d>? =
      artifacts?.let { collection0 -> collection0.toList() }

  /**
   * Sessions associated with this task
   */
  public val sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>? =
      sessions?.let { collection0 -> collection0.toList() }

  /**
   * User objects of collaborators on this task
   */
  public val userCollaborators:
      List<InlineAgentsTasksGetResponse200JsonAllOf1UserCollaboratorsItemX0718e965>? =
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

    private var stateValue: InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3? = null

    public var state: InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3
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
        List<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemX3044d72d>? = null

    /**
     * Resources created by this task (PRs, branches, etc.)
     */
    public var artifacts: List<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemX3044d72d>?
      get() = artifactsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        artifactsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The entity who created this task
     */
    public var creator: InlineAgentsTasksGetResponse200JsonAllOf1CreatorX730593c1? = null

    /**
     * Type of the task creator
     */
    public var creatorType: InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79? = null

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
    public var owner: InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43? = null

    /**
     * The repository this task belongs to
     */
    public var repository: InlineAgentsTasksGetResponse200JsonAllOf1RepositoryXab6d0773? = null

    /**
     * Number of sessions in this task
     */
    public var sessionCount: Int? = null

    private var sessionsValue: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>?
        = null

    /**
     * Sessions associated with this task
     */
    public var sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>?
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
        List<InlineAgentsTasksGetResponse200JsonAllOf1UserCollaboratorsItemX0718e965>? = null

    /**
     * User objects of collaborators on this task
     */
    public var userCollaborators:
        List<InlineAgentsTasksGetResponse200JsonAllOf1UserCollaboratorsItemX0718e965>?
      get() = userCollaboratorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        userCollaboratorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsTasksGetResponse200JsonXf398f1e0 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsTasksGetResponse200JsonXf398f1e0(
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
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonXf398f1e0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonXf398f1e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonXf398f1e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonXf398f1e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonXf398f1e0 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3>(rawObject, "state")
      return InlineAgentsTasksGetResponse200JsonXf398f1e0(
        createdAt = createdAt,
        id = id,
        state = state,
        archivedAt = rawObject["archived_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        artifacts = rawObject["artifacts"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemX3044d72d>>(it) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf1CreatorX730593c1>(it) },
        creatorType = rawObject["creator_type"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf1RepositoryXab6d0773>(it) },
        sessionCount = rawObject["session_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        sessions = rawObject["sessions"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userCollaborators = rawObject["user_collaborators"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonAllOf1UserCollaboratorsItemX0718e965>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonXf398f1e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonXf398f1e0")
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

public fun inlineAgentsTasksGetResponse200JsonXf398f1e0(block: InlineAgentsTasksGetResponse200JsonXf398f1e0.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonXf398f1e0 = InlineAgentsTasksGetResponse200JsonXf398f1e0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonXf398f1e0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
