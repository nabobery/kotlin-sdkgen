package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put

@Serializable
public data class IssuingTransactionFuelDataView(
  @SerialName("industry_product_code")
  public val industryProductCode: String? = null,
  @SerialName("quantity_decimal")
  public val quantityDecimal: String? = null,
  public val type: String,
  public val unit: String,
  @SerialName("unit_cost_decimal")
  public val unitCostDecimal: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fuel_data
 */
@Serializable(with = IssuingTransactionFuelData.Serializer::class)
public class IssuingTransactionFuelData(
  /**
   * The type of fuel that was purchased. One of `diesel`, `unleaded_plus`, `unleaded_regular`, `unleaded_super`, or
   * `other`.
   */
  public val type: String,
  /**
   * The units for `quantity_decimal`. One of `charging_minute`, `imperial_gallon`, `kilogram`, `kilowatt_hour`,
   * `liter`, `pound`, `us_gallon`, or `other`.
   */
  public val unit: String,
  /**
   * The cost in cents per each unit of fuel, represented as a decimal string with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitCostDecimal: String,
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
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var unitValue: String? = null

    public var unit: String
      get() = requireNotNull(unitValue) { "unit is required" }
      set(`value`) {
        unitValue = value
      }

    private var unitCostDecimalValue: String? = null

    public var unitCostDecimal: String
      get() = requireNotNull(unitCostDecimalValue) { "unitCostDecimal is required" }
      set(`value`) {
        unitCostDecimalValue = value
      }

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

    public fun build(): IssuingTransactionFuelData {
      check(typeValue != null) { "type is required" }
      check(unitValue != null) { "unit is required" }
      check(unitCostDecimalValue != null) { "unitCostDecimal is required" }
      return IssuingTransactionFuelData(
        type = type,
        unit = unit,
        unitCostDecimal = unitCostDecimal,
        industryProductCode = industryProductCode,
        quantityDecimal = quantityDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionFuelData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionFuelData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionFuelData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFuelData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionFuelData must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      val unit = json.decodeRequired<String>(rawObject, "unit")
      val unitCostDecimal = json.decodeRequired<String>(rawObject, "unit_cost_decimal")
      return IssuingTransactionFuelData(
        type = type,
        unit = unit,
        unitCostDecimal = unitCostDecimal,
        industryProductCode = rawObject["industry_product_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionFuelData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFuelData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        put("unit", value.unit)
        put("unit_cost_decimal", value.unitCostDecimal)
        value.industryProductCode?.let { put("industry_product_code", it) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionFuelData(block: IssuingTransactionFuelData.Builder.() -> Unit): IssuingTransactionFuelData = IssuingTransactionFuelData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingTransactionFuelData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
