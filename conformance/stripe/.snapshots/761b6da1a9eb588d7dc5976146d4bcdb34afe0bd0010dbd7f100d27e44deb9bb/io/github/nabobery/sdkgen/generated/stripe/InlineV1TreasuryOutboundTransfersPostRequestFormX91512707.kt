package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryOutboundTransfersPostRequestFormX91512707.Serializer::class)
public class InlineV1TreasuryOutboundTransfersPostRequestFormX91512707(
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The PaymentMethod to use as the payment instrument for the OutboundTransfer.
   */
  public val destinationPaymentMethod: String? = null,
  /**
   * Hash used to generate the PaymentMethod to be used for this OutboundTransfer. Exclusive with
   * `destination_payment_method`.
   */
  public val destinationPaymentMethodData:
      InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8? = null,
  /**
   * Hash describing payment method configuration details.
   */
  public val destinationPaymentMethodOptions:
      InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * Statement descriptor to be shown on the receiving end of an OutboundTransfer. Maximum 10 characters for `ach`
   * transfers or 140 characters for `us_domestic_wire` transfers. The default value is "transfer". Can only include
   * -#.$&*, spaces, and alphanumeric characters.
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
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The PaymentMethod to use as the payment instrument for the OutboundTransfer.
     */
    public var destinationPaymentMethod: String? = null

    /**
     * Hash used to generate the PaymentMethod to be used for this OutboundTransfer. Exclusive with
     * `destination_payment_method`.
     */
    public var destinationPaymentMethodData:
        InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8? = null

    /**
     * Hash describing payment method configuration details.
     */
    public var destinationPaymentMethodOptions:
        InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741? = null

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
     * Statement descriptor to be shown on the receiving end of an OutboundTransfer. Maximum 10 characters for `ach`
     * transfers or 140 characters for `us_domestic_wire` transfers. The default value is "transfer". Can only include
     * -#.$&*, spaces, and alphanumeric characters.
     */
    public var statementDescriptor: String? = null

    public fun build(): InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      return InlineV1TreasuryOutboundTransfersPostRequestFormX91512707(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        description = description,
        destinationPaymentMethod = destinationPaymentMethod,
        destinationPaymentMethodData = destinationPaymentMethodData,
        destinationPaymentMethodOptions = destinationPaymentMethodOptions,
        expand = expand,
        metadata = metadata,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundTransfersPostRequestFormX91512707> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundTransfersPostRequestFormX91512707")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      return InlineV1TreasuryOutboundTransfersPostRequestFormX91512707(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        destinationPaymentMethod = rawObject["destination_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        destinationPaymentMethodData = rawObject["destination_payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMec421X49fd33a8>(it) },
        destinationPaymentMethodOptions = rawObject["destination_payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTransfersPostRequestFormX91512707) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundTransfersPostRequestFormX91512707")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("financial_account", value.financialAccount)
        value.description?.let { put("description", it) }
        value.destinationPaymentMethod?.let { put("destination_payment_method", it) }
        value.destinationPaymentMethodData?.let { put("destination_payment_method_data", json.encodeToJsonElement(it)) }
        value.destinationPaymentMethodOptions?.let { put("destination_payment_method_options", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundTransfersPostRequestFormX91512707(block: InlineV1TreasuryOutboundTransfersPostRequestFormX91512707.Builder.() -> Unit): InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 = InlineV1TreasuryOutboundTransfersPostRequestFormX91512707.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
