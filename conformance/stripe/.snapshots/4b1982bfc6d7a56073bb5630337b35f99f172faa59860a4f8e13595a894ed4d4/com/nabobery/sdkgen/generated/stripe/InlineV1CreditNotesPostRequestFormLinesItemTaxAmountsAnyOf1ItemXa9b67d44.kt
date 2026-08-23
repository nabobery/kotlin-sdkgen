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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts/anyOf/0/items
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44.Serializer::class)
public class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44(
  public val amount: Int,
  public val taxRate: String,
  public val taxableAmount: Int,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var taxRateValue: String? = null

    public var taxRate: String
      get() = requireNotNull(taxRateValue) { "taxRate is required" }
      set(`value`) {
        taxRateValue = value
      }

    private var taxableAmountValue: Int? = null

    public var taxableAmount: Int
      get() = requireNotNull(taxableAmountValue) { "taxableAmount is required" }
      set(`value`) {
        taxableAmountValue = value
      }

    public fun build(): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 {
      check(amountValue != null) { "amount is required" }
      check(taxRateValue != null) { "taxRate is required" }
      check(taxableAmountValue != null) { "taxableAmount is required" }
      return InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44(
        amount = amount,
        taxRate = taxRate,
        taxableAmount = taxableAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val taxRate = json.decodeRequired<String>(rawObject, "tax_rate")
      val taxableAmount = json.decodeRequired<Int>(rawObject, "taxable_amount")
      return InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44(
        amount = amount,
        taxRate = taxRate,
        taxableAmount = taxableAmount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("tax_rate", value.taxRate)
        put("taxable_amount", json.encodeToJsonElement(value.taxableAmount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44(block: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 = InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
