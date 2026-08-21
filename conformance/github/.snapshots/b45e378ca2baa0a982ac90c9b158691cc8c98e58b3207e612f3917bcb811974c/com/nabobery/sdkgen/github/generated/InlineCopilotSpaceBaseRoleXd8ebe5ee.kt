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
 * The base role that determines default permissions.
 * - `no_access`: No default access
 * - `reader`: Default read permissions
 * - `writer`: Default write permissions (organization spaces only)
 * - `admin`: Default admin permissions (organization spaces only)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/base_role
 */
@Serializable(with = InlineCopilotSpaceBaseRoleXd8ebe5ee.Serializer::class)
public sealed class InlineCopilotSpaceBaseRoleXd8ebe5ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineCopilotSpaceBaseRoleXd8ebe5ee() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineCopilotSpaceBaseRoleXd8ebe5ee() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineCopilotSpaceBaseRoleXd8ebe5ee() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineCopilotSpaceBaseRoleXd8ebe5ee() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceBaseRoleXd8ebe5ee()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceBaseRoleXd8ebe5ee = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceBaseRoleXd8ebe5ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSpaceBaseRoleXd8ebe5ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceBaseRoleXd8ebe5ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceBaseRoleXd8ebe5ee) {
      encoder.encodeString(value.value)
    }
  }
}
