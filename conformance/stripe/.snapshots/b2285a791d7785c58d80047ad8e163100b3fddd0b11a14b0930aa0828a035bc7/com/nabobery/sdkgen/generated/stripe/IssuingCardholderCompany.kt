package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingCardholderCompanyView(
  @SerialName("tax_id_provided")
  public val taxIdProvided: Boolean,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_company
 */
@Serializable(with = IssuingCardholderCompany.Serializer::class)
public class IssuingCardholderCompany(
  /**
   * Whether the company's business ID number was provided.
   */
  public val taxIdProvided: Boolean,
) {
  public class Builder {
    private var taxIdProvidedValue: Boolean? = null

    public var taxIdProvided: Boolean
      get() = requireNotNull(taxIdProvidedValue) { "taxIdProvided is required" }
      set(`value`) {
        taxIdProvidedValue = value
      }

    public fun build(): IssuingCardholderCompany {
      check(taxIdProvidedValue != null) { "taxIdProvided is required" }
      return IssuingCardholderCompany(
        taxIdProvided = taxIdProvided,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderCompany = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardholderCompany> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderCompany {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderCompany")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderCompany must be a JSON object")
      val taxIdProvided = json.decodeRequired<Boolean>(rawObject, "tax_id_provided")
      return IssuingCardholderCompany(
        taxIdProvided = taxIdProvided,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderCompany) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderCompany")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_id_provided", json.encodeToJsonElement(value.taxIdProvided))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderCompany(block: IssuingCardholderCompany.Builder.() -> Unit): IssuingCardholderCompany = IssuingCardholderCompany.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardholderCompany is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
