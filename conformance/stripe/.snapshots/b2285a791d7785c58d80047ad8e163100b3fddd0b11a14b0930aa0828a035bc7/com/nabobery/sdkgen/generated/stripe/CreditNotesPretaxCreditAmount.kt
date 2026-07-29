package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_notes_pretax_credit_amount
 */
@Serializable(with = CreditNotesPretaxCreditAmount.Serializer::class)
public class CreditNotesPretaxCreditAmount(
  /**
   * The amount, in cents (or local equivalent), of the pretax credit amount.
   */
  public val amount: Int,
  /**
   * Type of the pretax credit amount referenced.
   */
  public val type: InlineCreditNotesPretaxCreditAmountTypeXe80b73a1,
  /**
   * The credit balance transaction that was applied to get this pretax credit amount.
   */
  public val creditBalanceTransaction:
      InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d? = null,
  /**
   * The discount that was applied to get this pretax credit amount.
   */
  public val discount: InlineCreditNotesPretaxCreditAmountDiscountX67821026? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var typeValue: InlineCreditNotesPretaxCreditAmountTypeXe80b73a1? = null

    public var type: InlineCreditNotesPretaxCreditAmountTypeXe80b73a1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The credit balance transaction that was applied to get this pretax credit amount.
     */
    public var creditBalanceTransaction:
        InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d? = null

    /**
     * The discount that was applied to get this pretax credit amount.
     */
    public var discount: InlineCreditNotesPretaxCreditAmountDiscountX67821026? = null

    public fun build(): CreditNotesPretaxCreditAmount {
      check(amountValue != null) { "amount is required" }
      check(typeValue != null) { "type is required" }
      return CreditNotesPretaxCreditAmount(
        amount = amount,
        type = type,
        creditBalanceTransaction = creditBalanceTransaction,
        discount = discount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreditNotesPretaxCreditAmount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CreditNotesPretaxCreditAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreditNotesPretaxCreditAmount {
      val jsonDecoder = decoder.requireJsonDecoder("CreditNotesPretaxCreditAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreditNotesPretaxCreditAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val type = json.decodeRequired<InlineCreditNotesPretaxCreditAmountTypeXe80b73a1>(rawObject, "type")
      return CreditNotesPretaxCreditAmount(
        amount = amount,
        type = type,
        creditBalanceTransaction = rawObject["credit_balance_transaction"]?.let { json.decodeFromJsonElement<InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<InlineCreditNotesPretaxCreditAmountDiscountX67821026>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreditNotesPretaxCreditAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("CreditNotesPretaxCreditAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("type", json.encodeToJsonElement(value.type))
        value.creditBalanceTransaction?.let { put("credit_balance_transaction", json.encodeToJsonElement(it)) }
        value.discount?.let { put("discount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun creditNotesPretaxCreditAmount(block: CreditNotesPretaxCreditAmount.Builder.() -> Unit): CreditNotesPretaxCreditAmount = CreditNotesPretaxCreditAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreditNotesPretaxCreditAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
