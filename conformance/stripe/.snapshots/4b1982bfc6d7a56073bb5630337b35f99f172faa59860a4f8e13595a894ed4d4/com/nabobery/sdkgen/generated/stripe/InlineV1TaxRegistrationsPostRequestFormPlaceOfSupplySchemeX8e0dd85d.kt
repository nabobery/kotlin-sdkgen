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
 * ded/schema/properties/country_options/properties/zw/properties/standard/properties/place_of_supply_scheme.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/zw/properties/standard/properties/place_of_supply_scheme
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound_goods`.
   */
  public data object InboundGoods : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d() {
    public override val `value`: String = "inbound_goods"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d = when (value) {
      InboundGoods.value -> InboundGoods
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX8e0dd85d) {
      encoder.encodeString(value.value)
    }
  }
}
