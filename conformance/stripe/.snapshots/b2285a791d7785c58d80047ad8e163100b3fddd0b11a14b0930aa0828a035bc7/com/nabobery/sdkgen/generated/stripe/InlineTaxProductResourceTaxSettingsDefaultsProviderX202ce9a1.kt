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
 * The tax calculation provider this account uses. Defaults to `stripe` when not using a [third-party
 * provider](/tax/third-party-apps).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_defaults/properties/provider
 */
@Serializable(with = InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1.Serializer::class)
public sealed class InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `anrok`.
   */
  public data object Anrok : InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1() {
    public override val `value`: String = "anrok"
  }

  /**
   * Documented value. Wire value: `avalara`.
   */
  public data object Avalara : InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1() {
    public override val `value`: String = "avalara"
  }

  /**
   * Documented value. Wire value: `sphere`.
   */
  public data object Sphere : InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1() {
    public override val `value`: String = "sphere"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1 = when (value) {
      Anrok.value -> Anrok
      Avalara.value -> Avalara
      Sphere.value -> Sphere
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxSettingsDefaultsProviderX202ce9a1) {
      encoder.encodeString(value.value)
    }
  }
}
