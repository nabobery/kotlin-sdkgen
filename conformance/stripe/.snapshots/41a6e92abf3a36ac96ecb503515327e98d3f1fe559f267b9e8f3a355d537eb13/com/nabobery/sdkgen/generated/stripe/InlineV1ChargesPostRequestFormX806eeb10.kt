package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1ChargesPostRequestFormX806eeb10.Serializer::class)
public class InlineV1ChargesPostRequestFormX806eeb10(
  /**
   * Amount intended to be collected by this payment. A positive integer representing how much to charge in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
   * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
   * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
   * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  public val amount: Int? = null,
  public val applicationFee: Int? = null,
  /**
   * A fee in cents (or local equivalent) that will be applied to the charge and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the `Stripe-Account` header in order to take an
   * application fee. For more information, see the application fees
   * [documentation](https://docs.stripe.com/connect/direct-charges#collect-fees).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * Whether to immediately capture the charge. Defaults to `true`. When `false`, the charge issues an authorization (or
   * pre-authorization), and will need to be [captured](https://api.stripe.com#capture_charge) later. Uncaptured charges
   * expire after a set number of days (7 by default). For more information, see the [authorizing charges and settling
   * later](https://docs.stripe.com/charges/placing-a-hold) documentation.
   */
  public val capture: Boolean? = null,
  /**
   * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
   */
  public val card: InlineV1ChargesPostRequestFormCardX44ae045e? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The ID of an existing customer that will be charged in this request.
   */
  public val customer: String? = null,
  /**
   * An arbitrary string which you can attach to a `Charge` object. It is displayed when in the web interface alongside
   * the charge. Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails
   * will include the `description` of the charge(s) that they are describing.
   */
  public val description: String? = null,
  public val destination: InlineV1ChargesPostRequestFormDestinationXa1ddd738? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1ChargesPostRequestFormMetadataX62aa1606? = null,
  /**
   * The Stripe account ID for which these funds are intended. You can specify the business of record as the connected
   * account using the `on_behalf_of` attribute on the charge. For details, see [Creating Separate Charges and
   * Transfers](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant).
   */
  public val onBehalfOf: String? = null,
  /**
   * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more information.
   */
  public val radarOptions: InlineV1ChargesPostRequestFormRadarOptionsX5235d18d? = null,
  /**
   * The email address to which this charge's [receipt](https://docs.stripe.com/dashboard/receipts) will be sent. The
   * receipt will not be sent until the charge is paid, and no receipts will be sent for test mode charges. If this
   * charge is for a [Customer](https://docs.stripe.com/api/customers/object), the email address specified here will
   * override the customer's email address. If `receipt_email` is specified for a charge in live mode, a receipt will be
   * sent regardless of your [email settings](https://dashboard.stripe.com/account/emails).
   */
  public val receiptEmail: String? = null,
  /**
   * Shipping information for the charge. Helps prevent fraud on charges for physical goods.
   */
  public val shipping: InlineV1ChargesPostRequestFormShippingX776066db? = null,
  /**
   * A payment source to be charged. This can be the ID of a [card](https://docs.stripe.com/api#cards) (i.e., credit or
   * debit card), a [bank account](https://docs.stripe.com/api#bank_accounts), a
   * [source](https://docs.stripe.com/api#sources), a [token](https://docs.stripe.com/api#tokens), or a [connected
   * account](https://docs.stripe.com/connect/account-debits#charging-a-connected-account). For certain
   * sources---namely, [cards](https://docs.stripe.com/api#cards), [bank
   * accounts](https://docs.stripe.com/api#bank_accounts), and attached
   * [sources](https://docs.stripe.com/api#sources)---you must also pass the ID of the associated customer.
   */
  public val source: String? = null,
  /**
   * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
   * overrides the account's default statement descriptor. For information about requirements, including the
   * 22-character limit, see [the Statement Descriptor
   * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
   *
   * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
   * this value is used as the suffix.
   */
  public val statementDescriptor: String? = null,
  /**
   * Provides information about a card charge. Concatenated to the account's [statement descriptor
   * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
   * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is concatenated
   * to the account's statement descriptor.
   */
  public val statementDescriptorSuffix: String? = null,
  /**
   * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
   * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
   */
  public val transferData: InlineV1ChargesPostRequestFormTransferDataXc3aedd04? = null,
  /**
   * A string that identifies this transaction as part of a group. For details, see [Grouping
   * transactions](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options).
   */
  public val transferGroup: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Amount intended to be collected by this payment. A positive integer representing how much to charge in the
     * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
     * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
     * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
     * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
     */
    public var amount: Int? = null

    public var applicationFee: Int? = null

    /**
     * A fee in cents (or local equivalent) that will be applied to the charge and transferred to the application
     * owner's Stripe account. The request must be made with an OAuth key or the `Stripe-Account` header in order to
     * take an application fee. For more information, see the application fees
     * [documentation](https://docs.stripe.com/connect/direct-charges#collect-fees).
     */
    public var applicationFeeAmount: Int? = null

    /**
     * Whether to immediately capture the charge. Defaults to `true`. When `false`, the charge issues an authorization
     * (or pre-authorization), and will need to be [captured](https://api.stripe.com#capture_charge) later. Uncaptured
     * charges expire after a set number of days (7 by default). For more information, see the [authorizing charges and
     * settling later](https://docs.stripe.com/charges/placing-a-hold) documentation.
     */
    public var capture: Boolean? = null

    /**
     * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
     */
    public var card: InlineV1ChargesPostRequestFormCardX44ae045e? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The ID of an existing customer that will be charged in this request.
     */
    public var customer: String? = null

    /**
     * An arbitrary string which you can attach to a `Charge` object. It is displayed when in the web interface
     * alongside the charge. Note that if you use Stripe to send automatic email receipts to your customers, your
     * receipt emails will include the `description` of the charge(s) that they are describing.
     */
    public var description: String? = null

    public var destination: InlineV1ChargesPostRequestFormDestinationXa1ddd738? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1ChargesPostRequestFormMetadataX62aa1606? = null

    /**
     * The Stripe account ID for which these funds are intended. You can specify the business of record as the connected
     * account using the `on_behalf_of` attribute on the charge. For details, see [Creating Separate Charges and
     * Transfers](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant).
     */
    public var onBehalfOf: String? = null

    /**
     * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more
     * information.
     */
    public var radarOptions: InlineV1ChargesPostRequestFormRadarOptionsX5235d18d? = null

    /**
     * The email address to which this charge's [receipt](https://docs.stripe.com/dashboard/receipts) will be sent. The
     * receipt will not be sent until the charge is paid, and no receipts will be sent for test mode charges. If this
     * charge is for a [Customer](https://docs.stripe.com/api/customers/object), the email address specified here will
     * override the customer's email address. If `receipt_email` is specified for a charge in live mode, a receipt will
     * be sent regardless of your [email settings](https://dashboard.stripe.com/account/emails).
     */
    public var receiptEmail: String? = null

    /**
     * Shipping information for the charge. Helps prevent fraud on charges for physical goods.
     */
    public var shipping: InlineV1ChargesPostRequestFormShippingX776066db? = null

    /**
     * A payment source to be charged. This can be the ID of a [card](https://docs.stripe.com/api#cards) (i.e., credit
     * or debit card), a [bank account](https://docs.stripe.com/api#bank_accounts), a
     * [source](https://docs.stripe.com/api#sources), a [token](https://docs.stripe.com/api#tokens), or a [connected
     * account](https://docs.stripe.com/connect/account-debits#charging-a-connected-account). For certain
     * sources---namely, [cards](https://docs.stripe.com/api#cards), [bank
     * accounts](https://docs.stripe.com/api#bank_accounts), and attached
     * [sources](https://docs.stripe.com/api#sources)---you must also pass the ID of the associated customer.
     */
    public var source: String? = null

    /**
     * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
     * overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     *
     * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
     * this value is used as the suffix.
     */
    public var statementDescriptor: String? = null

    /**
     * Provides information about a card charge. Concatenated to the account's [statement descriptor
     * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
     * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is
     * concatenated to the account's statement descriptor.
     */
    public var statementDescriptorSuffix: String? = null

    /**
     * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See
     * the Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
     */
    public var transferData: InlineV1ChargesPostRequestFormTransferDataXc3aedd04? = null

    /**
     * A string that identifies this transaction as part of a group. For details, see [Grouping
     * transactions](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options).
     */
    public var transferGroup: String? = null

    public fun build(): InlineV1ChargesPostRequestFormX806eeb10 = InlineV1ChargesPostRequestFormX806eeb10(
      amount = amount,
      applicationFee = applicationFee,
      applicationFeeAmount = applicationFeeAmount,
      capture = capture,
      card = card,
      currency = currency,
      customer = customer,
      description = description,
      destination = destination,
      expand = expand,
      metadata = metadata,
      onBehalfOf = onBehalfOf,
      radarOptions = radarOptions,
      receiptEmail = receiptEmail,
      shipping = shipping,
      source = source,
      statementDescriptor = statementDescriptor,
      statementDescriptorSuffix = statementDescriptorSuffix,
      transferData = transferData,
      transferGroup = transferGroup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormX806eeb10 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormX806eeb10> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormX806eeb10 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormX806eeb10")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormX806eeb10 must be a JSON object")
      return InlineV1ChargesPostRequestFormX806eeb10(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        applicationFee = rawObject["application_fee"]?.let { json.decodeFromJsonElement<Int>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        capture = rawObject["capture"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormCardX44ae045e>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        destination = rawObject["destination"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormDestinationXa1ddd738>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormMetadataX62aa1606>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormRadarOptionsX5235d18d>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<String>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormShippingX776066db>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormTransferDataXc3aedd04>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormX806eeb10) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormX806eeb10")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.applicationFee?.let { put("application_fee", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.capture?.let { put("capture", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", it) }
        value.description?.let { put("description", it) }
        value.destination?.let { put("destination", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesPostRequestFormX806eeb10(block: InlineV1ChargesPostRequestFormX806eeb10.Builder.() -> Unit): InlineV1ChargesPostRequestFormX806eeb10 = InlineV1ChargesPostRequestFormX806eeb10.build(block)
