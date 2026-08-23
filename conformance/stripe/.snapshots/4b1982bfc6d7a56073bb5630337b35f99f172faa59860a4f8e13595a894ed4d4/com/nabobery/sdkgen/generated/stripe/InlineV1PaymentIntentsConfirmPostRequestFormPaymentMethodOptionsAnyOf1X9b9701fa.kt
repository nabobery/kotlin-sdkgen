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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa(
  public val confirmationNumber:
      InlineV1PaymentIntentsConfirmPostRequestFormConfirmationNumberXf8667ff3? = null,
  public val expiresAfterDays:
      InlineV1PaymentIntentsConfirmPostRequestFormExpiresAfterDaysX32336f85? = null,
  public val expiresAt: InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae? = null,
  public val productDescription:
      InlineV1PaymentIntentsConfirmPostRequestFormProductDescriptionXad8bcd81? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXe55d98e6? = null,
) {
  public class Builder {
    public var confirmationNumber:
        InlineV1PaymentIntentsConfirmPostRequestFormConfirmationNumberXf8667ff3? = null

    public var expiresAfterDays:
        InlineV1PaymentIntentsConfirmPostRequestFormExpiresAfterDaysX32336f85? = null

    public var expiresAt: InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae? = null

    public var productDescription:
        InlineV1PaymentIntentsConfirmPostRequestFormProductDescriptionXad8bcd81? = null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXe55d98e6? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa(
      confirmationNumber = confirmationNumber,
      expiresAfterDays = expiresAfterDays,
      expiresAt = expiresAt,
      productDescription = productDescription,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa(
        confirmationNumber = rawObject["confirmation_number"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormConfirmationNumberXf8667ff3>(it) },
        expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormExpiresAfterDaysX32336f85>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormProductDescriptionXad8bcd81>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXe55d98e6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.confirmationNumber?.let { put("confirmation_number", json.encodeToJsonElement(it)) }
        value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X9b9701fa.build(block)
