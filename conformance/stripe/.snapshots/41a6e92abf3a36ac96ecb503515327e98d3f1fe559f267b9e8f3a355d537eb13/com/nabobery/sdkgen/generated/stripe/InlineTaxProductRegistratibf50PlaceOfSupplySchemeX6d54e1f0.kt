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
 * Place of supply scheme used in an Default standard registration.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default_standard/
 * properties/place_of_supply_scheme
 */
@Serializable(with = InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0.Serializer::class)
public sealed class InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound_goods`.
   */
  public data object InboundGoods : InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0() {
    public override val `value`: String = "inbound_goods"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0 = when (value) {
      InboundGoods.value -> InboundGoods
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistratibf50PlaceOfSupplySchemeX6d54e1f0) {
      encoder.encodeString(value.value)
    }
  }
}
