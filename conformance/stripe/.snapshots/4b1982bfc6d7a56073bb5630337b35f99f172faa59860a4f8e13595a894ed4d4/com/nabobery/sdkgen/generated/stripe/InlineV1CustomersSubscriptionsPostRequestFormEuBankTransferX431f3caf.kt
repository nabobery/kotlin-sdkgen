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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e/anyOf/0/properties/bank_transfer/properties/eu_bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e/anyOf/0/properties/bank_transfer/properties/eu_bank_transfer
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf(
  public val country: String,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf {
      check(countryValue != null) { "country is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf(
        country = country,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf(
        country = country,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf(block: InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf = InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormEuBankTransferX431f3caf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
