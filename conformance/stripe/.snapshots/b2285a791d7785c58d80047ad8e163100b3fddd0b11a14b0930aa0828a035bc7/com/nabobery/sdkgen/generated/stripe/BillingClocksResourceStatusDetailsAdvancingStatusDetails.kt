package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_clocks_resource_status_details_advancing_status_details
 */
@Serializable(with = BillingClocksResourceStatusDetailsAdvancingStatusDetails.Serializer::class)
public class BillingClocksResourceStatusDetailsAdvancingStatusDetails(
  /**
   * The `frozen_time` that the Test Clock is advancing towards.
   */
  public val targetFrozenTime: Int,
) {
  public class Builder {
    private var targetFrozenTimeValue: Int? = null

    public var targetFrozenTime: Int
      get() = requireNotNull(targetFrozenTimeValue) { "targetFrozenTime is required" }
      set(`value`) {
        targetFrozenTimeValue = value
      }

    public fun build(): BillingClocksResourceStatusDetailsAdvancingStatusDetails {
      check(targetFrozenTimeValue != null) { "targetFrozenTime is required" }
      return BillingClocksResourceStatusDetailsAdvancingStatusDetails(
        targetFrozenTime = targetFrozenTime,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingClocksResourceStatusDetailsAdvancingStatusDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingClocksResourceStatusDetailsAdvancingStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingClocksResourceStatusDetailsAdvancingStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BillingClocksResourceStatusDetailsAdvancingStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingClocksResourceStatusDetailsAdvancingStatusDetails must be a JSON object")
      val targetFrozenTime = json.decodeRequired<Int>(rawObject, "target_frozen_time")
      return BillingClocksResourceStatusDetailsAdvancingStatusDetails(
        targetFrozenTime = targetFrozenTime,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingClocksResourceStatusDetailsAdvancingStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingClocksResourceStatusDetailsAdvancingStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("target_frozen_time", json.encodeToJsonElement(value.targetFrozenTime))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingClocksResourceStatusDetailsAdvancingStatusDetails(block: BillingClocksResourceStatusDetailsAdvancingStatusDetails.Builder.() -> Unit): BillingClocksResourceStatusDetailsAdvancingStatusDetails = BillingClocksResourceStatusDetailsAdvancingStatusDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingClocksResourceStatusDetailsAdvancingStatusDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
