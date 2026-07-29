package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or
 * `schedule_details` fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af(
  public val billingCycleAnchor:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c? = null,
  public val billingMode: InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5? = null,
  public val billingSchedules:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b? = null,
  public val cancelAt:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08? = null,
  public val cancelAtPeriodEnd: Boolean? = null,
  public val cancelNow: Boolean? = null,
  public val defaultTaxRates:
      InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e? = null,
  items: List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750>? = null,
  public val prorationBehavior:
      InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX7014020a? = null,
  public val prorationDate: Int? = null,
  public val resumeAt:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsResumeAtX31c0f3b4? = null,
  public val startDate: Int? = null,
  public val trialEnd:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02? = null,
) {
  public val items:
      List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750>? =
      items?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var billingCycleAnchor:
        InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c? = null

    public var billingMode: InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5? = null

    public var billingSchedules:
        InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b? = null

    public var cancelAt:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08? = null

    public var cancelAtPeriodEnd: Boolean? = null

    public var cancelNow: Boolean? = null

    public var defaultTaxRates:
        InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e? = null

    private var itemsValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750>? = null

    public var items:
        List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750>?
      get() = itemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        itemsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var prorationBehavior:
        InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX7014020a? = null

    public var prorationDate: Int? = null

    public var resumeAt:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsResumeAtX31c0f3b4? = null

    public var startDate: Int? = null

    public var trialEnd:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af(
      billingCycleAnchor = billingCycleAnchor,
      billingMode = billingMode,
      billingSchedules = billingSchedules,
      cancelAt = cancelAt,
      cancelAtPeriodEnd = cancelAtPeriodEnd,
      cancelNow = cancelNow,
      defaultTaxRates = defaultTaxRates,
      items = items,
      prorationBehavior = prorationBehavior,
      prorationDate = prorationDate,
      resumeAt = resumeAt,
      startDate = startDate,
      trialEnd = trialEnd,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af(
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c>(it) },
        billingMode = rawObject["billing_mode"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingModeXa2159cf5>(it) },
        billingSchedules = rawObject["billing_schedules"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b>(it) },
        cancelAt = rawObject["cancel_at"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08>(it) },
        cancelAtPeriodEnd = rawObject["cancel_at_period_end"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        cancelNow = rawObject["cancel_now"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e>(it) },
        items = rawObject["items"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX8167b750>>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX7014020a>(it) },
        prorationDate = rawObject["proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        resumeAt = rawObject["resume_at"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsResumeAtX31c0f3b4>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        trialEnd = rawObject["trial_end"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
        value.billingSchedules?.let { put("billing_schedules", json.encodeToJsonElement(it)) }
        value.cancelAt?.let { put("cancel_at", json.encodeToJsonElement(it)) }
        value.cancelAtPeriodEnd?.let { put("cancel_at_period_end", json.encodeToJsonElement(it)) }
        value.cancelNow?.let { put("cancel_now", json.encodeToJsonElement(it)) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.items?.let { put("items", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.prorationDate?.let { put("proration_date", json.encodeToJsonElement(it)) }
        value.resumeAt?.let { put("resume_at", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af(block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af.build(block)
