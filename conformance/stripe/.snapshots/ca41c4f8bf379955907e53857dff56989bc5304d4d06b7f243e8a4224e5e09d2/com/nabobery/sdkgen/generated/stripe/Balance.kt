package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * This is an object representing your Stripe balance. You can retrieve it to see
 * the balance currently on your Stripe account.
 *
 * The top-level `available` and `pending` comprise your "payments balance."
 *
 * Related guide: [Balances and settlement time](https://docs.stripe.com/payments/balances), [Understanding Connect
 * account balances](https://docs.stripe.com/connect/account-balances)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance
 */
@Serializable(with = Balance.Serializer::class)
public class Balance(
  available: List<BalanceAmount>,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineBalanceObjectValueXf4726c4f,
  pending: List<BalanceAmount>,
  connectReserved: List<BalanceAmount>? = null,
  instantAvailable: List<BalanceAmountNet>? = null,
  public val issuing: BalanceDetail? = null,
  public val refundAndDisputePrefunding: BalanceDetailUngated? = null,
) {
  /**
   * Available funds that you can transfer or pay out automatically by Stripe or explicitly through the [Transfers
   * API](https://api.stripe.com#transfers) or [Payouts API](https://api.stripe.com#payouts). You can find the available
   * balance for each currency and payment type in the `source_types` property.
   */
  public val available: List<BalanceAmount> = available.toList()

  /**
   * Funds that aren't available in the balance yet. You can find the pending balance for each currency and each payment
   * type in the `source_types` property.
   */
  public val pending: List<BalanceAmount> = pending.toList()

  /**
   * Funds held due to negative balances on connected accounts where
   * [account.controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection)
   * is `application`, which includes Custom accounts. You can find the connect reserve balance for each currency and
   * payment type in the `source_types` property.
   */
  public val connectReserved: List<BalanceAmount>? =
      connectReserved?.let { collection0 -> collection0.toList() }

  /**
   * Funds that you can pay out using Instant Payouts.
   */
  public val instantAvailable: List<BalanceAmountNet>? =
      instantAvailable?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var availableValue: List<BalanceAmount>? = null

    public var available: List<BalanceAmount>
      get() = requireNotNull(availableValue) { "available is required" }.toList()
      set(`value`) {
        availableValue = value.toList()
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineBalanceObjectValueXf4726c4f? = null

    public var objectValue: InlineBalanceObjectValueXf4726c4f
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var pendingValue: List<BalanceAmount>? = null

    public var pending: List<BalanceAmount>
      get() = requireNotNull(pendingValue) { "pending is required" }.toList()
      set(`value`) {
        pendingValue = value.toList()
      }

    private var connectReservedValue: List<BalanceAmount>? = null

    /**
     * Funds held due to negative balances on connected accounts where
     * [account.controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection
     * ) is `application`, which includes Custom accounts. You can find the connect reserve balance for each currency
     * and payment type in the `source_types` property.
     */
    public var connectReserved: List<BalanceAmount>?
      get() = connectReservedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        connectReservedValue = value?.let { collection0 -> collection0.toList() }
      }

    private var instantAvailableValue: List<BalanceAmountNet>? = null

    /**
     * Funds that you can pay out using Instant Payouts.
     */
    public var instantAvailable: List<BalanceAmountNet>?
      get() = instantAvailableValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        instantAvailableValue = value?.let { collection0 -> collection0.toList() }
      }

    public var issuing: BalanceDetail? = null

    public var refundAndDisputePrefunding: BalanceDetailUngated? = null

    public fun build(): Balance {
      check(availableValue != null) { "available is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(pendingValue != null) { "pending is required" }
      return Balance(
        available = available,
        livemode = livemode,
        objectValue = objectValue,
        pending = pending,
        connectReserved = connectReserved,
        instantAvailable = instantAvailable,
        issuing = issuing,
        refundAndDisputePrefunding = refundAndDisputePrefunding,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Balance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Balance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Balance {
      val jsonDecoder = decoder.requireJsonDecoder("Balance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Balance must be a JSON object")
      val available = json.decodeRequired<List<BalanceAmount>>(rawObject, "available")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineBalanceObjectValueXf4726c4f>(rawObject, "object")
      val pending = json.decodeRequired<List<BalanceAmount>>(rawObject, "pending")
      return Balance(
        available = available,
        livemode = livemode,
        objectValue = objectValue,
        pending = pending,
        connectReserved = rawObject["connect_reserved"]?.let { json.decodeFromJsonElement<List<BalanceAmount>>(it) },
        instantAvailable = rawObject["instant_available"]?.let { json.decodeFromJsonElement<List<BalanceAmountNet>>(it) },
        issuing = rawObject["issuing"]?.let { json.decodeFromJsonElement<BalanceDetail>(it) },
        refundAndDisputePrefunding = rawObject["refund_and_dispute_prefunding"]?.let { json.decodeFromJsonElement<BalanceDetailUngated>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Balance) {
      val jsonEncoder = encoder.requireJsonEncoder("Balance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("pending", json.encodeToJsonElement(value.pending))
        value.connectReserved?.let { put("connect_reserved", json.encodeToJsonElement(it)) }
        value.instantAvailable?.let { put("instant_available", json.encodeToJsonElement(it)) }
        value.issuing?.let { put("issuing", json.encodeToJsonElement(it)) }
        value.refundAndDisputePrefunding?.let { put("refund_and_dispute_prefunding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balance(block: Balance.Builder.() -> Unit): Balance = Balance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Balance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
