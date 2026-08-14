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
 * Source: sdkgen://source/openapi.json#/components/schemas/source/properties/object
 */
@Serializable(with = InlineSourceObjectValueX8d2ab178.Serializer::class)
public sealed class InlineSourceObjectValueX8d2ab178 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `source`.
   */
  public data object Source : InlineSourceObjectValueX8d2ab178() {
    public override val `value`: String = "source"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceObjectValueX8d2ab178()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceObjectValueX8d2ab178 = when (value) {
      Source.value -> Source
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSourceObjectValueX8d2ab178> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSourceObjectValueX8d2ab178", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceObjectValueX8d2ab178 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceObjectValueX8d2ab178) {
      encoder.encodeString(value.value)
    }
  }
}
