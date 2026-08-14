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
 * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/cancellation_reason
 */
@Serializable(with = InlineSetupIntentCancellationReasonX43ba9b44.Serializer::class)
public sealed class InlineSetupIntentCancellationReasonX43ba9b44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineSetupIntentCancellationReasonX43ba9b44() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineSetupIntentCancellationReasonX43ba9b44() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `requested_by_customer`.
   */
  public data object RequestedByCustomer : InlineSetupIntentCancellationReasonX43ba9b44() {
    public override val `value`: String = "requested_by_customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentCancellationReasonX43ba9b44()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentCancellationReasonX43ba9b44 = when (value) {
      Abandoned.value -> Abandoned
      Duplicate.value -> Duplicate
      RequestedByCustomer.value -> RequestedByCustomer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentCancellationReasonX43ba9b44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentCancellationReasonX43ba9b44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentCancellationReasonX43ba9b44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentCancellationReasonX43ba9b44) {
      encoder.encodeString(value.value)
    }
  }
}
