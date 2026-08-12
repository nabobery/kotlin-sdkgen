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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration-repositories/properties/status
 */
@Serializable(with = InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984.Serializer::class)
public sealed class InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attached`.
   */
  public data object Attached : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "attached"
  }

  /**
   * Documented value. Wire value: `attaching`.
   */
  public data object Attaching : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "attaching"
  }

  /**
   * Documented value. Wire value: `detached`.
   */
  public data object Detached : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "detached"
  }

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "removed"
  }

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `updating`.
   */
  public data object Updating : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "updating"
  }

  /**
   * Documented value. Wire value: `removed_by_enterprise`.
   */
  public data object RemovedByEnterprise : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984() {
    public override val `value`: String = "removed_by_enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984 = when (value) {
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

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984) {
      encoder.encodeString(value.value)
    }
  }
}
