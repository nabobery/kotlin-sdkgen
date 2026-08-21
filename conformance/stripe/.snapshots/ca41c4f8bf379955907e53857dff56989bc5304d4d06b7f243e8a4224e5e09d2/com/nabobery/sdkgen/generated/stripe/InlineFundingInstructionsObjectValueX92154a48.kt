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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions/properties/object
 */
@Serializable(with = InlineFundingInstructionsObjectValueX92154a48.Serializer::class)
public sealed class InlineFundingInstructionsObjectValueX92154a48 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `funding_instructions`.
   */
  public data object FundingInstructions : InlineFundingInstructionsObjectValueX92154a48() {
    public override val `value`: String = "funding_instructions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFundingInstructionsObjectValueX92154a48()

  public companion object {
    public fun fromValue(`value`: String): InlineFundingInstructionsObjectValueX92154a48 = when (value) {
      FundingInstructions.value -> FundingInstructions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFundingInstructionsObjectValueX92154a48> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFundingInstructionsObjectValueX92154a48", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFundingInstructionsObjectValueX92154a48 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFundingInstructionsObjectValueX92154a48) {
      encoder.encodeString(value.value)
    }
  }
}
