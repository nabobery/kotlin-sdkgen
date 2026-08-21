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
 * sdkgen://source/openapi.json#/components/schemas/checkout_customer_balance_bank_transfer_payment_method_options/prope
 * rties/requested_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_customer_balance_bank_transfer_payment_method_options/prope
 * rties/requested_address_types/items
 */
@Serializable(with = InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef.Serializer::class)
public sealed class InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "aba"
  }

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sepa`.
   */
  public data object Sepa : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "sepa"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef = when (value) {
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

  internal object Serializer : KSerializer<InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCustomerBala007dRequestedAddressTypesItemXfe4b0bef) {
      encoder.encodeString(value.value)
    }
  }
}
