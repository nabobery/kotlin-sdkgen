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
 * User Marketplace Purchase
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/user-marketplace-purchase
 */
@Serializable(with = UserMarketplacePurchase.Serializer::class)
public class UserMarketplacePurchase(
  public val account: MarketplaceAccount,
  public val billingCycle: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val freeTrialEndsOn: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val nextBillingDate: String?,
  public val onFreeTrial: Boolean,
  public val plan: MarketplaceListingPlan,
  public val unitCount: Int?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
) {
  public class Builder {
    private var accountValue: MarketplaceAccount? = null

    public var account: MarketplaceAccount
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

    private var planValue: MarketplaceListingPlan? = null

    public var plan: MarketplaceListingPlan
      get() = requireNotNull(planValue) { "plan is required" }
      set(`value`) {
        planValue = value
      }

    private var freeTrialEndsOnState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var freeTrialEndsOn: String?
      get() = freeTrialEndsOnState.valueOrNull()
      set(`value`) {
        freeTrialEndsOnState = value.toNullableFieldState()
      }

    private var nextBillingDateState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var nextBillingDate: String?
      get() = nextBillingDateState.valueOrNull()
      set(`value`) {
        nextBillingDateState = value.toNullableFieldState()
      }

    private var unitCountState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var unitCount: Int?
      get() = unitCountState.valueOrNull()
      set(`value`) {
        unitCountState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    public fun build(): UserMarketplacePurchase {
      check(accountValue != null) { "account is required" }
      check(billingCycleValue != null) { "billingCycle is required" }
      check(onFreeTrialValue != null) { "onFreeTrial is required" }
      check(planValue != null) { "plan is required" }
      check(freeTrialEndsOnState !== FieldState.Absent) { "freeTrialEndsOn is required, even when null" }
      check(nextBillingDateState !== FieldState.Absent) { "nextBillingDate is required, even when null" }
      check(unitCountState !== FieldState.Absent) { "unitCount is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return UserMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOnState.valueOrNull(),
        nextBillingDate = nextBillingDateState.valueOrNull(),
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCountState.valueOrNull(),
        updatedAt = updatedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UserMarketplacePurchase = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<UserMarketplacePurchase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UserMarketplacePurchase {
      val jsonDecoder = decoder.requireJsonDecoder("UserMarketplacePurchase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UserMarketplacePurchase must be a JSON object")
      val account = json.decodeRequired<MarketplaceAccount>(rawObject, "account")
      val billingCycle = json.decodeRequired<String>(rawObject, "billing_cycle")
      val onFreeTrial = json.decodeRequired<Boolean>(rawObject, "on_free_trial")
      val plan = json.decodeRequired<MarketplaceListingPlan>(rawObject, "plan")
      if (!rawObject.containsKey("free_trial_ends_on")) {
        throw SerializationException("UserMarketplacePurchase is missing required property 'free_trial_ends_on'")
      }
      val freeTrialEndsOn = rawObject["free_trial_ends_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("next_billing_date")) {
        throw SerializationException("UserMarketplacePurchase is missing required property 'next_billing_date'")
      }
      val nextBillingDate = rawObject["next_billing_date"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("unit_count")) {
        throw SerializationException("UserMarketplacePurchase is missing required property 'unit_count'")
      }
      val unitCount = rawObject["unit_count"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("UserMarketplacePurchase is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return UserMarketplacePurchase(
        account = account,
        billingCycle = billingCycle,
        freeTrialEndsOn = freeTrialEndsOn,
        nextBillingDate = nextBillingDate,
        onFreeTrial = onFreeTrial,
        plan = plan,
        unitCount = unitCount,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UserMarketplacePurchase) {
      val jsonEncoder = encoder.requireJsonEncoder("UserMarketplacePurchase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("billing_cycle", value.billingCycle)
        put("free_trial_ends_on", value.freeTrialEndsOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("next_billing_date", value.nextBillingDate?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("on_free_trial", json.encodeToJsonElement(value.onFreeTrial))
        put("plan", json.encodeToJsonElement(value.plan))
        put("unit_count", value.unitCount?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun userMarketplacePurchase(block: UserMarketplacePurchase.Builder.() -> Unit): UserMarketplacePurchase = UserMarketplacePurchase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UserMarketplacePurchase is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("UserMarketplacePurchase property '" + name + "' is not nullable")
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
