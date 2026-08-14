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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token/properties/object
 */
@Serializable(with = InlineIssuingTokenObjectValueX40b4ed68.Serializer::class)
public sealed class InlineIssuingTokenObjectValueX40b4ed68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.token`.
   */
  public data object IssuingToken : InlineIssuingTokenObjectValueX40b4ed68() {
    public override val `value`: String = "issuing.token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingTokenObjectValueX40b4ed68()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingTokenObjectValueX40b4ed68 = when (value) {
      IssuingToken.value -> IssuingToken
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTokenObjectValueX40b4ed68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingTokenObjectValueX40b4ed68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingTokenObjectValueX40b4ed68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTokenObjectValueX40b4ed68) {
      encoder.encodeString(value.value)
    }
  }
}
