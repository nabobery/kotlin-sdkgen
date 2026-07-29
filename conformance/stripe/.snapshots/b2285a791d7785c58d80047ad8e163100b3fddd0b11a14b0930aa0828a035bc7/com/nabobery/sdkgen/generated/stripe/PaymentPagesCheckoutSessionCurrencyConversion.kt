package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
public data class PaymentPagesCheckoutSessionCurrencyConversionView(
  @SerialName("amount_subtotal")
  public val amountSubtotal: Int,
  @SerialName("amount_total")
  public val amountTotal: Int,
  @SerialName("fx_rate")
  public val fxRate: String,
  @SerialName("source_currency")
  public val sourceCurrency: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_currency_conversion
 */
@Serializable(with = PaymentPagesCheckoutSessionCurrencyConversion.Serializer::class)
public class PaymentPagesCheckoutSessionCurrencyConversion(
  /**
   * Total of all items in source currency before discounts or taxes are applied.
   */
  public val amountSubtotal: Int,
  /**
   * Total of all items in source currency after discounts and taxes are applied.
   */
  public val amountTotal: Int,
  /**
   * Exchange rate used to convert source currency amounts to customer currency amounts
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val fxRate: String,
  /**
   * Creation currency of the CheckoutSession before localization
   */
  public val sourceCurrency: String,
) {
  public class Builder {
    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    private var fxRateValue: String? = null

    public var fxRate: String
      get() = requireNotNull(fxRateValue) { "fxRate is required" }
      set(`value`) {
        fxRateValue = value
      }

    private var sourceCurrencyValue: String? = null

    public var sourceCurrency: String
      get() = requireNotNull(sourceCurrencyValue) { "sourceCurrency is required" }
      set(`value`) {
        sourceCurrencyValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionCurrencyConversion {
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      check(fxRateValue != null) { "fxRate is required" }
      check(sourceCurrencyValue != null) { "sourceCurrency is required" }
      return PaymentPagesCheckoutSessionCurrencyConversion(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        fxRate = fxRate,
        sourceCurrency = sourceCurrency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCurrencyConversion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionCurrencyConversion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCurrencyConversion {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCurrencyConversion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCurrencyConversion must be a JSON object")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val fxRate = json.decodeRequired<String>(rawObject, "fx_rate")
      val sourceCurrency = json.decodeRequired<String>(rawObject, "source_currency")
      return PaymentPagesCheckoutSessionCurrencyConversion(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        fxRate = fxRate,
        sourceCurrency = sourceCurrency,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCurrencyConversion) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCurrencyConversion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("fx_rate", value.fxRate)
        put("source_currency", value.sourceCurrency)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCurrencyConversion(block: PaymentPagesCheckoutSessionCurrencyConversion.Builder.() -> Unit): PaymentPagesCheckoutSessionCurrencyConversion = PaymentPagesCheckoutSessionCurrencyConversion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCurrencyConversion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
