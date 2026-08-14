package io.github.nabobery.sdkgen.generated.stripe

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
public data class IssuingTransactionView internal constructor(
  public val amount: Int,
  @SerialName("amount_details")
  public val amountDetails: InlineIssuingTransactionAmountDetailsX1f1f12ca? = null,
  public val authorization: InlineIssuingTransactionAuthorizationX61b3c552? = null,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineIssuingTransactionBalanceTransactionX8a6bb6b9? = null,
  public val card: InlineIssuingTransactionCardXb7a677c1,
  public val cardholder: InlineIssuingTransactionCardholderX282f1566? = null,
  public val created: Int,
  public val currency: String,
  public val dispute: InlineIssuingTransactionDisputeXddd279da? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("merchant_amount")
  public val merchantAmount: Int,
  @SerialName("merchant_currency")
  public val merchantCurrency: String,
  @SerialName("merchant_data")
  public val merchantData: IssuingAuthorizationMerchantData,
  public val metadata: Map<String, String>,
  @SerialName("network_data")
  public val networkData: InlineIssuingTransactionNetworkDataXb43544fa? = null,
  @SerialName("object")
  public val objectValue: InlineIssuingTransactionObjectValueX865231d6,
  @SerialName("purchase_details")
  public val purchaseDetails: InlineIssuingTransactionPurchaseDetailsXd6983dca? = null,
  public val token: InlineIssuingTransactionTokenX8b0d36f2? = null,
  public val treasury: InlineIssuingTransactionTreasuryX3d6b5c21? = null,
  public val type: InlineIssuingTransactionTypeX08595f91,
  public val wallet: InlineIssuingTransactionWalletXecbc9014? = null,
)

/**
 * Any use of an [issued card](https://docs.stripe.com/issuing) that results in funds entering or leaving
 * your Stripe account, such as a completed purchase or refund, is represented by an Issuing
 * `Transaction` object.
 *
 * Related guide: [Issued card transactions](https://docs.stripe.com/issuing/purchases/transactions)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction
 */
