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
 * Place of supply scheme used in an EU standard registration.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_eu_standard/prope
 * rties/place_of_supply_scheme
 */
@Serializable(with = InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46.Serializer::class)
public sealed class InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound_goods`.
   */
  public data object InboundGoods : InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46() {
    public override val `value`: String = "inbound_goods"
  }

  /**
   * Documented value. Wire value: `small_seller`.
   */
  public data object SmallSeller : InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46() {
    public override val `value`: String = "small_seller"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46 = when (value) {
      InboundGoods.value -> InboundGoods
      SmallSeller.value -> SmallSeller
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistrati09bbPlaceOfSupplySchemeX7e674b46) {
      encoder.encodeString(value.value)
    }
  }
}
