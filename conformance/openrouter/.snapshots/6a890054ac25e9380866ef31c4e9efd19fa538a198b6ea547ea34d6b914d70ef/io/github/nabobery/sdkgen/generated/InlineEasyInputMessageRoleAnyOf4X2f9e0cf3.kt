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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/3
 */
@Serializable(with = InlineEasyInputMessageRoleAnyOf4X2f9e0cf3.Serializer::class)
public sealed class InlineEasyInputMessageRoleAnyOf4X2f9e0cf3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineEasyInputMessageRoleAnyOf4X2f9e0cf3() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessageRoleAnyOf4X2f9e0cf3()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessageRoleAnyOf4X2f9e0cf3 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageRoleAnyOf4X2f9e0cf3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineEasyInputMessageRoleAnyOf4X2f9e0cf3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageRoleAnyOf4X2f9e0cf3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageRoleAnyOf4X2f9e0cf3) {
      encoder.encodeString(value.value)
    }
  }
}
