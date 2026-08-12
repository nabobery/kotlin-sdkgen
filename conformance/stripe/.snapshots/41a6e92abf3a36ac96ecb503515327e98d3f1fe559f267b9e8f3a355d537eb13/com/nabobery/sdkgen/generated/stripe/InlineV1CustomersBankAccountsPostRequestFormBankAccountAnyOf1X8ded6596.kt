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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/bank_account/anyOf/0
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596(
  public val accountNumber: String,
  public val country: String,
  public val accountHolderName: String? = null,
  public val accountHolderType:
      InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val objectValue:
      InlineV1CustomersBankAccountsPostRequestFormBankAccountObjectValueX41f830a9? = null,
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
        InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var objectValue:
        InlineV1CustomersBankAccountsPostRequestFormBankAccountObjectValueX41f830a9? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(countryValue != null) { "country is required" }
      return InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596(
        accountNumber = accountNumber,
        country = country,
        accountHolderName = accountHolderName,
        accountHolderType = accountHolderType,
        currency = currency,
        objectValue = objectValue,
        routingNumber = routingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596(
        accountNumber = accountNumber,
        country = country,
        accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        objectValue = rawObject["object"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormBankAccountObjectValueX41f830a9>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("country", value.country)
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.objectValue?.let { put("object", json.encodeToJsonElement(it)) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596(block: InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596.Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 = InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
