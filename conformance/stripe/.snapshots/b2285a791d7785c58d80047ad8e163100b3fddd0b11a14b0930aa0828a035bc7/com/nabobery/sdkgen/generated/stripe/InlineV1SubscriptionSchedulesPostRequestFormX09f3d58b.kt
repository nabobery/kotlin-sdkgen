package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b(
  /**
   * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
   */
  public val billingMode: InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba? = null,
  /**
   * The identifier of the customer to create the subscription schedule for.
   */
  public val customer: String? = null,
  /**
   * The identifier of the account to create the subscription schedule for.
   */
  public val customerAccount: String? = null,
  /**
   * Object representing the subscription schedule's default settings.
   */
  public val defaultSettings:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a? = null,
  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
   * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
   * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
   */
  public val endBehavior: InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorXe2268f44? = null,
  expand: List<String>? = null,
  /**
   * Migrate an existing subscription to be managed by a subscription schedule. If this parameter is set, a subscription
   * schedule will be created using the subscription's item(s), set to auto-renew using the subscription's interval.
   * When using this parameter, other parameters (such as phase values) cannot be set. To create a subscription schedule
   * with other modifications, we recommend making two separate API calls.
   */
  public val fromSubscription: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1SubscriptionSchedulesPostRequestFormMetadataXfae7d157? = null,
  phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06>? = null,
  /**
   * When the subscription schedule starts. We recommend using `now` so that it starts the subscription immediately. You
   * can also use a Unix timestamp to backdate the subscription so that it starts on a past date, or set a future date
   * for the subscription to start on.
   */
  public val startDate: InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have different durations,
   * plans, and coupons. If there are multiple phases, the `end_date` of one phase will always equal the `start_date` of
   * the next phase.
   */
  public val phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06>? =
      phases?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
     */
    public var billingMode: InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba? = null

    /**
     * The identifier of the customer to create the subscription schedule for.
     */
    public var customer: String? = null

    /**
     * The identifier of the account to create the subscription schedule for.
     */
    public var customerAccount: String? = null

    /**
     * Object representing the subscription schedule's default settings.
     */
    public var defaultSettings:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a? = null

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
     * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
     * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
     */
    public var endBehavior: InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorXe2268f44? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Migrate an existing subscription to be managed by a subscription schedule. If this parameter is set, a
     * subscription schedule will be created using the subscription's item(s), set to auto-renew using the
     * subscription's interval. When using this parameter, other parameters (such as phase values) cannot be set. To
     * create a subscription schedule with other modifications, we recommend making two separate API calls.
     */
    public var fromSubscription: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1SubscriptionSchedulesPostRequestFormMetadataXfae7d157? = null

    private var phasesValue: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06>?
        = null

    /**
     * List representing phases of the subscription schedule. Each phase can be customized to have different durations,
     * plans, and coupons. If there are multiple phases, the `end_date` of one phase will always equal the `start_date`
     * of the next phase.
     */
    public var phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06>?
      get() = phasesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        phasesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * When the subscription schedule starts. We recommend using `now` so that it starts the subscription immediately.
     * You can also use a Unix timestamp to backdate the subscription so that it starts on a past date, or set a future
     * date for the subscription to start on.
     */
    public var startDate: InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b = InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b(
      billingMode = billingMode,
      customer = customer,
      customerAccount = customerAccount,
      defaultSettings = defaultSettings,
      endBehavior = endBehavior,
      expand = expand,
      fromSubscription = fromSubscription,
      metadata = metadata,
      phases = phases,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b(
        billingMode = rawObject["billing_mode"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultSettings = rawObject["default_settings"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a>(it) },
        endBehavior = rawObject["end_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorXe2268f44>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fromSubscription = rawObject["from_subscription"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormMetadataXfae7d157>(it) },
        phases = rawObject["phases"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06>>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.defaultSettings?.let { put("default_settings", json.encodeToJsonElement(it)) }
        value.endBehavior?.let { put("end_behavior", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fromSubscription?.let { put("from_subscription", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.phases?.let { put("phases", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormX09f3d58b(block: InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b = InlineV1SubscriptionSchedulesPostRequestFormX09f3d58b.build(block)
