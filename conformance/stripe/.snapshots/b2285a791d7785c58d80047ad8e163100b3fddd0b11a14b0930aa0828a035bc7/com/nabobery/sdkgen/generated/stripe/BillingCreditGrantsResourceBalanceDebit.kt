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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingCreditGrantsResourceBalanceDebitView(
  public val amount: BillingCreditGrantsResourceAmount,
  @SerialName("credits_applied")
  public val creditsApplied:
      InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37? = null,
  public val type: InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_debit
 */
@Serializable(with = BillingCreditGrantsResourceBalanceDebit.Serializer::class)
public class BillingCreditGrantsResourceBalanceDebit(
  public val amount: BillingCreditGrantsResourceAmount,
  /**
   * The type of debit transaction.
   */
  public val type: InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc,
  /**
   * Details of how the billing credits were applied to an invoice. Only present if `type` is `credits_applied`.
   */
  public val creditsApplied:
      InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37? = null,
) {
  public class Builder {
    private var amountValue: BillingCreditGrantsResourceAmount? = null

    public var amount: BillingCreditGrantsResourceAmount
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var typeValue: InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc? = null

    public var type: InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Details of how the billing credits were applied to an invoice. Only present if `type` is `credits_applied`.
     */
    public var creditsApplied: InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37?
        = null

    public fun build(): BillingCreditGrantsResourceBalanceDebit {
      check(amountValue != null) { "amount is required" }
      check(typeValue != null) { "type is required" }
      return BillingCreditGrantsResourceBalanceDebit(
        amount = amount,
        type = type,
        creditsApplied = creditsApplied,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceBalanceDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingCreditGrantsResourceBalanceDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceBalanceDebit {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceBalanceDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceBalanceDebit must be a JSON object")
      val amount = json.decodeRequired<BillingCreditGrantsResourceAmount>(rawObject, "amount")
      val type = json.decodeRequired<InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc>(rawObject, "type")
      return BillingCreditGrantsResourceBalanceDebit(
        amount = amount,
        type = type,
        creditsApplied = rawObject["credits_applied"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceBalanceDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceBalanceDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("type", json.encodeToJsonElement(value.type))
        value.creditsApplied?.let { put("credits_applied", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceBalanceDebit(block: BillingCreditGrantsResourceBalanceDebit.Builder.() -> Unit): BillingCreditGrantsResourceBalanceDebit = BillingCreditGrantsResourceBalanceDebit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrantsResourceBalanceDebit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
