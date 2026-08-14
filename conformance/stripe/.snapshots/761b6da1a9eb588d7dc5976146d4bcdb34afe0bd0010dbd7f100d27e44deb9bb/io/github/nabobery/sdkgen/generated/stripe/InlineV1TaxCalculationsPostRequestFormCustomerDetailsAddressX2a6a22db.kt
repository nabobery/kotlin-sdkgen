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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db(
  public val country: String,
  public val city:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9? = null,
  public val line1:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3? = null,
  public val line2:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622? = null,
  public val postalCode:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37? = null,
  public val state:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6? = null,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public var city: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9? =
        null

    public var line1: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3? =
        null

    public var line2: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622? =
        null

    public var postalCode:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37? = null

    public var state: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6? =
        null

    public fun build(): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db {
      check(countryValue != null) { "country is required" }
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db(
        country = country,
        city = city,
        line1 = line1,
        line2 = line2,
        postalCode = postalCode,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db(
        country = country,
        city = rawObject["city"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
        value.city?.let { put("city", json.encodeToJsonElement(it)) }
        value.line1?.let { put("line1", json.encodeToJsonElement(it)) }
        value.line2?.let { put("line2", json.encodeToJsonElement(it)) }
        value.postalCode?.let { put("postal_code", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db(block: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
