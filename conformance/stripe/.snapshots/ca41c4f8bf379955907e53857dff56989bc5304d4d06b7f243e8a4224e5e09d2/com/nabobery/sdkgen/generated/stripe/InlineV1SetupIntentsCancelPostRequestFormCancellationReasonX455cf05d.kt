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
 * Reason for canceling this SetupIntent. Possible values are: `abandoned`, `requested_by_customer`, or `duplicate`
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1cancel/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/cancellation_reason
 */
@Serializable(with = InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d.Serializer::class)
public sealed class InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `requested_by_customer`.
   */
  public data object RequestedByCustomer : InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d() {
    public override val `value`: String = "requested_by_customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d = when (value) {
      Abandoned.value -> Abandoned
      Duplicate.value -> Duplicate
      RequestedByCustomer.value -> RequestedByCustomer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsCancelPostRequestFormCancellationReasonX455cf05d) {
      encoder.encodeString(value.value)
    }
  }
}
