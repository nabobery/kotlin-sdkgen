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
 * Result of the CVC check.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_succeeded_card/properties/cvc_
 * check
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45 = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationSucceededCardCvcCheckX33ac2c45) {
      encoder.encodeString(value.value)
    }
  }
}
