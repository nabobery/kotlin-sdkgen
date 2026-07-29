package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase
 */
@Serializable(with = InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1.Serializer::class)
public class InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 internal constructor(
  public val account: InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633AccountX31cf6743,
  public val billingCycle: String,
  public val freeTrialEndsOn: String?,
  public val onFreeTrial: Boolean?,
  public val plan: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402,
  public val unitCount: Int,
  private val nextBillingDateState: FieldState<String?>,
) {
  public val nextBillingDate: String?
    get() = nextBillingDateState.valueOrNull()

  public constructor(
    account: InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633AccountX31cf6743,
    billingCycle: String,
    freeTrialEndsOn: String?,
    onFreeTrial: Boolean?,
    plan: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402,
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
    private var accountValue:
        InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633AccountX31cf6743? = null

    public var account: InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633AccountX31cf6743
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

    private var planValue:
        InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402? = null

    public var plan: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402
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

    private var freeTrialEndsOnState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var freeTrialEndsOn: String?
      get() = freeTrialEndsOnState.valueOrNull()
      set(`value`) {
        freeTrialEndsOnState = value.toNullableFieldState()
      }

    private var onFreeTrialState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var onFreeTrial: Boolean?
      get() = onFreeTrialState.valueOrNull()
      set(`value`) {
        onFreeTrialState = value.toNullableFieldState()
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

    public fun build(): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 {
      check(accountValue != null) { "account is required" }
      check(billingCycleValue != null) { "billingCycle is required" }
      check(planValue != null) { "plan is required" }
      check(unitCountValue != null) { "unitCount is required" }
      check(freeTrialEndsOnState !== FieldState.Absent) { "freeTrialEndsOn is required, even when null" }
      check(onFreeTrialState !== FieldState.Absent) { "onFreeTrial is required, even when null" }
      return InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOnState.valueOrNull(),
        onFreeTrial = onFreeTrialState.valueOrNull(),
        plan = plan,
        unitCount = unitCount,
        nextBillingDateState = nextBillingDateState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 must be a JSON object")
      val account = json.decodeRequired<InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633AccountX31cf6743>(rawObject, "account")
      val billingCycle = json.decodeRequired<String>(rawObject, "billing_cycle")
      val plan = json.decodeRequired<InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402>(rawObject, "plan")
      val unitCount = json.decodeRequired<Int>(rawObject, "unit_count")
      if (!rawObject.containsKey("free_trial_ends_on")) {
        throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 is missing required property 'free_trial_ends_on'")
      }
      val freeTrialEndsOn = rawObject["free_trial_ends_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("on_free_trial")) {
        throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 is missing required property 'on_free_trial'")
      }
      val onFreeTrial = rawObject["on_free_trial"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      return InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOn,
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
        nextBillingDateState = json.decodeOptional(rawObject, "next_billing_date", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("billing_cycle", value.billingCycle)
        put("free_trial_ends_on", value.freeTrialEndsOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("on_free_trial", value.onFreeTrial?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("plan", json.encodeToJsonElement(value.plan))
        put("unit_count", json.encodeToJsonElement(value.unitCount))
        putState("next_billing_date", value.nextBillingDateState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1(block: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1.Builder.() -> Unit): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 = InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1 property '" + name + "' is not nullable")
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
