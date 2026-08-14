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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/object
 */
@Serializable(with = InlineIssuingCardObjectValueXeecda8e4.Serializer::class)
public sealed class InlineIssuingCardObjectValueXeecda8e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.card`.
   */
  public data object IssuingCard : InlineIssuingCardObjectValueXeecda8e4() {
    public override val `value`: String = "issuing.card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardObjectValueXeecda8e4()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardObjectValueXeecda8e4 = when (value) {
      IssuingCard.value -> IssuingCard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardObjectValueXeecda8e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardObjectValueXeecda8e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardObjectValueXeecda8e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardObjectValueXeecda8e4) {
      encoder.encodeString(value.value)
    }
  }
}
