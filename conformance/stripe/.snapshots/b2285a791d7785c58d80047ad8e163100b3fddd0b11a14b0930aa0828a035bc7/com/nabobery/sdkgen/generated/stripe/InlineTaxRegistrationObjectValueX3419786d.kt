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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.registration/properties/object
 */
@Serializable(with = InlineTaxRegistrationObjectValueX3419786d.Serializer::class)
public sealed class InlineTaxRegistrationObjectValueX3419786d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.registration`.
   */
  public data object TaxRegistration : InlineTaxRegistrationObjectValueX3419786d() {
    public override val `value`: String = "tax.registration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxRegistrationObjectValueX3419786d()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxRegistrationObjectValueX3419786d = when (value) {
      TaxRegistration.value -> TaxRegistration
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxRegistrationObjectValueX3419786d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxRegistrationObjectValueX3419786d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxRegistrationObjectValueX3419786d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxRegistrationObjectValueX3419786d) {
      encoder.encodeString(value.value)
    }
  }
}
