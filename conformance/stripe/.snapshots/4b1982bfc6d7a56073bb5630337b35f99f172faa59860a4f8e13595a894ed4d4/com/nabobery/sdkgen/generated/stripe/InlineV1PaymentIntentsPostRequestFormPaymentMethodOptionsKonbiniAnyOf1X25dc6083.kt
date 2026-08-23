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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083(
  public val confirmationNumber:
      InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41? = null,
  public val expiresAfterDays:
      InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c? = null,
  public val expiresAt:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663? = null,
  public val productDescription:
      InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1e81f1c3? = null,
) {
  public class Builder {
    public var confirmationNumber: InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41?
        = null

    public var expiresAfterDays: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c? =
        null

    public var expiresAt:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663? = null

    public var productDescription: InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d?
        = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1e81f1c3? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083(
      confirmationNumber = confirmationNumber,
      expiresAfterDays = expiresAfterDays,
      expiresAt = expiresAt,
      productDescription = productDescription,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083(
        confirmationNumber = rawObject["confirmation_number"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41>(it) },
        expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX1e81f1c3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083.build(block)
