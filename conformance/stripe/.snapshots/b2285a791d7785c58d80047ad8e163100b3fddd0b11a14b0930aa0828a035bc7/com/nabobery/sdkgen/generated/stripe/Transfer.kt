package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
public data class TransferView internal constructor(
  public val amount: Int,
  @SerialName("amount_reversed")
  public val amountReversed: Int,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineTransferBalanceTransactionX0d42b38e? = null,
  public val created: Int,
  public val currency: String,
  public val description: String? = null,
  public val destination: InlineTransferDestinationX606a81c1? = null,
  @SerialName("destination_payment")
  public val destinationPayment: InlineTransferDestinationPaymentX1562c10c? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  @SerialName("object")
  public val objectValue: InlineTransferObjectValueX7e0e795d,
  public val reversals: InlineTransferReversalsX26c635da,
  public val reversed: Boolean,
  @SerialName("source_transaction")
  public val sourceTransaction: InlineTransferSourceTransactionX7175398c? = null,
  @SerialName("source_type")
  public val sourceType: String? = null,
  @SerialName("transfer_group")
  public val transferGroup: String? = null,
)

/**
 * A `Transfer` object is created when you move funds between Stripe accounts as
 * part of Connect.
 *
 * Before April 6, 2017, transfers also represented movement of funds from a
 * Stripe account to a card or bank account. This behavior has since been split
 * out into a [Payout](https://api.stripe.com#payout_object) object, with corresponding payout endpoints. For more
 * information, read about the
 * [transfer/payout split](https://docs.stripe.com/transfer-payout-split).
 *
 * Related guide: [Creating separate charges and
 * transfers](https://docs.stripe.com/connect/separate-charges-and-transfers)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer
 */
@Serializable(with = Transfer.Serializer::class)
public class Transfer(
  /**
   * Amount in cents (or local equivalent) to be transferred.
   */
  public val amount: Int,
  /**
   * Amount in cents (or local equivalent) reversed (can be less than the amount attribute on the transfer if a partial
   * reversal was issued).
   */
  public val amountReversed: Int,
  /**
   * Time that this record of the transfer was first created.
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
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTransferObjectValueX7e0e795d,
  /**
   * A list of reversals that have been applied to the transfer.
   */
  public val reversals: InlineTransferReversalsX26c635da,
  /**
   * Whether the transfer has been fully reversed. If the transfer is only partially reversed, this attribute will still
   * be false.
   */
  public val reversed: Boolean,
  /**
   * Balance transaction that describes the impact of this transfer on your account balance.
   */
  public val balanceTransaction: InlineTransferBalanceTransactionX0d42b38e? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * ID of the Stripe account the transfer was sent to.
   */
  public val destination: InlineTransferDestinationX606a81c1? = null,
  /**
   * If the destination is a Stripe account, this will be the ID of the payment that the destination account received
   * for the transfer.
   */
  public val destinationPayment: InlineTransferDestinationPaymentX1562c10c? = null,
  /**
   * ID of the charge that was used to fund the transfer. If null, the transfer was funded from the available balance.
   */
  public val sourceTransaction: InlineTransferSourceTransactionX7175398c? = null,
  /**
   * The source balance this transfer came from. One of `card`, `fpx`, or `bank_account`.
   */
  public val sourceType: String? = null,
  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountReversedValue: Int? = null

    public var amountReversed: Int
      get() = requireNotNull(amountReversedValue) { "amountReversed is required" }
      set(`value`) {
        amountReversedValue = value
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

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineTransferObjectValueX7e0e795d? = null

    public var objectValue: InlineTransferObjectValueX7e0e795d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var reversalsValue: InlineTransferReversalsX26c635da? = null

    public var reversals: InlineTransferReversalsX26c635da
      get() = requireNotNull(reversalsValue) { "reversals is required" }
      set(`value`) {
        reversalsValue = value
      }

    private var reversedValue: Boolean? = null

    public var reversed: Boolean
      get() = requireNotNull(reversedValue) { "reversed is required" }
      set(`value`) {
        reversedValue = value
      }

    /**
     * Balance transaction that describes the impact of this transfer on your account balance.
     */
    public var balanceTransaction: InlineTransferBalanceTransactionX0d42b38e? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * ID of the Stripe account the transfer was sent to.
     */
    public var destination: InlineTransferDestinationX606a81c1? = null

    /**
     * If the destination is a Stripe account, this will be the ID of the payment that the destination account received
     * for the transfer.
     */
    public var destinationPayment: InlineTransferDestinationPaymentX1562c10c? = null

    /**
     * ID of the charge that was used to fund the transfer. If null, the transfer was funded from the available balance.
     */
    public var sourceTransaction: InlineTransferSourceTransactionX7175398c? = null

    /**
     * The source balance this transfer came from. One of `card`, `fpx`, or `bank_account`.
     */
    public var sourceType: String? = null

    /**
     * A string that identifies this transaction as part of a group. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
     */
    public var transferGroup: String? = null

    public fun build(): Transfer {
      check(amountValue != null) { "amount is required" }
      check(amountReversedValue != null) { "amountReversed is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(reversalsValue != null) { "reversals is required" }
      check(reversedValue != null) { "reversed is required" }
      return Transfer(
        amount = amount,
        amountReversed = amountReversed,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        reversals = reversals,
        reversed = reversed,
        balanceTransaction = balanceTransaction,
        description = description,
        destination = destination,
        destinationPayment = destinationPayment,
        sourceTransaction = sourceTransaction,
        sourceType = sourceType,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Transfer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Transfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Transfer {
      val jsonDecoder = decoder.requireJsonDecoder("Transfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Transfer must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountReversed = json.decodeRequired<Int>(rawObject, "amount_reversed")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineTransferObjectValueX7e0e795d>(rawObject, "object")
      val reversals = json.decodeRequired<InlineTransferReversalsX26c635da>(rawObject, "reversals")
      val reversed = json.decodeRequired<Boolean>(rawObject, "reversed")
      return Transfer(
        amount = amount,
        amountReversed = amountReversed,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        reversals = reversals,
        reversed = reversed,
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferBalanceTransactionX0d42b38e?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        destination = rawObject["destination"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferDestinationX606a81c1?>(element) },
        destinationPayment = rawObject["destination_payment"]?.let { json.decodeFromJsonElement<InlineTransferDestinationPaymentX1562c10c>(it) },
        sourceTransaction = rawObject["source_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTransferSourceTransactionX7175398c?>(element) },
        sourceType = rawObject["source_type"]?.let { json.decodeFromJsonElement<String>(it) },
        transferGroup = rawObject["transfer_group"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Transfer) {
      val jsonEncoder = encoder.requireJsonEncoder("Transfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_reversed", json.encodeToJsonElement(value.amountReversed))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("reversals", json.encodeToJsonElement(value.reversals))
        put("reversed", json.encodeToJsonElement(value.reversed))
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.destination?.let { put("destination", json.encodeToJsonElement(it)) }
        value.destinationPayment?.let { put("destination_payment", json.encodeToJsonElement(it)) }
        value.sourceTransaction?.let { put("source_transaction", json.encodeToJsonElement(it)) }
        value.sourceType?.let { put("source_type", it) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun transfer(block: Transfer.Builder.() -> Unit): Transfer = Transfer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Transfer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
