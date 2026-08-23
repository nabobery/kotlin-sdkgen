package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61(
  public val displayName: String,
  public val inclusive: Boolean,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentage: Double,
  public val country: String? = null,
  public val description: String? = null,
  public val jurisdiction: String? = null,
  public val jurisdictionLevel:
      InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729? = null,
  public val state: String? = null,
  public val taxType:
      InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxTypeXc79aef6e? = null,
) {
  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var inclusiveValue: Boolean? = null

    public var inclusive: Boolean
      get() = requireNotNull(inclusiveValue) { "inclusive is required" }
      set(`value`) {
        inclusiveValue = value
      }

    private var percentageValue: Double? = null

    public var percentage: Double
      get() = requireNotNull(percentageValue) { "percentage is required" }
      set(`value`) {
        percentageValue = value
      }

    public var country: String? = null

    public var description: String? = null

    public var jurisdiction: String? = null

    public var jurisdictionLevel:
        InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729? = null

    public var state: String? = null

    public var taxType: InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxTypeXc79aef6e? =
        null

    public fun build(): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 {
      check(displayNameValue != null) { "displayName is required" }
      check(inclusiveValue != null) { "inclusive is required" }
      check(percentageValue != null) { "percentage is required" }
      return InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61(
        displayName = displayName,
        inclusive = inclusive,
        percentage = percentage,
        country = country,
        description = description,
        jurisdiction = jurisdiction,
        jurisdictionLevel = jurisdictionLevel,
        state = state,
        taxType = taxType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val inclusive = json.decodeRequired<Boolean>(rawObject, "inclusive")
      val percentage = json.decodeRequired<Double>(rawObject, "percentage")
      return InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61(
        displayName = displayName,
        inclusive = inclusive,
        percentage = percentage,
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        jurisdiction = rawObject["jurisdiction"]?.let { json.decodeFromJsonElement<String>(it) },
        jurisdictionLevel = rawObject["jurisdiction_level"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        taxType = rawObject["tax_type"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxTypeXc79aef6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        put("inclusive", json.encodeToJsonElement(value.inclusive))
        put("percentage", json.encodeToJsonElement(value.percentage))
        value.country?.let { put("country", it) }
        value.description?.let { put("description", it) }
        value.jurisdiction?.let { put("jurisdiction", it) }
        value.jurisdictionLevel?.let { put("jurisdiction_level", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.taxType?.let { put("tax_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61(block: InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61.Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 = InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1ItemTaxRateDataXe9dc8d61 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
