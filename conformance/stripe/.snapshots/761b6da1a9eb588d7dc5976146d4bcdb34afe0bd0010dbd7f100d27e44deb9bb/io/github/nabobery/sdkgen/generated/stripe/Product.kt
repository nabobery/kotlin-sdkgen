package io.github.nabobery.sdkgen.generated.stripe

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
public data class ProductView internal constructor(
  public val active: Boolean,
  public val created: Int,
  @SerialName("default_price")
  public val defaultPrice: InlineProductDefaultPriceX5e5c27b1? = null,
  public val description: String? = null,
  public val id: String,
  public val images: List<String>,
  public val livemode: Boolean,
  @SerialName("marketing_features")
  public val marketingFeatures: List<ProductMarketingFeature>,
  public val metadata: Map<String, String>,
  public val name: String,
  @SerialName("object")
  public val objectValue: InlineProductObjectValueXe481ef09,
  @SerialName("package_dimensions")
  public val packageDimensions: InlineProductPackageDimensionsX11badd14? = null,
  public val shippable: Boolean? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  @SerialName("tax_code")
  public val taxCode: InlineProductTaxCodeXef95fe7f? = null,
  @SerialName("unit_label")
  public val unitLabel: String? = null,
  public val updated: Int,
  public val url: String? = null,
)

/**
 * Products describe the specific goods or services you offer to your customers.
 * For example, you might offer a Standard and Premium version of your goods or service; each version would be a
 * separate Product.
 * They can be used in conjunction with [Prices](https://api.stripe.com#prices) to configure pricing in Payment Links,
 * Checkout, and Subscriptions.
 *
 * Related guides: [Set up a subscription](https://docs.stripe.com/billing/subscriptions/set-up-subscription),
 * [share a Payment Link](https://docs.stripe.com/payment-links),
 * [accept payments with Checkout](https://docs.stripe.com/payments/accept-a-payment#create-product-prices-upfront),
 * and more about [Products and Prices](https://docs.stripe.com/products-prices/overview)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/product
 */
