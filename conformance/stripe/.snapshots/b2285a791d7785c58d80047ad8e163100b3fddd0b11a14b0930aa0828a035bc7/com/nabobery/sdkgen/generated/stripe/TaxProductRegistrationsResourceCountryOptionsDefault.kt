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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsDefault.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsDefault(
  /**
   * Type of registration in `country`.
   */
  public val type: InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f?
        = null

    public var type: InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsDefault {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsDefault(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefault = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsDefault> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsDefault {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsDefault")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefault must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsDefault(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsDefault) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsDefault")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsDefault(block: TaxProductRegistrationsResourceCountryOptionsDefault.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefault = TaxProductRegistrationsResourceCountryOptionsDefault.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefault is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
