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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766.Serializer::class)
public class InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766(
  public val customUnitAmount:
      InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX941990ea? = null,
  public val taxBehavior:
      InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b? = null,
  tiers: List<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6>? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val tiers:
      List<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6>? =
      tiers?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var customUnitAmount:
        InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX941990ea? = null

    public var taxBehavior: InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b? =
        null

    private var tiersValue:
        List<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6>? = null

    public var tiers:
        List<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6>?
      get() = tiersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tiersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766 = InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766(
      customUnitAmount = customUnitAmount,
      taxBehavior = taxBehavior,
      tiers = tiers,
      unitAmount = unitAmount,
      unitAmountDecimal = unitAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766 must be a JSON object")
      return InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766(
        customUnitAmount = rawObject["custom_unit_amount"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX941990ea>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataTaxBehaviorXd1346b5b>(it) },
        tiers = rawObject["tiers"]?.let { json.decodeFromJsonElement<List<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsItemX80c17ef6>>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766")
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

public fun inlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766(block: InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766.Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766 = InlineV1ProductsPostRequestFormDefaultPriceDataAdditionalValueX31f90766.build(block)
