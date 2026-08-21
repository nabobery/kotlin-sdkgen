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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase
 */
@Serializable(with = WebhooksMarketplacePurchase.Serializer::class)
public class WebhooksMarketplacePurchase(
  public val account: InlineWebhooksMarketplacePurchaseAccountXc473c48f,
  public val billingCycle: String,
  public val freeTrialEndsOn: String?,
  public val nextBillingDate: String?,
  public val onFreeTrial: Boolean,
  public val plan: InlineWebhooksMarketplacePurchasePlanX94dbce69,
  public val unitCount: Int,
) {
  public class Builder {
    private var accountValue: InlineWebhooksMarketplacePurchaseAccountXc473c48f? = null

    public var account: InlineWebhooksMarketplacePurchaseAccountXc473c48f
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

    private var planValue: InlineWebhooksMarketplacePurchasePlanX94dbce69? = null

    public var plan: InlineWebhooksMarketplacePurchasePlanX94dbce69
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
     * Required nullable field; assigning `null` records present-null.
     */
    public var nextBillingDate: String?
      get() = nextBillingDateState.valueOrNull()
      set(`value`) {
        nextBillingDateState = value.toNullableFieldState()
      }

    public fun build(): WebhooksMarketplacePurchase {
      check(accountValue != null) { "account is required" }
      check(billingCycleValue != null) { "billingCycle is required" }
      check(onFreeTrialValue != null) { "onFreeTrial is required" }
      check(planValue != null) { "plan is required" }
      check(unitCountValue != null) { "unitCount is required" }
      check(freeTrialEndsOnState !== FieldState.Absent) { "freeTrialEndsOn is required, even when null" }
      check(nextBillingDateState !== FieldState.Absent) { "nextBillingDate is required, even when null" }
      return WebhooksMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOnState.valueOrNull(),
        nextBillingDate = nextBillingDateState.valueOrNull(),
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksMarketplacePurchase = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksMarketplacePurchase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksMarketplacePurchase {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksMarketplacePurchase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksMarketplacePurchase must be a JSON object")
      val account = json.decodeRequired<InlineWebhooksMarketplacePurchaseAccountXc473c48f>(rawObject, "account")
      val billingCycle = json.decodeRequired<String>(rawObject, "billing_cycle")
      val onFreeTrial = json.decodeRequired<Boolean>(rawObject, "on_free_trial")
      val plan = json.decodeRequired<InlineWebhooksMarketplacePurchasePlanX94dbce69>(rawObject, "plan")
      val unitCount = json.decodeRequired<Int>(rawObject, "unit_count")
      if (!rawObject.containsKey("free_trial_ends_on")) {
        throw SerializationException("WebhooksMarketplacePurchase is missing required property 'free_trial_ends_on'")
      }
      val freeTrialEndsOn = rawObject["free_trial_ends_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("next_billing_date")) {
        throw SerializationException("WebhooksMarketplacePurchase is missing required property 'next_billing_date'")
      }
      val nextBillingDate = rawObject["next_billing_date"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return WebhooksMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOn,
        nextBillingDate = nextBillingDate,
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksMarketplacePurchase) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksMarketplacePurchase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("billing_cycle", value.billingCycle)
        put("free_trial_ends_on", value.freeTrialEndsOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("next_billing_date", value.nextBillingDate?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("on_free_trial", json.encodeToJsonElement(value.onFreeTrial))
        put("plan", json.encodeToJsonElement(value.plan))
        put("unit_count", json.encodeToJsonElement(value.unitCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksMarketplacePurchase(block: WebhooksMarketplacePurchase.Builder.() -> Unit): WebhooksMarketplacePurchase = WebhooksMarketplacePurchase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksMarketplacePurchase is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksMarketplacePurchase property '" + name + "' is not nullable")
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
