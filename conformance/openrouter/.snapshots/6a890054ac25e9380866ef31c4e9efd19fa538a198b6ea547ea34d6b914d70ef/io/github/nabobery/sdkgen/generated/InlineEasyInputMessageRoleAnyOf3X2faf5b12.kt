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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/2
 */
@Serializable(with = InlineEasyInputMessageRoleAnyOf3X2faf5b12.Serializer::class)
public sealed class InlineEasyInputMessageRoleAnyOf3X2faf5b12 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineEasyInputMessageRoleAnyOf3X2faf5b12() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessageRoleAnyOf3X2faf5b12()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessageRoleAnyOf3X2faf5b12 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageRoleAnyOf3X2faf5b12> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineEasyInputMessageRoleAnyOf3X2faf5b12", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageRoleAnyOf3X2faf5b12 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageRoleAnyOf3X2faf5b12) {
      encoder.encodeString(value.value)
    }
  }
}
