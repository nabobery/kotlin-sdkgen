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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AdditionalToolsItem/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdditionalToolsItem/properties/role
 */
@Serializable(with = InlineAdditionalToolsItemRoleXe3a56f4e.Serializer::class)
public sealed class InlineAdditionalToolsItemRoleXe3a56f4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "assistant"
  }

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "system"
  }

  /**
   * Documented value. Wire value: `critic`.
   */
  public data object Critic : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "critic"
  }

  /**
   * Documented value. Wire value: `discriminator`.
   */
  public data object Discriminator : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "discriminator"
  }

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "developer"
  }

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : InlineAdditionalToolsItemRoleXe3a56f4e() {
    public override val `value`: String = "tool"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdditionalToolsItemRoleXe3a56f4e()

  public companion object {
    public fun fromValue(`value`: String): InlineAdditionalToolsItemRoleXe3a56f4e = when (value) {
      Unknown.value -> Unknown
      User.value -> User
      Assistant.value -> Assistant
      System.value -> System
      Critic.value -> Critic
      Discriminator.value -> Discriminator
      Developer.value -> Developer
      Tool.value -> Tool
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAdditionalToolsItemRoleXe3a56f4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAdditionalToolsItemRoleXe3a56f4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdditionalToolsItemRoleXe3a56f4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdditionalToolsItemRoleXe3a56f4e) {
      encoder.encodeString(value.value)
    }
  }
}
