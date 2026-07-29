package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_rates~1{tax_rate}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_rates~1{tax_rate}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema
 */
@Serializable(with = InlineV1TaxRatesPostRequestFormX4d52a369.Serializer::class)
public class InlineV1TaxRatesPostRequestFormX4d52a369(
  /**
   * Flag determining whether the tax rate is active or inactive (archived). Inactive tax rates cannot be used with new
   * applications or Checkout Sessions, but will still work for subscriptions and invoices that already have it set.
   */
  public val active: Boolean? = null,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String? = null,
  /**
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
   */
  public val description: String? = null,
  /**
   * The display name of the tax rate, which will be shown to users.
   */
  public val displayName: String? = null,
  expand: List<String>? = null,
  /**
   * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It also appears on your
   * customer’s invoice.
   */
  public val jurisdiction: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1TaxRatesPostRequestFormMetadataX8ae6ab0e? = null,
  /**
   * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example, "NY"
   * for New York, United States.
   */
  public val state: String? = null,
  /**
   * The high-level tax type, such as `vat` or `sales_tax`.
   */
  public val taxType: InlineV1TaxRatesPostRequestFormTaxTypeX4d1ebbe5? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Flag determining whether the tax rate is active or inactive (archived). Inactive tax rates cannot be used with
     * new applications or Checkout Sessions, but will still work for subscriptions and invoices that already have it
     * set.
     */
    public var active: Boolean? = null

    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public var country: String? = null

    /**
     * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your
     * customers.
     */
    public var description: String? = null

    /**
     * The display name of the tax rate, which will be shown to users.
     */
    public var displayName: String? = null

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
     * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It also appears on
     * your customer’s invoice.
     */
    public var jurisdiction: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1TaxRatesPostRequestFormMetadataX8ae6ab0e? = null

    /**
     * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example,
     * "NY" for New York, United States.
     */
    public var state: String? = null

    /**
     * The high-level tax type, such as `vat` or `sales_tax`.
     */
    public var taxType: InlineV1TaxRatesPostRequestFormTaxTypeX4d1ebbe5? = null

    public fun build(): InlineV1TaxRatesPostRequestFormX4d52a369 = InlineV1TaxRatesPostRequestFormX4d52a369(
      active = active,
      country = country,
      description = description,
      displayName = displayName,
      expand = expand,
      jurisdiction = jurisdiction,
      metadata = metadata,
      state = state,
      taxType = taxType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRatesPostRequestFormX4d52a369 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxRatesPostRequestFormX4d52a369> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRatesPostRequestFormX4d52a369 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRatesPostRequestFormX4d52a369")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRatesPostRequestFormX4d52a369 must be a JSON object")
      return InlineV1TaxRatesPostRequestFormX4d52a369(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        jurisdiction = rawObject["jurisdiction"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TaxRatesPostRequestFormMetadataX8ae6ab0e>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        taxType = rawObject["tax_type"]?.let { json.decodeFromJsonElement<InlineV1TaxRatesPostRequestFormTaxTypeX4d1ebbe5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRatesPostRequestFormX4d52a369) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRatesPostRequestFormX4d52a369")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.description?.let { put("description", it) }
        value.displayName?.let { put("display_name", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.jurisdiction?.let { put("jurisdiction", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.taxType?.let { put("tax_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRatesPostRequestFormX4d52a369(block: InlineV1TaxRatesPostRequestFormX4d52a369.Builder.() -> Unit): InlineV1TaxRatesPostRequestFormX4d52a369 = InlineV1TaxRatesPostRequestFormX4d52a369.build(block)
