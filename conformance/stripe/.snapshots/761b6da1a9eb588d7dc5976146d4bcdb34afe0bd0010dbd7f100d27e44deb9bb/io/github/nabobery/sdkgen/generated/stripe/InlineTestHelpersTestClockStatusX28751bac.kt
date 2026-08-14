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
 * The status of the Test Clock.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/test_helpers.test_clock/properties/status
 */
@Serializable(with = InlineTestHelpersTestClockStatusX28751bac.Serializer::class)
public sealed class InlineTestHelpersTestClockStatusX28751bac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advancing`.
   */
  public data object Advancing : InlineTestHelpersTestClockStatusX28751bac() {
    public override val `value`: String = "advancing"
  }

  /**
   * Documented value. Wire value: `internal_failure`.
   */
  public data object InternalFailure : InlineTestHelpersTestClockStatusX28751bac() {
    public override val `value`: String = "internal_failure"
  }

  /**
   * Documented value. Wire value: `ready`.
   */
  public data object Ready : InlineTestHelpersTestClockStatusX28751bac() {
    public override val `value`: String = "ready"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTestHelpersTestClockStatusX28751bac()

  public companion object {
    public fun fromValue(`value`: String): InlineTestHelpersTestClockStatusX28751bac = when (value) {
      Advancing.value -> Advancing
      InternalFailure.value -> InternalFailure
      Ready.value -> Ready
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTestHelpersTestClockStatusX28751bac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTestHelpersTestClockStatusX28751bac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTestHelpersTestClockStatusX28751bac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTestHelpersTestClockStatusX28751bac) {
      encoder.encodeString(value.value)
    }
  }
}
