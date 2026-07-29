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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35(
  public val customUnitAmount:
      InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1CustomUnitAmountXfa527c22? = null,
  public val taxBehavior:
      InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e? = null,
  tiers: List<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueItemXd1232d66>? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val tiers:
      List<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueItemXd1232d66>? =
      tiers?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var customUnitAmount:
        InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1CustomUnitAmountXfa527c22? = null

    public var taxBehavior: InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e?
        = null

    private var tiersValue:
        List<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueItemXd1232d66>? = null

    public var tiers:
        List<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueItemXd1232d66>?
      get() = tiersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tiersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35 = InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35(
      customUnitAmount = customUnitAmount,
      taxBehavior = taxBehavior,
      tiers = tiers,
      unitAmount = unitAmount,
      unitAmountDecimal = unitAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35 must be a JSON object")
      return InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35(
        customUnitAmount = rawObject["custom_unit_amount"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1CustomUnitAmountXfa527c22>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e>(it) },
        tiers = rawObject["tiers"]?.let { json.decodeFromJsonElement<List<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueItemXd1232d66>>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35")
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

public fun inlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35(block: InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35.Builder.() -> Unit): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35 = InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueX50480c35.build(block)
