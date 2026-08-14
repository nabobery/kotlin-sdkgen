package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/schedule_at_period_end
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60(
  conditions: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b>? = null,
) {
  public val conditions: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b>? =
      conditions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var conditionsValue:
        List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b>? = null

    public var conditions: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b>?
      get() = conditionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        conditionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60 = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60(
      conditions = conditions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60 must be a JSON object")
      return InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60(
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX1edb0a0b>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60(block: InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60 = InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60.build(block)
