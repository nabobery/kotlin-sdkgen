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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/delet
 * e/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/delet
 * e/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83.Serializer::class)
public class InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83(
  customProperties: List<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af>? = null,
  organizations: List<String>? = null,
) {
  /**
   * List of custom property filters to match organizations. Organizations matching any of the specified property
   * name/value pairs will be included. This is a one-time operation, setting the property on an organization in the
   * future will not automatically update its coding agent policy.
   */
  public val customProperties:
      List<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af>? =
      customProperties?.let { collection0 -> collection0.toList() }

  /**
   * List of organization logins within the enterprise to disable Copilot cloud agent for.
   */
  public val organizations: List<String>? =
      organizations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customPropertiesValue:
        List<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af>? = null

    /**
     * List of custom property filters to match organizations. Organizations matching any of the specified property
     * name/value pairs will be included. This is a one-time operation, setting the property on an organization in the
     * future will not automatically update its coding agent policy.
     */
    public var customProperties:
        List<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af>?
      get() = customPropertiesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customPropertiesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var organizationsValue: List<String>? = null

    /**
     * List of organization logins within the enterprise to disable Copilot cloud agent for.
     */
    public var organizations: List<String>?
      get() = organizationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        organizationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83 = InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83(
      customProperties = customProperties,
      organizations = organizations,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83 must be a JSON object")
      return InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83(
        customProperties = rawObject["custom_properties"]?.let { json.decodeFromJsonElement<List<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af>>(it) },
        organizations = rawObject["organizations"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customProperties?.let { put("custom_properties", json.encodeToJsonElement(it)) }
        value.organizations?.let { put("organizations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83(block: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83.Builder.() -> Unit): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83 = InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83.build(block)
