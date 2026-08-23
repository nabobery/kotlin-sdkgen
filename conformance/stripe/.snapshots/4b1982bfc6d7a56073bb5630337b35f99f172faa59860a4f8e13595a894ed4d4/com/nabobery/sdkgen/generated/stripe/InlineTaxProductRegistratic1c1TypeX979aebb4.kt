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
 * Type of registration in `country`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default_inbound_g
 * oods/properties/type
 */
@Serializable(with = InlineTaxProductRegistratic1c1TypeX979aebb4.Serializer::class)
public sealed class InlineTaxProductRegistratic1c1TypeX979aebb4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineTaxProductRegistratic1c1TypeX979aebb4() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductRegistratic1c1TypeX979aebb4()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductRegistratic1c1TypeX979aebb4 = when (value) {
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductRegistratic1c1TypeX979aebb4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistratic1c1TypeX979aebb4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductRegistratic1c1TypeX979aebb4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductRegistratic1c1TypeX979aebb4) {
      encoder.encodeString(value.value)
    }
  }
}
