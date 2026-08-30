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
 * The level of permission to grant the access token to view and manage GitHub Actions self-hosted runners available to
 * an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_self_hosted_runners
 */
@Serializable(with = InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617.Serializer::class)
public sealed class InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617) {
      encoder.encodeString(value.value)
    }
  }
}
