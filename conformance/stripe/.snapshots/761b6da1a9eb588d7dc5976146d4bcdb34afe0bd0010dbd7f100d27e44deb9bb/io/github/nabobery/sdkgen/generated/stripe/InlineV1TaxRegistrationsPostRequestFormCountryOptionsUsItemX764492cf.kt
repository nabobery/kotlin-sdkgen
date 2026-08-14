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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax/properties/elections/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax/properties/elections/items
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf(
  public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710,
  public val jurisdiction: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710? =
        null

    public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var jurisdiction: String? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf(
        type = type,
        jurisdiction = jurisdiction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710>(rawObject, "type")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf(
        type = type,
        jurisdiction = rawObject["jurisdiction"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.jurisdiction?.let { put("jurisdiction", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsItemX764492cf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
