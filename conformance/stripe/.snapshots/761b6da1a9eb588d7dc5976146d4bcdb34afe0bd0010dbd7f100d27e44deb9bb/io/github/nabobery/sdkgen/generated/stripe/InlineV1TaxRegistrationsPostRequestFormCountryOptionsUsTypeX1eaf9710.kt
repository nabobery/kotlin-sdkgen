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
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax/properties/elections/items/properties/
 * type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/state_sales_tax/properties/elections/items/properties/
 * type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_use_tax`.
   */
  public data object LocalUseTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710() {
    public override val `value`: String = "local_use_tax"
  }

  /**
   * Documented value. Wire value: `simplified_sellers_use_tax`.
   */
  public data object SimplifiedSellersUseTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710() {
    public override val `value`: String = "simplified_sellers_use_tax"
  }

  /**
   * Documented value. Wire value: `single_local_use_tax`.
   */
  public data object SingleLocalUseTax : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710() {
    public override val `value`: String = "single_local_use_tax"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710 = when (value) {
      LocalUseTax.value -> LocalUseTax
      SimplifiedSellersUseTax.value -> SimplifiedSellersUseTax
      SingleLocalUseTax.value -> SingleLocalUseTax
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsTypeX1eaf9710) {
      encoder.encodeString(value.value)
    }
  }
}
