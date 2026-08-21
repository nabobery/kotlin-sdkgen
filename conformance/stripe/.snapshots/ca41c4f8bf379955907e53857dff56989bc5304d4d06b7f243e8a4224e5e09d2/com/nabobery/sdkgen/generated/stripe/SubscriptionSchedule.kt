package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class SubscriptionScheduleView internal constructor(
  public val application: InlineSubscriptionScheduleApplicationX4a2180ae? = null,
  @SerialName("billing_mode")
  public val billingMode: SubscriptionsResourceBillingMode,
  @SerialName("canceled_at")
  public val canceledAt: Int? = null,
  @SerialName("completed_at")
  public val completedAt: Int? = null,
  public val created: Int,
  @SerialName("current_phase")
  public val currentPhase: InlineSubscriptionScheduleCurrentPhaseX57fffd12? = null,
  public val customer: InlineSubscriptionScheduleCustomerX15534109,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("default_settings")
  public val defaultSettings: SubscriptionSchedulesResourceDefaultSettings,
  @SerialName("end_behavior")
  public val endBehavior: InlineSubscriptionScheduleEndBehaviorXf40f838d,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  @SerialName("object")
  public val objectValue: InlineSubscriptionScheduleObjectValueX6722ea6d,
  public val phases: List<SubscriptionSchedulePhaseConfiguration>,
  @SerialName("released_at")
  public val releasedAt: Int? = null,
  @SerialName("released_subscription")
  public val releasedSubscription: String? = null,
  public val status: InlineSubscriptionScheduleStatusXa92acafb,
  public val subscription: InlineSubscriptionScheduleSubscriptionX1f6afdc9? = null,
  @SerialName("test_clock")
  public val testClock: InlineSubscriptionScheduleTestClockX22d9a61a? = null,
)

/**
 * A subscription schedule allows you to create and manage the lifecycle of a subscription by predefining expected
 * changes.
 *
 * Related guide: [Subscription schedules](https://docs.stripe.com/billing/subscriptions/subscription-schedules)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule
 */
