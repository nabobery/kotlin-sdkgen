package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1.Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1(
  public val readOnly: Boolean? = null,
  public val toolNames: List<String>? = null,
) {
  public class Builder {
    public var readOnly: Boolean? = null

    public var toolNames: List<String>? = null

    public fun build(): InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 =
      InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1(
      readOnly = readOnly,
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 must be a JSON " +
          "object")
      return InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1(
        readOnly = raw["read_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        toolNames = raw["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.readOnly?.let { put("read_only", json.encodeToJsonElement(it)) }
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1(block: InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1.Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1 = InlineComponentsSchemasMcpServerToolPropertiesAllowedToolsAnyOf1.build(block)
