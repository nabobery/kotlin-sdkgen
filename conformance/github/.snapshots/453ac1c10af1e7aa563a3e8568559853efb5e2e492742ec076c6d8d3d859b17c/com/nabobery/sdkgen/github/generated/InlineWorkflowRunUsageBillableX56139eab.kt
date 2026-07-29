package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run-usage/properties/billable
 */
@Serializable(with = InlineWorkflowRunUsageBillableX56139eab.Serializer::class)
public class InlineWorkflowRunUsageBillableX56139eab(
  public val macos: InlineWorkflowRunUsageBillableMacosXb7fec781? = null,
  public val ubuntu: InlineWorkflowRunUsageBillableUbuntuX37d348b1? = null,
  public val windows: InlineWorkflowRunUsageBillableWindowsX4c0a211d? = null,
) {
  public class Builder {
    public var macos: InlineWorkflowRunUsageBillableMacosXb7fec781? = null

    public var ubuntu: InlineWorkflowRunUsageBillableUbuntuX37d348b1? = null

    public var windows: InlineWorkflowRunUsageBillableWindowsX4c0a211d? = null

    public fun build(): InlineWorkflowRunUsageBillableX56139eab = InlineWorkflowRunUsageBillableX56139eab(
      macos = macos,
      ubuntu = ubuntu,
      windows = windows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowRunUsageBillableX56139eab = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWorkflowRunUsageBillableX56139eab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowRunUsageBillableX56139eab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowRunUsageBillableX56139eab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowRunUsageBillableX56139eab must be a JSON object")
      return InlineWorkflowRunUsageBillableX56139eab(
        macos = rawObject["MACOS"]?.let { json.decodeFromJsonElement<InlineWorkflowRunUsageBillableMacosXb7fec781>(it) },
        ubuntu = rawObject["UBUNTU"]?.let { json.decodeFromJsonElement<InlineWorkflowRunUsageBillableUbuntuX37d348b1>(it) },
        windows = rawObject["WINDOWS"]?.let { json.decodeFromJsonElement<InlineWorkflowRunUsageBillableWindowsX4c0a211d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunUsageBillableX56139eab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowRunUsageBillableX56139eab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.macos?.let { put("MACOS", json.encodeToJsonElement(it)) }
        value.ubuntu?.let { put("UBUNTU", json.encodeToJsonElement(it)) }
        value.windows?.let { put("WINDOWS", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWorkflowRunUsageBillableX56139eab(block: InlineWorkflowRunUsageBillableX56139eab.Builder.() -> Unit): InlineWorkflowRunUsageBillableX56139eab = InlineWorkflowRunUsageBillableX56139eab.build(block)
