package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properties/transac
 * tion_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properties/transac
 * tion_type
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278 = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransactionTypeXc8487278) {
      encoder.encodeString(value.value)
    }
  }
}
