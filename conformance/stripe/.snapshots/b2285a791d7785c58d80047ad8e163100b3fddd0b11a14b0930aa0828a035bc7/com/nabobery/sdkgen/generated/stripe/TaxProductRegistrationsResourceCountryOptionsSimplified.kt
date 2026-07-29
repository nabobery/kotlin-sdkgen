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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_simplified
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsSimplified.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsSimplified(
  /**
   * Type of registration in `country`.
   */
  public val type: InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c,
) {
  public class Builder {
    private var typeValue:
        InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c? = null

    public var type: InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsSimplified {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsSimplified(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsSimplified = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsSimplified> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsSimplified {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsSimplified")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsSimplified must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsSimplifiedTypeX91637e9c>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsSimplified(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsSimplified) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsSimplified")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsSimplified(block: TaxProductRegistrationsResourceCountryOptionsSimplified.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsSimplified = TaxProductRegistrationsResourceCountryOptionsSimplified.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsSimplified is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
