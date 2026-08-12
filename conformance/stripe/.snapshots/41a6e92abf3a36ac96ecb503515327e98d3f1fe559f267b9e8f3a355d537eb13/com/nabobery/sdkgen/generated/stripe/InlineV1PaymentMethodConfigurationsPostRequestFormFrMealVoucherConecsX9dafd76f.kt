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
 * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered by employers for their
 * employees to purchase prepared food and beverages on working days. Check this
 * [page](https://docs.stripe.com/payments/meal-vouchers/fr-meal-vouchers) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/fr_meal_voucher_conecs
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXd365d024? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXd365d024? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f = InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXd365d024>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f(block: InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f = InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f.build(block)
