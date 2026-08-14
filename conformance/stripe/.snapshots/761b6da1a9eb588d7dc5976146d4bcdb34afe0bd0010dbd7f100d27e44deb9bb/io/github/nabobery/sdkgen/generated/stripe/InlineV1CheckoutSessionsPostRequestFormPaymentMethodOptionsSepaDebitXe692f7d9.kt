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
 * ded/schema/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9(
  public val mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb8be0a5d? = null,
  public val targetDate: String? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681? =
        null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb8be0a5d? =
        null

    public var targetDate: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXb8be0a5d>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9")
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

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9.build(block)
