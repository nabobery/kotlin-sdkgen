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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tiers/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tiers/items
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0(
  public val upTo: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153,
  public val flatAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val flatAmountDecimal: String? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public class Builder {
    private var upToValue:
        InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153? = null

    public var upTo: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153
      get() = requireNotNull(upToValue) { "upTo is required" }
      set(`value`) {
        upToValue = value
      }

    public var flatAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var flatAmountDecimal: String? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 {
      check(upToValue != null) { "upTo is required" }
      return InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0(
        upTo = upTo,
        flatAmount = flatAmount,
        flatAmountDecimal = flatAmountDecimal,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 must be a JSON object")
      val upTo = json.decodeRequired<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153>(rawObject, "up_to")
      return InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0(
        upTo = upTo,
        flatAmount = rawObject["flat_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        flatAmountDecimal = rawObject["flat_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("up_to", json.encodeToJsonElement(value.upTo))
        value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
        value.flatAmountDecimal?.let { put("flat_amount_decimal", it) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0(block: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0.Builder.() -> Unit): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 = InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersItemXb92990b0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
