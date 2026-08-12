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
 * Canadian pre-authorized debit payments, check this [page](https://docs.stripe.com/payments/acss-debit) for more
 * details like country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/acss_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAcssDebitDisplayPreferenceXa39278f2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba(block: InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba = InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba.build(block)
