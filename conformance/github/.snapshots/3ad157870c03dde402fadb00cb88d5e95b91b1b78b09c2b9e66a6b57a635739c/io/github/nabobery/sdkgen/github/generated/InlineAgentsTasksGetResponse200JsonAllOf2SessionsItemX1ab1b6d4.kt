package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/1/properties/sessions/items
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4(
  /**
   * Creation timestamp
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Session ID
   */
  public val id: String,
  /**
   * Current state of a session
   */
  public val state: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemStateXa86ee3b6,
  /**
   * Base branch name
   */
  public val baseRef: String? = null,
  /**
   * Completion timestamp
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String? = null,
  /**
   * Error details for a failed session
   */
  public val error: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313? = null,
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
  public val owner: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9? = null,
  /**
   * Content of the triggering event
   */
  public val prompt: String? = null,
  /**
   * The repository this session belongs to
   */
  public val repository:
      InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemRepositoryX17252eeb? = null,
  /**
   * Task ID this session belongs to
   */
  public val taskId: String? = null,
  /**
   * Last update timestamp
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * The user who created this session
   */
  public val user: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemUserXbcef073b? = null,
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

    private var stateValue: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemStateXa86ee3b6? =
        null

    public var state: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemStateXa86ee3b6
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
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var completedAt: String? = null

    /**
     * Error details for a failed session
     */
    public var error: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313? = null

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
    public var owner: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9? = null

    /**
     * Content of the triggering event
     */
    public var prompt: String? = null

    /**
     * The repository this session belongs to
     */
    public var repository: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemRepositoryX17252eeb?
        = null

    /**
     * Task ID this session belongs to
     */
    public var taskId: String? = null

    /**
     * Last update timestamp
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * The user who created this session
     */
    public var user: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemUserXbcef073b? = null

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(stateValue != null) { "state is required" }
      return InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4(
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
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val state = json.decodeRequired<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemStateXa86ee3b6>(rawObject, "state")
      return InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4(
        createdAt = createdAt,
        id = id,
        state = state,
        baseRef = rawObject["base_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        completedAt = rawObject["completed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313>(it) },
        headRef = rawObject["head_ref"]?.let { json.decodeFromJsonElement<String>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9>(it) },
        prompt = rawObject["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemRepositoryX17252eeb>(it) },
        taskId = rawObject["task_id"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemUserXbcef073b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4")
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

public fun inlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4(block: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
