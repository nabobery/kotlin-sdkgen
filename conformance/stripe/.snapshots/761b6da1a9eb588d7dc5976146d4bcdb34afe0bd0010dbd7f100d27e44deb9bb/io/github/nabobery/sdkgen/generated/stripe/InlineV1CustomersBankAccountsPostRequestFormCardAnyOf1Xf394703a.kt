package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/card/anyOf/0
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a(
  public val expMonth: Int,
  public val expYear: Int,
  public val number: String,
  public val addressCity: String? = null,
  public val addressCountry: String? = null,
  public val addressLine1: String? = null,
  public val addressLine2: String? = null,
  public val addressState: String? = null,
  public val addressZip: String? = null,
  public val cvc: String? = null,
  public val encrypted: String? = null,
  metadata: Map<String, String>? = null,
  public val name: String? = null,
  public val networkToken:
      InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1NetworkTokenXec223d99? = null,
  public val objectValue:
      InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da? = null,
  public val swipeData: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var expMonthValue: Int? = null

    public var expMonth: Int
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: Int? = null

    public var expYear: Int
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

    public var cvc: String? = null

    public var encrypted: String? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var name: String? = null

    public var networkToken:
        InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1NetworkTokenXec223d99? = null

    public var objectValue:
        InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da? = null

    public var swipeData: String? = null

    public fun build(): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a {
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(numberValue != null) { "number is required" }
      return InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        addressCity = addressCity,
        addressCountry = addressCountry,
        addressLine1 = addressLine1,
        addressLine2 = addressLine2,
        addressState = addressState,
        addressZip = addressZip,
        cvc = cvc,
        encrypted = encrypted,
        metadata = metadata,
        name = name,
        networkToken = networkToken,
        objectValue = objectValue,
        swipeData = swipeData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a must be a JSON object")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val number = json.decodeRequired<String>(rawObject, "number")
      return InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        addressCity = rawObject["address_city"]?.let { json.decodeFromJsonElement<String>(it) },
        addressCountry = rawObject["address_country"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine1 = rawObject["address_line1"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine2 = rawObject["address_line2"]?.let { json.decodeFromJsonElement<String>(it) },
        addressState = rawObject["address_state"]?.let { json.decodeFromJsonElement<String>(it) },
        addressZip = rawObject["address_zip"]?.let { json.decodeFromJsonElement<String>(it) },
        cvc = rawObject["cvc"]?.let { json.decodeFromJsonElement<String>(it) },
        encrypted = rawObject["encrypted"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        networkToken = rawObject["network_token"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1NetworkTokenXec223d99>(it) },
        objectValue = rawObject["object"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da>(it) },
        swipeData = rawObject["swipe_data"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("number", value.number)
        value.addressCity?.let { put("address_city", it) }
        value.addressCountry?.let { put("address_country", it) }
        value.addressLine1?.let { put("address_line1", it) }
        value.addressLine2?.let { put("address_line2", it) }
        value.addressState?.let { put("address_state", it) }
        value.addressZip?.let { put("address_zip", it) }
        value.cvc?.let { put("cvc", it) }
        value.encrypted?.let { put("encrypted", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.networkToken?.let { put("network_token", json.encodeToJsonElement(it)) }
        value.objectValue?.let { put("object", json.encodeToJsonElement(it)) }
        value.swipeData?.let { put("swipe_data", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a(block: InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a.Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a = InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
