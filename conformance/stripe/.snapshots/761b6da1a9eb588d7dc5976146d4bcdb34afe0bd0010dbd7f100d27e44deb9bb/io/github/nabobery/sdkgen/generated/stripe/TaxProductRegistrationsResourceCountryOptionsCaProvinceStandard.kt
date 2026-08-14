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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_ca_province_stand
 * ard
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard(
  /**
   * Two-letter CA province code ([ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2)).
   */
  public val province: String,
) {
  public class Builder {
    private var provinceValue: String? = null

    public var province: String
      get() = requireNotNull(provinceValue) { "province is required" }
      set(`value`) {
        provinceValue = value
      }

    public fun build(): TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard {
      check(provinceValue != null) { "province is required" }
      return TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard(
        province = province,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard must be a JSON object")
      val province = json.decodeRequired<String>(rawObject, "province")
      return TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard(
        province = province,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("province", value.province)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsCaProvinceStandard(block: TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard = TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsCaProvinceStandard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
