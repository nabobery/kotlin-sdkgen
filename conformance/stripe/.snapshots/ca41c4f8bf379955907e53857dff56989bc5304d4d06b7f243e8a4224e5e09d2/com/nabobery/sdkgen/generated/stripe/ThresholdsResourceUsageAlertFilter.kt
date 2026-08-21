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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_alert_filter
 */
@Serializable(with = ThresholdsResourceUsageAlertFilter.Serializer::class)
public class ThresholdsResourceUsageAlertFilter(
  public val type: InlineThresholdsResourceUsageAlertFilterTypeXbeebca80,
  /**
   * Limit the scope of the alert to this customer ID
   */
  public val customer: InlineThresholdsResourceUsageAlertFilterCustomerX84bc98d0? = null,
) {
  public class Builder {
    private var typeValue: InlineThresholdsResourceUsageAlertFilterTypeXbeebca80? = null

    public var type: InlineThresholdsResourceUsageAlertFilterTypeXbeebca80
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Limit the scope of the alert to this customer ID
     */
    public var customer: InlineThresholdsResourceUsageAlertFilterCustomerX84bc98d0? = null

    public fun build(): ThresholdsResourceUsageAlertFilter {
      check(typeValue != null) { "type is required" }
      return ThresholdsResourceUsageAlertFilter(
        type = type,
        customer = customer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThresholdsResourceUsageAlertFilter = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ThresholdsResourceUsageAlertFilter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThresholdsResourceUsageAlertFilter {
      val jsonDecoder = decoder.requireJsonDecoder("ThresholdsResourceUsageAlertFilter")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThresholdsResourceUsageAlertFilter must be a JSON object")
      val type = json.decodeRequired<InlineThresholdsResourceUsageAlertFilterTypeXbeebca80>(rawObject, "type")
      return ThresholdsResourceUsageAlertFilter(
        type = type,
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineThresholdsResourceUsageAlertFilterCustomerX84bc98d0?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThresholdsResourceUsageAlertFilter) {
      val jsonEncoder = encoder.requireJsonEncoder("ThresholdsResourceUsageAlertFilter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun thresholdsResourceUsageAlertFilter(block: ThresholdsResourceUsageAlertFilter.Builder.() -> Unit): ThresholdsResourceUsageAlertFilter = ThresholdsResourceUsageAlertFilter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ThresholdsResourceUsageAlertFilter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
