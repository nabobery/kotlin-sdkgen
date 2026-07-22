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
 * The base role that determines default permissions for organization members. Changing this field requires admin
 * permissions.
 * - `no_access`: No default access (default)
 * - `reader`: Organization members can read the space
 * - `writer`: Organization members can read and edit the space
 * - `admin`: Organization members have full admin access to the space
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema/properties/base_role
 */
@Serializable(with = InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d.Serializer::class)
public sealed class InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPutRequestJsonBaseRoleXb56fc98d) {
      encoder.encodeString(value.value)
    }
  }
}
