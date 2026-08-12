package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/runner-groups-org.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/runner-groups-org
 */
@Serializable(with = RunnerGroupsOrg.Serializer::class)
public class RunnerGroupsOrg(
  public val allowsPublicRepositories: Boolean,
  public val default: Boolean,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val id: Double,
  public val inherited: Boolean,
  public val name: String,
  public val runnersUrl: String,
  public val visibility: String,
  public val hostedRunnersUrl: String? = null,
  public val inheritedAllowsPublicRepositories: Boolean? = null,
  /**
   * The identifier of a hosted compute network configuration.
   */
  public val networkConfigurationId: String? = null,
  /**
   * If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows`
   * array.
   */
  public val restrictedToWorkflows: Boolean? = null,
  /**
   * Link to the selected repositories resource for this runner group. Not present unless visibility was set to
   * `selected`
   */
  public val selectedRepositoriesUrl: String? = null,
  selectedWorkflows: List<String>? = null,
  /**
   * If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
   */
  public val workflowRestrictionsReadOnly: Boolean? = null,
) {
  /**
   * List of workflows the runner group should be allowed to run. This setting will be ignored unless
   * `restricted_to_workflows` is set to `true`.
   */
  public val selectedWorkflows: List<String>? =
      selectedWorkflows?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowsPublicRepositoriesValue: Boolean? = null

    public var allowsPublicRepositories: Boolean
      get() = requireNotNull(allowsPublicRepositoriesValue) { "allowsPublicRepositories is required" }
      set(`value`) {
        allowsPublicRepositoriesValue = value
      }

    private var defaultValue: Boolean? = null

    public var default: Boolean
      get() = requireNotNull(defaultValue) { "default is required" }
      set(`value`) {
        defaultValue = value
      }

    private var idValue: Double? = null

    public var id: Double
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var inheritedValue: Boolean? = null

    public var inherited: Boolean
      get() = requireNotNull(inheritedValue) { "inherited is required" }
      set(`value`) {
        inheritedValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var runnersUrlValue: String? = null

    public var runnersUrl: String
      get() = requireNotNull(runnersUrlValue) { "runnersUrl is required" }
      set(`value`) {
        runnersUrlValue = value
      }

    private var visibilityValue: String? = null

    public var visibility: String
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    public var hostedRunnersUrl: String? = null

    public var inheritedAllowsPublicRepositories: Boolean? = null

    /**
     * The identifier of a hosted compute network configuration.
     */
    public var networkConfigurationId: String? = null

    /**
     * If `true`, the runner group will be restricted to running only the workflows specified in the
     * `selected_workflows` array.
     */
    public var restrictedToWorkflows: Boolean? = null

    /**
     * Link to the selected repositories resource for this runner group. Not present unless visibility was set to
     * `selected`
     */
    public var selectedRepositoriesUrl: String? = null

    private var selectedWorkflowsValue: List<String>? = null

    /**
     * List of workflows the runner group should be allowed to run. This setting will be ignored unless
     * `restricted_to_workflows` is set to `true`.
     */
    public var selectedWorkflows: List<String>?
      get() = selectedWorkflowsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedWorkflowsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
     */
    public var workflowRestrictionsReadOnly: Boolean? = null

    public fun build(): RunnerGroupsOrg {
      check(allowsPublicRepositoriesValue != null) { "allowsPublicRepositories is required" }
      check(defaultValue != null) { "default is required" }
      check(idValue != null) { "id is required" }
      check(inheritedValue != null) { "inherited is required" }
      check(nameValue != null) { "name is required" }
      check(runnersUrlValue != null) { "runnersUrl is required" }
      check(visibilityValue != null) { "visibility is required" }
      return RunnerGroupsOrg(
        allowsPublicRepositories = allowsPublicRepositories,
        default = default,
        id = id,
        inherited = inherited,
        name = name,
        runnersUrl = runnersUrl,
        visibility = visibility,
        hostedRunnersUrl = hostedRunnersUrl,
        inheritedAllowsPublicRepositories = inheritedAllowsPublicRepositories,
        networkConfigurationId = networkConfigurationId,
        restrictedToWorkflows = restrictedToWorkflows,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
        selectedWorkflows = selectedWorkflows,
        workflowRestrictionsReadOnly = workflowRestrictionsReadOnly,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RunnerGroupsOrg = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RunnerGroupsOrg> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RunnerGroupsOrg {
      val jsonDecoder = decoder.requireJsonDecoder("RunnerGroupsOrg")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RunnerGroupsOrg must be a JSON object")
      val allowsPublicRepositories = json.decodeRequired<Boolean>(rawObject, "allows_public_repositories")
      val default = json.decodeRequired<Boolean>(rawObject, "default")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val inherited = json.decodeRequired<Boolean>(rawObject, "inherited")
      val name = json.decodeRequired<String>(rawObject, "name")
      val runnersUrl = json.decodeRequired<String>(rawObject, "runners_url")
      val visibility = json.decodeRequired<String>(rawObject, "visibility")
      return RunnerGroupsOrg(
        allowsPublicRepositories = allowsPublicRepositories,
        default = default,
        id = id,
        inherited = inherited,
        name = name,
        runnersUrl = runnersUrl,
        visibility = visibility,
        hostedRunnersUrl = rawObject["hosted_runners_url"]?.let { json.decodeFromJsonElement<String>(it) },
        inheritedAllowsPublicRepositories = rawObject["inherited_allows_public_repositories"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        networkConfigurationId = rawObject["network_configuration_id"]?.let { json.decodeFromJsonElement<String>(it) },
        restrictedToWorkflows = rawObject["restricted_to_workflows"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedWorkflows = rawObject["selected_workflows"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        workflowRestrictionsReadOnly = rawObject["workflow_restrictions_read_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RunnerGroupsOrg) {
      val jsonEncoder = encoder.requireJsonEncoder("RunnerGroupsOrg")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allows_public_repositories", json.encodeToJsonElement(value.allowsPublicRepositories))
        put("default", json.encodeToJsonElement(value.default))
        put("id", json.encodeToJsonElement(value.id))
        put("inherited", json.encodeToJsonElement(value.inherited))
        put("name", value.name)
        put("runners_url", value.runnersUrl)
        put("visibility", value.visibility)
        value.hostedRunnersUrl?.let { put("hosted_runners_url", it) }
        value.inheritedAllowsPublicRepositories?.let { put("inherited_allows_public_repositories", json.encodeToJsonElement(it)) }
        value.networkConfigurationId?.let { put("network_configuration_id", it) }
        value.restrictedToWorkflows?.let { put("restricted_to_workflows", json.encodeToJsonElement(it)) }
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
        value.selectedWorkflows?.let { put("selected_workflows", json.encodeToJsonElement(it)) }
        value.workflowRestrictionsReadOnly?.let { put("workflow_restrictions_read_only", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun runnerGroupsOrg(block: RunnerGroupsOrg.Builder.() -> Unit): RunnerGroupsOrg = RunnerGroupsOrg.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RunnerGroupsOrg is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