@Serializable(with = IssuingTransaction.Serializer::class)
public class IssuingTransaction(
  /**
   * The transaction amount, which will be reflected in your balance. This amount is in your currency and in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int,
  /**
   * The card used to make this transaction.
   */
  public val card: InlineIssuingTransactionCardXb7a677c1,
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
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The amount that the merchant will receive, denominated in `merchant_currency` and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). It will be different from `amount` if the merchant is
   * taking payment in a different currency.
   */
  public val merchantAmount: Int,
  /**
   * The currency with which the merchant is taking payment.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val merchantCurrency: String,
  public val merchantData: IssuingAuthorizationMerchantData,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineIssuingTransactionObjectValueX865231d6,
  /**
   * The nature of the transaction.
   */
  public val type: InlineIssuingTransactionTypeX08595f91,
  /**
   * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amountDetails: InlineIssuingTransactionAmountDetailsX1f1f12ca? = null,
  /**
   * The `Authorization` object that led to this transaction.
   */
  public val authorization: InlineIssuingTransactionAuthorizationX61b3c552? = null,
  /**
   * ID of the [balance transaction](https://docs.stripe.com/api/balance_transactions) associated with this transaction.
   */
  public val balanceTransaction: InlineIssuingTransactionBalanceTransactionX8a6bb6b9? = null,
  /**
   * The cardholder to whom this transaction belongs.
   */
  public val cardholder: InlineIssuingTransactionCardholderX282f1566? = null,
  /**
   * If you've disputed the transaction, the ID of the dispute.
   */
  public val dispute: InlineIssuingTransactionDisputeXddd279da? = null,
  /**
   * Details about the transaction, such as processing dates, set by the card network.
   */
  public val networkData: InlineIssuingTransactionNetworkDataXb43544fa? = null,
  /**
   * Additional purchase information that is optionally provided by the merchant.
   */
  public val purchaseDetails: InlineIssuingTransactionPurchaseDetailsXd6983dca? = null,
  /**
   * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this transaction. If a network token was
   * not used for this transaction, this field will be null.
   */
  public val token: InlineIssuingTransactionTokenX8b0d36f2? = null,
  /**
   * [Treasury](https://docs.stripe.com/api/treasury) details related to this transaction if it was created on a
   * [FinancialAccount](/docs/api/treasury/financial_accounts
   */
  public val treasury: InlineIssuingTransactionTreasuryX3d6b5c21? = null,
  /**
   * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`.
   */
  public val wallet: InlineIssuingTransactionWalletXecbc9014? = null,
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

    private var cardValue: InlineIssuingTransactionCardXb7a677c1? = null

    public var card: InlineIssuingTransactionCardXb7a677c1
      get() = requireNotNull(cardValue) { "card is required" }
      set(`value`) {
        cardValue = value
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

    private var merchantAmountValue: Int? = null

    public var merchantAmount: Int
      get() = requireNotNull(merchantAmountValue) { "merchantAmount is required" }
      set(`value`) {
        merchantAmountValue = value
      }

    private var merchantCurrencyValue: String? = null

    public var merchantCurrency: String
      get() = requireNotNull(merchantCurrencyValue) { "merchantCurrency is required" }
      set(`value`) {
        merchantCurrencyValue = value
      }

    private var merchantDataValue: IssuingAuthorizationMerchantData? = null

    public var merchantData: IssuingAuthorizationMerchantData
      get() = requireNotNull(merchantDataValue) { "merchantData is required" }
      set(`value`) {
        merchantDataValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineIssuingTransactionObjectValueX865231d6? = null

    public var objectValue: InlineIssuingTransactionObjectValueX865231d6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlineIssuingTransactionTypeX08595f91? = null

    public var type: InlineIssuingTransactionTypeX08595f91
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest
     * currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var amountDetails: InlineIssuingTransactionAmountDetailsX1f1f12ca? = null

    /**
     * The `Authorization` object that led to this transaction.
     */
    public var authorization: InlineIssuingTransactionAuthorizationX61b3c552? = null

    /**
     * ID of the [balance transaction](https://docs.stripe.com/api/balance_transactions) associated with this
     * transaction.
     */
    public var balanceTransaction: InlineIssuingTransactionBalanceTransactionX8a6bb6b9? = null

    /**
     * The cardholder to whom this transaction belongs.
     */
    public var cardholder: InlineIssuingTransactionCardholderX282f1566? = null

    /**
     * If you've disputed the transaction, the ID of the dispute.
     */
    public var dispute: InlineIssuingTransactionDisputeXddd279da? = null

    /**
     * Details about the transaction, such as processing dates, set by the card network.
     */
    public var networkData: InlineIssuingTransactionNetworkDataXb43544fa? = null

    /**
     * Additional purchase information that is optionally provided by the merchant.
     */
    public var purchaseDetails: InlineIssuingTransactionPurchaseDetailsXd6983dca? = null

    /**
     * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this transaction. If a network token
     * was not used for this transaction, this field will be null.
     */
    public var token: InlineIssuingTransactionTokenX8b0d36f2? = null

    /**
     * [Treasury](https://docs.stripe.com/api/treasury) details related to this transaction if it was created on a
     * [FinancialAccount](/docs/api/treasury/financial_accounts
     */
    public var treasury: InlineIssuingTransactionTreasuryX3d6b5c21? = null

    /**
     * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`.
     */
    public var wallet: InlineIssuingTransactionWalletXecbc9014? = null

    public fun build(): IssuingTransaction {
      check(amountValue != null) { "amount is required" }
      check(cardValue != null) { "card is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(merchantAmountValue != null) { "merchantAmount is required" }
      check(merchantCurrencyValue != null) { "merchantCurrency is required" }
      check(merchantDataValue != null) { "merchantData is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      return IssuingTransaction(
        amount = amount,
        card = card,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        merchantData = merchantData,
        metadata = metadata,
        objectValue = objectValue,
        type = type,
        amountDetails = amountDetails,
        authorization = authorization,
        balanceTransaction = balanceTransaction,
        cardholder = cardholder,
        dispute = dispute,
        networkData = networkData,
        purchaseDetails = purchaseDetails,
        token = token,
        treasury = treasury,
        wallet = wallet,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransaction must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val card = json.decodeRequired<InlineIssuingTransactionCardXb7a677c1>(rawObject, "card")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val merchantAmount = json.decodeRequired<Int>(rawObject, "merchant_amount")
      val merchantCurrency = json.decodeRequired<String>(rawObject, "merchant_currency")
      val merchantData = json.decodeRequired<IssuingAuthorizationMerchantData>(rawObject, "merchant_data")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineIssuingTransactionObjectValueX865231d6>(rawObject, "object")
      val type = json.decodeRequired<InlineIssuingTransactionTypeX08595f91>(rawObject, "type")
      return IssuingTransaction(
        amount = amount,
        card = card,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        merchantData = merchantData,
        metadata = metadata,
        objectValue = objectValue,
        type = type,
        amountDetails = rawObject["amount_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionAmountDetailsX1f1f12ca?>(element) },
        authorization = rawObject["authorization"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionAuthorizationX61b3c552?>(element) },
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionBalanceTransactionX8a6bb6b9?>(element) },
        cardholder = rawObject["cardholder"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionCardholderX282f1566?>(element) },
        dispute = rawObject["dispute"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionDisputeXddd279da?>(element) },
        networkData = rawObject["network_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionNetworkDataXb43544fa?>(element) },
        purchaseDetails = rawObject["purchase_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionPurchaseDetailsXd6983dca?>(element) },
        token = rawObject["token"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionTokenX8b0d36f2?>(element) },
        treasury = rawObject["treasury"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionTreasuryX3d6b5c21?>(element) },
        wallet = rawObject["wallet"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionWalletXecbc9014?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("card", json.encodeToJsonElement(value.card))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("merchant_amount", json.encodeToJsonElement(value.merchantAmount))
        put("merchant_currency", value.merchantCurrency)
        put("merchant_data", json.encodeToJsonElement(value.merchantData))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.authorization?.let { put("authorization", json.encodeToJsonElement(it)) }
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.cardholder?.let { put("cardholder", json.encodeToJsonElement(it)) }
        value.dispute?.let { put("dispute", json.encodeToJsonElement(it)) }
        value.networkData?.let { put("network_data", json.encodeToJsonElement(it)) }
        value.purchaseDetails?.let { put("purchase_details", json.encodeToJsonElement(it)) }
        value.token?.let { put("token", json.encodeToJsonElement(it)) }
        value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
        value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransaction(block: IssuingTransaction.Builder.() -> Unit): IssuingTransaction = IssuingTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
