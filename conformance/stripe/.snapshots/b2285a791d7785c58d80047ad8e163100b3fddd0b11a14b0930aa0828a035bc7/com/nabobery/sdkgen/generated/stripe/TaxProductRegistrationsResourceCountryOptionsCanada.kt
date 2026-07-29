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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_canada
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsCanada.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsCanada(
  /**
   * Type of registration in Canada.
   */
  public val type: InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b,
  public val provinceStandard:
      TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard? = null,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b? =
        null

    public var type: InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var provinceStandard: TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard? =
        null

    public fun build(): TaxProductRegistrationsResourceCountryOptionsCanada {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsCanada(
        type = type,
        provinceStandard = provinceStandard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsCanada = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsCanada> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsCanada {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsCanada")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsCanada must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsCanada(
        type = type,
        provinceStandard = rawObject["province_standard"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsCanada) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsCanada")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.provinceStandard?.let { put("province_standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsCanada(block: TaxProductRegistrationsResourceCountryOptionsCanada.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsCanada = TaxProductRegistrationsResourceCountryOptionsCanada.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsCanada is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
