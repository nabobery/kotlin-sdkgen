package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/WINDOWS.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/WINDOWS
 */
@Serializable(with = InlineWorkflowUsageBillableWindowsX081db476.Serializer::class)
public class InlineWorkflowUsageBillableWindowsX081db476(
  public val totalMs: Int? = null,
) {
  public class Builder {
    public var totalMs: Int? = null

    public fun build(): InlineWorkflowUsageBillableWindowsX081db476 = InlineWorkflowUsageBillableWindowsX081db476(
      totalMs = totalMs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowUsageBillableWindowsX081db476 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowUsageBillableWindowsX081db476> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowUsageBillableWindowsX081db476 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowUsageBillableWindowsX081db476")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowUsageBillableWindowsX081db476 must be a JSON object")
      return InlineWorkflowUsageBillableWindowsX081db476(
        totalMs = rawObject["total_ms"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowUsageBillableWindowsX081db476) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowUsageBillableWindowsX081db476")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.totalMs?.let { put("total_ms", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowUsageBillableWindowsX081db476(block: InlineWorkflowUsageBillableWindowsX081db476.Builder.() -> Unit): InlineWorkflowUsageBillableWindowsX081db476 = InlineWorkflowUsageBillableWindowsX081db476.build(block)
