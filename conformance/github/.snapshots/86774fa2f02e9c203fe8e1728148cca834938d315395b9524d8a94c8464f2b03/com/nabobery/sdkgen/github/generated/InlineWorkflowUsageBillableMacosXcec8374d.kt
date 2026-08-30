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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/MACOS.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/MACOS
 */
@Serializable(with = InlineWorkflowUsageBillableMacosXcec8374d.Serializer::class)
public class InlineWorkflowUsageBillableMacosXcec8374d(
  public val totalMs: Int? = null,
) {
  public class Builder {
    public var totalMs: Int? = null

    public fun build(): InlineWorkflowUsageBillableMacosXcec8374d = InlineWorkflowUsageBillableMacosXcec8374d(
      totalMs = totalMs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowUsageBillableMacosXcec8374d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowUsageBillableMacosXcec8374d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowUsageBillableMacosXcec8374d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowUsageBillableMacosXcec8374d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowUsageBillableMacosXcec8374d must be a JSON object")
      return InlineWorkflowUsageBillableMacosXcec8374d(
        totalMs = rawObject["total_ms"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowUsageBillableMacosXcec8374d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowUsageBillableMacosXcec8374d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.totalMs?.let { put("total_ms", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowUsageBillableMacosXcec8374d(block: InlineWorkflowUsageBillableMacosXcec8374d.Builder.() -> Unit): InlineWorkflowUsageBillableMacosXcec8374d = InlineWorkflowUsageBillableMacosXcec8374d.build(block)
