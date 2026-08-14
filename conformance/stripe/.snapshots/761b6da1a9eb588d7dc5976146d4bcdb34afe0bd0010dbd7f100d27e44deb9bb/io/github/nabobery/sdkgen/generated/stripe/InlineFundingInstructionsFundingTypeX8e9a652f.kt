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
 * The `funding_type` of the returned instructions
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions/properties/funding_type
 */
@Serializable(with = InlineFundingInstructionsFundingTypeX8e9a652f.Serializer::class)
public sealed class InlineFundingInstructionsFundingTypeX8e9a652f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_transfer`.
   */
  public data object BankTransfer : InlineFundingInstructionsFundingTypeX8e9a652f() {
    public override val `value`: String = "bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFundingInstructionsFundingTypeX8e9a652f()

  public companion object {
    public fun fromValue(`value`: String): InlineFundingInstructionsFundingTypeX8e9a652f = when (value) {
      BankTransfer.value -> BankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFundingInstructionsFundingTypeX8e9a652f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFundingInstructionsFundingTypeX8e9a652f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFundingInstructionsFundingTypeX8e9a652f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFundingInstructionsFundingTypeX8e9a652f) {
      encoder.encodeString(value.value)
    }
  }
}
