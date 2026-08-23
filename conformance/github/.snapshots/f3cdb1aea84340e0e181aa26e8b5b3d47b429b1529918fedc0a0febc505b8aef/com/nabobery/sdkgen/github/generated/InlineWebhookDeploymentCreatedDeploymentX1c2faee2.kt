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
 * The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentX1c2faee2.Serializer::class)
public class InlineWebhookDeploymentCreatedDeploymentX1c2faee2 internal constructor(
  public val createdAt: String,
  public val creator: InlineWebhookDeploymentCreatedDeploymentCreatorX69458bd7?,
  public val description: String?,
  public val environment: String,
  public val id: Int,
  public val nodeId: String,
  public val originalEnvironment: String,
  public val payload: InlineWebhookDeploymentCreatedDeploymentPayloadXaaa64ca2,
  public val ref: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val statusesUrl: String,
  public val task: String,
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val performedViaGithubAppState:
      FieldState<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppXa4d8a8e4?>,
  private val productionEnvironmentState: FieldState<Boolean>,
  private val transientEnvironmentState: FieldState<Boolean>,
) {
  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val performedViaGithubApp:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppXa4d8a8e4?
    get() = performedViaGithubAppState.valueOrNull()

  public val productionEnvironment: Boolean?
    get() = productionEnvironmentState.valueOrNull()

  public val transientEnvironment: Boolean?
    get() = transientEnvironmentState.valueOrNull()

  public constructor(
    createdAt: String,
    creator: InlineWebhookDeploymentCreatedDeploymentCreatorX69458bd7?,
    description: String?,
    environment: String,
    id: Int,
    nodeId: String,
    originalEnvironment: String,
    payload: InlineWebhookDeploymentCreatedDeploymentPayloadXaaa64ca2,
    ref: String,
    repositoryUrl: String,
    sha: String,
    statusesUrl: String,
    task: String,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  creator = creator,
  description = description,
  environment = environment,
  id = id,
  nodeId = nodeId,
  originalEnvironment = originalEnvironment,
  payload = payload,
  ref = ref,
  repositoryUrl = repositoryUrl,
  sha = sha,
  statusesUrl = statusesUrl,
  task = task,
  updatedAt = updatedAt,
  url = url,
  performedViaGithubAppState = FieldState.Absent,
  productionEnvironmentState = FieldState.Absent,
  transientEnvironmentState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  /**
   * Returns the wire presence of `production_environment`.
   */
  public fun productionEnvironmentPresence(): FieldPresence = productionEnvironmentState.presence

  /**
   * Returns the wire presence of `transient_environment`.
   */
  public fun transientEnvironmentPresence(): FieldPresence = transientEnvironmentState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var environmentValue: String? = null

    public var environment: String
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
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

    private var originalEnvironmentValue: String? = null

    public var originalEnvironment: String
      get() = requireNotNull(originalEnvironmentValue) { "originalEnvironment is required" }
      set(`value`) {
        originalEnvironmentValue = value
      }

    private var payloadValue: InlineWebhookDeploymentCreatedDeploymentPayloadXaaa64ca2? = null

    public var payload: InlineWebhookDeploymentCreatedDeploymentPayloadXaaa64ca2
      get() = requireNotNull(payloadValue) { "payload is required" }
      set(`value`) {
        payloadValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var statusesUrlValue: String? = null

    public var statusesUrl: String
      get() = requireNotNull(statusesUrlValue) { "statusesUrl is required" }
      set(`value`) {
        statusesUrlValue = value
      }

    private var taskValue: String? = null

    public var task: String
      get() = requireNotNull(taskValue) { "task is required" }
      set(`value`) {
        taskValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var creatorState: FieldState<InlineWebhookDeploymentCreatedDeploymentCreatorX69458bd7?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhookDeploymentCreatedDeploymentCreatorX69458bd7?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
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

    private var performedViaGithubAppState:
        FieldState<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppXa4d8a8e4?> =
        FieldState.Absent

    /**
     * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
     * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps
     * are first class actors within GitHub.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppXa4d8a8e4?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var productionEnvironmentState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var productionEnvironment: Boolean?
      get() = productionEnvironmentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "productionEnvironment is not nullable; call unsetProductionEnvironment() to omit it" }
        productionEnvironmentState = FieldState.Value(present)
      }

    private var transientEnvironmentState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var transientEnvironment: Boolean?
      get() = transientEnvironmentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "transientEnvironment is not nullable; call unsetTransientEnvironment() to omit it" }
        transientEnvironmentState = FieldState.Value(present)
      }

    /**
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    /**
     * Omits `production_environment` from serialized output.
     */
    public fun unsetProductionEnvironment() {
      productionEnvironmentState = FieldState.Absent
    }

    /**
     * Omits `transient_environment` from serialized output.
     */
    public fun unsetTransientEnvironment() {
      transientEnvironmentState = FieldState.Absent
    }

    public fun build(): InlineWebhookDeploymentCreatedDeploymentX1c2faee2 {
      check(createdAtValue != null) { "createdAt is required" }
      check(environmentValue != null) { "environment is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(originalEnvironmentValue != null) { "originalEnvironment is required" }
      check(payloadValue != null) { "payload is required" }
      check(refValue != null) { "ref is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(shaValue != null) { "sha is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(taskValue != null) { "task is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return InlineWebhookDeploymentCreatedDeploymentX1c2faee2(
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        environment = environment,
        id = id,
        nodeId = nodeId,
        originalEnvironment = originalEnvironment,
        payload = payload,
        ref = ref,
        repositoryUrl = repositoryUrl,
        sha = sha,
        statusesUrl = statusesUrl,
        task = task,
        updatedAt = updatedAt,
        url = url,
        performedViaGithubAppState = performedViaGithubAppState,
        productionEnvironmentState = productionEnvironmentState,
        transientEnvironmentState = transientEnvironmentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedDeploymentX1c2faee2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentX1c2faee2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentX1c2faee2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedDeploymentX1c2faee2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedDeploymentX1c2faee2 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val originalEnvironment = json.decodeRequired<String>(rawObject, "original_environment")
      val payload = json.decodeRequired<InlineWebhookDeploymentCreatedDeploymentPayloadXaaa64ca2>(rawObject, "payload")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val task = json.decodeRequired<String>(rawObject, "task")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("InlineWebhookDeploymentCreatedDeploymentX1c2faee2 is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentCreatorX69458bd7?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookDeploymentCreatedDeploymentX1c2faee2 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookDeploymentCreatedDeploymentX1c2faee2(
        createdAt = createdAt,
        creator = creator,
        description = description,
        environment = environment,
        id = id,
        nodeId = nodeId,
        originalEnvironment = originalEnvironment,
        payload = payload,
        ref = ref,
        repositoryUrl = repositoryUrl,
        sha = sha,
        statusesUrl = statusesUrl,
        task = task,
        updatedAt = updatedAt,
        url = url,
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        productionEnvironmentState = json.decodeOptional(rawObject, "production_environment", nullable = false),
        transientEnvironmentState = json.decodeOptional(rawObject, "transient_environment", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentX1c2faee2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedDeploymentX1c2faee2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("environment", value.environment)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("original_environment", value.originalEnvironment)
        put("payload", json.encodeToJsonElement(value.payload))
        put("ref", value.ref)
        put("repository_url", value.repositoryUrl)
        put("sha", value.sha)
        put("statuses_url", value.statusesUrl)
        put("task", value.task)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("production_environment", value.productionEnvironmentState, json::encodeToJsonElement)
        putState("transient_environment", value.transientEnvironmentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentCreatedDeploymentX1c2faee2(block: InlineWebhookDeploymentCreatedDeploymentX1c2faee2.Builder.() -> Unit): InlineWebhookDeploymentCreatedDeploymentX1c2faee2 = InlineWebhookDeploymentCreatedDeploymentX1c2faee2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentCreatedDeploymentX1c2faee2 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookDeploymentCreatedDeploymentX1c2faee2 property '" + name + "' is not nullable")
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
