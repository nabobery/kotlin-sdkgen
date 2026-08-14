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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_test_helpers.test_clock/properties/object
 */
@Serializable(with = InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b.Serializer::class)
public sealed class InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `test_helpers.test_clock`.
   */
  public data object TestHelpersTestClock : InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b() {
    public override val `value`: String = "test_helpers.test_clock"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b = when (value) {
      TestHelpersTestClock.value -> TestHelpersTestClock
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedTestHelpersTestClockObjectValueX65fb1b0b) {
      encoder.encodeString(value.value)
    }
  }
}
