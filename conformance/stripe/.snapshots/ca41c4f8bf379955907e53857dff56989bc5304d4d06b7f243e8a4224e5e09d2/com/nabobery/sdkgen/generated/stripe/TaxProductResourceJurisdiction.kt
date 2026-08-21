package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_jurisdiction
 */
@Serializable(with = TaxProductResourceJurisdiction.Serializer::class)
public class TaxProductResourceJurisdiction(
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String,
  /**
   * A human-readable name for the jurisdiction imposing the tax.
   */
  public val displayName: String,
  /**
   * Indicates the level of the jurisdiction imposing the tax.
   */
  public val level: InlineTaxProductResourceJurisdictionLevelX73a9211f,
  /**
   * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example, "NY"
   * for New York, United States.
   */
  public val state: String? = null,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var levelValue: InlineTaxProductResourceJurisdictionLevelX73a9211f? = null

    public var level: InlineTaxProductResourceJurisdictionLevelX73a9211f
      get() = requireNotNull(levelValue) { "level is required" }
      set(`value`) {
        levelValue = value
      }

    /**
     * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example,
     * "NY" for New York, United States.
     */
    public var state: String? = null

    public fun build(): TaxProductResourceJurisdiction {
      check(countryValue != null) { "country is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(levelValue != null) { "level is required" }
      return TaxProductResourceJurisdiction(
        country = country,
        displayName = displayName,
        level = level,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceJurisdiction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceJurisdiction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceJurisdiction {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceJurisdiction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceJurisdiction must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val level = json.decodeRequired<InlineTaxProductResourceJurisdictionLevelX73a9211f>(rawObject, "level")
      return TaxProductResourceJurisdiction(
        country = country,
        displayName = displayName,
        level = level,
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceJurisdiction) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceJurisdiction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
        put("display_name", value.displayName)
        put("level", json.encodeToJsonElement(value.level))
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceJurisdiction(block: TaxProductResourceJurisdiction.Builder.() -> Unit): TaxProductResourceJurisdiction = TaxProductResourceJurisdiction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceJurisdiction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
