package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups/post/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups/post/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf.Serializer::class)
public class InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf(
  /**
   * Name of the runner group.
   */
  public val name: String,
  /**
   * Whether the runner group can be used by `public` repositories.
   */
  public val allowsPublicRepositories: Boolean? = null,
  /**
   * The identifier of a hosted compute network configuration.
   */
  public val networkConfigurationId: String? = null,
  /**
   * If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows`
   * array.
   */
  public val restrictedToWorkflows: Boolean? = null,
  runners: List<Int>? = null,
  selectedRepositoryIds: List<Int>? = null,
  selectedWorkflows: List<String>? = null,
  /**
   * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to
   * private repositories.
   */
  public val visibility: InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1? = null,
) {
  /**
   * List of runner IDs to add to the runner group.
   */
  public val runners: List<Int>? = runners?.let { collection0 -> collection0.toList() }

  /**
   * List of repository IDs that can access the runner group.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  /**
   * List of workflows the runner group should be allowed to run. This setting will be ignored unless
   * `restricted_to_workflows` is set to `true`.
   */
  public val selectedWorkflows: List<String>? =
      selectedWorkflows?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Whether the runner group can be used by `public` repositories.
     */
    public var allowsPublicRepositories: Boolean? = null

    /**
     * The identifier of a hosted compute network configuration.
     */
    public var networkConfigurationId: String? = null

    /**
     * If `true`, the runner group will be restricted to running only the workflows specified in the
     * `selected_workflows` array.
     */
    public var restrictedToWorkflows: Boolean? = null

    private var runnersValue: List<Int>? = null

    /**
     * List of runner IDs to add to the runner group.
     */
    public var runners: List<Int>?
      get() = runnersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        runnersValue = value?.let { collection0 -> collection0.toList() }
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * List of repository IDs that can access the runner group.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

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
     * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to
     * private repositories.
     */
    public var visibility: InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1? = null

    public fun build(): InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf {
      check(nameValue != null) { "name is required" }
      return InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf(
        name = name,
        allowsPublicRepositories = allowsPublicRepositories,
        networkConfigurationId = networkConfigurationId,
        restrictedToWorkflows = restrictedToWorkflows,
        runners = runners,
        selectedRepositoryIds = selectedRepositoryIds,
        selectedWorkflows = selectedWorkflows,
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf(
        name = name,
        allowsPublicRepositories = rawObject["allows_public_repositories"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        networkConfigurationId = rawObject["network_configuration_id"]?.let { json.decodeFromJsonElement<String>(it) },
        restrictedToWorkflows = rawObject["restricted_to_workflows"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        runners = rawObject["runners"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        selectedWorkflows = rawObject["selected_workflows"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.allowsPublicRepositories?.let { put("allows_public_repositories", json.encodeToJsonElement(it)) }
        value.networkConfigurationId?.let { put("network_configuration_id", it) }
        value.restrictedToWorkflows?.let { put("restricted_to_workflows", json.encodeToJsonElement(it)) }
        value.runners?.let { put("runners", json.encodeToJsonElement(it)) }
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
        value.selectedWorkflows?.let { put("selected_workflows", json.encodeToJsonElement(it)) }
        value.visibility?.let { put("visibility", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf(block: InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf = InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsPostRequestJsonX99329cdf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
