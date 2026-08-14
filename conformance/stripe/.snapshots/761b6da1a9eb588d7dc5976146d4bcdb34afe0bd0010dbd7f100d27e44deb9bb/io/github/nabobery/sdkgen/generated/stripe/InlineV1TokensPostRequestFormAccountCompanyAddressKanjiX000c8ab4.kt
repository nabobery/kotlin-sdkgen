package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/address_kanji.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/address_kanji
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4.Serializer::class)
public class InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4(
  public val city: String? = null,
  public val country: String? = null,
  public val line1: String? = null,
  public val line2: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
  public val town: String? = null,
) {
  public class Builder {
    public var city: String? = null

    public var country: String? = null

    public var line1: String? = null

    public var line2: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public var town: String? = null

    public fun build(): InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4 = InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
      town = town,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4 must be a JSON object")
      return InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4(
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<String>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        town = rawObject["town"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
        value.town?.let { put("town", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4(block: InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4 = InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4.build(block)
