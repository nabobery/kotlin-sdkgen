package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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

@Serializable
public data class ApplicationFeeView(
  public val account: InlineApplicationFeeAccountXa998faec,
  public val amount: Int,
  @SerialName("amount_refunded")
  public val amountRefunded: Int,
  public val application: InlineApplicationFeeApplicationX0c97ee83,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineApplicationFeeBalanceTransactionX1d204e15? = null,
  public val charge: InlineApplicationFeeChargeX40828a9c,
  public val created: Int,
  public val currency: String,
  @SerialName("fee_source")
  public val feeSource: InlineApplicationFeeFeeSourceX78740799? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineApplicationFeeObjectValueX5ef1b2f5,
  @SerialName("originating_transaction")
  public val originatingTransaction: InlineApplicationFeeOriginatingTransactionX9ab63b0d? = null,
  public val refunded: Boolean,
  public val refunds: InlineApplicationFeeRefundsX8c1c63b4,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee
 */
@Serializable(with = ApplicationFee.Serializer::class)
public class ApplicationFee(
  /**
   * ID of the Stripe account this fee was taken from.
   */
  public val account: InlineApplicationFeeAccountXa998faec,
  /**
   * Amount earned, in cents (or local equivalent).
   */
  public val amount: Int,
  /**
   * Amount in cents (or local equivalent) refunded (can be less than the amount attribute on the fee if a partial
   * refund was issued)
   */
  public val amountRefunded: Int,
  /**
   * ID of the Connect application that earned the fee.
   */
  public val application: InlineApplicationFeeApplicationX0c97ee83,
  /**
   * ID of the charge that the application fee was taken from.
   */
  public val charge: InlineApplicationFeeChargeX40828a9c,
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineApplicationFeeObjectValueX5ef1b2f5,
  /**
   * Whether the fee has been fully refunded. If the fee is only partially refunded, this attribute will still be false.
   */
  public val refunded: Boolean,
  /**
   * A list of refunds that have been applied to the fee.
   */
  public val refunds: InlineApplicationFeeRefundsX8c1c63b4,
  /**
   * Balance transaction that describes the impact of this collected application fee on your account balance (not
   * including refunds).
   */
  public val balanceTransaction: InlineApplicationFeeBalanceTransactionX1d204e15? = null,
  /**
   * Polymorphic source of the application fee. Includes the ID of the object the application fee was created from.
   */
  public val feeSource: InlineApplicationFeeFeeSourceX78740799? = null,
  /**
   * ID of the corresponding charge on the platform account, if this fee was the result of a charge using the
   * `destination` parameter.
   */
  public val originatingTransaction: InlineApplicationFeeOriginatingTransactionX9ab63b0d? = null,
) {
  public class Builder {
    private var accountValue: InlineApplicationFeeAccountXa998faec? = null

    public var account: InlineApplicationFeeAccountXa998faec
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountRefundedValue: Int? = null

    public var amountRefunded: Int
      get() = requireNotNull(amountRefundedValue) { "amountRefunded is required" }
      set(`value`) {
        amountRefundedValue = value
      }

    private var applicationValue: InlineApplicationFeeApplicationX0c97ee83? = null

    public var application: InlineApplicationFeeApplicationX0c97ee83
      get() = requireNotNull(applicationValue) { "application is required" }
      set(`value`) {
        applicationValue = value
      }

    private var chargeValue: InlineApplicationFeeChargeX40828a9c? = null

    public var charge: InlineApplicationFeeChargeX40828a9c
      get() = requireNotNull(chargeValue) { "charge is required" }
      set(`value`) {
        chargeValue = value
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

    private var objectValueValue: InlineApplicationFeeObjectValueX5ef1b2f5? = null

    public var objectValue: InlineApplicationFeeObjectValueX5ef1b2f5
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var refundedValue: Boolean? = null

    public var refunded: Boolean
      get() = requireNotNull(refundedValue) { "refunded is required" }
      set(`value`) {
        refundedValue = value
      }

    private var refundsValue: InlineApplicationFeeRefundsX8c1c63b4? = null

    public var refunds: InlineApplicationFeeRefundsX8c1c63b4
      get() = requireNotNull(refundsValue) { "refunds is required" }
      set(`value`) {
        refundsValue = value
      }

    /**
     * Balance transaction that describes the impact of this collected application fee on your account balance (not
     * including refunds).
     */
    public var balanceTransaction: InlineApplicationFeeBalanceTransactionX1d204e15? = null

    /**
     * Polymorphic source of the application fee. Includes the ID of the object the application fee was created from.
     */
    public var feeSource: InlineApplicationFeeFeeSourceX78740799? = null

    /**
     * ID of the corresponding charge on the platform account, if this fee was the result of a charge using the
     * `destination` parameter.
     */
    public var originatingTransaction: InlineApplicationFeeOriginatingTransactionX9ab63b0d? = null

    public fun build(): ApplicationFee {
      check(accountValue != null) { "account is required" }
      check(amountValue != null) { "amount is required" }
      check(amountRefundedValue != null) { "amountRefunded is required" }
      check(applicationValue != null) { "application is required" }
      check(chargeValue != null) { "charge is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(refundedValue != null) { "refunded is required" }
      check(refundsValue != null) { "refunds is required" }
      return ApplicationFee(
        account = account,
        amount = amount,
        amountRefunded = amountRefunded,
        application = application,
        charge = charge,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        refunded = refunded,
        refunds = refunds,
        balanceTransaction = balanceTransaction,
        feeSource = feeSource,
        originatingTransaction = originatingTransaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplicationFee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApplicationFee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplicationFee {
      val jsonDecoder = decoder.requireJsonDecoder("ApplicationFee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplicationFee must be a JSON object")
      val account = json.decodeRequired<InlineApplicationFeeAccountXa998faec>(rawObject, "account")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountRefunded = json.decodeRequired<Int>(rawObject, "amount_refunded")
      val application = json.decodeRequired<InlineApplicationFeeApplicationX0c97ee83>(rawObject, "application")
      val charge = json.decodeRequired<InlineApplicationFeeChargeX40828a9c>(rawObject, "charge")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineApplicationFeeObjectValueX5ef1b2f5>(rawObject, "object")
      val refunded = json.decodeRequired<Boolean>(rawObject, "refunded")
      val refunds = json.decodeRequired<InlineApplicationFeeRefundsX8c1c63b4>(rawObject, "refunds")
      return ApplicationFee(
        account = account,
        amount = amount,
        amountRefunded = amountRefunded,
        application = application,
        charge = charge,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        refunded = refunded,
        refunds = refunds,
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineApplicationFeeBalanceTransactionX1d204e15?>(element) },
        feeSource = rawObject["fee_source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineApplicationFeeFeeSourceX78740799?>(element) },
        originatingTransaction = rawObject["originating_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineApplicationFeeOriginatingTransactionX9ab63b0d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplicationFee) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplicationFee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_refunded", json.encodeToJsonElement(value.amountRefunded))
        put("application", json.encodeToJsonElement(value.application))
        put("charge", json.encodeToJsonElement(value.charge))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("refunded", json.encodeToJsonElement(value.refunded))
        put("refunds", json.encodeToJsonElement(value.refunds))
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.feeSource?.let { put("fee_source", json.encodeToJsonElement(it)) }
        value.originatingTransaction?.let { put("originating_transaction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applicationFee(block: ApplicationFee.Builder.() -> Unit): ApplicationFee = ApplicationFee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplicationFee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
