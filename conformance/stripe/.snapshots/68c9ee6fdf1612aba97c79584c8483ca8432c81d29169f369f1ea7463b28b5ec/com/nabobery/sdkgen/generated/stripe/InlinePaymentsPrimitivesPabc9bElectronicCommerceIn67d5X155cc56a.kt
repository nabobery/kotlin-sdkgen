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
 * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of authentication was
 * performed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/electronic_commerce_indicator
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `01`.
   */
  public data object _01 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "01"
  }

  /**
   * Documented value. Wire value: `02`.
   */
  public data object _02 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "02"
  }

  /**
   * Documented value. Wire value: `03`.
   */
  public data object _03 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "03"
  }

  /**
   * Documented value. Wire value: `04`.
   */
  public data object _04 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "04"
  }

  /**
   * Documented value. Wire value: `05`.
   */
  public data object _05 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "05"
  }

  /**
   * Documented value. Wire value: `06`.
   */
  public data object _06 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "06"
  }

  /**
   * Documented value. Wire value: `07`.
   */
  public data object _07 : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a() {
    public override val `value`: String = "07"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a = when (value) {
      _01.value -> _01
      _02.value -> _02
      _03.value -> _03
      _04.value -> _04
      _05.value -> _05
      _06.value -> _06
      _07.value -> _07
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bElectronicCommerceIn67d5X155cc56a) {
      encoder.encodeString(value.value)
    }
  }
}
