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
 * The [Single Euro Payments Area (SEPA)](https://en.wikipedia.org/wiki/Single_Euro_Payments_Area) is an initiative of
 * the European Union to simplify payments within and across member countries. SEPA established and enforced banking
 * standards to allow for the direct debiting of every EUR-denominated bank account within the SEPA region, check this
 * [page](https://docs.stripe.com/payments/sepa-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX182c5666? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX182c5666? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210 = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX182c5666>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210(block: InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210 = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210.build(block)
