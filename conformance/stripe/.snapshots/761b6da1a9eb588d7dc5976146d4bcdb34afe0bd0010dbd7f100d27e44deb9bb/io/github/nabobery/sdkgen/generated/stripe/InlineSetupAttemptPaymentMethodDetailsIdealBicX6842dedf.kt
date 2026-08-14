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
 * The Bank Identifier Code of the customer's bank.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_ideal/properties/bic
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf.Serializer::class)
public sealed class InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ABNANL2A`.
   */
  public data object Abnanl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "ABNANL2A"
  }

  /**
   * Documented value. Wire value: `ADYBNL2A`.
   */
  public data object Adybnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "ADYBNL2A"
  }

  /**
   * Documented value. Wire value: `ASNBNL21`.
   */
  public data object Asnbnl21 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "ASNBNL21"
  }

  /**
   * Documented value. Wire value: `BITSNL2A`.
   */
  public data object Bitsnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "BITSNL2A"
  }

  /**
   * Documented value. Wire value: `BUNQNL2A`.
   */
  public data object Bunqnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "BUNQNL2A"
  }

  /**
   * Documented value. Wire value: `BUUTNL2A`.
   */
  public data object Buutnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "BUUTNL2A"
  }

  /**
   * Documented value. Wire value: `FNOMNL22`.
   */
  public data object Fnomnl22 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "FNOMNL22"
  }

  /**
   * Documented value. Wire value: `FVLBNL22`.
   */
  public data object Fvlbnl22 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "FVLBNL22"
  }

  /**
   * Documented value. Wire value: `HANDNL2A`.
   */
  public data object Handnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "HANDNL2A"
  }

  /**
   * Documented value. Wire value: `INGBNL2A`.
   */
  public data object Ingbnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "INGBNL2A"
  }

  /**
   * Documented value. Wire value: `KNABNL2H`.
   */
  public data object Knabnl2H : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "KNABNL2H"
  }

  /**
   * Documented value. Wire value: `MLLENL2A`.
   */
  public data object Mllenl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "MLLENL2A"
  }

  /**
   * Documented value. Wire value: `MOYONL21`.
   */
  public data object Moyonl21 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "MOYONL21"
  }

  /**
   * Documented value. Wire value: `NNBANL2G`.
   */
  public data object Nnbanl2G : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "NNBANL2G"
  }

  /**
   * Documented value. Wire value: `NTSBDEB1`.
   */
  public data object Ntsbdeb1 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "NTSBDEB1"
  }

  /**
   * Documented value. Wire value: `RABONL2U`.
   */
  public data object Rabonl2U : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "RABONL2U"
  }

  /**
   * Documented value. Wire value: `RBRBNL21`.
   */
  public data object Rbrbnl21 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "RBRBNL21"
  }

  /**
   * Documented value. Wire value: `REVOIE23`.
   */
  public data object Revoie23 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "REVOIE23"
  }

  /**
   * Documented value. Wire value: `REVOLT21`.
   */
  public data object Revolt21 : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "REVOLT21"
  }

  /**
   * Documented value. Wire value: `SNSBNL2A`.
   */
  public data object Snsbnl2A : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "SNSBNL2A"
  }

  /**
   * Documented value. Wire value: `TRIONL2U`.
   */
  public data object Trionl2U : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf() {
    public override val `value`: String = "TRIONL2U"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf = when (value) {
      Abnanl2A.value -> Abnanl2A
      Adybnl2A.value -> Adybnl2A
      Asnbnl21.value -> Asnbnl21
      Bitsnl2A.value -> Bitsnl2A
      Bunqnl2A.value -> Bunqnl2A
      Buutnl2A.value -> Buutnl2A
      Fnomnl22.value -> Fnomnl22
      Fvlbnl22.value -> Fvlbnl22
      Handnl2A.value -> Handnl2A
      Ingbnl2A.value -> Ingbnl2A
      Knabnl2H.value -> Knabnl2H
      Mllenl2A.value -> Mllenl2A
      Moyonl21.value -> Moyonl21
      Nnbanl2G.value -> Nnbanl2G
      Ntsbdeb1.value -> Ntsbdeb1
      Rabonl2U.value -> Rabonl2U
      Rbrbnl21.value -> Rbrbnl21
      Revoie23.value -> Revoie23
      Revolt21.value -> Revolt21
      Snsbnl2A.value -> Snsbnl2A
      Trionl2U.value -> Trionl2U
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsIdealBicX6842dedf) {
      encoder.encodeString(value.value)
    }
  }
}
