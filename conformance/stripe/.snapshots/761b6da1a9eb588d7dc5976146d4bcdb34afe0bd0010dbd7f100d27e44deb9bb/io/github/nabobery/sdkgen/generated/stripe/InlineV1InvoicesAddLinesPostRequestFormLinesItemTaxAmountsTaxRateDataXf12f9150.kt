package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150(
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
      InlineV1InvoicesAddLinesPostRequestFormLinesItemJurisdictionLevelXa21e5c49? = null,
  public val state: String? = null,
  public val taxType:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47? = null,
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
        InlineV1InvoicesAddLinesPostRequestFormLinesItemJurisdictionLevelXa21e5c49? = null

    public var state: String? = null

    public var taxType:
        InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47? = null

    public fun build(): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 {
      check(displayNameValue != null) { "displayName is required" }
      check(inclusiveValue != null) { "inclusive is required" }
      check(percentageValue != null) { "percentage is required" }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150(
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
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val inclusive = json.decodeRequired<Boolean>(rawObject, "inclusive")
      val percentage = json.decodeRequired<Double>(rawObject, "percentage")
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150(
        displayName = displayName,
        inclusive = inclusive,
        percentage = percentage,
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        jurisdiction = rawObject["jurisdiction"]?.let { json.decodeFromJsonElement<String>(it) },
        jurisdictionLevel = rawObject["jurisdiction_level"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemJurisdictionLevelXa21e5c49>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        taxType = rawObject["tax_type"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1TaxTypeX769efb47>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150")
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

public fun inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150(block: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150.Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsTaxRateDataXf12f9150 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
