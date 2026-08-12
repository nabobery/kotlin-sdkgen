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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c(
  public val confirmationNumber:
      InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556? = null,
  public val expiresAfterDays:
      InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88? = null,
  public val expiresAt:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d? = null,
  public val productDescription:
      InlineV1PaymentIntentsPostRequestFormProductDescriptionXe8e0f451? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd72b59c5? = null,
) {
  public class Builder {
    public var confirmationNumber: InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556?
        = null

    public var expiresAfterDays: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88? =
        null

    public var expiresAt:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d? = null

    public var productDescription: InlineV1PaymentIntentsPostRequestFormProductDescriptionXe8e0f451?
        = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd72b59c5? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c(
      confirmationNumber = confirmationNumber,
      expiresAfterDays = expiresAfterDays,
      expiresAt = expiresAt,
      productDescription = productDescription,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c(
        confirmationNumber = rawObject["confirmation_number"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormConfirmationNumberXb0770556>(it) },
        expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormProductDescriptionXe8e0f451>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd72b59c5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1Xeb40840c.build(block)
