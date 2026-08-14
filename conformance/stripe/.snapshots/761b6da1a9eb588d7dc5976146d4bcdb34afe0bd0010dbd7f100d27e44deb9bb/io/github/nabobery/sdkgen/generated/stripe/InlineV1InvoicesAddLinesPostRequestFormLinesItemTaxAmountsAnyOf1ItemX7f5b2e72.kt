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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72(
  public val amount: Int,
  public val taxRateData:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150,
  public val taxableAmount: Int,
  public val taxabilityReason:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var taxRateDataValue:
        InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150? = null

    public var taxRateData:
        InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150
      get() = requireNotNull(taxRateDataValue) { "taxRateData is required" }
      set(`value`) {
        taxRateDataValue = value
      }

    private var taxableAmountValue: Int? = null

    public var taxableAmount: Int
      get() = requireNotNull(taxableAmountValue) { "taxableAmount is required" }
      set(`value`) {
        taxableAmountValue = value
      }

    public var taxabilityReason:
        InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160? = null

    public fun build(): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 {
      check(amountValue != null) { "amount is required" }
      check(taxRateDataValue != null) { "taxRateData is required" }
      check(taxableAmountValue != null) { "taxableAmount is required" }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72(
        amount = amount,
        taxRateData = taxRateData,
        taxableAmount = taxableAmount,
        taxabilityReason = taxabilityReason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val taxRateData = json.decodeRequired<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150>(rawObject, "tax_rate_data")
      val taxableAmount = json.decodeRequired<Int>(rawObject, "taxable_amount")
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72(
        amount = amount,
        taxRateData = taxRateData,
        taxableAmount = taxableAmount,
        taxabilityReason = rawObject["taxability_reason"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxabilityReasonX3cc94160>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("tax_rate_data", json.encodeToJsonElement(value.taxRateData))
        put("taxable_amount", json.encodeToJsonElement(value.taxableAmount))
        value.taxabilityReason?.let { put("taxability_reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72(block: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72.Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
