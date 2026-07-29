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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_cycle_anchor_config.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_cycle_anchor_config
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629(
  public val dayOfMonth: Int,
  public val hour: Int? = null,
  public val minute: Int? = null,
  public val month: Int? = null,
  public val second: Int? = null,
) {
  public class Builder {
    private var dayOfMonthValue: Int? = null

    public var dayOfMonth: Int
      get() = requireNotNull(dayOfMonthValue) { "dayOfMonth is required" }
      set(`value`) {
        dayOfMonthValue = value
      }

    public var hour: Int? = null

    public var minute: Int? = null

    public var month: Int? = null

    public var second: Int? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 {
      check(dayOfMonthValue != null) { "dayOfMonth is required" }
      return InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629(
        dayOfMonth = dayOfMonth,
        hour = hour,
        minute = minute,
        month = month,
        second = second,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 must be a JSON object")
      val dayOfMonth = json.decodeRequired<Int>(rawObject, "day_of_month")
      return InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629(
        dayOfMonth = dayOfMonth,
        hour = rawObject["hour"]?.let { json.decodeFromJsonElement<Int>(it) },
        minute = rawObject["minute"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
        second = rawObject["second"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("day_of_month", json.encodeToJsonElement(value.dayOfMonth))
        value.hour?.let { put("hour", json.encodeToJsonElement(it)) }
        value.minute?.let { put("minute", json.encodeToJsonElement(it)) }
        value.month?.let { put("month", json.encodeToJsonElement(it)) }
        value.second?.let { put("second", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629(block: InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 = InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
