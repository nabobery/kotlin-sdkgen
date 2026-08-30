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
 * Stripe users in the United States can accept ACH direct debit payments from customers with a US bank account using
 * the Automated Clearing House (ACH) payments system operated by Nacha. Check this
 * [page](https://docs.stripe.com/payments/ach-direct-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf62af492? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf62af492? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3 = InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf62af492>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3(block: InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3 = InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3.build(block)
