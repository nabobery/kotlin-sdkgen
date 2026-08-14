package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_defaults
 */
@Serializable(with = TaxProductResourceTaxSettingsDefaults.Serializer::class)
public class TaxProductResourceTaxSettingsDefaults(
  /**
   * The tax calculation provider this account uses. Defaults to `stripe` when not using a [third-party
   * provider](/tax/third-party-apps).
   */
  public val provider: InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1,
  /**
   * Default [tax behavior](https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior) used
   * to specify whether the price is considered inclusive of taxes or exclusive of taxes. If the item's price has a tax
   * behavior set, it will take precedence over the default tax behavior.
   */
  public val taxBehavior: InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb? = null,
  /**
   * Default [tax code](https://stripe.com/docs/tax/tax-categories) used to classify your products and prices.
   */
  public val taxCode: String? = null,
) {
  public class Builder {
    private var providerValue: InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1? = null

    public var provider: InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    /**
     * Default [tax behavior](https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior) used
     * to specify whether the price is considered inclusive of taxes or exclusive of taxes. If the item's price has a
     * tax behavior set, it will take precedence over the default tax behavior.
     */
    public var taxBehavior: InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb? = null

    /**
     * Default [tax code](https://stripe.com/docs/tax/tax-categories) used to classify your products and prices.
     */
    public var taxCode: String? = null

    public fun build(): TaxProductResourceTaxSettingsDefaults {
      check(providerValue != null) { "provider is required" }
      return TaxProductResourceTaxSettingsDefaults(
        provider = provider,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxSettingsDefaults = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceTaxSettingsDefaults> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxSettingsDefaults {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxSettingsDefaults")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxSettingsDefaults must be a JSON object")
      val provider = json.decodeRequired<InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1>(rawObject, "provider")
      return TaxProductResourceTaxSettingsDefaults(
        provider = provider,
        taxBehavior = rawObject["tax_behavior"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxProductResourceTaxSettingsDefaultsTaxBehaviorX5e15d3cb?>(element) },
        taxCode = rawObject["tax_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxSettingsDefaults) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxSettingsDefaults")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("provider", json.encodeToJsonElement(value.provider))
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxSettingsDefaults(block: TaxProductResourceTaxSettingsDefaults.Builder.() -> Unit): TaxProductResourceTaxSettingsDefaults = TaxProductResourceTaxSettingsDefaults.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceTaxSettingsDefaults is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
