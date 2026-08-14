package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-usage/properties/billable
 */
@Serializable(with = InlineWorkflowUsageBillableX4f0004d3.Serializer::class)
public class InlineWorkflowUsageBillableX4f0004d3(
  public val macos: InlineWorkflowUsageBillableMacosXcec8374d? = null,
  public val ubuntu: InlineWorkflowUsageBillableUbuntuXaddb6931? = null,
  public val windows: InlineWorkflowUsageBillableWindowsX081db476? = null,
) {
  public class Builder {
    public var macos: InlineWorkflowUsageBillableMacosXcec8374d? = null

    public var ubuntu: InlineWorkflowUsageBillableUbuntuXaddb6931? = null

    public var windows: InlineWorkflowUsageBillableWindowsX081db476? = null

    public fun build(): InlineWorkflowUsageBillableX4f0004d3 = InlineWorkflowUsageBillableX4f0004d3(
      macos = macos,
      ubuntu = ubuntu,
      windows = windows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWorkflowUsageBillableX4f0004d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWorkflowUsageBillableX4f0004d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWorkflowUsageBillableX4f0004d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWorkflowUsageBillableX4f0004d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWorkflowUsageBillableX4f0004d3 must be a JSON object")
      return InlineWorkflowUsageBillableX4f0004d3(
        macos = rawObject["MACOS"]?.let { json.decodeFromJsonElement<InlineWorkflowUsageBillableMacosXcec8374d>(it) },
        ubuntu = rawObject["UBUNTU"]?.let { json.decodeFromJsonElement<InlineWorkflowUsageBillableUbuntuXaddb6931>(it) },
        windows = rawObject["WINDOWS"]?.let { json.decodeFromJsonElement<InlineWorkflowUsageBillableWindowsX081db476>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowUsageBillableX4f0004d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWorkflowUsageBillableX4f0004d3")
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

public fun inlineWorkflowUsageBillableX4f0004d3(block: InlineWorkflowUsageBillableX4f0004d3.Builder.() -> Unit): InlineWorkflowUsageBillableX4f0004d3 = InlineWorkflowUsageBillableX4f0004d3.build(block)
