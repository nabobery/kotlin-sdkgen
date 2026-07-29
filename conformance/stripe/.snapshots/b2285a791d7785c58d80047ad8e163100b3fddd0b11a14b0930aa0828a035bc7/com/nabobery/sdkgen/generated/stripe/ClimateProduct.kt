package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class ClimateProductView internal constructor(
  public val created: Int,
  @SerialName("current_prices_per_metric_ton")
  public val currentPricesPerMetricTon: Map<String, ClimateRemovalsProductsPrice>,
  @SerialName("delivery_year")
  public val deliveryYear: Int? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("metric_tons_available")
  public val metricTonsAvailable: String,
  public val name: String,
  @SerialName("object")
  public val objectValue: InlineClimateProductObjectValueX0611ac1a,
  public val suppliers: List<ClimateSupplier>,
)

/**
 * A Climate product represents a type of carbon removal unit available for reservation.
 * You can retrieve it to see the current price and availability.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.product
 */
@Serializable(with = ClimateProduct.Serializer::class)
public class ClimateProduct(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  currentPricesPerMetricTon: Map<String, ClimateRemovalsProductsPrice>,
  /**
   * Unique identifier for the object. For convenience, Climate product IDs are human-readable strings
   * that start with `climsku_`. See [carbon removal
   * inventory](https://stripe.com/docs/climate/orders/carbon-removal-inventory)
   * for a list of available carbon removal products.
   */
  public val id: String,
  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
   */
  public val livemode: Boolean,
  /**
   * The quantity of metric tons available for reservation.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val metricTonsAvailable: String,
  /**
   * The Climate product's name.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineClimateProductObjectValueX0611ac1a,
  suppliers: List<ClimateSupplier>,
  /**
   * The year in which the carbon removal is expected to be delivered.
   */
  public val deliveryYear: Int? = null,
) {
  /**
   * Current prices for a metric ton of carbon removal in a currency's smallest unit.
   */
  public val currentPricesPerMetricTon: Map<String, ClimateRemovalsProductsPrice> =
      currentPricesPerMetricTon.toMap()

  /**
   * The carbon removal suppliers that fulfill orders for this Climate product.
   */
  public val suppliers: List<ClimateSupplier> = suppliers.toList()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currentPricesPerMetricTonValue: Map<String, ClimateRemovalsProductsPrice>? = null

    public var currentPricesPerMetricTon: Map<String, ClimateRemovalsProductsPrice>
      get() = requireNotNull(currentPricesPerMetricTonValue) { "currentPricesPerMetricTon is required" }.toMap()
      set(`value`) {
        currentPricesPerMetricTonValue = value.toMap()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metricTonsAvailableValue: String? = null

    public var metricTonsAvailable: String
      get() = requireNotNull(metricTonsAvailableValue) { "metricTonsAvailable is required" }
      set(`value`) {
        metricTonsAvailableValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineClimateProductObjectValueX0611ac1a? = null

    public var objectValue: InlineClimateProductObjectValueX0611ac1a
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var suppliersValue: List<ClimateSupplier>? = null

    public var suppliers: List<ClimateSupplier>
      get() = requireNotNull(suppliersValue) { "suppliers is required" }.toList()
      set(`value`) {
        suppliersValue = value.toList()
      }

    /**
     * The year in which the carbon removal is expected to be delivered.
     */
    public var deliveryYear: Int? = null

    public fun build(): ClimateProduct {
      check(createdValue != null) { "created is required" }
      check(currentPricesPerMetricTonValue != null) { "currentPricesPerMetricTon is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metricTonsAvailableValue != null) { "metricTonsAvailable is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(suppliersValue != null) { "suppliers is required" }
      return ClimateProduct(
        created = created,
        currentPricesPerMetricTon = currentPricesPerMetricTon,
        id = id,
        livemode = livemode,
        metricTonsAvailable = metricTonsAvailable,
        name = name,
        objectValue = objectValue,
        suppliers = suppliers,
        deliveryYear = deliveryYear,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClimateProduct = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ClimateProduct> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClimateProduct {
      val jsonDecoder = decoder.requireJsonDecoder("ClimateProduct")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClimateProduct must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currentPricesPerMetricTon = json.decodeRequired<Map<String, ClimateRemovalsProductsPrice>>(rawObject, "current_prices_per_metric_ton")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metricTonsAvailable = json.decodeRequired<String>(rawObject, "metric_tons_available")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineClimateProductObjectValueX0611ac1a>(rawObject, "object")
      val suppliers = json.decodeRequired<List<ClimateSupplier>>(rawObject, "suppliers")
      return ClimateProduct(
        created = created,
        currentPricesPerMetricTon = currentPricesPerMetricTon,
        id = id,
        livemode = livemode,
        metricTonsAvailable = metricTonsAvailable,
        name = name,
        objectValue = objectValue,
        suppliers = suppliers,
        deliveryYear = rawObject["delivery_year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClimateProduct) {
      val jsonEncoder = encoder.requireJsonEncoder("ClimateProduct")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("current_prices_per_metric_ton", json.encodeToJsonElement(value.currentPricesPerMetricTon))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metric_tons_available", value.metricTonsAvailable)
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("suppliers", json.encodeToJsonElement(value.suppliers))
        value.deliveryYear?.let { put("delivery_year", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun climateProduct(block: ClimateProduct.Builder.() -> Unit): ClimateProduct = ClimateProduct.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClimateProduct is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
