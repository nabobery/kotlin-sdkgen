package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * When creating a subscription or subscription schedule, the specified configuration data will be used. There must be
 * at least one line item with a recurring price for a subscription or subscription schedule to be created. A
 * subscription schedule is created if `subscription_data[effective_date]` is present and in the future, otherwise a
 * subscription is created.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df(
  public val description: InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2? = null,
  public val effectiveDate:
      InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7? = null,
  metadata: Map<String, String>? = null,
  public val trialPeriodDays:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var description: InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2? =
        null

    public var effectiveDate: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7? =
        null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var trialPeriodDays:
        InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f? = null

    public fun build(): InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df = InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df(
      description = description,
      effectiveDate = effectiveDate,
      metadata = metadata,
      trialPeriodDays = trialPeriodDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df must be a JSON object")
      return InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataDescriptionXf84cabf2>(it) },
        effectiveDate = rawObject["effective_date"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX2c96b2d7>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.effectiveDate?.let { put("effective_date", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormSubscriptionDataXafbc88df(block: InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df.Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df = InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df.build(block)
