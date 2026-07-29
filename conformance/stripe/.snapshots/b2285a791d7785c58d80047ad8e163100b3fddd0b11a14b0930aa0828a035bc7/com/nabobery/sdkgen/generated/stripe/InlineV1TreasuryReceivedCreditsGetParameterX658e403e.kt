package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/4/schema
 */
@Serializable(with = InlineV1TreasuryReceivedCreditsGetParameterX658e403e.Serializer::class)
public class InlineV1TreasuryReceivedCreditsGetParameterX658e403e(
  public val sourceFlowType: InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275,
) {
  public class Builder {
    private var sourceFlowTypeValue:
        InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275? = null

    public var sourceFlowType: InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275
      get() = requireNotNull(sourceFlowTypeValue) { "sourceFlowType is required" }
      set(`value`) {
        sourceFlowTypeValue = value
      }

    public fun build(): InlineV1TreasuryReceivedCreditsGetParameterX658e403e {
      check(sourceFlowTypeValue != null) { "sourceFlowType is required" }
      return InlineV1TreasuryReceivedCreditsGetParameterX658e403e(
        sourceFlowType = sourceFlowType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryReceivedCreditsGetParameterX658e403e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryReceivedCreditsGetParameterX658e403e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryReceivedCreditsGetParameterX658e403e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryReceivedCreditsGetParameterX658e403e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryReceivedCreditsGetParameterX658e403e must be a JSON object")
      val sourceFlowType = json.decodeRequired<InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275>(rawObject, "source_flow_type")
      return InlineV1TreasuryReceivedCreditsGetParameterX658e403e(
        sourceFlowType = sourceFlowType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryReceivedCreditsGetParameterX658e403e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryReceivedCreditsGetParameterX658e403e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("source_flow_type", json.encodeToJsonElement(value.sourceFlowType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryReceivedCreditsGetParameterX658e403e(block: InlineV1TreasuryReceivedCreditsGetParameterX658e403e.Builder.() -> Unit): InlineV1TreasuryReceivedCreditsGetParameterX658e403e = InlineV1TreasuryReceivedCreditsGetParameterX658e403e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryReceivedCreditsGetParameterX658e403e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
