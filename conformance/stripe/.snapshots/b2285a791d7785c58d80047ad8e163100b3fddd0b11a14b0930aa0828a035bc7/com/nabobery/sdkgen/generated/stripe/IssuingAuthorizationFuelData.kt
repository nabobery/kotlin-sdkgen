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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingAuthorizationFuelDataView(
  @SerialName("industry_product_code")
  public val industryProductCode: String? = null,
  @SerialName("quantity_decimal")
  public val quantityDecimal: String? = null,
  public val type: InlineIssuingAuthorizationFuelDataTypeX66f3603f? = null,
  public val unit: InlineIssuingAuthorizationFuelDataUnitX94435e5d? = null,
  @SerialName("unit_cost_decimal")
  public val unitCostDecimal: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fuel_data
 */
@Serializable(with = IssuingAuthorizationFuelData.Serializer::class)
public class IssuingAuthorizationFuelData(
  /**
   * [Conexxus Payment System Product Code](https://www.conexxus.org/conexxus-payment-system-product-codes) identifying
   * the primary fuel product purchased.
   */
  public val industryProductCode: String? = null,
  /**
   * The quantity of `unit`s of fuel that was dispensed, represented as a decimal string with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  /**
   * The type of fuel that was purchased.
   */
  public val type: InlineIssuingAuthorizationFuelDataTypeX66f3603f? = null,
  /**
   * The units for `quantity_decimal`.
   */
  public val unit: InlineIssuingAuthorizationFuelDataUnitX94435e5d? = null,
  /**
   * The cost in cents per each unit of fuel, represented as a decimal string with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitCostDecimal: String? = null,
) {
  public class Builder {
    /**
     * [Conexxus Payment System Product Code](https://www.conexxus.org/conexxus-payment-system-product-codes)
     * identifying the primary fuel product purchased.
     */
    public var industryProductCode: String? = null

    /**
     * The quantity of `unit`s of fuel that was dispensed, represented as a decimal string with at most 12 decimal
     * places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    /**
     * The type of fuel that was purchased.
     */
    public var type: InlineIssuingAuthorizationFuelDataTypeX66f3603f? = null

    /**
     * The units for `quantity_decimal`.
     */
    public var unit: InlineIssuingAuthorizationFuelDataUnitX94435e5d? = null

    /**
     * The cost in cents per each unit of fuel, represented as a decimal string with at most 12 decimal places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitCostDecimal: String? = null

    public fun build(): IssuingAuthorizationFuelData = IssuingAuthorizationFuelData(
      industryProductCode = industryProductCode,
      quantityDecimal = quantityDecimal,
      type = type,
      unit = unit,
      unitCostDecimal = unitCostDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationFuelData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingAuthorizationFuelData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationFuelData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationFuelData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationFuelData must be a JSON object")
      return IssuingAuthorizationFuelData(
        industryProductCode = rawObject["industry_product_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFuelDataTypeX66f3603f?>(element) },
        unit = rawObject["unit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFuelDataUnitX94435e5d?>(element) },
        unitCostDecimal = rawObject["unit_cost_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationFuelData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationFuelData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.industryProductCode?.let { put("industry_product_code", it) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.unit?.let { put("unit", json.encodeToJsonElement(it)) }
        value.unitCostDecimal?.let { put("unit_cost_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationFuelData(block: IssuingAuthorizationFuelData.Builder.() -> Unit): IssuingAuthorizationFuelData = IssuingAuthorizationFuelData.build(block)
