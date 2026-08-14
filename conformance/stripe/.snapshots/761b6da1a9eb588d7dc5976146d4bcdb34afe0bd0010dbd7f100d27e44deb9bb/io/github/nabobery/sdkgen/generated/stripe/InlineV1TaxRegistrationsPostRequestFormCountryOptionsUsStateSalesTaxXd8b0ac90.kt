package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90(
  elections: List<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf>,
) {
  public val elections: List<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf> =
      elections.toList()

  public class Builder {
    private var electionsValue:
        List<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf>? = null

    public var elections: List<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf>
      get() = requireNotNull(electionsValue) { "elections is required" }.toList()
      set(`value`) {
        electionsValue = value.toList()
      }

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 {
      check(electionsValue != null) { "elections is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90(
        elections = elections,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 must be a JSON object")
      val elections = json.decodeRequired<List<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf>>(rawObject, "elections")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90(
        elections = elections,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("elections", json.encodeToJsonElement(value.elections))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsStateSalesTaxXd8b0ac90 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
