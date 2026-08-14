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
 * Result of the address line 1 check.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_succeeded_card/properties/addr
 * ess_line1_check
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7 = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationSucceededCardAddressLine1CheckX27330ad7) {
      encoder.encodeString(value.value)
    }
  }
}
