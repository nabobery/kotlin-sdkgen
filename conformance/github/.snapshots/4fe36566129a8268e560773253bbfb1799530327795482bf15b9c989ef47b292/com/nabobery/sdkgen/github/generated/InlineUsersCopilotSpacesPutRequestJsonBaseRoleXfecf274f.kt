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
 * The base role that determines default permissions for the space. Changing this field requires admin permissions.
 * - `no_access`: No default access (default)
 * - `reader`: Makes the space publicly readable
 * Note: User spaces do not support writer or admin base roles.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema/properties/base_role
 */
@Serializable(with = InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f.Serializer::class)
public sealed class InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f = when (value) {
      Reader.value -> Reader
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPutRequestJsonBaseRoleXfecf274f) {
      encoder.encodeString(value.value)
    }
  }
}
