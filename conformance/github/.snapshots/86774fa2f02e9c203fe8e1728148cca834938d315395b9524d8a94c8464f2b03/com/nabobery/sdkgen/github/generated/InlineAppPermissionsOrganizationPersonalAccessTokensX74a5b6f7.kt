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
 * The level of permission to grant the access token for viewing and managing fine-grained personal access token
 * requests to an organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_personal_access_tokens
 */
@Serializable(with = InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7.Serializer::class)
public sealed class InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7) {
      encoder.encodeString(value.value)
    }
  }
}
