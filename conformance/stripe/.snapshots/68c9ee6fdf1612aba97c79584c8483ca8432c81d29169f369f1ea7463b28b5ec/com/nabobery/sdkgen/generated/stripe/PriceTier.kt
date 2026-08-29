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
 * Source: sdkgen://source/openapi.json#/components/schemas/price_tier
 */
@Serializable(with = PriceTier.Serializer::class)
public class PriceTier(
  /**
   * Price for the entire tier.
   */
  public val flatAmount: Int? = null,
  /**
   * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val flatAmountDecimal: String? = null,
  /**
   * Per unit price for units relevant to the tier.
   */
  public val unitAmount: Int? = null,
  /**
   * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
  /**
   * Up to and including to this quantity will be contained in the tier.
   */
  public val upTo: Int? = null,
) {
  public class Builder {
    /**
     * Price for the entire tier.
     */
    public var flatAmount: Int? = null

    /**
     * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var flatAmountDecimal: String? = null

    /**
     * Per unit price for units relevant to the tier.
     */
    public var unitAmount: Int? = null

    /**
     * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    /**
     * Up to and including to this quantity will be contained in the tier.
     */
    public var upTo: Int? = null

    public fun build(): PriceTier = PriceTier(
      flatAmount = flatAmount,
      flatAmountDecimal = flatAmountDecimal,
      unitAmount = unitAmount,
      unitAmountDecimal = unitAmountDecimal,
      upTo = upTo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PriceTier = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PriceTier> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PriceTier {
      val jsonDecoder = decoder.requireJsonDecoder("PriceTier")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PriceTier must be a JSON object")
      return PriceTier(
        flatAmount = rawObject["flat_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        flatAmountDecimal = rawObject["flat_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        unitAmount = rawObject["unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        upTo = rawObject["up_to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PriceTier) {
      val jsonEncoder = encoder.requireJsonEncoder("PriceTier")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
        value.flatAmountDecimal?.let { put("flat_amount_decimal", it) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
        value.upTo?.let { put("up_to", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun priceTier(block: PriceTier.Builder.() -> Unit): PriceTier = PriceTier.build(block)
