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
 * Type of registration in `country`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default/propertie
 * s/type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f = when (value) {
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistrationsResourceCountryOptionsDefaultTypeX522c9c9f) {
      encoder.encodeString(value.value)
    }
  }
}
