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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute/properties/object
 */
@Serializable(with = InlineDisputeObjectValueX8c08bfde.Serializer::class)
public sealed class InlineDisputeObjectValueX8c08bfde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dispute`.
   */
  public data object Dispute : InlineDisputeObjectValueX8c08bfde() {
    public override val `value`: String = "dispute"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeObjectValueX8c08bfde()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeObjectValueX8c08bfde = when (value) {
      Dispute.value -> Dispute
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeObjectValueX8c08bfde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputeObjectValueX8c08bfde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeObjectValueX8c08bfde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeObjectValueX8c08bfde) {
      encoder.encodeString(value.value)
    }
  }
}
