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
 * Indicates the outcome of 3D Secure authentication.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/result
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bResultX842ca21e.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bResultX842ca21e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attempt_acknowledged`.
   */
  public data object AttemptAcknowledged : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "attempt_acknowledged"
  }

  /**
   * Documented value. Wire value: `authenticated`.
   */
  public data object Authenticated : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "authenticated"
  }

  /**
   * Documented value. Wire value: `exempted`.
   */
  public data object Exempted : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "exempted"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `not_supported`.
   */
  public data object NotSupported : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "not_supported"
  }

  /**
   * Documented value. Wire value: `processing_error`.
   */
  public data object ProcessingError : InlinePaymentsPrimitivesPabc9bResultX842ca21e() {
    public override val `value`: String = "processing_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bResultX842ca21e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bResultX842ca21e = when (value) {
      AttemptAcknowledged.value -> AttemptAcknowledged
      Authenticated.value -> Authenticated
      Exempted.value -> Exempted
      Failed.value -> Failed
      NotSupported.value -> NotSupported
      ProcessingError.value -> ProcessingError
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bResultX842ca21e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bResultX842ca21e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bResultX842ca21e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bResultX842ca21e) {
      encoder.encodeString(value.value)
    }
  }
}
