package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The base role that determines default permissions for organization members.
 * - `no_access`: No default access (default)
 * - `reader`: Organization members can read the space
 * - `writer`: Organization members can read and edit the space
 * - `admin`: Organization members have full admin access to the space
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema/p
 * roperties/base_role
 */
@Serializable(with = InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c.Serializer::class)
public sealed class InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPostRequestJsonBaseRoleX270bda3c) {
      encoder.encodeString(value.value)
    }
  }
}
