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
 * sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/UBUNTU.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable/properties/UBUNTU
 */
@Serializable(with = InlineWorkflowUsageBillableUbuntuXaddb6931.Serializer::class)
public class InlineWorkflowUsageBillableUbuntuXaddb6931(
  public val totalMs: Int? = null,
) {
  public class Builder {
    public var totalMs: Int? = null

    public fun build(): InlineWorkflowUsageBillableUbuntuXaddb6931 = InlineWorkflowUsageBillableUbuntuXaddb6931(
      totalMs = totalMs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowUsageBillableUbuntuXaddb6931 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWorkflowUsageBillableUbuntuXaddb6931> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowUsageBillableUbuntuXaddb6931 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowUsageBillableUbuntuXaddb6931")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowUsageBillableUbuntuXaddb6931 must be a JSON object")
      return InlineWorkflowUsageBillableUbuntuXaddb6931(
        totalMs = rawObject["total_ms"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowUsageBillableUbuntuXaddb6931) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowUsageBillableUbuntuXaddb6931")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.totalMs?.let { put("total_ms", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowUsageBillableUbuntuXaddb6931(block: InlineWorkflowUsageBillableUbuntuXaddb6931.Builder.() -> Unit): InlineWorkflowUsageBillableUbuntuXaddb6931 = InlineWorkflowUsageBillableUbuntuXaddb6931.build(block)
