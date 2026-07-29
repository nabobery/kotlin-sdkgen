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
 * Source: sdkgen://source/openapi.json#/components/schemas/test_helpers.test_clock/properties/object
 */
@Serializable(with = InlineTestHelpersTestClockObjectValueXb2175ccc.Serializer::class)
public sealed class InlineTestHelpersTestClockObjectValueXb2175ccc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `test_helpers.test_clock`.
   */
  public data object TestHelpersTestClock : InlineTestHelpersTestClockObjectValueXb2175ccc() {
    public override val `value`: String = "test_helpers.test_clock"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTestHelpersTestClockObjectValueXb2175ccc()

  public companion object {
    public fun fromValue(`value`: String): InlineTestHelpersTestClockObjectValueXb2175ccc = when (value) {
      TestHelpersTestClock.value -> TestHelpersTestClock
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTestHelpersTestClockObjectValueXb2175ccc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTestHelpersTestClockObjectValueXb2175ccc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTestHelpersTestClockObjectValueXb2175ccc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTestHelpersTestClockObjectValueXb2175ccc) {
      encoder.encodeString(value.value)
    }
  }
}
