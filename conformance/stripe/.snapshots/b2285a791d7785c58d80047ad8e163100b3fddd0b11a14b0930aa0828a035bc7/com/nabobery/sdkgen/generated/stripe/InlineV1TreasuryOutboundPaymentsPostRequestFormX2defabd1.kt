package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1.Serializer::class)
public class InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1(
  /**
   * Amount (in cents) to be transferred.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The FinancialAccount to pull funds from.
   */
  public val financialAccount: String,
  /**
   * ID of the customer to whom the OutboundPayment is sent. Must match the Customer attached to the
   * `destination_payment_method` passed in.
   */
  public val customer: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The PaymentMethod to use as the payment instrument for the OutboundPayment. Exclusive with
   * `destination_payment_method_data`.
   */
  public val destinationPaymentMethod: String? = null,
  /**
   * Hash used to generate the PaymentMethod to be used for this OutboundPayment. Exclusive with
   * `destination_payment_method`.
   */
  public val destinationPaymentMethodData:
      InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474? = null,
  /**
   * Payment method-specific configuration for this OutboundPayment.
   */
  public val destinationPaymentMethodOptions:
      InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9? = null,
  /**
   * End user details.
   */
  public val endUserDetails:
      InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The description that appears on the receiving end for this OutboundPayment (for example, bank statement for
   * external bank transfer). Maximum 10 characters for `ach` payments, 140 characters for `us_domestic_wire` payments,
   * or 500 characters for `stripe` network transfers. Can only include -#.$&*, spaces, and alphanumeric characters. The
   * default value is "payment".
   */
  public val statementDescriptor: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var financialAccountValue: String? = null

    public var financialAccount: String
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
      }

    /**
     * ID of the customer to whom the OutboundPayment is sent. Must match the Customer attached to the
     * `destination_payment_method` passed in.
     */
    public var customer: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The PaymentMethod to use as the payment instrument for the OutboundPayment. Exclusive with
     * `destination_payment_method_data`.
     */
    public var destinationPaymentMethod: String? = null

    /**
     * Hash used to generate the PaymentMethod to be used for this OutboundPayment. Exclusive with
     * `destination_payment_method`.
     */
    public var destinationPaymentMethodData:
        InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474? = null

    /**
     * Payment method-specific configuration for this OutboundPayment.
     */
    public var destinationPaymentMethodOptions:
        InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9? = null

    /**
     * End user details.
     */
    public var endUserDetails:
        InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The description that appears on the receiving end for this OutboundPayment (for example, bank statement for
     * external bank transfer). Maximum 10 characters for `ach` payments, 140 characters for `us_domestic_wire`
     * payments, or 500 characters for `stripe` network transfers. Can only include -#.$&*, spaces, and alphanumeric
     * characters. The default value is "payment".
     */
    public var statementDescriptor: String? = null

    public fun build(): InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      return InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        customer = customer,
        description = description,
        destinationPaymentMethod = destinationPaymentMethod,
        destinationPaymentMethodData = destinationPaymentMethodData,
        destinationPaymentMethodOptions = destinationPaymentMethodOptions,
        endUserDetails = endUserDetails,
        expand = expand,
        metadata = metadata,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      return InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        destinationPaymentMethod = rawObject["destination_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        destinationPaymentMethodData = rawObject["destination_payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474>(it) },
        destinationPaymentMethodOptions = rawObject["destination_payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9>(it) },
        endUserDetails = rawObject["end_user_details"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPaymentsPostRequestFormEndUserDetailsX9f3a6bde>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("financial_account", value.financialAccount)
        value.customer?.let { put("customer", it) }
        value.description?.let { put("description", it) }
        value.destinationPaymentMethod?.let { put("destination_payment_method", it) }
        value.destinationPaymentMethodData?.let { put("destination_payment_method_data", json.encodeToJsonElement(it)) }
        value.destinationPaymentMethodOptions?.let { put("destination_payment_method_options", json.encodeToJsonElement(it)) }
        value.endUserDetails?.let { put("end_user_details", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1(block: InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1.Builder.() -> Unit): InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 = InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryOutboundPaymentsPostRequestFormX2defabd1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
