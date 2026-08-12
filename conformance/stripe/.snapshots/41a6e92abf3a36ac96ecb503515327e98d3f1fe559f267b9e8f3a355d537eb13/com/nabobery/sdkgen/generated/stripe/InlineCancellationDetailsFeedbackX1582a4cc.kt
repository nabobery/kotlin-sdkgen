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
 * The customer submitted reason for why they canceled, if the subscription was canceled explicitly by the user.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/cancellation_details/properties/feedback
 */
@Serializable(with = InlineCancellationDetailsFeedbackX1582a4cc.Serializer::class)
public sealed class InlineCancellationDetailsFeedbackX1582a4cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_service`.
   */
  public data object CustomerService : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "customer_service"
  }

  /**
   * Documented value. Wire value: `low_quality`.
   */
  public data object LowQuality : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "low_quality"
  }

  /**
   * Documented value. Wire value: `missing_features`.
   */
  public data object MissingFeatures : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "missing_features"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `switched_service`.
   */
  public data object SwitchedService : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "switched_service"
  }

  /**
   * Documented value. Wire value: `too_complex`.
   */
  public data object TooComplex : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "too_complex"
  }

  /**
   * Documented value. Wire value: `too_expensive`.
   */
  public data object TooExpensive : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "too_expensive"
  }

  /**
   * Documented value. Wire value: `unused`.
   */
  public data object Unused : InlineCancellationDetailsFeedbackX1582a4cc() {
    public override val `value`: String = "unused"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCancellationDetailsFeedbackX1582a4cc()

  public companion object {
    public fun fromValue(`value`: String): InlineCancellationDetailsFeedbackX1582a4cc = when (value) {
      CustomerService.value -> CustomerService
      LowQuality.value -> LowQuality
      MissingFeatures.value -> MissingFeatures
      Other.value -> Other
      SwitchedService.value -> SwitchedService
      TooComplex.value -> TooComplex
      TooExpensive.value -> TooExpensive
      Unused.value -> Unused
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCancellationDetailsFeedbackX1582a4cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCancellationDetailsFeedbackX1582a4cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCancellationDetailsFeedbackX1582a4cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCancellationDetailsFeedbackX1582a4cc) {
      encoder.encodeString(value.value)
    }
  }
}
