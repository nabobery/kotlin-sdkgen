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
public data class BillingCreditGrantsResourceBalanceCreditView(
  public val amount: BillingCreditGrantsResourceAmount,
  @SerialName("credits_application_invoice_voided")
  public val creditsApplicationInvoiceVoided:
      InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22? = null,
  public val type: InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credit
 */
@Serializable(with = BillingCreditGrantsResourceBalanceCredit.Serializer::class)
public class BillingCreditGrantsResourceBalanceCredit(
  public val amount: BillingCreditGrantsResourceAmount,
  /**
   * The type of credit transaction.
   */
  public val type: InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44,
  /**
   * Details of the invoice to which the reinstated credits were originally applied. Only present if `type` is
   * `credits_application_invoice_voided`.
   */
  public val creditsApplicationInvoiceVoided:
      InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22? = null,
) {
  public class Builder {
    private var amountValue: BillingCreditGrantsResourceAmount? = null

    public var amount: BillingCreditGrantsResourceAmount
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var typeValue: InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44? = null

    public var type: InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Details of the invoice to which the reinstated credits were originally applied. Only present if `type` is
     * `credits_application_invoice_voided`.
     */
    public var creditsApplicationInvoiceVoided:
        InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22? = null

    public fun build(): BillingCreditGrantsResourceBalanceCredit {
      check(amountValue != null) { "amount is required" }
      check(typeValue != null) { "type is required" }
      return BillingCreditGrantsResourceBalanceCredit(
        amount = amount,
        type = type,
        creditsApplicationInvoiceVoided = creditsApplicationInvoiceVoided,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceBalanceCredit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingCreditGrantsResourceBalanceCredit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceBalanceCredit {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceBalanceCredit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceBalanceCredit must be a JSON object")
      val amount = json.decodeRequired<BillingCreditGrantsResourceAmount>(rawObject, "amount")
      val type = json.decodeRequired<InlineBillingCreditGrantsResourceBalanceCreditTypeX5ab06d44>(rawObject, "type")
      return BillingCreditGrantsResourceBalanceCredit(
        amount = amount,
        type = type,
        creditsApplicationInvoiceVoided = rawObject["credits_application_invoice_voided"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceBalanceCredit) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceBalanceCredit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("type", json.encodeToJsonElement(value.type))
        value.creditsApplicationInvoiceVoided?.let { put("credits_application_invoice_voided", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceBalanceCredit(block: BillingCreditGrantsResourceBalanceCredit.Builder.() -> Unit): BillingCreditGrantsResourceBalanceCredit = BillingCreditGrantsResourceBalanceCredit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrantsResourceBalanceCredit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
