package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_pretax_credit_amount
 */
@Serializable(with = InvoicesResourcePretaxCreditAmount.Serializer::class)
public class InvoicesResourcePretaxCreditAmount(
  /**
   * The amount, in cents (or local equivalent), of the pretax credit amount.
   */
  public val amount: Int,
  /**
   * Type of the pretax credit amount referenced.
   */
  public val type: InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103,
  /**
   * The credit balance transaction that was applied to get this pretax credit amount.
   */
  public val creditBalanceTransaction:
      InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d? = null,
  /**
   * The discount that was applied to get this pretax credit amount.
   */
  public val discount: InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var typeValue: InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103? = null

    public var type: InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The credit balance transaction that was applied to get this pretax credit amount.
     */
    public var creditBalanceTransaction:
        InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d? = null

    /**
     * The discount that was applied to get this pretax credit amount.
     */
    public var discount: InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c? = null

    public fun build(): InvoicesResourcePretaxCreditAmount {
      check(amountValue != null) { "amount is required" }
      check(typeValue != null) { "type is required" }
      return InvoicesResourcePretaxCreditAmount(
        amount = amount,
        type = type,
        creditBalanceTransaction = creditBalanceTransaction,
        discount = discount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesResourcePretaxCreditAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicesResourcePretaxCreditAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesResourcePretaxCreditAmount {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourcePretaxCreditAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesResourcePretaxCreditAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val type = json.decodeRequired<InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103>(rawObject, "type")
      return InvoicesResourcePretaxCreditAmount(
        amount = amount,
        type = type,
        creditBalanceTransaction = rawObject["credit_balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d?>(element) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesResourcePretaxCreditAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourcePretaxCreditAmount")
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

public fun invoicesResourcePretaxCreditAmount(block: InvoicesResourcePretaxCreditAmount.Builder.() -> Unit): InvoicesResourcePretaxCreditAmount = InvoicesResourcePretaxCreditAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoicesResourcePretaxCreditAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
