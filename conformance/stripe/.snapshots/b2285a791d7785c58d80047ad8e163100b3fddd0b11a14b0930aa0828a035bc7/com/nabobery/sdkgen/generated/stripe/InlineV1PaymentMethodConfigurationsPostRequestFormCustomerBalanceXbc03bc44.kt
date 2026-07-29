package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Uses a customer’s [cash balance](https://docs.stripe.com/payments/customer-balance) for the payment. The cash balance
 * can be funded via a bank transfer. Check this [page](https://docs.stripe.com/payments/bank-transfers) for more
 * details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/customer_balance
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25e911b3? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25e911b3? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44 = InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25e911b3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44(block: InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44 = InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceXbc03bc44.build(block)
