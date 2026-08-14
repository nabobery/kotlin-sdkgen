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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/get/parameters/5/schema
 */
@Serializable(with = InlineV1IssuingDisputesGetParameterX740fe819.Serializer::class)
public sealed class InlineV1IssuingDisputesGetParameterX740fe819 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineV1IssuingDisputesGetParameterX740fe819() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineV1IssuingDisputesGetParameterX740fe819() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `submitted`.
   */
  public data object Submitted : InlineV1IssuingDisputesGetParameterX740fe819() {
    public override val `value`: String = "submitted"
  }

  /**
   * Documented value. Wire value: `unsubmitted`.
   */
  public data object Unsubmitted : InlineV1IssuingDisputesGetParameterX740fe819() {
    public override val `value`: String = "unsubmitted"
  }

  /**
   * Documented value. Wire value: `won`.
   */
  public data object Won : InlineV1IssuingDisputesGetParameterX740fe819() {
    public override val `value`: String = "won"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingDisputesGetParameterX740fe819()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingDisputesGetParameterX740fe819 = when (value) {
      Expired.value -> Expired
      Lost.value -> Lost
      Submitted.value -> Submitted
      Unsubmitted.value -> Unsubmitted
      Won.value -> Won
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesGetParameterX740fe819> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesGetParameterX740fe819", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesGetParameterX740fe819 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesGetParameterX740fe819) {
      encoder.encodeString(value.value)
    }
  }
}
