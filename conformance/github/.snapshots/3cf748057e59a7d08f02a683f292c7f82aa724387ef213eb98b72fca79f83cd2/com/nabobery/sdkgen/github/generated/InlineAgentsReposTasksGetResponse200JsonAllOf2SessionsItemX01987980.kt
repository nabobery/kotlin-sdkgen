package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Full session details within a task
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/1/properties/sessions/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980(
  /**
   * Creation timestamp
   */
  public val createdAt: String,
  /**
   * Session ID
   */
  public val id: String,
  /**
   * Current state of a session
   */
  public val state: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemStateXef8525a1,
  /**
   * Base branch name
   */
  public val baseRef: String? = null,
  /**
   * Completion timestamp
   */
  public val completedAt: String? = null,
  /**
   * Error details for a failed session
   */
  public val error:
      InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072? = null,
  /**
   * Head branch name
   */
  public val headRef: String? = null,
  /**
   * Model used for this session
   */
  public val model: String? = null,
  /**
   * Session name
   */
  public val name: String? = null,
  /**
   * The owner of the repository
   */
  public val owner:
      InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422? = null,
  /**
   * Content of the triggering event
   */
  public val prompt: String? = null,
  /**
   * The repository this session belongs to
   */
  public val repository:
      InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemRepositoryXc21328a8? = null,
  /**
   * Task ID this session belongs to
   */
  public val taskId: String? = null,
  /**
   * Last update timestamp
   */
  public val updatedAt: String? = null,
  /**
   * The user who created this session
   */
  public val user: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemUserXd0256daf? = null,
) {
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

    private var stateValue:
        InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemStateXef8525a1? = null

    public var state: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemStateXef8525a1
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Base branch name
     */
    public var baseRef: String? = null

    /**
     * Completion timestamp
     */
    public var completedAt: String? = null

    /**
     * Error details for a failed session
     */
    public var error: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072? =
        null

    /**
     * Head branch name
     */
    public var headRef: String? = null

    /**
     * Model used for this session
     */
    public var model: String? = null

    /**
     * Session name
     */
    public var name: String? = null

    /**
     * The owner of the repository
     */
    public var owner: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422? =
        null

    /**
     * Content of the triggering event
     */
    public var prompt: String? = null

    /**
     * The repository this session belongs to
     */
    public var repository:
        InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemRepositoryXc21328a8? = null

    /**
     * Task ID this session belongs to
     */
    public var taskId: String? = null

    /**
     * Last update timestamp
     */
    public var updatedAt: String? = null

    /**
     * The user who created this session
     */
    public var user: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemUserXd0256daf? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980(
        createdAt = createdAt,
        id = id,
        state = state,
        baseRef = baseRef,
        completedAt = completedAt,
        error = error,
        headRef = headRef,
        model = model,
        name = name,
        owner = owner,
        prompt = prompt,
        repository = repository,
        taskId = taskId,
        updatedAt = updatedAt,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemStateXef8525a1>(rawObject, "state")
      return InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980(
        createdAt = createdAt,
        id = id,
        state = state,
        baseRef = rawObject["base_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        completedAt = rawObject["completed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072>(it) },
        headRef = rawObject["head_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422>(it) },
        prompt = rawObject["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemRepositoryXc21328a8>(it) },
        taskId = rawObject["task_id"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemUserXd0256daf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", value.id)
        put("state", json.encodeToJsonElement(value.state))
        value.baseRef?.let { put("base_ref", it) }
        value.completedAt?.let { put("completed_at", it) }
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.headRef?.let { put("head_ref", it) }
        value.model?.let { put("model", it) }
        value.name?.let { put("name", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.prompt?.let { put("prompt", it) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.taskId?.let { put("task_id", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980(block: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
