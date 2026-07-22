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
 * The level of permission to grant the access token to view and manage security events like code scanning alerts.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/security_events
 */
@Serializable(with = InlineAppPermissionsSecurityEventsXddf5cb81.Serializer::class)
public sealed class InlineAppPermissionsSecurityEventsXddf5cb81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsSecurityEventsXddf5cb81() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsSecurityEventsXddf5cb81() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsSecurityEventsXddf5cb81()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsSecurityEventsXddf5cb81 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsSecurityEventsXddf5cb81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsSecurityEventsXddf5cb81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsSecurityEventsXddf5cb81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsSecurityEventsXddf5cb81) {
      encoder.encodeString(value.value)
    }
  }
}
