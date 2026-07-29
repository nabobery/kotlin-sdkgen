package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/post/
 * requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/post/
 * requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d.Serializer::class)
public class InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d(
  customProperties: List<InlineEnterprisesCopilotPo0ee5PostRequestJsonCustomPropertiesItemX58071cd5>? = null,
  organizations: List<String>? = null,
) {
  /**
   * List of custom property filters to match organizations. Organizations matching any of the specified property
   * name/value pairs will be included. This is a one-time operation, setting the property on an organization in the
   * future will not automatically update its coding agent policy.
   */
  public val customProperties:
      List<InlineEnterprisesCopilotPo0ee5PostRequestJsonCustomPropertiesItemX58071cd5>? =
      customProperties?.let { collection0 -> collection0.toList() }

  /**
   * List of organization logins within the enterprise to enable Copilot cloud agent for.
   */
  public val organizations: List<String>? =
      organizations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customPropertiesValue:
        List<InlineEnterprisesCopilotPo0ee5PostRequestJsonCustomPropertiesItemX58071cd5>? = null

    /**
     * List of custom property filters to match organizations. Organizations matching any of the specified property
     * name/value pairs will be included. This is a one-time operation, setting the property on an organization in the
     * future will not automatically update its coding agent policy.
     */
    public var customProperties:
        List<InlineEnterprisesCopilotPo0ee5PostRequestJsonCustomPropertiesItemX58071cd5>?
      get() = customPropertiesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customPropertiesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var organizationsValue: List<String>? = null

    /**
     * List of organization logins within the enterprise to enable Copilot cloud agent for.
     */
    public var organizations: List<String>?
      get() = organizationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        organizationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d = InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d(
      customProperties = customProperties,
      organizations = organizations,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d must be a JSON object")
      return InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d(
        customProperties = rawObject["custom_properties"]?.let { json.decodeFromJsonElement<List<InlineEnterprisesCopilotPo0ee5PostRequestJsonCustomPropertiesItemX58071cd5>>(it) },
        organizations = rawObject["organizations"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customProperties?.let { put("custom_properties", json.encodeToJsonElement(it)) }
        value.organizations?.let { put("organizations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d(block: InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d.Builder.() -> Unit): InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d = InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d.build(block)
