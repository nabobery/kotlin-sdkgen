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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properti
 * es/transaction_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properti
 * es/transaction_type
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransactionTypeX4959f3da) {
      encoder.encodeString(value.value)
    }
  }
}
