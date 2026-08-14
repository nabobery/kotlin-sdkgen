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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role/anyOf/1
 */
@Serializable(with = InlineEasyInputMessageRoleAnyOf2Xa05aa430.Serializer::class)
public sealed class InlineEasyInputMessageRoleAnyOf2Xa05aa430 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineEasyInputMessageRoleAnyOf2Xa05aa430() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessageRoleAnyOf2Xa05aa430()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessageRoleAnyOf2Xa05aa430 = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageRoleAnyOf2Xa05aa430> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineEasyInputMessageRoleAnyOf2Xa05aa430", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageRoleAnyOf2Xa05aa430 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageRoleAnyOf2Xa05aa430) {
      encoder.encodeString(value.value)
    }
  }
}
