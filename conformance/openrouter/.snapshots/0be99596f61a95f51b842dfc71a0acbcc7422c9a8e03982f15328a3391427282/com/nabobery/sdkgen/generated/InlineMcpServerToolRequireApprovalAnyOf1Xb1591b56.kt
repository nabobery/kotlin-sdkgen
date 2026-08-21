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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval/anyOf/0
 */
@Serializable(with = InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56.Serializer::class)
public class InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56(
  public val always: InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312? = null,
  public val never: InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487? = null,
) {
  public class Builder {
    public var always: InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312? = null

    public var never: InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487? = null

    public fun build(): InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 = InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56(
      always = always,
      never = never,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 must be a JSON object")
      return InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56(
        always = rawObject["always"]?.let { json.decodeFromJsonElement<InlineMcpServerToolRequireApprovalAnyOf1AlwaysXa5632312>(it) },
        never = rawObject["never"]?.let { json.decodeFromJsonElement<InlineMcpServerToolRequireApprovalAnyOf1NeverXb73a7487>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.always?.let { put("always", json.encodeToJsonElement(it)) }
        value.never?.let { put("never", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMcpServerToolRequireApprovalAnyOf1Xb1591b56(block: InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56.Builder.() -> Unit): InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 = InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56.build(block)
