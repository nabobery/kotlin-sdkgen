package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198(
  public val expiresAfterDays: Int? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651? = null,
) {
  public class Builder {
    public var expiresAfterDays: Int? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198(
      expiresAfterDays = expiresAfterDays,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198(
        expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<Int>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198.build(block)
