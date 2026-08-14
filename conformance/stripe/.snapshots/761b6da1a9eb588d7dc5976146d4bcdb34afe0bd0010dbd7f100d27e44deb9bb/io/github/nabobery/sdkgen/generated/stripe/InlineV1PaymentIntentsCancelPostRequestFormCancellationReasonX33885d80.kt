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
 * Reason for canceling this PaymentIntent. Possible values are: `duplicate`, `fraudulent`, `requested_by_customer`, or
 * `abandoned`
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1cancel/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/cancellation_reason
 */
@Serializable(with = InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80.Serializer::class)
public sealed class InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `requested_by_customer`.
   */
  public data object RequestedByCustomer : InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80() {
    public override val `value`: String = "requested_by_customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80 = when (value) {
      Abandoned.value -> Abandoned
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      RequestedByCustomer.value -> RequestedByCustomer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCancelPostRequestFormCancellationReasonX33885d80) {
      encoder.encodeString(value.value)
    }
  }
}
