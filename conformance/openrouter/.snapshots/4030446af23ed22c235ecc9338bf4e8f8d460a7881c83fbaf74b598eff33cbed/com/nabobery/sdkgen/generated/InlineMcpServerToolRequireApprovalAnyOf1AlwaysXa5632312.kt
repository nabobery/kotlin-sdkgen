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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0/properties/always
 */
@Serializable(with = InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312.Serializer::class)
public class InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312(
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

    public fun build(): InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312 = InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312(
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312 must be a JSON object")
      return InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312(
        toolNames = rawObject["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312(block: InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312.Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312 = InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312.build(block)
