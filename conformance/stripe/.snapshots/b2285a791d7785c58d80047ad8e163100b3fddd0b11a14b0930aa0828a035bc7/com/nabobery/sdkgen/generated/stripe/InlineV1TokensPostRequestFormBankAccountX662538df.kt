package com.nabobery.sdkgen.generated.stripe

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
 * The bank account this token will represent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/bank_account
 */
@Serializable(with = InlineV1TokensPostRequestFormBankAccountX662538df.Serializer::class)
public class InlineV1TokensPostRequestFormBankAccountX662538df(
  public val accountNumber: String,
  public val country: String,
  public val accountHolderName: String? = null,
  public val accountHolderType:
      InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed? = null,
  public val accountType: InlineV1TokensPostRequestFormBankAccountAccountTypeX2066f168? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val paymentMethod: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    private var accountNumberValue: String? = null

    public var accountNumber: String
      get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
      set(`value`) {
        accountNumberValue = value
      }

    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public var accountHolderName: String? = null

    public var accountHolderType:
        InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed? = null

    public var accountType: InlineV1TokensPostRequestFormBankAccountAccountTypeX2066f168? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var paymentMethod: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1TokensPostRequestFormBankAccountX662538df {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(countryValue != null) { "country is required" }
      return InlineV1TokensPostRequestFormBankAccountX662538df(
        accountNumber = accountNumber,
        country = country,
        accountHolderName = accountHolderName,
        accountHolderType = accountHolderType,
        accountType = accountType,
        currency = currency,
        paymentMethod = paymentMethod,
        routingNumber = routingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormBankAccountX662538df = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormBankAccountX662538df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormBankAccountX662538df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormBankAccountX662538df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormBankAccountX662538df must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1TokensPostRequestFormBankAccountX662538df(
        accountNumber = accountNumber,
        country = country,
        accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormBankAccountAccountTypeX2066f168>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormBankAccountX662538df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormBankAccountX662538df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("country", value.country)
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormBankAccountX662538df(block: InlineV1TokensPostRequestFormBankAccountX662538df.Builder.() -> Unit): InlineV1TokensPostRequestFormBankAccountX662538df = InlineV1TokensPostRequestFormBankAccountX662538df.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TokensPostRequestFormBankAccountX662538df is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
