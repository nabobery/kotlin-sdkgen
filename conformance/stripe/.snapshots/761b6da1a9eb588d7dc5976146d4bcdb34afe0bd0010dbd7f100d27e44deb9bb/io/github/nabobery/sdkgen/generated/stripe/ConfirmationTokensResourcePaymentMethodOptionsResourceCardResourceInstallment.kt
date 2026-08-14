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
 * Installment configuration for payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_options_resource_card_re
 * source_installment
 */
@Serializable(with = ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment.Serializer::class)
public class ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment(
  public val plan: PaymentMethodDetailsCardInstallmentsPlan? = null,
) {
  public class Builder {
    public var plan: PaymentMethodDetailsCardInstallmentsPlan? = null

    public fun build(): ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment = ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment(
      plan = plan,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment {
      val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment must be a JSON object")
      return ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment(
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardInstallmentsPlan>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment) {
      val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun confirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment(block: ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment.Builder.() -> Unit): ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment = ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment.build(block)
