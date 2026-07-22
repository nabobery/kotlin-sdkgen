package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}/patch/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}/patch/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293.Serializer::class)
public class InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 internal constructor(
  /**
   * Name of the runner group.
   */
  public val name: String,
  private val allowsPublicRepositoriesState: FieldState<Boolean>,
  private val networkConfigurationIdState: FieldState<String?>,
  private val restrictedToWorkflowsState: FieldState<Boolean>,
  private val selectedWorkflowsState: FieldState<List<String>>,
  private val visibilityState:
      FieldState<InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359>,
) {
  /**
   * Whether the runner group can be used by `public` repositories.
   */
  public val allowsPublicRepositories: Boolean?
    get() = allowsPublicRepositoriesState.valueOrNull()

  /**
   * The identifier of a hosted compute network configuration.
   */
  public val networkConfigurationId: String?
    get() = networkConfigurationIdState.valueOrNull()

  /**
   * If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows`
   * array.
   */
  public val restrictedToWorkflows: Boolean?
    get() = restrictedToWorkflowsState.valueOrNull()

  /**
   * List of workflows the runner group should be allowed to run. This setting will be ignored unless
   * `restricted_to_workflows` is set to `true`.
   */
  public val selectedWorkflows: List<String>?
    get() = selectedWorkflowsState.valueOrNull()

  /**
   * Visibility of a runner group. You can select all repositories, select individual repositories, or all private
   * repositories.
   */
  public val visibility: InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359?
    get() = visibilityState.valueOrNull()

  public constructor(name: String) : this(name = name,
  allowsPublicRepositoriesState = FieldState.Absent,
  networkConfigurationIdState = FieldState.Absent,
  restrictedToWorkflowsState = FieldState.Absent,
  selectedWorkflowsState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allows_public_repositories`.
   */
  public fun allowsPublicRepositoriesPresence(): FieldPresence = allowsPublicRepositoriesState.presence

  /**
   * Returns the wire presence of `network_configuration_id`.
   */
  public fun networkConfigurationIdPresence(): FieldPresence = networkConfigurationIdState.presence

  /**
   * Returns the wire presence of `restricted_to_workflows`.
   */
  public fun restrictedToWorkflowsPresence(): FieldPresence = restrictedToWorkflowsState.presence

  /**
   * Returns the wire presence of `selected_workflows`.
   */
  public fun selectedWorkflowsPresence(): FieldPresence = selectedWorkflowsState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var allowsPublicRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the runner group can be used by `public` repositories.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowsPublicRepositories: Boolean?
      get() = allowsPublicRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowsPublicRepositories is not nullable; call unsetAllowsPublicRepositories() to omit it" }
        allowsPublicRepositoriesState = FieldState.Value(present)
      }

    private var networkConfigurationIdState: FieldState<String?> = FieldState.Absent

    /**
     * The identifier of a hosted compute network configuration.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var networkConfigurationId: String?
      get() = networkConfigurationIdState.valueOrNull()
      set(`value`) {
        networkConfigurationIdState = value.toNullableFieldState()
      }

    private var restrictedToWorkflowsState: FieldState<Boolean> = FieldState.Absent

    /**
     * If `true`, the runner group will be restricted to running only the workflows specified in the
     * `selected_workflows` array.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var restrictedToWorkflows: Boolean?
      get() = restrictedToWorkflowsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "restrictedToWorkflows is not nullable; call unsetRestrictedToWorkflows() to omit it" }
        restrictedToWorkflowsState = FieldState.Value(present)
      }

    private var selectedWorkflowsState: FieldState<List<String>> = FieldState.Absent

    /**
     * List of workflows the runner group should be allowed to run. This setting will be ignored unless
     * `restricted_to_workflows` is set to `true`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var selectedWorkflows: List<String>?
      get() = selectedWorkflowsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "selectedWorkflows is not nullable; call unsetSelectedWorkflows() to omit it" }
        selectedWorkflowsState = FieldState.Value(present)
      }

    private var visibilityState:
        FieldState<InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359> =
        FieldState.Absent

    /**
     * Visibility of a runner group. You can select all repositories, select individual repositories, or all private
     * repositories.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    /**
     * Omits `allows_public_repositories` from serialized output.
     */
    public fun unsetAllowsPublicRepositories() {
      allowsPublicRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `network_configuration_id` from serialized output.
     */
    public fun unsetNetworkConfigurationId() {
      networkConfigurationIdState = FieldState.Absent
    }

    /**
     * Omits `restricted_to_workflows` from serialized output.
     */
    public fun unsetRestrictedToWorkflows() {
      restrictedToWorkflowsState = FieldState.Absent
    }

    /**
     * Omits `selected_workflows` from serialized output.
     */
    public fun unsetSelectedWorkflows() {
      selectedWorkflowsState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    public fun build(): InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 {
      check(nameValue != null) { "name is required" }
      return InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293(
        name = name,
        allowsPublicRepositoriesState = allowsPublicRepositoriesState,
        networkConfigurationIdState = networkConfigurationIdState,
        restrictedToWorkflowsState = restrictedToWorkflowsState,
        selectedWorkflowsState = selectedWorkflowsState,
        visibilityState = visibilityState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293(
        name = name,
        allowsPublicRepositoriesState = json.decodeOptional(rawObject, "allows_public_repositories", nullable = false),
        networkConfigurationIdState = json.decodeOptional(rawObject, "network_configuration_id", nullable = true),
        restrictedToWorkflowsState = json.decodeOptional(rawObject, "restricted_to_workflows", nullable = false),
        selectedWorkflowsState = json.decodeOptional(rawObject, "selected_workflows", nullable = false),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        putState("allows_public_repositories", value.allowsPublicRepositoriesState, json::encodeToJsonElement)
        putState("network_configuration_id", value.networkConfigurationIdState, json::encodeToJsonElement)
        putState("restricted_to_workflows", value.restrictedToWorkflowsState, json::encodeToJsonElement)
        putState("selected_workflows", value.selectedWorkflowsState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293(block: InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 = InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsActionsRunnerGroupsPatchRequestJsonXba8a4293 property '" + name + "' is not nullable")
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
