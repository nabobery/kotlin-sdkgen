package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema
 */
@Serializable(with = InlineV1ProductsPostRequestFormX3fd7ded7.Serializer::class)
public class InlineV1ProductsPostRequestFormX3fd7ded7(
  /**
   * Whether the product is available for purchase.
   */
  public val active: Boolean? = null,
  /**
   * The ID of the [Price](https://docs.stripe.com/api/prices) object that is the default price for this product.
   */
  public val defaultPrice: String? = null,
  /**
   * The product's description, meant to be displayable to the customer. Use this field to optionally store a long form
   * explanation of the product being sold for your own rendering purposes.
   */
  public val description: InlineV1ProductsPostRequestFormDescriptionX1695ae95? = null,
  expand: List<String>? = null,
  /**
   * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
   */
  public val images: InlineV1ProductsPostRequestFormImagesX81d5d48f? = null,
  /**
   * A list of up to 15 marketing features for this product. These are displayed in [pricing
   * tables](https://docs.stripe.com/payments/checkout/pricing-table).
   */
  public val marketingFeatures: InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1ProductsPostRequestFormMetadataXa7c50b95? = null,
  /**
   * The product's name, meant to be displayable to the customer.
   */
  public val name: String? = null,
  /**
   * The dimensions of this product for shipping purposes.
   */
  public val packageDimensions: InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95? = null,
  /**
   * Whether this product is shipped (i.e., physical goods).
   */
  public val shippable: Boolean? = null,
  /**
   * An arbitrary string to be displayed on your customer's credit card or bank statement. While most banks display this
   * information consistently, some may display it incorrectly or not at all.
   *
   * This may be up to 22 characters. The statement description may not include `<`, `>`, `\`, `"`, `'` characters, and
   * will appear on your customer's statement in capital letters. Non-ASCII characters are automatically stripped.
   * It must contain at least one letter. May only be set if `type=service`. Only used for subscription payments.
   */
  public val statementDescriptor: String? = null,
  /**
   * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
   */
  public val taxCode: InlineV1ProductsPostRequestFormTaxCodeXedb946d2? = null,
  /**
   * A label that represents units of this product. When set, this will be included in customers' receipts, invoices,
   * Checkout, and the customer portal. May only be set if `type=service`.
   */
  public val unitLabel: InlineV1ProductsPostRequestFormUnitLabelX6c533a49? = null,
  /**
   * A URL of a publicly-accessible webpage for this product.
   */
  public val url: InlineV1ProductsPostRequestFormUrlX9c1340a7? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether the product is available for purchase.
     */
    public var active: Boolean? = null

    /**
     * The ID of the [Price](https://docs.stripe.com/api/prices) object that is the default price for this product.
     */
    public var defaultPrice: String? = null

    /**
     * The product's description, meant to be displayable to the customer. Use this field to optionally store a long
     * form explanation of the product being sold for your own rendering purposes.
     */
    public var description: InlineV1ProductsPostRequestFormDescriptionX1695ae95? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
     */
    public var images: InlineV1ProductsPostRequestFormImagesX81d5d48f? = null

    /**
     * A list of up to 15 marketing features for this product. These are displayed in [pricing
     * tables](https://docs.stripe.com/payments/checkout/pricing-table).
     */
    public var marketingFeatures: InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1ProductsPostRequestFormMetadataXa7c50b95? = null

    /**
     * The product's name, meant to be displayable to the customer.
     */
    public var name: String? = null

    /**
     * The dimensions of this product for shipping purposes.
     */
    public var packageDimensions: InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95? = null

    /**
     * Whether this product is shipped (i.e., physical goods).
     */
    public var shippable: Boolean? = null

    /**
     * An arbitrary string to be displayed on your customer's credit card or bank statement. While most banks display
     * this information consistently, some may display it incorrectly or not at all.
     *
     * This may be up to 22 characters. The statement description may not include `<`, `>`, `\`, `"`, `'` characters,
     * and will appear on your customer's statement in capital letters. Non-ASCII characters are automatically stripped.
     * It must contain at least one letter. May only be set if `type=service`. Only used for subscription payments.
     */
    public var statementDescriptor: String? = null

    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
     */
    public var taxCode: InlineV1ProductsPostRequestFormTaxCodeXedb946d2? = null

    /**
     * A label that represents units of this product. When set, this will be included in customers' receipts, invoices,
     * Checkout, and the customer portal. May only be set if `type=service`.
     */
    public var unitLabel: InlineV1ProductsPostRequestFormUnitLabelX6c533a49? = null

    /**
     * A URL of a publicly-accessible webpage for this product.
     */
    public var url: InlineV1ProductsPostRequestFormUrlX9c1340a7? = null

    public fun build(): InlineV1ProductsPostRequestFormX3fd7ded7 = InlineV1ProductsPostRequestFormX3fd7ded7(
      active = active,
      defaultPrice = defaultPrice,
      description = description,
      expand = expand,
      images = images,
      marketingFeatures = marketingFeatures,
      metadata = metadata,
      name = name,
      packageDimensions = packageDimensions,
      shippable = shippable,
      statementDescriptor = statementDescriptor,
      taxCode = taxCode,
      unitLabel = unitLabel,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormX3fd7ded7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormX3fd7ded7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormX3fd7ded7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormX3fd7ded7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormX3fd7ded7 must be a JSON object")
      return InlineV1ProductsPostRequestFormX3fd7ded7(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        defaultPrice = rawObject["default_price"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormDescriptionX1695ae95>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        images = rawObject["images"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormImagesX81d5d48f>(it) },
        marketingFeatures = rawObject["marketing_features"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormMetadataXa7c50b95>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        packageDimensions = rawObject["package_dimensions"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95>(it) },
        shippable = rawObject["shippable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormTaxCodeXedb946d2>(it) },
        unitLabel = rawObject["unit_label"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormUnitLabelX6c533a49>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<InlineV1ProductsPostRequestFormUrlX9c1340a7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormX3fd7ded7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormX3fd7ded7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.defaultPrice?.let { put("default_price", it) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.images?.let { put("images", json.encodeToJsonElement(it)) }
        value.marketingFeatures?.let { put("marketing_features", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.packageDimensions?.let { put("package_dimensions", json.encodeToJsonElement(it)) }
        value.shippable?.let { put("shippable", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
        value.unitLabel?.let { put("unit_label", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsPostRequestFormX3fd7ded7(block: InlineV1ProductsPostRequestFormX3fd7ded7.Builder.() -> Unit): InlineV1ProductsPostRequestFormX3fd7ded7 = InlineV1ProductsPostRequestFormX3fd7ded7.build(block)
