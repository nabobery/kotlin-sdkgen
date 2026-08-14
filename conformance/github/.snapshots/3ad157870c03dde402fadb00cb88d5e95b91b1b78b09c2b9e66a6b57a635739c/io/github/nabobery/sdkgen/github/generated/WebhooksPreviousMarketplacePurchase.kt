package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase
 */
@Serializable(with = WebhooksPreviousMarketplacePurchase.Serializer::class)
public class WebhooksPreviousMarketplacePurchase internal constructor(
  public val account: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3,
  public val billingCycle: String,
  public val freeTrialEndsOn: JsonElement?,
  public val onFreeTrial: Boolean,
  public val plan: InlineWebhooksPreviousMarketplacePurchasePlanX59b3f774,
  public val unitCount: Int,
  private val nextBillingDateState: FieldState<String?>,
) {
  public val nextBillingDate: String?
    get() = nextBillingDateState.valueOrNull()

  public constructor(
    account: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3,
    billingCycle: String,
    freeTrialEndsOn: JsonElement?,
    onFreeTrial: Boolean,
    plan: InlineWebhooksPreviousMarketplacePurchasePlanX59b3f774,
    unitCount: Int,
  ) : this(account = account,
  billingCycle = billingCycle,
  freeTrialEndsOn = freeTrialEndsOn,
  onFreeTrial = onFreeTrial,
  plan = plan,
  unitCount = unitCount,
  nextBillingDateState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `next_billing_date`.
   */
  public fun nextBillingDatePresence(): FieldPresence = nextBillingDateState.presence

  public class Builder {
    private var accountValue: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3? = null

    public var account: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var billingCycleValue: String? = null

    public var billingCycle: String
      get() = requireNotNull(billingCycleValue) { "billingCycle is required" }
      set(`value`) {
        billingCycleValue = value
      }

    private var onFreeTrialValue: Boolean? = null

    public var onFreeTrial: Boolean
      get() = requireNotNull(onFreeTrialValue) { "onFreeTrial is required" }
      set(`value`) {
        onFreeTrialValue = value
      }

    private var planValue: InlineWebhooksPreviousMarketplacePurchasePlanX59b3f774? = null

    public var plan: InlineWebhooksPreviousMarketplacePurchasePlanX59b3f774
      get() = requireNotNull(planValue) { "plan is required" }
      set(`value`) {
        planValue = value
      }

    private var unitCountValue: Int? = null

    public var unitCount: Int
      get() = requireNotNull(unitCountValue) { "unitCount is required" }
      set(`value`) {
        unitCountValue = value
      }

    private var freeTrialEndsOnState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var freeTrialEndsOn: JsonElement?
      get() = freeTrialEndsOnState.valueOrNull()
      set(`value`) {
        freeTrialEndsOnState = value.toNullableFieldState()
      }

    private var nextBillingDateState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var nextBillingDate: String?
      get() = nextBillingDateState.valueOrNull()
      set(`value`) {
        nextBillingDateState = value.toNullableFieldState()
      }

    /**
     * Omits `next_billing_date` from serialized output.
     */
    public fun unsetNextBillingDate() {
      nextBillingDateState = FieldState.Absent
    }

    public fun build(): WebhooksPreviousMarketplacePurchase {
      check(accountValue != null) { "account is required" }
      check(billingCycleValue != null) { "billingCycle is required" }
      check(onFreeTrialValue != null) { "onFreeTrial is required" }
      check(planValue != null) { "plan is required" }
      check(unitCountValue != null) { "unitCount is required" }
      check(freeTrialEndsOnState !== FieldState.Absent) { "freeTrialEndsOn is required, even when null" }
      return WebhooksPreviousMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOnState.valueOrNull(),
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
        nextBillingDateState = nextBillingDateState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksPreviousMarketplacePurchase = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksPreviousMarketplacePurchase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksPreviousMarketplacePurchase {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksPreviousMarketplacePurchase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksPreviousMarketplacePurchase must be a JSON object")
      val account = json.decodeRequired<InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3>(rawObject, "account")
      val billingCycle = json.decodeRequired<String>(rawObject, "billing_cycle")
      val onFreeTrial = json.decodeRequired<Boolean>(rawObject, "on_free_trial")
      val plan = json.decodeRequired<InlineWebhooksPreviousMarketplacePurchasePlanX59b3f774>(rawObject, "plan")
      val unitCount = json.decodeRequired<Int>(rawObject, "unit_count")
      if (!rawObject.containsKey("free_trial_ends_on")) {
        throw SerializationException("WebhooksPreviousMarketplacePurchase is missing required property 'free_trial_ends_on'")
      }
      val freeTrialEndsOn = rawObject["free_trial_ends_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      return WebhooksPreviousMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOn,
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
        nextBillingDateState = json.decodeOptional(rawObject, "next_billing_date", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksPreviousMarketplacePurchase) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksPreviousMarketplacePurchase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("billing_cycle", value.billingCycle)
        put("free_trial_ends_on", value.freeTrialEndsOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("on_free_trial", json.encodeToJsonElement(value.onFreeTrial))
        put("plan", json.encodeToJsonElement(value.plan))
        put("unit_count", json.encodeToJsonElement(value.unitCount))
        putState("next_billing_date", value.nextBillingDateState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksPreviousMarketplacePurchase(block: WebhooksPreviousMarketplacePurchase.Builder.() -> Unit): WebhooksPreviousMarketplacePurchase = WebhooksPreviousMarketplacePurchase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksPreviousMarketplacePurchase is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhooksPreviousMarketplacePurchase property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
