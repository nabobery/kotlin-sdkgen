package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4(
  public val billingMode: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04? = null,
  public val description: String? = null,
  public val effectiveDate:
      InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c? = null,
  metadata: Map<String, String>? = null,
  public val trialPeriodDays:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var billingMode: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04? =
        null

    public var description: String? = null

    public var effectiveDate: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c? =
        null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var trialPeriodDays:
        InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420? = null

    public fun build(): InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4 = InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4(
      billingMode = billingMode,
      description = description,
      effectiveDate = effectiveDate,
      metadata = metadata,
      trialPeriodDays = trialPeriodDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4 must be a JSON object")
      return InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4(
        billingMode = rawObject["billing_mode"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        effectiveDate = rawObject["effective_date"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.effectiveDate?.let { put("effective_date", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4(block: InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4.Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4 = InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4.build(block)