@Serializable(with = SubscriptionSchedule.Serializer::class)
public class SubscriptionSchedule(
  public val billingMode: SubscriptionsResourceBillingMode,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * ID of the customer who owns the subscription schedule.
   */
  public val customer: InlineSubscriptionScheduleCustomerX15534109,
  public val defaultSettings: SubscriptionSchedulesResourceDefaultSettings,
  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
   * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
   * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
   */
  public val endBehavior: InlineSubscriptionScheduleEndBehaviorXf40f838d,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineSubscriptionScheduleObjectValueX6722ea6d,
  phases: List<SubscriptionSchedulePhaseConfiguration>,
  /**
   * The present status of the subscription schedule. Possible values are `not_started`, `active`, `completed`,
   * `released`, and `canceled`. You can read more about the different states in our [behavior
   * guide](https://docs.stripe.com/billing/subscriptions/subscription-schedules).
   */
  public val status: InlineSubscriptionScheduleStatusXa92acafb,
  /**
   * ID of the Connect Application that created the schedule.
   */
  public val application: InlineSubscriptionScheduleApplicationX4a2180ae? = null,
  /**
   * Time at which the subscription schedule was canceled. Measured in seconds since the Unix epoch.
   */
  public val canceledAt: Int? = null,
  /**
   * Time at which the subscription schedule was completed. Measured in seconds since the Unix epoch.
   */
  public val completedAt: Int? = null,
  /**
   * Object representing the start and end dates for the current phase of the subscription schedule, if it is `active`.
   */
  public val currentPhase: InlineSubscriptionScheduleCurrentPhaseX57fffd12? = null,
  /**
   * ID of the account who owns the subscription schedule.
   */
  public val customerAccount: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * Time at which the subscription schedule was released. Measured in seconds since the Unix epoch.
   */
  public val releasedAt: Int? = null,
  /**
   * ID of the subscription once managed by the subscription schedule (if it is released).
   */
  public val releasedSubscription: String? = null,
  /**
   * ID of the subscription managed by the subscription schedule.
   */
  public val subscription: InlineSubscriptionScheduleSubscriptionX1f6afdc9? = null,
  /**
   * ID of the test clock this subscription schedule belongs to.
   */
  public val testClock: InlineSubscriptionScheduleTestClockX22d9a61a? = null,
) {
  /**
   * Configuration for the subscription schedule's phases.
   */
  public val phases: List<SubscriptionSchedulePhaseConfiguration> = phases.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var billingModeValue: SubscriptionsResourceBillingMode? = null

    public var billingMode: SubscriptionsResourceBillingMode
      get() = requireNotNull(billingModeValue) { "billingMode is required" }
      set(`value`) {
        billingModeValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var customerValue: InlineSubscriptionScheduleCustomerX15534109? = null

    public var customer: InlineSubscriptionScheduleCustomerX15534109
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var defaultSettingsValue: SubscriptionSchedulesResourceDefaultSettings? = null

    public var defaultSettings: SubscriptionSchedulesResourceDefaultSettings
      get() = requireNotNull(defaultSettingsValue) { "defaultSettings is required" }
      set(`value`) {
        defaultSettingsValue = value
      }

    private var endBehaviorValue: InlineSubscriptionScheduleEndBehaviorXf40f838d? = null

    public var endBehavior: InlineSubscriptionScheduleEndBehaviorXf40f838d
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineSubscriptionScheduleObjectValueX6722ea6d? = null

    public var objectValue: InlineSubscriptionScheduleObjectValueX6722ea6d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var phasesValue: List<SubscriptionSchedulePhaseConfiguration>? = null

    public var phases: List<SubscriptionSchedulePhaseConfiguration>
      get() = requireNotNull(phasesValue) { "phases is required" }.toList()
      set(`value`) {
        phasesValue = value.toList()
      }

    private var statusValue: InlineSubscriptionScheduleStatusXa92acafb? = null

    public var status: InlineSubscriptionScheduleStatusXa92acafb
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * ID of the Connect Application that created the schedule.
     */
    public var application: InlineSubscriptionScheduleApplicationX4a2180ae? = null

    /**
     * Time at which the subscription schedule was canceled. Measured in seconds since the Unix epoch.
     */
    public var canceledAt: Int? = null

    /**
     * Time at which the subscription schedule was completed. Measured in seconds since the Unix epoch.
     */
    public var completedAt: Int? = null

    /**
     * Object representing the start and end dates for the current phase of the subscription schedule, if it is
     * `active`.
     */
    public var currentPhase: InlineSubscriptionScheduleCurrentPhaseX57fffd12? = null

    /**
     * ID of the account who owns the subscription schedule.
     */
    public var customerAccount: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Time at which the subscription schedule was released. Measured in seconds since the Unix epoch.
     */
    public var releasedAt: Int? = null

    /**
     * ID of the subscription once managed by the subscription schedule (if it is released).
     */
    public var releasedSubscription: String? = null

    /**
     * ID of the subscription managed by the subscription schedule.
     */
    public var subscription: InlineSubscriptionScheduleSubscriptionX1f6afdc9? = null

    /**
     * ID of the test clock this subscription schedule belongs to.
     */
    public var testClock: InlineSubscriptionScheduleTestClockX22d9a61a? = null

    public fun build(): SubscriptionSchedule {
      check(billingModeValue != null) { "billingMode is required" }
      check(createdValue != null) { "created is required" }
      check(customerValue != null) { "customer is required" }
      check(defaultSettingsValue != null) { "defaultSettings is required" }
      check(endBehaviorValue != null) { "endBehavior is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(phasesValue != null) { "phases is required" }
      check(statusValue != null) { "status is required" }
      return SubscriptionSchedule(
        billingMode = billingMode,
        created = created,
        customer = customer,
        defaultSettings = defaultSettings,
        endBehavior = endBehavior,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        phases = phases,
        status = status,
        application = application,
        canceledAt = canceledAt,
        completedAt = completedAt,
        currentPhase = currentPhase,
        customerAccount = customerAccount,
        metadata = metadata,
        releasedAt = releasedAt,
        releasedSubscription = releasedSubscription,
        subscription = subscription,
        testClock = testClock,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedule = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionSchedule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedule {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedule must be a JSON object")
      val billingMode = json.decodeRequired<SubscriptionsResourceBillingMode>(rawObject, "billing_mode")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val customer = json.decodeRequired<InlineSubscriptionScheduleCustomerX15534109>(rawObject, "customer")
      val defaultSettings = json.decodeRequired<SubscriptionSchedulesResourceDefaultSettings>(rawObject, "default_settings")
      val endBehavior = json.decodeRequired<InlineSubscriptionScheduleEndBehaviorXf40f838d>(rawObject, "end_behavior")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSubscriptionScheduleObjectValueX6722ea6d>(rawObject, "object")
      val phases = json.decodeRequired<List<SubscriptionSchedulePhaseConfiguration>>(rawObject, "phases")
      val status = json.decodeRequired<InlineSubscriptionScheduleStatusXa92acafb>(rawObject, "status")
      return SubscriptionSchedule(
        billingMode = billingMode,
        created = created,
        customer = customer,
        defaultSettings = defaultSettings,
        endBehavior = endBehavior,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        phases = phases,
        status = status,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleApplicationX4a2180ae?>(element) },
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        currentPhase = rawObject["current_phase"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleCurrentPhaseX57fffd12?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        releasedAt = rawObject["released_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        releasedSubscription = rawObject["released_subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleSubscriptionX1f6afdc9?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleTestClockX22d9a61a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedule) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_mode", json.encodeToJsonElement(value.billingMode))
        put("created", json.encodeToJsonElement(value.created))
        put("customer", json.encodeToJsonElement(value.customer))
        put("default_settings", json.encodeToJsonElement(value.defaultSettings))
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("phases", json.encodeToJsonElement(value.phases))
        put("status", json.encodeToJsonElement(value.status))
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.completedAt?.let { put("completed_at", json.encodeToJsonElement(it)) }
        value.currentPhase?.let { put("current_phase", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.releasedAt?.let { put("released_at", json.encodeToJsonElement(it)) }
        value.releasedSubscription?.let { put("released_subscription", it) }
        value.subscription?.let { put("subscription", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedule(block: SubscriptionSchedule.Builder.() -> Unit): SubscriptionSchedule = SubscriptionSchedule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
