package com.nabobery.sdkgen.generated

import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0.Serializer::class)
public class InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0(
  public val always:
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways? = null,
  public val never:
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever? = null,
) {
  public class Builder {
    public var always:
        InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways? = null

    public var never:
        InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever? = null

    public fun build(): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 =
      InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0(
      always = always,
      never = never,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 must be a " +
          "JSON object")
      return InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0(
        always = raw["always"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesAlways>(it) },
        never = raw["never"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0PropertiesNever>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.always?.let { put("always", json.encodeToJsonElement(it)) }
        value.never?.let { put("never", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0(block: InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0.Builder.() -> Unit): InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0 = InlineComponentsSchemasMcpServerToolPropertiesRequireApprovalAnyOf0.build(block)
