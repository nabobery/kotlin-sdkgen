package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_customer_mapping_settings
 */
@Serializable(with = BillingMeterResourceCustomerMappingSettings.Serializer::class)
public class BillingMeterResourceCustomerMappingSettings(
  /**
   * The key in the meter event payload to use for mapping the event to a customer.
   */
  public val eventPayloadKey: String,
  /**
   * The method for mapping a meter event to a customer.
   */
  public val type: InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38,
) {
  public class Builder {
    private var eventPayloadKeyValue: String? = null

    public var eventPayloadKey: String
      get() = requireNotNull(eventPayloadKeyValue) { "eventPayloadKey is required" }
      set(`value`) {
        eventPayloadKeyValue = value
      }

    private var typeValue: InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38? = null

    public var type: InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BillingMeterResourceCustomerMappingSettings {
      check(eventPayloadKeyValue != null) { "eventPayloadKey is required" }
      check(typeValue != null) { "type is required" }
      return BillingMeterResourceCustomerMappingSettings(
        eventPayloadKey = eventPayloadKey,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingMeterResourceCustomerMappingSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingMeterResourceCustomerMappingSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingMeterResourceCustomerMappingSettings {
      val jsonDecoder = decoder.requireJsonDecoder("BillingMeterResourceCustomerMappingSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingMeterResourceCustomerMappingSettings must be a JSON object")
      val eventPayloadKey = json.decodeRequired<String>(rawObject, "event_payload_key")
      val type = json.decodeRequired<InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38>(rawObject, "type")
      return BillingMeterResourceCustomerMappingSettings(
        eventPayloadKey = eventPayloadKey,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingMeterResourceCustomerMappingSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingMeterResourceCustomerMappingSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("event_payload_key", value.eventPayloadKey)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingMeterResourceCustomerMappingSettings(block: BillingMeterResourceCustomerMappingSettings.Builder.() -> Unit): BillingMeterResourceCustomerMappingSettings = BillingMeterResourceCustomerMappingSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingMeterResourceCustomerMappingSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
