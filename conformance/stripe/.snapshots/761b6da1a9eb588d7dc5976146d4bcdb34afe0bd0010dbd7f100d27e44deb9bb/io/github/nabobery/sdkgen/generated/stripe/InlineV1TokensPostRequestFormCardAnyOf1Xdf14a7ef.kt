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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0
 */
@Serializable(with = InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef.Serializer::class)
public class InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef(
  public val expMonth: String,
  public val expYear: String,
  public val number: String,
  public val addressCity: String? = null,
  public val addressCountry: String? = null,
  public val addressLine1: String? = null,
  public val addressLine2: String? = null,
  public val addressState: String? = null,
  public val addressZip: String? = null,
  public val currency: String? = null,
  public val cvc: String? = null,
  public val name: String? = null,
  public val networks: InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0? = null,
) {
  public class Builder {
    private var expMonthValue: String? = null

    public var expMonth: String
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: String? = null

    public var expYear: String
      get() = requireNotNull(expYearValue) { "expYear is required" }
      set(`value`) {
        expYearValue = value
      }

    private var numberValue: String? = null

    public var number: String
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    public var addressCity: String? = null

    public var addressCountry: String? = null

    public var addressLine1: String? = null

    public var addressLine2: String? = null

    public var addressState: String? = null

    public var addressZip: String? = null

    public var currency: String? = null

    public var cvc: String? = null

    public var name: String? = null

    public var networks: InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0? = null

    public fun build(): InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef {
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(numberValue != null) { "number is required" }
      return InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        addressCity = addressCity,
        addressCountry = addressCountry,
        addressLine1 = addressLine1,
        addressLine2 = addressLine2,
        addressState = addressState,
        addressZip = addressZip,
        currency = currency,
        cvc = cvc,
        name = name,
        networks = networks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef must be a JSON object")
      val expMonth = json.decodeRequired<String>(rawObject, "exp_month")
      val expYear = json.decodeRequired<String>(rawObject, "exp_year")
      val number = json.decodeRequired<String>(rawObject, "number")
      return InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        addressCity = rawObject["address_city"]?.let { json.decodeFromJsonElement<String>(it) },
        addressCountry = rawObject["address_country"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine1 = rawObject["address_line1"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine2 = rawObject["address_line2"]?.let { json.decodeFromJsonElement<String>(it) },
        addressState = rawObject["address_state"]?.let { json.decodeFromJsonElement<String>(it) },
        addressZip = rawObject["address_zip"]?.let { json.decodeFromJsonElement<String>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        cvc = rawObject["cvc"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormCardAnyOf1NetworksX285416f0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exp_month", value.expMonth)
        put("exp_year", value.expYear)
        put("number", value.number)
        value.addressCity?.let { put("address_city", it) }
        value.addressCountry?.let { put("address_country", it) }
        value.addressLine1?.let { put("address_line1", it) }
        value.addressLine2?.let { put("address_line2", it) }
        value.addressState?.let { put("address_state", it) }
        value.addressZip?.let { put("address_zip", it) }
        value.currency?.let { put("currency", it) }
        value.cvc?.let { put("cvc", it) }
        value.name?.let { put("name", it) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef(block: InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef.Builder.() -> Unit): InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef = InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TokensPostRequestFormCardAnyOf1Xdf14a7ef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
