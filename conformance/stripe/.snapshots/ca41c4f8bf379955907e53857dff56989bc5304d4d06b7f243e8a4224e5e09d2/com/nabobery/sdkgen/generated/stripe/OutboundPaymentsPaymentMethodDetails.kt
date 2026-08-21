package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class OutboundPaymentsPaymentMethodDetailsView(
  @SerialName("billing_details")
  public val billingDetails: TreasurySharedResourceBillingDetails,
  @SerialName("financial_account")
  public val financialAccount: OutboundPaymentsPaymentMethodDetailsFinancialAccount? = null,
  public val type: InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1,
  @SerialName("us_bank_account")
  public val usBankAccount: OutboundPaymentsPaymentMethodDetailsUsBankAccount? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_payments_payment_method_details
 */
@Serializable(with = OutboundPaymentsPaymentMethodDetails.Serializer::class)
public class OutboundPaymentsPaymentMethodDetails(
  public val billingDetails: TreasurySharedResourceBillingDetails,
  /**
   * The type of the payment method used in the OutboundPayment.
   */
  public val type: InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1,
  public val financialAccount: OutboundPaymentsPaymentMethodDetailsFinancialAccount? = null,
  public val usBankAccount: OutboundPaymentsPaymentMethodDetailsUsBankAccount? = null,
) {
  public class Builder {
    private var billingDetailsValue: TreasurySharedResourceBillingDetails? = null

    public var billingDetails: TreasurySharedResourceBillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var typeValue: InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1? = null

    public var type: InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var financialAccount: OutboundPaymentsPaymentMethodDetailsFinancialAccount? = null

    public var usBankAccount: OutboundPaymentsPaymentMethodDetailsUsBankAccount? = null

    public fun build(): OutboundPaymentsPaymentMethodDetails {
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(typeValue != null) { "type is required" }
      return OutboundPaymentsPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        financialAccount = financialAccount,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutboundPaymentsPaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutboundPaymentsPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutboundPaymentsPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("OutboundPaymentsPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutboundPaymentsPaymentMethodDetails must be a JSON object")
      val billingDetails = json.decodeRequired<TreasurySharedResourceBillingDetails>(rawObject, "billing_details")
      val type = json.decodeRequired<InlineOutboundPaymentsPaymentMethodDetailsTypeXe5713fd1>(rawObject, "type")
      return OutboundPaymentsPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<OutboundPaymentsPaymentMethodDetailsFinancialAccount>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<OutboundPaymentsPaymentMethodDetailsUsBankAccount>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutboundPaymentsPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("OutboundPaymentsPaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_details", json.encodeToJsonElement(value.billingDetails))
        put("type", json.encodeToJsonElement(value.type))
        value.financialAccount?.let { put("financial_account", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outboundPaymentsPaymentMethodDetails(block: OutboundPaymentsPaymentMethodDetails.Builder.() -> Unit): OutboundPaymentsPaymentMethodDetails = OutboundPaymentsPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutboundPaymentsPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
