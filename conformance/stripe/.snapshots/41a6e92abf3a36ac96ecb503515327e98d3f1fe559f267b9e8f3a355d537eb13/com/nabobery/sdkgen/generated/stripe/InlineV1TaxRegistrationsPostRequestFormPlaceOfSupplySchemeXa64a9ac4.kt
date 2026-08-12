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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/si/properties/standard/properties/place_of_supply_scheme.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/si/properties/standard/properties/place_of_supply_scheme
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound_goods`.
   */
  public data object InboundGoods : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4() {
    public override val `value`: String = "inbound_goods"
  }

  /**
   * Documented value. Wire value: `small_seller`.
   */
  public data object SmallSeller : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4() {
    public override val `value`: String = "small_seller"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4 = when (value) {
      InboundGoods.value -> InboundGoods
      SmallSeller.value -> SmallSeller
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa64a9ac4) {
      encoder.encodeString(value.value)
    }
  }
}
