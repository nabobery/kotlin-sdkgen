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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent/put/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent/put/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71.Serializer::class)
public class InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71(
  /**
   * The policy state for Copilot cloud agent in the enterprise. Can be one of `enabled_for_all_orgs`,
   * `disabled_for_all_orgs`, `enabled_for_selected_orgs`, or `configured_by_org_admins`.
   */
  public val policyState:
      InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9,
) {
  public class Builder {
    private var policyStateValue:
        InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9? = null

    public var policyState:
        InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9
      get() = requireNotNull(policyStateValue) { "policyState is required" }
      set(`value`) {
        policyStateValue = value
      }

    public fun build(): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 {
      check(policyStateValue != null) { "policyState is required" }
      return InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71(
        policyState = policyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 must be a JSON object")
      val policyState = json.decodeRequired<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9>(rawObject, "policy_state")
      return InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71(
        policyState = policyState,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("policy_state", json.encodeToJsonElement(value.policyState))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71(block: InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71.Builder.() -> Unit): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 = InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
