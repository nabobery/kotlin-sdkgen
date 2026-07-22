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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/previous_mark
 * etplace_purchase.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/previous_mark
 * etplace_purchase
 */
@Serializable(with = InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787.Serializer::class)
public class InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 internal constructor(
  public val account: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633AccountX29a7a97f,
  public val billingCycle: String,
  public val freeTrialEndsOn: String?,
  public val onFreeTrial: Boolean,
  public val plan: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanX94063f36,
  public val unitCount: Int,
  private val nextBillingDateState: FieldState<String?>,
) {
  public val nextBillingDate: String?
    get() = nextBillingDateState.valueOrNull()

  public constructor(
    account: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633AccountX29a7a97f,
    billingCycle: String,
    freeTrialEndsOn: String?,
    onFreeTrial: Boolean,
    plan: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanX94063f36,
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
        InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633AccountX29a7a97f? = null

    public var account: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633AccountX29a7a97f
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

    private var planValue: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanX94063f36? =
        null

    public var plan: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanX94063f36
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

    public fun build(): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 {
      check(accountValue != null) { "account is required" }
      check(billingCycleValue != null) { "billingCycle is required" }
      check(onFreeTrialValue != null) { "onFreeTrial is required" }
      check(planValue != null) { "plan is required" }
      check(unitCountValue != null) { "unitCount is required" }
      check(freeTrialEndsOnState !== FieldState.Absent) { "freeTrialEndsOn is required, even when null" }
      return InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 must be a JSON object")
      val account = json.decodeRequired<InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633AccountX29a7a97f>(rawObject, "account")
      val billingCycle = json.decodeRequired<String>(rawObject, "billing_cycle")
      val onFreeTrial = json.decodeRequired<Boolean>(rawObject, "on_free_trial")
      val plan = json.decodeRequired<InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanX94063f36>(rawObject, "plan")
      val unitCount = json.decodeRequired<Int>(rawObject, "unit_count")
      if (!rawObject.containsKey("free_trial_ends_on")) {
        throw SerializationException("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 is missing required property 'free_trial_ends_on'")
      }
      val freeTrialEndsOn = rawObject["free_trial_ends_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOn,
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
        nextBillingDateState = json.decodeOptional(rawObject, "next_billing_date", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787")
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

public fun inlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787(block: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787.Builder.() -> Unit): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 = InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633Xf336e787 property '" + name + "' is not nullable")
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
