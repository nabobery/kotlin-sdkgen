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
 * The bank_transfer type
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer/properties/type
 */
@Serializable(with = InlineFundingInstructionsBankTransferTypeX6b71fe17.Serializer::class)
public sealed class InlineFundingInstructionsBankTransferTypeX6b71fe17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu_bank_transfer`.
   */
  public data object EuBankTransfer : InlineFundingInstructionsBankTransferTypeX6b71fe17() {
    public override val `value`: String = "eu_bank_transfer"
  }

  /**
   * Documented value. Wire value: `jp_bank_transfer`.
   */
  public data object JpBankTransfer : InlineFundingInstructionsBankTransferTypeX6b71fe17() {
    public override val `value`: String = "jp_bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFundingInstructionsBankTransferTypeX6b71fe17()

  public companion object {
    public fun fromValue(`value`: String): InlineFundingInstructionsBankTransferTypeX6b71fe17 = when (value) {
      EuBankTransfer.value -> EuBankTransfer
      JpBankTransfer.value -> JpBankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFundingInstructionsBankTransferTypeX6b71fe17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFundingInstructionsBankTransferTypeX6b71fe17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFundingInstructionsBankTransferTypeX6b71fe17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFundingInstructionsBankTransferTypeX6b71fe17) {
      encoder.encodeString(value.value)
    }
  }
}