@Serializable(with = Product.Serializer::class)
public class Product(
  /**
   * Whether the product is currently available for purchase.
   */
  public val active: Boolean,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  images: List<String>,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  marketingFeatures: List<ProductMarketingFeature>,
  metadata: Map<String, String>,
  /**
   * The product's name, meant to be displayable to the customer.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineProductObjectValueXe481ef09,
  /**
   * Time at which the object was last updated. Measured in seconds since the Unix epoch.
   */
  public val updated: Int,
  /**
   * The ID of the [Price](https://docs.stripe.com/api/prices) object that is the default price for this product.
   */
  public val defaultPrice: InlineProductDefaultPriceX5e5c27b1? = null,
  /**
   * The product's description, meant to be displayable to the customer. Use this field to optionally store a long form
   * explanation of the product being sold for your own rendering purposes.
   */
  public val description: String? = null,
  /**
   * The dimensions of this product for shipping purposes.
   */
  public val packageDimensions: InlineProductPackageDimensionsX11badd14? = null,
  /**
   * Whether this product is shipped (i.e., physical goods).
   */
  public val shippable: Boolean? = null,
  /**
   * Extra information about a product which will appear on your customer's credit card statement. In the case that
   * multiple products are billed at once, the first statement descriptor will be used. Only used for subscription
   * payments.
   */
  public val statementDescriptor: String? = null,
  /**
   * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
   */
  public val taxCode: InlineProductTaxCodeXef95fe7f? = null,
  /**
   * A label that represents units of this product. When set, this will be included in customers' receipts, invoices,
   * Checkout, and the customer portal.
   */
  public val unitLabel: String? = null,
  /**
   * A URL of a publicly-accessible webpage for this product.
   */
  public val url: String? = null,
) {
  /**
   * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
   */
  public val images: List<String> = images.toList()

  /**
   * A list of up to 15 marketing features for this product. These are displayed in [pricing
   * tables](https://docs.stripe.com/payments/checkout/pricing-table).
   */
  public val marketingFeatures: List<ProductMarketingFeature> = marketingFeatures.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var imagesValue: List<String>? = null

    public var images: List<String>
      get() = requireNotNull(imagesValue) { "images is required" }.toList()
      set(`value`) {
        imagesValue = value.toList()
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var marketingFeaturesValue: List<ProductMarketingFeature>? = null

    public var marketingFeatures: List<ProductMarketingFeature>
      get() = requireNotNull(marketingFeaturesValue) { "marketingFeatures is required" }.toList()
      set(`value`) {
        marketingFeaturesValue = value.toList()
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineProductObjectValueXe481ef09? = null

    public var objectValue: InlineProductObjectValueXe481ef09
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var updatedValue: Int? = null

    public var updated: Int
      get() = requireNotNull(updatedValue) { "updated is required" }
      set(`value`) {
        updatedValue = value
      }

    /**
     * The ID of the [Price](https://docs.stripe.com/api/prices) object that is the default price for this product.
     */
    public var defaultPrice: InlineProductDefaultPriceX5e5c27b1? = null

    /**
     * The product's description, meant to be displayable to the customer. Use this field to optionally store a long
     * form explanation of the product being sold for your own rendering purposes.
     */
    public var description: String? = null

    /**
     * The dimensions of this product for shipping purposes.
     */
    public var packageDimensions: InlineProductPackageDimensionsX11badd14? = null

    /**
     * Whether this product is shipped (i.e., physical goods).
     */
    public var shippable: Boolean? = null

    /**
     * Extra information about a product which will appear on your customer's credit card statement. In the case that
     * multiple products are billed at once, the first statement descriptor will be used. Only used for subscription
     * payments.
     */
    public var statementDescriptor: String? = null

    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
     */
    public var taxCode: InlineProductTaxCodeXef95fe7f? = null

    /**
     * A label that represents units of this product. When set, this will be included in customers' receipts, invoices,
     * Checkout, and the customer portal.
     */
    public var unitLabel: String? = null

    /**
     * A URL of a publicly-accessible webpage for this product.
     */
    public var url: String? = null

    public fun build(): Product {
      check(activeValue != null) { "active is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(imagesValue != null) { "images is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(marketingFeaturesValue != null) { "marketingFeatures is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(updatedValue != null) { "updated is required" }
      return Product(
        active = active,
        created = created,
        id = id,
        images = images,
        livemode = livemode,
        marketingFeatures = marketingFeatures,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
        updated = updated,
        defaultPrice = defaultPrice,
        description = description,
        packageDimensions = packageDimensions,
        shippable = shippable,
        statementDescriptor = statementDescriptor,
        taxCode = taxCode,
        unitLabel = unitLabel,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Product = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Product> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Product {
      val jsonDecoder = decoder.requireJsonDecoder("Product")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Product must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val images = json.decodeRequired<List<String>>(rawObject, "images")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val marketingFeatures = json.decodeRequired<List<ProductMarketingFeature>>(rawObject, "marketing_features")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineProductObjectValueXe481ef09>(rawObject, "object")
      val updated = json.decodeRequired<Int>(rawObject, "updated")
      return Product(
        active = active,
        created = created,
        id = id,
        images = images,
        livemode = livemode,
        marketingFeatures = marketingFeatures,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
        updated = updated,
        defaultPrice = rawObject["default_price"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProductDefaultPriceX5e5c27b1?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        packageDimensions = rawObject["package_dimensions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProductPackageDimensionsX11badd14?>(element) },
        shippable = rawObject["shippable"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxCode = rawObject["tax_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProductTaxCodeXef95fe7f?>(element) },
        unitLabel = rawObject["unit_label"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Product) {
      val jsonEncoder = encoder.requireJsonEncoder("Product")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("images", json.encodeToJsonElement(value.images))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("marketing_features", json.encodeToJsonElement(value.marketingFeatures))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("updated", json.encodeToJsonElement(value.updated))
        value.defaultPrice?.let { put("default_price", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.packageDimensions?.let { put("package_dimensions", json.encodeToJsonElement(it)) }
        value.shippable?.let { put("shippable", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
        value.unitLabel?.let { put("unit_label", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun product(block: Product.Builder.() -> Unit): Product = Product.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Product is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
