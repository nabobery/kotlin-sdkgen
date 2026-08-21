package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade(
  public val amountIncludesIof:
      InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d? = null,
  public val expiresAfterSeconds: Int? = null,
  public val expiresAt: Int? = null,
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX628f6906? = null,
) {
  public class Builder {
    public var amountIncludesIof: InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d? =
        null

    public var expiresAfterSeconds: Int? = null

    public var expiresAt: Int? = null

    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX628f6906? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade(
      amountIncludesIof = amountIncludesIof,
      expiresAfterSeconds = expiresAfterSeconds,
      expiresAt = expiresAt,
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade(
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d>(it) },
        expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX628f6906>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade.build(block)
