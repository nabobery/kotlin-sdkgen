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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_shared_resource_initiating_payment_method_details_initiatin
 * g_payment_method_details
 */
@Serializable(with = TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails.Serializer::class)
public class TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails(
  public val billingDetails: TreasurySharedResourceBillingDetails,
  /**
   * Polymorphic type matching the originating money movement's source. This can be an external account, a Stripe
   * balance, or a FinancialAccount.
   */
  public val type: InlineTreasurySharedResour4545TypeX37e05792,
  /**
   * Set when `type` is `balance`.
   */
  public val balance: InlineTreasurySharedResour4545BalanceX74e6449c? = null,
  public val financialAccount: ReceivedPaymentMethodDetailsFinancialAccount? = null,
  /**
   * Set when `type` is `issuing_card`. This is an [Issuing Card](https://api.stripe.com#issuing_cards) ID.
   */
  public val issuingCard: String? = null,
  public val usBankAccount:
      TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount? = null,
) {
  public class Builder {
    private var billingDetailsValue: TreasurySharedResourceBillingDetails? = null

    public var billingDetails: TreasurySharedResourceBillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var typeValue: InlineTreasurySharedResour4545TypeX37e05792? = null

    public var type: InlineTreasurySharedResour4545TypeX37e05792
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Set when `type` is `balance`.
     */
    public var balance: InlineTreasurySharedResour4545BalanceX74e6449c? = null

    public var financialAccount: ReceivedPaymentMethodDetailsFinancialAccount? = null

    /**
     * Set when `type` is `issuing_card`. This is an [Issuing Card](https://api.stripe.com#issuing_cards) ID.
     */
    public var issuingCard: String? = null

    public var usBankAccount: TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount? =
        null

    public fun build(): TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails {
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(typeValue != null) { "type is required" }
      return TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        balance = balance,
        financialAccount = financialAccount,
        issuingCard = issuingCard,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails must be a JSON object")
      val billingDetails = json.decodeRequired<TreasurySharedResourceBillingDetails>(rawObject, "billing_details")
      val type = json.decodeRequired<InlineTreasurySharedResour4545TypeX37e05792>(rawObject, "type")
      return TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails(
        billingDetails = billingDetails,
        type = type,
        balance = rawObject["balance"]?.let { json.decodeFromJsonElement<InlineTreasurySharedResour4545BalanceX74e6449c>(it) },
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<ReceivedPaymentMethodDetailsFinancialAccount>(it) },
        issuingCard = rawObject["issuing_card"]?.let { json.decodeFromJsonElement<String>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_details", json.encodeToJsonElement(value.billingDetails))
        put("type", json.encodeToJsonElement(value.type))
        value.balance?.let { put("balance", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", json.encodeToJsonElement(it)) }
        value.issuingCard?.let { put("issuing_card", it) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails(block: TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails.Builder.() -> Unit): TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails = TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasurySharedResourceInitiatingPaymentMethodDetailsInitiatingPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
