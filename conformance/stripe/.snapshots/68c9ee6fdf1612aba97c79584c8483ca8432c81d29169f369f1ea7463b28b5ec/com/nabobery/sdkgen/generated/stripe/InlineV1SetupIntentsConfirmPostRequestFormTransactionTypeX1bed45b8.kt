package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/propertie
 * s/transaction_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/propertie
 * s/transaction_type
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8 = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormTransactionTypeX1bed45b8) {
      encoder.encodeString(value.value)
    }
  }
}
