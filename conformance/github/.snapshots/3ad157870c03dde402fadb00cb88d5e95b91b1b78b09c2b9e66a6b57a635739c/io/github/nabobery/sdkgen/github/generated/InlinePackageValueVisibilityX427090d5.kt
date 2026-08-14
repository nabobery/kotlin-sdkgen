package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/package/properties/visibility.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package/properties/visibility
 */
@Serializable(with = InlinePackageValueVisibilityX427090d5.Serializer::class)
public sealed class InlinePackageValueVisibilityX427090d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlinePackageValueVisibilityX427090d5() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlinePackageValueVisibilityX427090d5() {
    public override val `value`: String = "public"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePackageValueVisibilityX427090d5()

  public companion object {
    public fun fromValue(`value`: String): InlinePackageValueVisibilityX427090d5 = when (value) {
      Private.value -> Private
      Public.value -> Public
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePackageValueVisibilityX427090d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePackageValueVisibilityX427090d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePackageValueVisibilityX427090d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePackageValueVisibilityX427090d5) {
      encoder.encodeString(value.value)
    }
  }
}
