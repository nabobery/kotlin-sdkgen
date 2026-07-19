package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Role of the member in the workspace
 */
@Serializable(with = InlineComponentsSchemasWorkspaceMemberPropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasWorkspaceMemberPropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineComponentsSchemasWorkspaceMemberPropertiesRole() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineComponentsSchemasWorkspaceMemberPropertiesRole() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWorkspaceMemberPropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWorkspaceMemberPropertiesRole = when (value) {
      Admin.value -> Admin
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWorkspaceMemberPropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWorkspaceMemberPropertiesRole",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWorkspaceMemberPropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWorkspaceMemberPropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
