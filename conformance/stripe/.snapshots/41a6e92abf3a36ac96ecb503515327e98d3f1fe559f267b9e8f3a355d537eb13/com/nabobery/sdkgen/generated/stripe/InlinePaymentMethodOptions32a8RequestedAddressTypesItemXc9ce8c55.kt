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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_bank_transfer/properties/req
 * uested_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_bank_transfer/properties/req
 * uested_address_types/items
 */
@Serializable(with = InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55.Serializer::class)
public sealed class InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "aba"
  }

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sepa`.
   */
  public data object Sepa : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "sepa"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55 = when (value) {
      Aba.value -> Aba
      Iban.value -> Iban
      Sepa.value -> Sepa
      SortCode.value -> SortCode
      Spei.value -> Spei
      Swift.value -> Swift
      Zengin.value -> Zengin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptions32a8RequestedAddressTypesItemXc9ce8c55) {
      encoder.encodeString(value.value)
    }
  }
}
