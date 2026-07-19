package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0/properties/always.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways
  .Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways(
  public val toolNames: List<String>? = null,
) {
  public class Builder {
    public var toolNames: List<String>? = null

    public fun build(): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways =
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways(
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways " +
          "must be a JSON object")
      return InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways(
        toolNames = raw["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways(block: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways.Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways.build(block)
