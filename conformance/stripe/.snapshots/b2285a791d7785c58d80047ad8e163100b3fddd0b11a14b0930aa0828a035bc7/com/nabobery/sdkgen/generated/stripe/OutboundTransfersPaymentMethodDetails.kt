package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details
 */
@Serializable(with = OutboundTransfersPaymentMethodDetails.Serializer::class)
public class OutboundTransfersPaymentMethodDetails(
  public val billingDetails: TreasurySharedResourceBillingDetails,
  /**
   * The type of the payment method used in the OutboundTransfer.
   */
  public val type: InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32,
  public val financialAccount: OutboundTransfersPaymentMethodDetailsFinancialAccount? = null,
  public val usBankAccount: OutboundTransfersPaymentMethodDetailsUsBankAccount? = null,
) {
  public class Builder {
    private var billingDetailsValue: TreasurySharedResourceBillingDetails? = null

    public var billingDetails: TreasurySharedResourceBillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var typeValue: InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32? = null

    public var type: InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var financialAccount: OutboundTransfersPaymentMethodDetailsFinancialAccount? = null

    public var usBankAccount: OutboundTransfersPaymentMethodDetailsUsBankAccount? = null

    public fun build(): OutboundTransfersPaymentMethodDetails {
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(typeValue != null) { "type is required" }
      return OutboundTransfersPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        financialAccount = financialAccount,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutboundTransfersPaymentMethodDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutboundTransfersPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutboundTransfersPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("OutboundTransfersPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutboundTransfersPaymentMethodDetails must be a JSON object")
      val billingDetails = json.decodeRequired<TreasurySharedResourceBillingDetails>(rawObject, "billing_details")
      val type = json.decodeRequired<InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32>(rawObject, "type")
      return OutboundTransfersPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<OutboundTransfersPaymentMethodDetailsFinancialAccount>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<OutboundTransfersPaymentMethodDetailsUsBankAccount>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutboundTransfersPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("OutboundTransfersPaymentMethodDetails")
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

public fun outboundTransfersPaymentMethodDetails(block: OutboundTransfersPaymentMethodDetails.Builder.() -> Unit): OutboundTransfersPaymentMethodDetails = OutboundTransfersPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutboundTransfersPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
