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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold/properties/filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold/properties/filters/items
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c.Serializer::class)
public class InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c(
  public val type: InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c,
  public val customer: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c? = null

    public var type: InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var customer: String? = null

    public fun build(): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c(
        type = type,
        customer = customer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c>(rawObject, "type")
      return InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c(
        type = type,
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.customer?.let { put("customer", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c(block: InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c.Builder.() -> Unit): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c = InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
