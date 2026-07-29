package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_billing_meter_status_transitions
 */
@Serializable(with = BillingMeterResourceBillingMeterStatusTransitions.Serializer::class)
public class BillingMeterResourceBillingMeterStatusTransitions(
  /**
   * The time the meter was deactivated, if any. Measured in seconds since Unix epoch.
   */
  public val deactivatedAt: Int? = null,
) {
  public class Builder {
    /**
     * The time the meter was deactivated, if any. Measured in seconds since Unix epoch.
     */
    public var deactivatedAt: Int? = null

    public fun build(): BillingMeterResourceBillingMeterStatusTransitions = BillingMeterResourceBillingMeterStatusTransitions(
      deactivatedAt = deactivatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingMeterResourceBillingMeterStatusTransitions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingMeterResourceBillingMeterStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingMeterResourceBillingMeterStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("BillingMeterResourceBillingMeterStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingMeterResourceBillingMeterStatusTransitions must be a JSON object")
      return BillingMeterResourceBillingMeterStatusTransitions(
        deactivatedAt = rawObject["deactivated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingMeterResourceBillingMeterStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingMeterResourceBillingMeterStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.deactivatedAt?.let { put("deactivated_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingMeterResourceBillingMeterStatusTransitions(block: BillingMeterResourceBillingMeterStatusTransitions.Builder.() -> Unit): BillingMeterResourceBillingMeterStatusTransitions = BillingMeterResourceBillingMeterStatusTransitions.build(block)
