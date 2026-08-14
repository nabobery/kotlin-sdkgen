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
 * The high-level tax type, such as `vat` or `sales_tax`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate/properties/tax_type
 */
@Serializable(with = InlineTaxRateTaxTypeX73e4c6cd.Serializer::class)
public sealed class InlineTaxRateTaxTypeX73e4c6cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amusement_tax`.
   */
  public data object AmusementTax : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "amusement_tax"
  }

  /**
   * Documented value. Wire value: `communications_tax`.
   */
  public data object CommunicationsTax : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "communications_tax"
  }

  /**
   * Documented value. Wire value: `gst`.
   */
  public data object Gst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "gst"
  }

  /**
   * Documented value. Wire value: `hst`.
   */
  public data object Hst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "hst"
  }

  /**
   * Documented value. Wire value: `igst`.
   */
  public data object Igst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "igst"
  }

  /**
   * Documented value. Wire value: `jct`.
   */
  public data object Jct : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "jct"
  }

  /**
   * Documented value. Wire value: `lease_tax`.
   */
  public data object LeaseTax : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "lease_tax"
  }

  /**
   * Documented value. Wire value: `pst`.
   */
  public data object Pst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "pst"
  }

  /**
   * Documented value. Wire value: `qst`.
   */
  public data object Qst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "qst"
  }

  /**
   * Documented value. Wire value: `retail_delivery_fee`.
   */
  public data object RetailDeliveryFee : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "retail_delivery_fee"
  }

  /**
   * Documented value. Wire value: `rst`.
   */
  public data object Rst : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "rst"
  }

  /**
   * Documented value. Wire value: `sales_tax`.
   */
  public data object SalesTax : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "sales_tax"
  }

  /**
   * Documented value. Wire value: `service_tax`.
   */
  public data object ServiceTax : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "service_tax"
  }

  /**
   * Documented value. Wire value: `vat`.
   */
  public data object Vat : InlineTaxRateTaxTypeX73e4c6cd() {
    public override val `value`: String = "vat"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxRateTaxTypeX73e4c6cd()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxRateTaxTypeX73e4c6cd = when (value) {
      AmusementTax.value -> AmusementTax
      CommunicationsTax.value -> CommunicationsTax
      Gst.value -> Gst
      Hst.value -> Hst
      Igst.value -> Igst
      Jct.value -> Jct
      LeaseTax.value -> LeaseTax
      Pst.value -> Pst
      Qst.value -> Qst
      RetailDeliveryFee.value -> RetailDeliveryFee
      Rst.value -> Rst
      SalesTax.value -> SalesTax
      ServiceTax.value -> ServiceTax
      Vat.value -> Vat
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxRateTaxTypeX73e4c6cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxRateTaxTypeX73e4c6cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxRateTaxTypeX73e4c6cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxRateTaxTypeX73e4c6cd) {
      encoder.encodeString(value.value)
    }
  }
}
