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
 * The level of permission to grant the access token to view and manage secret scanning alerts.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/secret_scanning_alerts
 */
@Serializable(with = InlineAppPermissionsSecretScanningAlertsX161d463f.Serializer::class)
public sealed class InlineAppPermissionsSecretScanningAlertsX161d463f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsSecretScanningAlertsX161d463f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsSecretScanningAlertsX161d463f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsSecretScanningAlertsX161d463f()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsSecretScanningAlertsX161d463f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsSecretScanningAlertsX161d463f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsSecretScanningAlertsX161d463f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsSecretScanningAlertsX161d463f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsSecretScanningAlertsX161d463f) {
      encoder.encodeString(value.value)
    }
  }
}
