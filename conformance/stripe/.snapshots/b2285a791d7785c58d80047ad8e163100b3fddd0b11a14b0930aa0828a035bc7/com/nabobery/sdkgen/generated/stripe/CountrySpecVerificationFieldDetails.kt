package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/country_spec_verification_field_details
 */
@Serializable(with = CountrySpecVerificationFieldDetails.Serializer::class)
public class CountrySpecVerificationFieldDetails(
  additional: List<String>,
  minimum: List<String>,
) {
  /**
   * Additional fields which are only required for some users.
   */
  public val additional: List<String> = additional.toList()

  /**
   * Fields which every account must eventually provide.
   */
  public val minimum: List<String> = minimum.toList()

  public class Builder {
    private var additionalValue: List<String>? = null

    public var additional: List<String>
      get() = requireNotNull(additionalValue) { "additional is required" }.toList()
      set(`value`) {
        additionalValue = value.toList()
      }

    private var minimumValue: List<String>? = null

    public var minimum: List<String>
      get() = requireNotNull(minimumValue) { "minimum is required" }.toList()
      set(`value`) {
        minimumValue = value.toList()
      }

    public fun build(): CountrySpecVerificationFieldDetails {
      check(additionalValue != null) { "additional is required" }
      check(minimumValue != null) { "minimum is required" }
      return CountrySpecVerificationFieldDetails(
        additional = additional,
        minimum = minimum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CountrySpecVerificationFieldDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CountrySpecVerificationFieldDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CountrySpecVerificationFieldDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CountrySpecVerificationFieldDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CountrySpecVerificationFieldDetails must be a JSON object")
      val additional = json.decodeRequired<List<String>>(rawObject, "additional")
      val minimum = json.decodeRequired<List<String>>(rawObject, "minimum")
      return CountrySpecVerificationFieldDetails(
        additional = additional,
        minimum = minimum,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CountrySpecVerificationFieldDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CountrySpecVerificationFieldDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("additional", json.encodeToJsonElement(value.additional))
        put("minimum", json.encodeToJsonElement(value.minimum))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun countrySpecVerificationFieldDetails(block: CountrySpecVerificationFieldDetails.Builder.() -> Unit): CountrySpecVerificationFieldDetails = CountrySpecVerificationFieldDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CountrySpecVerificationFieldDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
