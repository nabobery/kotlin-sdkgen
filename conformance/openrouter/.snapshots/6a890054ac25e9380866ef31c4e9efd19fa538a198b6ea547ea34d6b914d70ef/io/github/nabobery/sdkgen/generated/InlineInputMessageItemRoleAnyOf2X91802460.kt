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
 * sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role/anyOf/1
 */
@Serializable(with = InlineInputMessageItemRoleAnyOf2X91802460.Serializer::class)
public sealed class InlineInputMessageItemRoleAnyOf2X91802460 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineInputMessageItemRoleAnyOf2X91802460() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputMessageItemRoleAnyOf2X91802460()

  public companion object {
    public fun fromValue(`value`: String): InlineInputMessageItemRoleAnyOf2X91802460 = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputMessageItemRoleAnyOf2X91802460> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputMessageItemRoleAnyOf2X91802460", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputMessageItemRoleAnyOf2X91802460 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputMessageItemRoleAnyOf2X91802460) {
      encoder.encodeString(value.value)
    }
  }
}
