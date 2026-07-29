package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_per
 * iod_end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_per
 * iod_end
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155(
  public val conditions:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesConditionsXd770a1b0? = null,
) {
  public class Builder {
    public var conditions: InlineV1BillingPortalConfiab44PostRequestFormFeaturesConditionsXd770a1b0?
        = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155 = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155(
      conditions = conditions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155 must be a JSON object")
      return InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155(
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesConditionsXd770a1b0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155(block: InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155 = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX72d26155.build(block)
