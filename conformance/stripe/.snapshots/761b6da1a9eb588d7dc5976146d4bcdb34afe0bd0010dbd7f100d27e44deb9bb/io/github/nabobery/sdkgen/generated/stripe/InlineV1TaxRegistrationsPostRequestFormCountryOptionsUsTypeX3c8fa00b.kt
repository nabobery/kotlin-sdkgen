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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_amusement_tax`.
   */
  public data object LocalAmusementTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b() {
    public override val `value`: String = "local_amusement_tax"
  }

  /**
   * Documented value. Wire value: `local_lease_tax`.
   */
  public data object LocalLeaseTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b() {
    public override val `value`: String = "local_lease_tax"
  }

  /**
   * Documented value. Wire value: `state_communications_tax`.
   */
  public data object StateCommunicationsTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b() {
    public override val `value`: String = "state_communications_tax"
  }

  /**
   * Documented value. Wire value: `state_retail_delivery_fee`.
   */
  public data object StateRetailDeliveryFee : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b() {
    public override val `value`: String = "state_retail_delivery_fee"
  }

  /**
   * Documented value. Wire value: `state_sales_tax`.
   */
  public data object StateSalesTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b() {
    public override val `value`: String = "state_sales_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b = when (value) {
      LocalAmusementTax.value -> LocalAmusementTax
      LocalLeaseTax.value -> LocalLeaseTax
      StateCommunicationsTax.value -> StateCommunicationsTax
      StateRetailDeliveryFee.value -> StateRetailDeliveryFee
      StateSalesTax.value -> StateSalesTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX3c8fa00b) {
      encoder.encodeString(value.value)
    }
  }
}
