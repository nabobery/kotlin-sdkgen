package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
 * Source: sdkgen://source/openapi.json#/components/schemas/currency_option
 */
@Serializable(with = CurrencyOption.Serializer::class)
public class CurrencyOption(
  /**
   * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment
   * Links.
   */
  public val customUnitAmount: InlineCurrencyOptionCustomUnitAmountXb002e49e? = null,
  /**
   * Only required if a [default tax
   * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
   * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
   * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
   * `inclusive` or `exclusive`, it cannot be changed.
   */
  public val taxBehavior: InlineCurrencyOptionTaxBehaviorX674b7e80? = null,
  tiers: List<PriceTier>? = null,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only set
   * if `billing_scheme=per_unit`.
   */
  public val unitAmount: Int? = null,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
   * decimal places. Only set if `billing_scheme=per_unit`.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  /**
   * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
   * the documentation for `billing_scheme`.
   */
  public val tiers: List<PriceTier>? = tiers?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and
     * Payment Links.
     */
    public var customUnitAmount: InlineCurrencyOptionCustomUnitAmountXb002e49e? = null

    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
     * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
     * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public var taxBehavior: InlineCurrencyOptionTaxBehaviorX674b7e80? = null

    private var tiersValue: List<PriceTier>? = null

    /**
     * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
     * the documentation for `billing_scheme`.
     */
    public var tiers: List<PriceTier>?
      get() = tiersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tiersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only
     * set if `billing_scheme=per_unit`.
     */
    public var unitAmount: Int? = null

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
     * decimal places. Only set if `billing_scheme=per_unit`.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): CurrencyOption = CurrencyOption(
      customUnitAmount = customUnitAmount,
      taxBehavior = taxBehavior,
      tiers = tiers,
      unitAmount = unitAmount,
      unitAmountDecimal = unitAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CurrencyOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CurrencyOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CurrencyOption {
      val jsonDecoder = decoder.requireJsonDecoder("CurrencyOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CurrencyOption must be a JSON object")
      return CurrencyOption(
        customUnitAmount = rawObject["custom_unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCurrencyOptionCustomUnitAmountXb002e49e?>(element) },
        taxBehavior = rawObject["tax_behavior"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCurrencyOptionTaxBehaviorX674b7e80?>(element) },
        tiers = rawObject["tiers"]?.let { json.decodeFromJsonElement<List<PriceTier>>(it) },
        unitAmount = rawObject["unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CurrencyOption) {
      val jsonEncoder = encoder.requireJsonEncoder("CurrencyOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customUnitAmount?.let { put("custom_unit_amount", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.tiers?.let { put("tiers", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun currencyOption(block: CurrencyOption.Builder.() -> Unit): CurrencyOption = CurrencyOption.build(block)
