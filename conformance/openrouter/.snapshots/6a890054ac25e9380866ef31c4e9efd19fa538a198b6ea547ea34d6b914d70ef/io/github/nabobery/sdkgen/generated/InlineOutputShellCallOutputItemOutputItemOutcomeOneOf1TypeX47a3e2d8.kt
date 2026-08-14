package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/0/properties/type
 */
@Serializable(with = InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8.Serializer::class)
public sealed class InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exit`.
   */
  public data object Exit : InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8() {
    public override val `value`: String = "exit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8 = when (value) {
      Exit.value -> Exit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf1TypeX47a3e2d8) {
      encoder.encodeString(value.value)
    }
  }
}
