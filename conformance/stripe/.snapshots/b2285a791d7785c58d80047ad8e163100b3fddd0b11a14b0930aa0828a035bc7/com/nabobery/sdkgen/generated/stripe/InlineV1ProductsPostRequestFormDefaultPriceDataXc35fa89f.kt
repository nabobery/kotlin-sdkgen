package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object. This Price will be set as the default
 * price for this product.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f.Serializer::class)
public class InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  currencyOptions: Map<String, InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766>? = null,
  public val customUnitAmount:
      InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626? = null,
  metadata: Map<String, String>? = null,
  public val recurring: InlineV1ProductsPostRequestFormDefaultPriceDataRecurringX5a8b0783? = null,
  public val taxBehavior:
      InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorX82b5e45a? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var currencyOptionsValue:
        Map<String, InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766>? = null

    public var currencyOptions:
        Map<String, InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var customUnitAmount:
        InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var recurring: InlineV1ProductsPostRequestFormDefaultPriceDataRecurringX5a8b0783? = null

    public var taxBehavior: InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorX82b5e45a? =
        null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f {
      check(currencyValue != null) { "currency is required" }
      return InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f(
        currency = currency,
        currencyOptions = currencyOptions,
        customUnitAmount = customUnitAmount,
        metadata = metadata,
        recurring = recurring,
        taxBehavior = taxBehavior,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f(
        currency = currency,
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766>>(it) },
        customUnitAmount = rawObject["custom_unit_amount"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        recurring = rawObject["recurring"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataRecurringX5a8b0783>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorX82b5e45a>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.customUnitAmount?.let { put("custom_unit_amount", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f(block: InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f.Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f = InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ProductsPostRequestFormDefaultPriceDataXc35fa89f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
