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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0/properties/never.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever
  .Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever(
  public val toolNames: List<String>? = null,
) {
  public class Builder {
    public var toolNames: List<String>? = null

    public fun build(): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever =
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever(
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever " +
          "must be a JSON object")
      return InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever(
        toolNames = raw["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever(block: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever.Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever.build(block)
