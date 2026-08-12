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
 * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers with
 * an Australian bank account. Check this [page](https://docs.stripe.com/payments/au-becs-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25ef6140? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25ef6140? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789 = InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX25ef6140>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789(block: InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789 = InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789.build(block)
