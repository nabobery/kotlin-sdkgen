package com.nabobery.sdkgen.generated

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
 * /oneOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/1/properties/type
 */
@Serializable(with = InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234.Serializer::class)
public sealed class InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `timeout`.
   */
  public data object Timeout : InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234() {
    public override val `value`: String = "timeout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234 = when (value) {
      Timeout.value -> Timeout
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234) {
      encoder.encodeString(value.value)
    }
  }
}
