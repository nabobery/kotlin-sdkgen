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
 * The attachment status of the code security configuration on the repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration-for-repository/properties/status
 */
@Serializable(with = InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae.Serializer::class)
public sealed class InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attached`.
   */
  public data object Attached : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "attached"
  }

  /**
   * Documented value. Wire value: `attaching`.
   */
  public data object Attaching : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "attaching"
  }

  /**
   * Documented value. Wire value: `detached`.
   */
  public data object Detached : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "detached"
  }

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "removed"
  }

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `updating`.
   */
  public data object Updating : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "updating"
  }

  /**
   * Documented value. Wire value: `removed_by_enterprise`.
   */
  public data object RemovedByEnterprise : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae() {
    public override val `value`: String = "removed_by_enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae = when (value) {
      Attached.value -> Attached
      Attaching.value -> Attaching
      Detached.value -> Detached
      Removed.value -> Removed
      Enforced.value -> Enforced
      Failed.value -> Failed
      Updating.value -> Updating
      RemovedByEnterprise.value -> RemovedByEnterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae) {
      encoder.encodeString(value.value)
    }
  }
}
