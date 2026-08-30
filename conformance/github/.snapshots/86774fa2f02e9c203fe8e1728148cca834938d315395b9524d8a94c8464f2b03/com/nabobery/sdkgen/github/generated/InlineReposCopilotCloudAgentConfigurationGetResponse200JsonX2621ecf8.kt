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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1copilot~1cloud-agent~1configuration/get/responses/200/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1copilot~1cloud-agent~1configuration/get/responses/200/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8.Serializer::class)
public class InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8(
  customAllowlist: List<String>,
  /**
   * The enabled review tools for Copilot cloud agent.
   */
  public val enabledTools:
      InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46,
  /**
   * Whether the firewall is enabled.
   */
  public val isFirewallEnabled: Boolean,
  /**
   * Whether the firewall recommended allowlist is enabled.
   */
  public val isFirewallRecommendedAllowlistEnabled: Boolean,
  /**
   * The user-supplied MCP server configuration for the repository, as a free-form JSON object. This will be set to
   * `null` if no configuration has been set.
   *
   * The shape of a valid MCP configuration may evolve over time, so this property is intentionally not strictly typed.
   * Clients should not assume a fixed schema.
   */
  public val mcpConfiguration: JsonObject?,
  /**
   * Whether Actions workflow approval is required for Copilot cloud agent pull requests.
   */
  public val requireActionsWorkflowApproval: Boolean,
) {
  /**
   * A list of custom allowlist entries, as hosts or URLs, that the firewall will allow the Copilot cloud agent to
   * access.
   */
  public val customAllowlist: List<String> = customAllowlist.toList()

  public class Builder {
    private var customAllowlistValue: List<String>? = null

    public var customAllowlist: List<String>
      get() = requireNotNull(customAllowlistValue) { "customAllowlist is required" }.toList()
      set(`value`) {
        customAllowlistValue = value.toList()
      }

    private var enabledToolsValue:
        InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46? = null

    public var enabledTools:
        InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46
      get() = requireNotNull(enabledToolsValue) { "enabledTools is required" }
      set(`value`) {
        enabledToolsValue = value
      }

    private var isFirewallEnabledValue: Boolean? = null

    public var isFirewallEnabled: Boolean
      get() = requireNotNull(isFirewallEnabledValue) { "isFirewallEnabled is required" }
      set(`value`) {
        isFirewallEnabledValue = value
      }

    private var isFirewallRecommendedAllowlistEnabledValue: Boolean? = null

    public var isFirewallRecommendedAllowlistEnabled: Boolean
      get() = requireNotNull(isFirewallRecommendedAllowlistEnabledValue) { "isFirewallRecommendedAllowlistEnabled is required" }
      set(`value`) {
        isFirewallRecommendedAllowlistEnabledValue = value
      }

    private var requireActionsWorkflowApprovalValue: Boolean? = null

    public var requireActionsWorkflowApproval: Boolean
      get() = requireNotNull(requireActionsWorkflowApprovalValue) { "requireActionsWorkflowApproval is required" }
      set(`value`) {
        requireActionsWorkflowApprovalValue = value
      }

    private var mcpConfigurationState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The user-supplied MCP server configuration for the repository, as a free-form JSON object. This will be set to
     * `null` if no configuration has been set.
     *
     * The shape of a valid MCP configuration may evolve over time, so this property is intentionally not strictly
     * typed. Clients should not assume a fixed schema.
     * Required nullable field; assigning `null` records present-null.
     */
    public var mcpConfiguration: JsonObject?
      get() = mcpConfigurationState.valueOrNull()
      set(`value`) {
        mcpConfigurationState = value.toNullableFieldState()
      }

    public fun build(): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 {
      check(customAllowlistValue != null) { "customAllowlist is required" }
      check(enabledToolsValue != null) { "enabledTools is required" }
      check(isFirewallEnabledValue != null) { "isFirewallEnabled is required" }
      check(isFirewallRecommendedAllowlistEnabledValue != null) { "isFirewallRecommendedAllowlistEnabled is required" }
      check(requireActionsWorkflowApprovalValue != null) { "requireActionsWorkflowApproval is required" }
      check(mcpConfigurationState !== FieldState.Absent) { "mcpConfiguration is required, even when null" }
      return InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8(
        customAllowlist = customAllowlist,
        enabledTools = enabledTools,
        isFirewallEnabled = isFirewallEnabled,
        isFirewallRecommendedAllowlistEnabled = isFirewallRecommendedAllowlistEnabled,
        mcpConfiguration = mcpConfigurationState.valueOrNull(),
        requireActionsWorkflowApproval = requireActionsWorkflowApproval,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 must be a JSON object")
      val customAllowlist = json.decodeRequired<List<String>>(rawObject, "custom_allowlist")
      val enabledTools = json.decodeRequired<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46>(rawObject, "enabled_tools")
      val isFirewallEnabled = json.decodeRequired<Boolean>(rawObject, "is_firewall_enabled")
      val isFirewallRecommendedAllowlistEnabled = json.decodeRequired<Boolean>(rawObject, "is_firewall_recommended_allowlist_enabled")
      val requireActionsWorkflowApproval = json.decodeRequired<Boolean>(rawObject, "require_actions_workflow_approval")
      if (!rawObject.containsKey("mcp_configuration")) {
        throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 is missing required property 'mcp_configuration'")
      }
      val mcpConfiguration = rawObject["mcp_configuration"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      return InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8(
        customAllowlist = customAllowlist,
        enabledTools = enabledTools,
        isFirewallEnabled = isFirewallEnabled,
        isFirewallRecommendedAllowlistEnabled = isFirewallRecommendedAllowlistEnabled,
        mcpConfiguration = mcpConfiguration,
        requireActionsWorkflowApproval = requireActionsWorkflowApproval,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom_allowlist", json.encodeToJsonElement(value.customAllowlist))
        put("enabled_tools", json.encodeToJsonElement(value.enabledTools))
        put("is_firewall_enabled", json.encodeToJsonElement(value.isFirewallEnabled))
        put("is_firewall_recommended_allowlist_enabled", json.encodeToJsonElement(value.isFirewallRecommendedAllowlistEnabled))
        put("mcp_configuration", value.mcpConfiguration?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("require_actions_workflow_approval", json.encodeToJsonElement(value.requireActionsWorkflowApproval))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8(block: InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8.Builder.() -> Unit): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 = InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 property '" + name + "' is not nullable")
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
