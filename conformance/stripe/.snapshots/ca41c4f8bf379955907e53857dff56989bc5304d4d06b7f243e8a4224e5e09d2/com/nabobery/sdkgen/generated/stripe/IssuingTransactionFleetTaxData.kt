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
public data class IssuingTransactionFleetTaxDataView(
  @SerialName("local_amount_decimal")
  public val localAmountDecimal: String? = null,
  @SerialName("national_amount_decimal")
  public val nationalAmountDecimal: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_tax_data
 */
@Serializable(with = IssuingTransactionFleetTaxData.Serializer::class)
public class IssuingTransactionFleetTaxData(
  /**
   * Amount of state or provincial Sales Tax included in the transaction amount. Null if not reported by merchant or not
   * subject to tax.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val localAmountDecimal: String? = null,
  /**
   * Amount of national Sales Tax or VAT included in the transaction amount. Null if not reported by merchant or not
   * subject to tax.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val nationalAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Amount of state or provincial Sales Tax included in the transaction amount. Null if not reported by merchant or
     * not subject to tax.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var localAmountDecimal: String? = null

    /**
     * Amount of national Sales Tax or VAT included in the transaction amount. Null if not reported by merchant or not
     * subject to tax.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var nationalAmountDecimal: String? = null

    public fun build(): IssuingTransactionFleetTaxData = IssuingTransactionFleetTaxData(
      localAmountDecimal = localAmountDecimal,
      nationalAmountDecimal = nationalAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionFleetTaxData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionFleetTaxData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionFleetTaxData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFleetTaxData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionFleetTaxData must be a JSON object")
      return IssuingTransactionFleetTaxData(
        localAmountDecimal = rawObject["local_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nationalAmountDecimal = rawObject["national_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionFleetTaxData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFleetTaxData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.localAmountDecimal?.let { put("local_amount_decimal", it) }
        value.nationalAmountDecimal?.let { put("national_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionFleetTaxData(block: IssuingTransactionFleetTaxData.Builder.() -> Unit): IssuingTransactionFleetTaxData = IssuingTransactionFleetTaxData.build(block)
