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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_thailand
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsThailand.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsThailand(
  /**
   * Type of registration in `country`.
   */
  public val type: InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740?
        = null

    public var type: InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsThailand {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsThailand(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsThailand = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsThailand> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsThailand {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsThailand")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsThailand must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistrationsResourceCountryOptionsThailandTypeX831d6740>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsThailand(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsThailand) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsThailand")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsThailand(block: TaxProductRegistrationsResourceCountryOptionsThailand.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsThailand = TaxProductRegistrationsResourceCountryOptionsThailand.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsThailand is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
