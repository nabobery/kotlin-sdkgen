package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The state of the milestone.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-milestone/properties/state
 */
@Serializable(with = InlineNullableMilestoneStateXc7465c01.Serializer::class)
public sealed class InlineNullableMilestoneStateXc7465c01 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineNullableMilestoneStateXc7465c01() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineNullableMilestoneStateXc7465c01() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableMilestoneStateXc7465c01()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableMilestoneStateXc7465c01 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableMilestoneStateXc7465c01> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableMilestoneStateXc7465c01", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableMilestoneStateXc7465c01 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableMilestoneStateXc7465c01) {
      encoder.encodeString(value.value)
    }
  }
}
