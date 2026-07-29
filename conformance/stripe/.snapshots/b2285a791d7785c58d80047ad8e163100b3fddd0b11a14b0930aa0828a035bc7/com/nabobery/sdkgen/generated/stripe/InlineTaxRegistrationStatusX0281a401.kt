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
 * The status of the registration. This field is present for convenience and can be deduced from `active_from` and
 * `expires_at`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.registration/properties/status
 */
@Serializable(with = InlineTaxRegistrationStatusX0281a401.Serializer::class)
public sealed class InlineTaxRegistrationStatusX0281a401 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineTaxRegistrationStatusX0281a401() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineTaxRegistrationStatusX0281a401() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `scheduled`.
   */
  public data object Scheduled : InlineTaxRegistrationStatusX0281a401() {
    public override val `value`: String = "scheduled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxRegistrationStatusX0281a401()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxRegistrationStatusX0281a401 = when (value) {
      Active.value -> Active
      Expired.value -> Expired
      Scheduled.value -> Scheduled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxRegistrationStatusX0281a401> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxRegistrationStatusX0281a401", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxRegistrationStatusX0281a401 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxRegistrationStatusX0281a401) {
      encoder.encodeString(value.value)
    }
  }
}
