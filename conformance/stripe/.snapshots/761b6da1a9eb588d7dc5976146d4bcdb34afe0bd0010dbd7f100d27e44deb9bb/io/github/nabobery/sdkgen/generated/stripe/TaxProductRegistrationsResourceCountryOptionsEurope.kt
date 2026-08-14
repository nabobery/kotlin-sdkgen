package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_europe
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsEurope.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsEurope(
  /**
   * Type of registration in an EU country.
   */
  public val type: InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6,
  public val standard: TaxProductRegistrationsResourceCountryOptionsEuStandard? = null,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6? =
        null

    public var type: InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: TaxProductRegistrationsResourceCountryOptionsEuStandard? = null

    public fun build(): TaxProductRegistrationsResourceCountryOptionsEurope {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsEurope(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsEurope = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsEurope> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsEurope {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsEurope")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsEurope must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsEuropeTypeXdf9315c6>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsEurope(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEuStandard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsEurope) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsEurope")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsEurope(block: TaxProductRegistrationsResourceCountryOptionsEurope.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsEurope = TaxProductRegistrationsResourceCountryOptionsEurope.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsEurope is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
