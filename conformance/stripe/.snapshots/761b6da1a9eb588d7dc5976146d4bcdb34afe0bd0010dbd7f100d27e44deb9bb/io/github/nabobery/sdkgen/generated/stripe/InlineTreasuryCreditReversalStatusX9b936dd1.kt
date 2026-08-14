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
 * Status of the CreditReversal
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.credit_reversal/properties/status
 */
@Serializable(with = InlineTreasuryCreditReversalStatusX9b936dd1.Serializer::class)
public sealed class InlineTreasuryCreditReversalStatusX9b936dd1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineTreasuryCreditReversalStatusX9b936dd1() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineTreasuryCreditReversalStatusX9b936dd1() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineTreasuryCreditReversalStatusX9b936dd1() {
    public override val `value`: String = "processing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryCreditReversalStatusX9b936dd1()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryCreditReversalStatusX9b936dd1 = when (value) {
      Canceled.value -> Canceled
      Posted.value -> Posted
      Processing.value -> Processing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryCreditReversalStatusX9b936dd1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryCreditReversalStatusX9b936dd1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryCreditReversalStatusX9b936dd1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryCreditReversalStatusX9b936dd1) {
      encoder.encodeString(value.value)
    }
  }
}
