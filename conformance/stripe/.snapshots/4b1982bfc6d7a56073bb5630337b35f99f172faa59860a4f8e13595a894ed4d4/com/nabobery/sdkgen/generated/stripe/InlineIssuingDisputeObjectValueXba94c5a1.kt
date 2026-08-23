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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute/properties/object
 */
@Serializable(with = InlineIssuingDisputeObjectValueXba94c5a1.Serializer::class)
public sealed class InlineIssuingDisputeObjectValueXba94c5a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.dispute`.
   */
  public data object IssuingDispute : InlineIssuingDisputeObjectValueXba94c5a1() {
    public override val `value`: String = "issuing.dispute"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingDisputeObjectValueXba94c5a1()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingDisputeObjectValueXba94c5a1 = when (value) {
      IssuingDispute.value -> IssuingDispute
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeObjectValueXba94c5a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeObjectValueXba94c5a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeObjectValueXba94c5a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeObjectValueXba94c5a1) {
      encoder.encodeString(value.value)
    }
  }
}
