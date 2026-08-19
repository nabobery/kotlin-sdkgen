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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0/properties/never
 */
@Serializable(with = InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487.Serializer::class)
public class InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487(
  toolNames: List<String>? = null,
) {
  public val toolNames: List<String>? = toolNames?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var toolNamesValue: List<String>? = null

    public var toolNames: List<String>?
      get() = toolNamesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolNamesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487 = InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487(
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487 must be a JSON object")
      return InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487(
        toolNames = rawObject["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487(block: InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487.Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487 = InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487.build(block)
