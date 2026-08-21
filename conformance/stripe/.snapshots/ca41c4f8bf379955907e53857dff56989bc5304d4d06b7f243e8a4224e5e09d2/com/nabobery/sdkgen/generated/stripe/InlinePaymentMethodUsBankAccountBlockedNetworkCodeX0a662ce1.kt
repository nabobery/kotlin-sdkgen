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
 * The ACH network code that resulted in this block.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account_blocked/properties/network_code
 */
@Serializable(with = InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1.Serializer::class)
public sealed class InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `R02`.
   */
  public data object R02 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R02"
  }

  /**
   * Documented value. Wire value: `R03`.
   */
  public data object R03 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R03"
  }

  /**
   * Documented value. Wire value: `R04`.
   */
  public data object R04 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R04"
  }

  /**
   * Documented value. Wire value: `R05`.
   */
  public data object R05 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R05"
  }

  /**
   * Documented value. Wire value: `R07`.
   */
  public data object R07 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R07"
  }

  /**
   * Documented value. Wire value: `R08`.
   */
  public data object R08 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R08"
  }

  /**
   * Documented value. Wire value: `R10`.
   */
  public data object R10 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R10"
  }

  /**
   * Documented value. Wire value: `R11`.
   */
  public data object R11 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R11"
  }

  /**
   * Documented value. Wire value: `R16`.
   */
  public data object R16 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R16"
  }

  /**
   * Documented value. Wire value: `R20`.
   */
  public data object R20 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R20"
  }

  /**
   * Documented value. Wire value: `R29`.
   */
  public data object R29 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R29"
  }

  /**
   * Documented value. Wire value: `R31`.
   */
  public data object R31 : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1() {
    public override val `value`: String = "R31"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1 = when (value) {
      R02.value -> R02
      R03.value -> R03
      R04.value -> R04
      R05.value -> R05
      R07.value -> R07
      R08.value -> R08
      R10.value -> R10
      R11.value -> R11
      R16.value -> R16
      R20.value -> R20
      R29.value -> R29
      R31.value -> R31
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1) {
      encoder.encodeString(value.value)
    }
  }
}
