package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54(
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc8943ba3? = null,
  public val targetDate: String? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc8943ba3? =
        null

    public var targetDate: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXc8943ba3>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54.build(block)
