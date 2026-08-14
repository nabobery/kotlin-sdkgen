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
 * The base role that determines default permissions for the space.
 * - `no_access`: No default access (default)
 * - `reader`: Makes the space publicly readable
 * Note: User spaces do not support writer or admin base roles.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema/properties/base_role
 */
@Serializable(with = InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6.Serializer::class)
public sealed class InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6 = when (value) {
      Reader.value -> Reader
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPostRequestJsonBaseRoleXe2ee32c6) {
      encoder.encodeString(value.value)
    }
  }
}
