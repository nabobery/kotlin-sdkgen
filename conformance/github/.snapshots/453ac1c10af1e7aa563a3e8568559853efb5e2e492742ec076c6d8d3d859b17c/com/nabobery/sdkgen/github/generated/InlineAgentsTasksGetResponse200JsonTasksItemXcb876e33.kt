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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33(
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
  public val state: InlineAgentsTasksGetResponse200JsonTasksItemStateX966daba7,
  /**
   * Timestamp when the task was archived, null if not archived
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archivedAt: String? = null,
  artifacts: List<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemXedfae0a8>? = null,
  /**
   * The entity who created this task
   */
  public val creator: InlineAgentsTasksGetResponse200JsonTasksItemCreatorXd6d3f5ce? = null,
  /**
   * Type of the task creator
   */
  public val creatorType: InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8? = null,
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
  public val owner: InlineAgentsTasksGetResponse200JsonTasksItemOwnerXb346dae5? = null,
  /**
   * The repository this task belongs to
   */
  public val repository: InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290? = null,
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
  userCollaborators: List<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f>? = null,
) {
  /**
   * Resources created by this task (PRs, branches, etc.)
   */
  public val artifacts: List<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemXedfae0a8>? =
      artifacts?.let { collection0 -> collection0.toList() }

  /**
   * User objects of collaborators on this task
   */
  public val userCollaborators:
      List<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f>? =
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

    private var stateValue: InlineAgentsTasksGetResponse200JsonTasksItemStateX966daba7? = null

    public var state: InlineAgentsTasksGetResponse200JsonTasksItemStateX966daba7
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
        List<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemXedfae0a8>? = null

    /**
     * Resources created by this task (PRs, branches, etc.)
     */
    public var artifacts: List<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemXedfae0a8>?
      get() = artifactsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        artifactsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The entity who created this task
     */
    public var creator: InlineAgentsTasksGetResponse200JsonTasksItemCreatorXd6d3f5ce? = null

    /**
     * Type of the task creator
     */
    public var creatorType: InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8? = null

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
    public var owner: InlineAgentsTasksGetResponse200JsonTasksItemOwnerXb346dae5? = null

    /**
     * The repository this task belongs to
     */
    public var repository: InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290? = null

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
        List<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f>? = null

    /**
     * User objects of collaborators on this task
     */
    public var userCollaborators:
        List<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f>?
      get() = userCollaboratorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        userCollaboratorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33(
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
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsTasksGetResponse200JsonTasksItemStateX966daba7>(rawObject, "state")
      return InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33(
        createdAt = createdAt,
        id = id,
        state = state,
        archivedAt = rawObject["archived_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        artifacts = rawObject["artifacts"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemXedfae0a8>>(it) },
        creator = rawObject["creator"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonTasksItemCreatorXd6d3f5ce>(it) },
        creatorType = rawObject["creator_type"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonTasksItemOwnerXb346dae5>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290>(it) },
        sessionCount = rawObject["session_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userCollaborators = rawObject["user_collaborators"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33")
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

public fun inlineAgentsTasksGetResponse200JsonTasksItemXcb876e33(block: InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 = InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemXcb876e33 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
