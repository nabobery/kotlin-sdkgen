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
 * Strictness of the name matching policy to apply.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_matching_options/properties/name
 */
@Serializable(with = InlineGelatoSessionMatchingOptionsNameX7cc1dac6.Serializer::class)
public sealed class InlineGelatoSessionMatchingOptionsNameX7cc1dac6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineGelatoSessionMatchingOptionsNameX7cc1dac6() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `similar`.
   */
  public data object Similar : InlineGelatoSessionMatchingOptionsNameX7cc1dac6() {
    public override val `value`: String = "similar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSessionMatchingOptionsNameX7cc1dac6()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSessionMatchingOptionsNameX7cc1dac6 = when (value) {
      None.value -> None
      Similar.value -> Similar
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoSessionMatchingOptionsNameX7cc1dac6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoSessionMatchingOptionsNameX7cc1dac6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSessionMatchingOptionsNameX7cc1dac6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSessionMatchingOptionsNameX7cc1dac6) {
      encoder.encodeString(value.value)
    }
  }
}
