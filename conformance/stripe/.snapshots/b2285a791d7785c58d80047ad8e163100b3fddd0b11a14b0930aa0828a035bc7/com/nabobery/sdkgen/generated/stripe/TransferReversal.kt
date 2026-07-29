package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
public data class TransferReversalView internal constructor(
  public val amount: Int,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineTransferReversalBalanceTransactionX1338043b? = null,
  public val created: Int,
  public val currency: String,
  @SerialName("destination_payment_refund")
  public val destinationPaymentRefund:
      InlineTransferReversalDestinationPaymentRefundX06158f84? = null,
  public val id: String,
  public val metadata: Map<String, String>? = null,
  @SerialName("object")
  public val objectValue: InlineTransferReversalObjectValueX4b5dfdb6,
  @SerialName("source_refund")
  public val sourceRefund: InlineTransferReversalSourceRefundXf3d2c1b8? = null,
  public val transfer: InlineTransferReversalTransferX62772372,
)

/**
 * [Stripe Connect](https://docs.stripe.com/connect) platforms can reverse transfers made to a
 * connected account, either entirely or partially, and can also specify whether
 * to refund any related application fees. Transfer reversals add to the
 * platform's balance and subtract from the destination account's balance.
 *
 * Reversing a transfer that was made for a [destination
 * charge](/docs/connect/destination-charges) is allowed only up to the amount of
 * the charge. It is possible to reverse a
 * [transfer_group](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options)
 * transfer only if the destination account has enough balance to cover the
 * reversal.
 *
 * Related guide: [Reverse transfers](https://docs.stripe.com/connect/separate-charges-and-transfers#reverse-transfers)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal
 */
@Serializable(with = TransferReversal.Serializer::class)
public class TransferReversal(
  /**
   * Amount, in cents (or local equivalent).
   */
  public val amount: Int,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTransferReversalObjectValueX4b5dfdb6,
  /**
   * ID of the transfer that was reversed.
   */
  public val transfer: InlineTransferReversalTransferX62772372,
  /**
   * Balance transaction that describes the impact on your account balance.
   */
  public val balanceTransaction: InlineTransferReversalBalanceTransactionX1338043b? = null,
  /**
   * Linked payment refund for the transfer reversal.
   */
  public val destinationPaymentRefund:
      InlineTransferReversalDestinationPaymentRefundX06158f84? = null,
  metadata: Map<String, String>? = null,
  /**
   * ID of the refund responsible for the transfer reversal.
   */
  public val sourceRefund: InlineTransferReversalSourceRefundXf3d2c1b8? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineTransferReversalObjectValueX4b5dfdb6? = null

    public var objectValue: InlineTransferReversalObjectValueX4b5dfdb6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var transferValue: InlineTransferReversalTransferX62772372? = null

    public var transfer: InlineTransferReversalTransferX62772372
      get() = requireNotNull(transferValue) { "transfer is required" }
      set(`value`) {
        transferValue = value
      }

    /**
     * Balance transaction that describes the impact on your account balance.
     */
    public var balanceTransaction: InlineTransferReversalBalanceTransactionX1338043b? = null

    /**
     * Linked payment refund for the transfer reversal.
     */
    public var destinationPaymentRefund: InlineTransferReversalDestinationPaymentRefundX06158f84? =
        null

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
     * ID of the refund responsible for the transfer reversal.
     */
    public var sourceRefund: InlineTransferReversalSourceRefundXf3d2c1b8? = null

    public fun build(): TransferReversal {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(transferValue != null) { "transfer is required" }
      return TransferReversal(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        objectValue = objectValue,
        transfer = transfer,
        balanceTransaction = balanceTransaction,
        destinationPaymentRefund = destinationPaymentRefund,
        metadata = metadata,
        sourceRefund = sourceRefund,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TransferReversal = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TransferReversal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TransferReversal {
      val jsonDecoder = decoder.requireJsonDecoder("TransferReversal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TransferReversal must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineTransferReversalObjectValueX4b5dfdb6>(rawObject, "object")
      val transfer = json.decodeRequired<InlineTransferReversalTransferX62772372>(rawObject, "transfer")
      return TransferReversal(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        objectValue = objectValue,
        transfer = transfer,
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferReversalBalanceTransactionX1338043b?>(element) },
        destinationPaymentRefund = rawObject["destination_payment_refund"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferReversalDestinationPaymentRefundX06158f84?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        sourceRefund = rawObject["source_refund"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferReversalSourceRefundXf3d2c1b8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TransferReversal) {
      val jsonEncoder = encoder.requireJsonEncoder("TransferReversal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("transfer", json.encodeToJsonElement(value.transfer))
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.destinationPaymentRefund?.let { put("destination_payment_refund", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.sourceRefund?.let { put("source_refund", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun transferReversal(block: TransferReversal.Builder.() -> Unit): TransferReversal = TransferReversal.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TransferReversal is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
