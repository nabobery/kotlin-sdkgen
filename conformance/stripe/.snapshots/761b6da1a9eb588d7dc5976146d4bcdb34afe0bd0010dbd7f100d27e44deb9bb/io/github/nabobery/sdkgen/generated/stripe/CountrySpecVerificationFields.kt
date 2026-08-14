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
 * Source: sdkgen://source/openapi.json#/components/schemas/country_spec_verification_fields
 */
@Serializable(with = CountrySpecVerificationFields.Serializer::class)
public class CountrySpecVerificationFields(
  public val company: CountrySpecVerificationFieldDetails,
  public val individual: CountrySpecVerificationFieldDetails,
) {
  public class Builder {
    private var companyValue: CountrySpecVerificationFieldDetails? = null

    public var company: CountrySpecVerificationFieldDetails
      get() = requireNotNull(companyValue) { "company is required" }
      set(`value`) {
        companyValue = value
      }

    private var individualValue: CountrySpecVerificationFieldDetails? = null

    public var individual: CountrySpecVerificationFieldDetails
      get() = requireNotNull(individualValue) { "individual is required" }
      set(`value`) {
        individualValue = value
      }

    public fun build(): CountrySpecVerificationFields {
      check(companyValue != null) { "company is required" }
      check(individualValue != null) { "individual is required" }
      return CountrySpecVerificationFields(
        company = company,
        individual = individual,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CountrySpecVerificationFields = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CountrySpecVerificationFields> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CountrySpecVerificationFields {
      val jsonDecoder = decoder.requireJsonDecoder("CountrySpecVerificationFields")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CountrySpecVerificationFields must be a JSON object")
      val company = json.decodeRequired<CountrySpecVerificationFieldDetails>(rawObject, "company")
      val individual = json.decodeRequired<CountrySpecVerificationFieldDetails>(rawObject, "individual")
      return CountrySpecVerificationFields(
        company = company,
        individual = individual,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CountrySpecVerificationFields) {
      val jsonEncoder = encoder.requireJsonEncoder("CountrySpecVerificationFields")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("company", json.encodeToJsonElement(value.company))
        put("individual", json.encodeToJsonElement(value.individual))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun countrySpecVerificationFields(block: CountrySpecVerificationFields.Builder.() -> Unit): CountrySpecVerificationFields = CountrySpecVerificationFields.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CountrySpecVerificationFields is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
