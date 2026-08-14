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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BooleanCapability/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BooleanCapability/properties/type
 */
@Serializable(with = InlineBooleanCapabilityTypeX1c71ccb2.Serializer::class)
public sealed class InlineBooleanCapabilityTypeX1c71ccb2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `boolean`.
   */
  public data object Boolean : InlineBooleanCapabilityTypeX1c71ccb2() {
    public override val `value`: String = "boolean"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBooleanCapabilityTypeX1c71ccb2()

  public companion object {
    public fun fromValue(`value`: String): InlineBooleanCapabilityTypeX1c71ccb2 = when (value) {
      Boolean.value -> Boolean
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBooleanCapabilityTypeX1c71ccb2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBooleanCapabilityTypeX1c71ccb2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBooleanCapabilityTypeX1c71ccb2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBooleanCapabilityTypeX1c71ccb2) {
      encoder.encodeString(value.value)
    }
  }
}
