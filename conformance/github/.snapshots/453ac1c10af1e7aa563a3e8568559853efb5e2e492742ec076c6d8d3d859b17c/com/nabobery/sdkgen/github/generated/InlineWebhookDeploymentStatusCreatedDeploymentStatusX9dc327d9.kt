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
 * The [deployment status](https://docs.github.com/rest/deployments/statuses#list-deployment-statuses).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 internal constructor(
  public val createdAt: String,
  public val creator: InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorX8248454b?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deploymentUrl: String,
  /**
   * The optional human-readable description added to the status.
   */
  public val description: String,
  public val environment: String,
  public val id: Int,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  /**
   * The new state. Can be `pending`, `success`, `failure`, or `error`.
   */
  public val state: String,
  /**
   * The optional link added to the status.
   */
  public val targetUrl: String,
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val environmentUrlState: FieldState<String>,
  private val logUrlState: FieldState<String>,
  private val performedViaGithubAppState:
      FieldState<InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppXe01cd015?>,
) {
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val environmentUrl: String?
    get() = environmentUrlState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val logUrl: String?
    get() = logUrlState.valueOrNull()

  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val performedViaGithubApp:
      InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppXe01cd015?
    get() = performedViaGithubAppState.valueOrNull()

  public constructor(
    createdAt: String,
    creator: InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorX8248454b?,
    deploymentUrl: String,
    description: String,
    environment: String,
    id: Int,
    nodeId: String,
    repositoryUrl: String,
    state: String,
    targetUrl: String,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  creator = creator,
  deploymentUrl = deploymentUrl,
  description = description,
  environment = environment,
  id = id,
  nodeId = nodeId,
  repositoryUrl = repositoryUrl,
  state = state,
  targetUrl = targetUrl,
  updatedAt = updatedAt,
  url = url,
  environmentUrlState = FieldState.Absent,
  logUrlState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `environment_url`.
   */
  public fun environmentUrlPresence(): FieldPresence = environmentUrlState.presence

  /**
   * Returns the wire presence of `log_url`.
   */
  public fun logUrlPresence(): FieldPresence = logUrlState.presence

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var deploymentUrlValue: String? = null

    public var deploymentUrl: String
      get() = requireNotNull(deploymentUrlValue) { "deploymentUrl is required" }
      set(`value`) {
        deploymentUrlValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
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

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var targetUrlValue: String? = null

    public var targetUrl: String
      get() = requireNotNull(targetUrlValue) { "targetUrl is required" }
      set(`value`) {
        targetUrlValue = value
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

    private var creatorState:
        FieldState<InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorX8248454b?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorX8248454b?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
      }

    private var environmentUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var environmentUrl: String?
      get() = environmentUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "environmentUrl is not nullable; call unsetEnvironmentUrl() to omit it" }
        environmentUrlState = FieldState.Value(present)
      }

    private var logUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var logUrl: String?
      get() = logUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "logUrl is not nullable; call unsetLogUrl() to omit it" }
        logUrlState = FieldState.Value(present)
      }

    private var performedViaGithubAppState:
        FieldState<InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppXe01cd015?> =
        FieldState.Absent

    /**
     * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
     * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps
     * are first class actors within GitHub.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp:
        InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppXe01cd015?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    /**
     * Omits `environment_url` from serialized output.
     */
    public fun unsetEnvironmentUrl() {
      environmentUrlState = FieldState.Absent
    }

    /**
     * Omits `log_url` from serialized output.
     */
    public fun unsetLogUrl() {
      logUrlState = FieldState.Absent
    }

    /**
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    public fun build(): InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 {
      check(createdAtValue != null) { "createdAt is required" }
      check(deploymentUrlValue != null) { "deploymentUrl is required" }
      check(descriptionValue != null) { "description is required" }
      check(environmentValue != null) { "environment is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(stateValue != null) { "state is required" }
      check(targetUrlValue != null) { "targetUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      return InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9(
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        deploymentUrl = deploymentUrl,
        description = description,
        environment = environment,
        id = id,
        nodeId = nodeId,
        repositoryUrl = repositoryUrl,
        state = state,
        targetUrl = targetUrl,
        updatedAt = updatedAt,
        url = url,
        environmentUrlState = environmentUrlState,
        logUrlState = logUrlState,
        performedViaGithubAppState = performedViaGithubAppState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val deploymentUrl = json.decodeRequired<String>(rawObject, "deployment_url")
      val description = json.decodeRequired<String>(rawObject, "description")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val state = json.decodeRequired<String>(rawObject, "state")
      val targetUrl = json.decodeRequired<String>(rawObject, "target_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorX8248454b?>(requireNotNull(element)) }
      return InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9(
        createdAt = createdAt,
        creator = creator,
        deploymentUrl = deploymentUrl,
        description = description,
        environment = environment,
        id = id,
        nodeId = nodeId,
        repositoryUrl = repositoryUrl,
        state = state,
        targetUrl = targetUrl,
        updatedAt = updatedAt,
        url = url,
        environmentUrlState = json.decodeOptional(rawObject, "environment_url", nullable = false),
        logUrlState = json.decodeOptional(rawObject, "log_url", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("deployment_url", value.deploymentUrl)
        put("description", value.description)
        put("environment", value.environment)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("repository_url", value.repositoryUrl)
        put("state", value.state)
        put("target_url", value.targetUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("environment_url", value.environmentUrlState, json::encodeToJsonElement)
        putState("log_url", value.logUrlState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9(block: InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 = InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9 property '" + name + "' is not nullable")
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
