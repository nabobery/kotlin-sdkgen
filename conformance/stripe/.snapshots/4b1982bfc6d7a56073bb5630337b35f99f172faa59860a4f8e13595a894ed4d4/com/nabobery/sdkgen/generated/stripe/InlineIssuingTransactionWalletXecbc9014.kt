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
 * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/wallet
 */
@Serializable(with = InlineIssuingTransactionWalletXecbc9014.Serializer::class)
public sealed class InlineIssuingTransactionWalletXecbc9014 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_pay`.
   */
  public data object ApplePay : InlineIssuingTransactionWalletXecbc9014() {
    public override val `value`: String = "apple_pay"
  }

  /**
   * Documented value. Wire value: `google_pay`.
   */
  public data object GooglePay : InlineIssuingTransactionWalletXecbc9014() {
    public override val `value`: String = "google_pay"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlineIssuingTransactionWalletXecbc9014() {
    public override val `value`: String = "samsung_pay"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingTransactionWalletXecbc9014()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingTransactionWalletXecbc9014 = when (value) {
      ApplePay.value -> ApplePay
      GooglePay.value -> GooglePay
      SamsungPay.value -> SamsungPay
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionWalletXecbc9014> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingTransactionWalletXecbc9014", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionWalletXecbc9014 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionWalletXecbc9014) {
      encoder.encodeString(value.value)
    }
  }
}
