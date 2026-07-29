package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * The status of a deployment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-status
 */
@Serializable(with = DeploymentStatus.Serializer::class)
public class DeploymentStatus internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val creator: NullableSimpleUser?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deploymentUrl: String,
  /**
   * A short description of the status.
   */
  public val description: String,
  public val id: Long,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  /**
   * The state of the status.
   */
  public val state: InlineDeploymentStatusStateX0d1c1510,
  /**
   * Closing down notice: the URL to associate with this status.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val targetUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val environmentState: FieldState<String>,
  private val environmentUrlState: FieldState<String>,
  private val logUrlState: FieldState<String>,
  private val performedViaGithubAppState: FieldState<NullableIntegration?>,
) {
  /**
   * The environment of the deployment that the status is for.
   */
  public val environment: String?
    get() = environmentState.valueOrNull()

  /**
   * The URL for accessing your environment.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val environmentUrl: String?
    get() = environmentUrlState.valueOrNull()

  /**
   * The URL to associate with this status.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val logUrl: String?
    get() = logUrlState.valueOrNull()

  public val performedViaGithubApp: NullableIntegration?
    get() = performedViaGithubAppState.valueOrNull()

  public constructor(
    createdAt: String,
    creator: NullableSimpleUser?,
    deploymentUrl: String,
    description: String,
    id: Long,
    nodeId: String,
    repositoryUrl: String,
    state: InlineDeploymentStatusStateX0d1c1510,
    targetUrl: String,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  creator = creator,
  deploymentUrl = deploymentUrl,
  description = description,
  id = id,
  nodeId = nodeId,
  repositoryUrl = repositoryUrl,
  state = state,
  targetUrl = targetUrl,
  updatedAt = updatedAt,
  url = url,
  environmentState = FieldState.Absent,
  environmentUrlState = FieldState.Absent,
  logUrlState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `environment`.
   */
  public fun environmentPresence(): FieldPresence = environmentState.presence

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

    private var idValue: Long? = null

    public var id: Long
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

    private var stateValue: InlineDeploymentStatusStateX0d1c1510? = null

    public var state: InlineDeploymentStatusStateX0d1c1510
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

    private var creatorState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: NullableSimpleUser?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
      }

    private var environmentState: FieldState<String> = FieldState.Absent

    /**
     * The environment of the deployment that the status is for.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var environment: String?
      get() = environmentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "environment is not nullable; call unsetEnvironment() to omit it" }
        environmentState = FieldState.Value(present)
      }

    private var environmentUrlState: FieldState<String> = FieldState.Absent

    /**
     * The URL for accessing your environment.
     *
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
     * The URL to associate with this status.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var logUrl: String?
      get() = logUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "logUrl is not nullable; call unsetLogUrl() to omit it" }
        logUrlState = FieldState.Value(present)
      }

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp: NullableIntegration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    /**
     * Omits `environment` from serialized output.
     */
    public fun unsetEnvironment() {
      environmentState = FieldState.Absent
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

    public fun build(): DeploymentStatus {
      check(createdAtValue != null) { "createdAt is required" }
      check(deploymentUrlValue != null) { "deploymentUrl is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(stateValue != null) { "state is required" }
      check(targetUrlValue != null) { "targetUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      return DeploymentStatus(
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        deploymentUrl = deploymentUrl,
        description = description,
        id = id,
        nodeId = nodeId,
        repositoryUrl = repositoryUrl,
        state = state,
        targetUrl = targetUrl,
        updatedAt = updatedAt,
        url = url,
        environmentState = environmentState,
        environmentUrlState = environmentUrlState,
        logUrlState = logUrlState,
        performedViaGithubAppState = performedViaGithubAppState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentStatus = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeploymentStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentStatus {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentStatus must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val deploymentUrl = json.decodeRequired<String>(rawObject, "deployment_url")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val state = json.decodeRequired<InlineDeploymentStatusStateX0d1c1510>(rawObject, "state")
      val targetUrl = json.decodeRequired<String>(rawObject, "target_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("DeploymentStatus is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return DeploymentStatus(
        createdAt = createdAt,
        creator = creator,
        deploymentUrl = deploymentUrl,
        description = description,
        id = id,
        nodeId = nodeId,
        repositoryUrl = repositoryUrl,
        state = state,
        targetUrl = targetUrl,
        updatedAt = updatedAt,
        url = url,
        environmentState = json.decodeOptional(rawObject, "environment", nullable = false),
        environmentUrlState = json.decodeOptional(rawObject, "environment_url", nullable = false),
        logUrlState = json.decodeOptional(rawObject, "log_url", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("deployment_url", value.deploymentUrl)
        put("description", value.description)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("repository_url", value.repositoryUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("target_url", value.targetUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("environment", value.environmentState, json::encodeToJsonElement)
        putState("environment_url", value.environmentUrlState, json::encodeToJsonElement)
        putState("log_url", value.logUrlState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentStatus(block: DeploymentStatus.Builder.() -> Unit): DeploymentStatus = DeploymentStatus.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeploymentStatus is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("DeploymentStatus property '" + name + "' is not nullable")
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
