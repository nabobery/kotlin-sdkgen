package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put

@Serializable
public data class IssuingTransactionFleetNonFuelPriceDataView(
  @SerialName("gross_amount_decimal")
  public val grossAmountDecimal: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_non_fuel_price_data
 */
@Serializable(with = IssuingTransactionFleetNonFuelPriceData.Serializer::class)
public class IssuingTransactionFleetNonFuelPriceData(
  /**
   * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val grossAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var grossAmountDecimal: String? = null

    public fun build(): IssuingTransactionFleetNonFuelPriceData = IssuingTransactionFleetNonFuelPriceData(
      grossAmountDecimal = grossAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionFleetNonFuelPriceData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionFleetNonFuelPriceData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionFleetNonFuelPriceData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFleetNonFuelPriceData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionFleetNonFuelPriceData must be a JSON object")
      return IssuingTransactionFleetNonFuelPriceData(
        grossAmountDecimal = rawObject["gross_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionFleetNonFuelPriceData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFleetNonFuelPriceData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.grossAmountDecimal?.let { put("gross_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionFleetNonFuelPriceData(block: IssuingTransactionFleetNonFuelPriceData.Builder.() -> Unit): IssuingTransactionFleetNonFuelPriceData = IssuingTransactionFleetNonFuelPriceData.build(block)
