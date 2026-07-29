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
 * The type of financial address
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_financial_address/properties/type
 */
@Serializable(with = InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec.Serializer::class)
public sealed class InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "aba"
  }

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec()

  public companion object {
    public fun fromValue(`value`: String): InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec = when (value) {
      Aba.value -> Aba
      Iban.value -> Iban
      SortCode.value -> SortCode
      Spei.value -> Spei
      Swift.value -> Swift
      Zengin.value -> Zengin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec) {
      encoder.encodeString(value.value)
    }
  }
}
