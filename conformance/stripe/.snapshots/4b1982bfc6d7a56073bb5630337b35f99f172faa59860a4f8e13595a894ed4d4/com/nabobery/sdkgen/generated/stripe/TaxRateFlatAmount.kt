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

@Serializable
public data class TaxRateFlatAmountView(
  public val amount: Int,
  public val currency: String,
)

/**
 * The amount of the tax rate when the `rate_type`` is `flat_amount`. Tax rates with `rate_type` `percentage` can vary
 * based on the transaction, resulting in this field being `null`. This field exposes the amount and currency of the
 * flat tax rate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate_flat_amount
 */
@Serializable(with = TaxRateFlatAmount.Serializer::class)
public class TaxRateFlatAmount(
  /**
   * Amount of the tax when the `rate_type` is `flat_amount`. This positive integer represents how much to charge in the
   * smallest currency unit (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The amount
   * value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  public val amount: Int,
  /**
   * Three-letter ISO currency code, in lowercase.
   */
  public val currency: String,
) {
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

    public fun build(): TaxRateFlatAmount {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return TaxRateFlatAmount(
        amount = amount,
        currency = currency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxRateFlatAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxRateFlatAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxRateFlatAmount {
      val jsonDecoder = decoder.requireJsonDecoder("TaxRateFlatAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxRateFlatAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return TaxRateFlatAmount(
        amount = amount,
        currency = currency,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxRateFlatAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxRateFlatAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxRateFlatAmount(block: TaxRateFlatAmount.Builder.() -> Unit): TaxRateFlatAmount = TaxRateFlatAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxRateFlatAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
