package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX7b7125b2? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX7b7125b2? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSepaDebitDisplayPreferenceX7b7125b2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da(block: InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da = InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX2f37b4da.build(block)
