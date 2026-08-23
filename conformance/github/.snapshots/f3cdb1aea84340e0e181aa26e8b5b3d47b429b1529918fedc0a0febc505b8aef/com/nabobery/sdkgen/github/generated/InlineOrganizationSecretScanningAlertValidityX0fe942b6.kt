package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The token status as of the latest validity check.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-secret-scanning-alert/properties/validity
 */
@Serializable(with = InlineOrganizationSecretScanningAlertValidityX0fe942b6.Serializer::class)
public sealed class InlineOrganizationSecretScanningAlertValidityX0fe942b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineOrganizationSecretScanningAlertValidityX0fe942b6() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineOrganizationSecretScanningAlertValidityX0fe942b6() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineOrganizationSecretScanningAlertValidityX0fe942b6() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationSecretScanningAlertValidityX0fe942b6()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationSecretScanningAlertValidityX0fe942b6 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationSecretScanningAlertValidityX0fe942b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationSecretScanningAlertValidityX0fe942b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationSecretScanningAlertValidityX0fe942b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationSecretScanningAlertValidityX0fe942b6) {
      encoder.encodeString(value.value)
    }
  }
}
