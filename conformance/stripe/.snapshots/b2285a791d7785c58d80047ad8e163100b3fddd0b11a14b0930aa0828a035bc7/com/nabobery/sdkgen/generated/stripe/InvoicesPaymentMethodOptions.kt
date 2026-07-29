package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InvoicesPaymentMethodOptionsView(
  @SerialName("acss_debit")
  public val acssDebit: InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0? = null,
  public val bancontact: InlineInvoicesPaymentMethodOptionsBancontactXb30f7363? = null,
  public val card: InlineInvoicesPaymentMethodOptionsCardX7732c642? = null,
  @SerialName("customer_balance")
  public val customerBalance: InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3? = null,
  public val konbini: InlineInvoicesPaymentMethodOptionsKonbiniX054be988? = null,
  public val payto: InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a? = null,
  public val pix: InlineInvoicesPaymentMethodOptionsPixX100a30a5? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3? = null,
  public val upi: InlineInvoicesPaymentMethodOptionsUpiX81b96e1e? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options
 */
@Serializable(with = InvoicesPaymentMethodOptions.Serializer::class)
public class InvoicesPaymentMethodOptions(
  /**
   * If paying by `acss_debit`, this sub-hash contains details about the Canadian pre-authorized debit payment method
   * options to pass to the invoice’s PaymentIntent.
   */
  public val acssDebit: InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0? = null,
  /**
   * If paying by `bancontact`, this sub-hash contains details about the Bancontact payment method options to pass to
   * the invoice’s PaymentIntent.
   */
  public val bancontact: InlineInvoicesPaymentMethodOptionsBancontactXb30f7363? = null,
  /**
   * If paying by `card`, this sub-hash contains details about the Card payment method options to pass to the invoice’s
   * PaymentIntent.
   */
  public val card: InlineInvoicesPaymentMethodOptionsCardX7732c642? = null,
  /**
   * If paying by `customer_balance`, this sub-hash contains details about the Bank transfer payment method options to
   * pass to the invoice’s PaymentIntent.
   */
  public val customerBalance: InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3? = null,
  /**
   * If paying by `konbini`, this sub-hash contains details about the Konbini payment method options to pass to the
   * invoice’s PaymentIntent.
   */
  public val konbini: InlineInvoicesPaymentMethodOptionsKonbiniX054be988? = null,
  /**
   * If paying by `payto`, this sub-hash contains details about the PayTo payment method options to pass to the
   * invoice’s PaymentIntent.
   */
  public val payto: InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a? = null,
  /**
   * If paying by `pix`, this sub-hash contains details about the Pix payment method options to pass to the invoice’s
   * PaymentIntent.
   */
  public val pix: InlineInvoicesPaymentMethodOptionsPixX100a30a5? = null,
  /**
   * If paying by `sepa_debit`, this sub-hash contains details about the SEPA Direct Debit payment method options to
   * pass to the invoice’s PaymentIntent.
   */
  public val sepaDebit: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3? = null,
  /**
   * If paying by `upi`, this sub-hash contains details about the UPI payment method options to pass to the invoice’s
   * PaymentIntent.
   */
  public val upi: InlineInvoicesPaymentMethodOptionsUpiX81b96e1e? = null,
  /**
   * If paying by `us_bank_account`, this sub-hash contains details about the ACH direct debit payment method options to
   * pass to the invoice’s PaymentIntent.
   */
  public val usBankAccount: InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd? = null,
) {
  public class Builder {
    /**
     * If paying by `acss_debit`, this sub-hash contains details about the Canadian pre-authorized debit payment method
     * options to pass to the invoice’s PaymentIntent.
     */
    public var acssDebit: InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0? = null

    /**
     * If paying by `bancontact`, this sub-hash contains details about the Bancontact payment method options to pass to
     * the invoice’s PaymentIntent.
     */
    public var bancontact: InlineInvoicesPaymentMethodOptionsBancontactXb30f7363? = null

    /**
     * If paying by `card`, this sub-hash contains details about the Card payment method options to pass to the
     * invoice’s PaymentIntent.
     */
    public var card: InlineInvoicesPaymentMethodOptionsCardX7732c642? = null

    /**
     * If paying by `customer_balance`, this sub-hash contains details about the Bank transfer payment method options to
     * pass to the invoice’s PaymentIntent.
     */
    public var customerBalance: InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3? = null

    /**
     * If paying by `konbini`, this sub-hash contains details about the Konbini payment method options to pass to the
     * invoice’s PaymentIntent.
     */
    public var konbini: InlineInvoicesPaymentMethodOptionsKonbiniX054be988? = null

    /**
     * If paying by `payto`, this sub-hash contains details about the PayTo payment method options to pass to the
     * invoice’s PaymentIntent.
     */
    public var payto: InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a? = null

    /**
     * If paying by `pix`, this sub-hash contains details about the Pix payment method options to pass to the invoice’s
     * PaymentIntent.
     */
    public var pix: InlineInvoicesPaymentMethodOptionsPixX100a30a5? = null

    /**
     * If paying by `sepa_debit`, this sub-hash contains details about the SEPA Direct Debit payment method options to
     * pass to the invoice’s PaymentIntent.
     */
    public var sepaDebit: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3? = null

    /**
     * If paying by `upi`, this sub-hash contains details about the UPI payment method options to pass to the invoice’s
     * PaymentIntent.
     */
    public var upi: InlineInvoicesPaymentMethodOptionsUpiX81b96e1e? = null

    /**
     * If paying by `us_bank_account`, this sub-hash contains details about the ACH direct debit payment method options
     * to pass to the invoice’s PaymentIntent.
     */
    public var usBankAccount: InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd? = null

    public fun build(): InvoicesPaymentMethodOptions = InvoicesPaymentMethodOptions(
      acssDebit = acssDebit,
      bancontact = bancontact,
      card = card,
      customerBalance = customerBalance,
      konbini = konbini,
      payto = payto,
      pix = pix,
      sepaDebit = sepaDebit,
      upi = upi,
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesPaymentMethodOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicesPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesPaymentMethodOptions must be a JSON object")
      return InvoicesPaymentMethodOptions(
        acssDebit = rawObject["acss_debit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0?>(element) },
        bancontact = rawObject["bancontact"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsBancontactXb30f7363?>(element) },
        card = rawObject["card"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsCardX7732c642?>(element) },
        customerBalance = rawObject["customer_balance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3?>(element) },
        konbini = rawObject["konbini"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsKonbiniX054be988?>(element) },
        payto = rawObject["payto"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a?>(element) },
        pix = rawObject["pix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsPixX100a30a5?>(element) },
        sepaDebit = rawObject["sepa_debit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3?>(element) },
        upi = rawObject["upi"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsUpiX81b96e1e?>(element) },
        usBankAccount = rawObject["us_bank_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesPaymentMethodOptions(block: InvoicesPaymentMethodOptions.Builder.() -> Unit): InvoicesPaymentMethodOptions = InvoicesPaymentMethodOptions.build(block)
