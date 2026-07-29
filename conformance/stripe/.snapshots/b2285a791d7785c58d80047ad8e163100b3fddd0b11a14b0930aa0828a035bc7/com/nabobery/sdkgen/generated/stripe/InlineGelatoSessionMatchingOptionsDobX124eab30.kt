package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Strictness of the DOB matching policy to apply.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_matching_options/properties/dob
 */
@Serializable(with = InlineGelatoSessionMatchingOptionsDobX124eab30.Serializer::class)
public sealed class InlineGelatoSessionMatchingOptionsDobX124eab30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineGelatoSessionMatchingOptionsDobX124eab30() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `similar`.
   */
  public data object Similar : InlineGelatoSessionMatchingOptionsDobX124eab30() {
    public override val `value`: String = "similar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSessionMatchingOptionsDobX124eab30()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSessionMatchingOptionsDobX124eab30 = when (value) {
      None.value -> None
      Similar.value -> Similar
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoSessionMatchingOptionsDobX124eab30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoSessionMatchingOptionsDobX124eab30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSessionMatchingOptionsDobX124eab30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSessionMatchingOptionsDobX124eab30) {
      encoder.encodeString(value.value)
    }
  }
}
