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
 * Transaction type of the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_mandate_options/properties/transaction_type
 */
@Serializable(with = InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba.Serializer::class)
public sealed class InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAcssDebitMandateOptionsTransactionTypeX41610eba) {
      encoder.encodeString(value.value)
    }
  }
}
